package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbit implements zzcue {
    private zzbqj zzept;
    private final /* synthetic */ zzbhw zzewb;
    private zzcuu zzfex;

    private zzbit(zzbhw zzbhwVar) {
        this.zzewb = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcue
    public final zzcuf zzafv() {
        zzehf.zza(this.zzept, zzbqj.class);
        zzehf.zza(this.zzfex, zzcuu.class);
        return new zzbiw(this.zzewb, this.zzfex, new zzbox(), new zzcin(), this.zzept, new zzdie());
    }

    @Override // com.google.android.gms.internal.ads.zzcue
    @Deprecated
    public final /* synthetic */ zzcue zzf(zzbuj zzbujVar) {
        zzehf.checkNotNull(zzbujVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcue
    public final /* synthetic */ zzcue zza(zzcuu zzcuuVar) {
        this.zzfex = (zzcuu) zzehf.checkNotNull(zzcuuVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcue
    public final /* synthetic */ zzcue zzf(zzbqj zzbqjVar) {
        this.zzept = (zzbqj) zzehf.checkNotNull(zzbqjVar);
        return this;
    }
}
