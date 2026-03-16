package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbhy implements zzbyo {
    private zzbqj zzept;
    private zzdha zzepv;
    private zzbyl zzepw;
    private zzdfa zzepx;
    private zzdee zzepy;
    private final /* synthetic */ zzbhw zzewb;
    private zzbuj zzewc;

    private zzbhy(zzbhw zzbhwVar) {
        this.zzewb = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    /* renamed from: zzaef */
    public final zzbyp zzaeg() {
        zzehf.zza(this.zzewc, zzbuj.class);
        zzehf.zza(this.zzept, zzbqj.class);
        zzehf.zza(this.zzepw, zzbyl.class);
        return new zzbhx(this.zzewb, this.zzepw, new zzbox(), new zzdhw(), new zzbpx(), new zzcin(), this.zzewc, this.zzept, new zzdie(), this.zzepv, this.zzepx, this.zzepy);
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final /* synthetic */ zzbyo zza(zzbyl zzbylVar) {
        this.zzepw = (zzbyl) zzehf.checkNotNull(zzbylVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final /* synthetic */ zzbyo zza(zzbqj zzbqjVar) {
        this.zzept = (zzbqj) zzehf.checkNotNull(zzbqjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final /* synthetic */ zzbyo zza(zzbuj zzbujVar) {
        this.zzewc = (zzbuj) zzehf.checkNotNull(zzbujVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzbyp> zza(zzdee zzdeeVar) {
        this.zzepy = zzdeeVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzbyp> zza(zzdfa zzdfaVar) {
        this.zzepx = zzdfaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzbyp> zza(zzdha zzdhaVar) {
        this.zzepv = zzdhaVar;
        return this;
    }
}
