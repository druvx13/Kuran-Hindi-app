package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbil implements zzbxq {
    private zzbqj zzept;
    private zzdha zzepv;
    private zzdfa zzepx;
    private zzdee zzepy;
    private final /* synthetic */ zzbhw zzewb;
    private zzbuj zzewc;
    private zzcsm zzfcf;

    private zzbil(zzbhw zzbhwVar) {
        this.zzewb = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    /* renamed from: zzafm */
    public final zzbxr zzaeg() {
        zzehf.zza(this.zzewc, zzbuj.class);
        zzehf.zza(this.zzept, zzbqj.class);
        zzehf.zza(this.zzfcf, zzcsm.class);
        return new zzbio(this.zzewb, new zzbox(), new zzdhw(), new zzbpx(), new zzcin(), this.zzewc, this.zzept, new zzdie(), this.zzfcf, this.zzepv, this.zzepx, this.zzepy);
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final /* synthetic */ zzbxq zzb(zzcsm zzcsmVar) {
        this.zzfcf = (zzcsm) zzehf.checkNotNull(zzcsmVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final /* synthetic */ zzbxq zzd(zzbqj zzbqjVar) {
        this.zzept = (zzbqj) zzehf.checkNotNull(zzbqjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbxq
    public final /* synthetic */ zzbxq zzd(zzbuj zzbujVar) {
        this.zzewc = (zzbuj) zzehf.checkNotNull(zzbujVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzbxr> zza(zzdee zzdeeVar) {
        this.zzepy = zzdeeVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzbxr> zza(zzdfa zzdfaVar) {
        this.zzepx = zzdfaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzbxr> zza(zzdha zzdhaVar) {
        this.zzepv = zzdhaVar;
        return this;
    }
}
