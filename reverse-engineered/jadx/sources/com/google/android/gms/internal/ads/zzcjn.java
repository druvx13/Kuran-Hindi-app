package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcjn {
    private final zzdrh zzfur;
    private final zzdrh zzgav;
    private final zzckr zzgaw;
    private final zzegt<zzclo> zzgax;

    public zzcjn(zzdrh zzdrhVar, zzdrh zzdrhVar2, zzckr zzckrVar, zzegt<zzclo> zzegtVar) {
        this.zzgav = zzdrhVar;
        this.zzfur = zzdrhVar2;
        this.zzgaw = zzckrVar;
        this.zzgax = zzegtVar;
    }

    public final zzdri<InputStream> zze(final zzarj zzarjVar) {
        zzdri zzb;
        String str = zzarjVar.packageName;
        com.google.android.gms.ads.internal.zzq.zzkw();
        if (zzaxa.zzep(str)) {
            zzb = zzdqw.immediateFailedFuture(new zzclc(0));
        } else {
            zzb = zzdqw.zzb(this.zzgav.zzd(new Callable(this, zzarjVar) { // from class: com.google.android.gms.internal.ads.zzcjm
                private final zzcjn zzgat;
                private final zzarj zzgau;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgat = this;
                    this.zzgau = zzarjVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzgat.zzf(this.zzgau);
                }
            }), ExecutionException.class, zzcjp.zzbly, this.zzfur);
        }
        final int callingUid = Binder.getCallingUid();
        return zzdqw.zzb(zzb, zzclc.class, new zzdqj(this, zzarjVar, callingUid) { // from class: com.google.android.gms.internal.ads.zzcjo
            private final int zzdwu;
            private final zzcjn zzgat;
            private final zzarj zzgau;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgat = this;
                this.zzgau = zzarjVar;
                this.zzdwu = callingUid;
            }

            @Override // com.google.android.gms.internal.ads.zzdqj
            public final zzdri zzf(Object obj) {
                return this.zzgat.zza(this.zzgau, this.zzdwu, (zzclc) obj);
            }
        }, this.zzfur);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdri zza(zzarj zzarjVar, int i, zzclc zzclcVar) throws Exception {
        return this.zzgax.get().zzb(zzarjVar, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzf(zzarj zzarjVar) throws Exception {
        return this.zzgaw.zzg(zzarjVar).get(((Integer) zzvj.zzpv().zzd(zzzz.zzcrr)).intValue(), TimeUnit.SECONDS);
    }
}
