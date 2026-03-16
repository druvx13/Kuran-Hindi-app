package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcuq implements zzdqx<zzcvd> {
    private final /* synthetic */ zzavm zzgkx;
    private final /* synthetic */ zzcuh zzgky;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcuq(zzcuh zzcuhVar, zzavm zzavmVar) {
        this.zzgky = zzcuhVar;
        this.zzgkx = zzavmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        try {
            zzavm zzavmVar = this.zzgkx;
            String valueOf = String.valueOf(th.getMessage());
            zzavmVar.onError(valueOf.length() != 0 ? "Internal error. ".concat(valueOf) : new String("Internal error. "));
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(zzcvd zzcvdVar) {
        zzazz zzazzVar;
        zzcvd zzcvdVar2 = zzcvdVar;
        try {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcue)).booleanValue()) {
                zzazzVar = this.zzgky.zzbml;
                if (zzazzVar.zzdzo >= ((Integer) zzvj.zzpv().zzd(zzzz.zzcug)).intValue()) {
                    if (zzcvdVar2 == null) {
                        this.zzgkx.zza(null, null, null);
                        return;
                    } else {
                        this.zzgkx.zza(zzcvdVar2.zzglg, zzcvdVar2.zzglh, zzcvdVar2.zzgli);
                        return;
                    }
                }
            }
            if (zzcvdVar2 == null) {
                this.zzgkx.zzk(null, null);
            } else {
                this.zzgkx.zzk(zzcvdVar2.zzglg, zzcvdVar2.zzglh);
            }
        } catch (RemoteException e) {
            zzazw.zzc("", e);
        }
    }
}
