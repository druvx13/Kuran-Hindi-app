package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbim {
    private zzbiv zzenr;
    private zzbhb zzens;
    private zzdlb zzfde;
    private zzbje zzfdf;
    private zzdhu zzfdg;

    private zzbim() {
    }

    public final zzbim zzc(zzbhb zzbhbVar) {
        this.zzens = (zzbhb) zzehf.checkNotNull(zzbhbVar);
        return this;
    }

    public final zzbim zza(zzbiv zzbivVar) {
        this.zzenr = (zzbiv) zzehf.checkNotNull(zzbivVar);
        return this;
    }

    public final zzbgy zzafn() {
        zzehf.zza(this.zzens, zzbhb.class);
        zzehf.zza(this.zzenr, zzbiv.class);
        if (this.zzfde == null) {
            this.zzfde = new zzdlb();
        }
        if (this.zzfdf == null) {
            this.zzfdf = new zzbje();
        }
        if (this.zzfdg == null) {
            this.zzfdg = new zzdhu();
        }
        return new zzbhw(this.zzens, this.zzenr, this.zzfde, this.zzfdf, this.zzfdg);
    }
}
