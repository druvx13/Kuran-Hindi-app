package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbib implements zzblk {
    private zzbqj zzept;
    private zzdha zzepv;
    private zzdfa zzepx;
    private zzdee zzepy;
    private final /* synthetic */ zzbhw zzewb;
    private zzbuj zzewc;

    private zzbib(zzbhw zzbhwVar) {
        this.zzewb = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    /* renamed from: zzaes */
    public final zzbll zzaeg() {
        zzehf.zza(this.zzewc, zzbuj.class);
        zzehf.zza(this.zzept, zzbqj.class);
        return new zzbie(this.zzewb, new zzbox(), new zzdhw(), new zzbpx(), new zzcin(), this.zzewc, this.zzept, new zzdie(), this.zzepv, this.zzepx, this.zzepy);
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    @Deprecated
    public final /* synthetic */ zzblk zza(zzbls zzblsVar) {
        zzehf.checkNotNull(zzblsVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final /* synthetic */ zzblk zzb(zzbqj zzbqjVar) {
        this.zzept = (zzbqj) zzehf.checkNotNull(zzbqjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final /* synthetic */ zzblk zzb(zzbuj zzbujVar) {
        this.zzewc = (zzbuj) zzehf.checkNotNull(zzbujVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzbll> zza(zzdee zzdeeVar) {
        this.zzepy = zzdeeVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzbll> zza(zzdfa zzdfaVar) {
        this.zzepx = zzdfaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzbll> zza(zzdha zzdhaVar) {
        this.zzepv = zzdhaVar;
        return this;
    }
}
