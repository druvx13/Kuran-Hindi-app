package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbdv extends zzbdl {
    public zzbdv(zzbbx zzbbxVar) {
        super(zzbbxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbdl
    public final void abort() {
    }

    @Override // com.google.android.gms.internal.ads.zzbdl
    public final boolean zzfl(String str) {
        zzbbx zzbbxVar = this.zzego.get();
        if (zzbbxVar != null) {
            zzbbxVar.zza(zzfm(str), this);
        }
        zzawr.zzfc("VideoStreamNoopCache is doing nothing.");
        zza(str, zzfm(str), "noop", "Noop cache is a noop.");
        return false;
    }
}
