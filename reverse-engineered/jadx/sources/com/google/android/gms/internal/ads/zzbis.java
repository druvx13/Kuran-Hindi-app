package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbis implements zzcer {
    private zzbqj zzept;
    private zzdha zzepv;
    private zzdfa zzepx;
    private zzdee zzepy;
    private final /* synthetic */ zzbhw zzewb;
    private zzbuj zzewc;

    private zzbis(zzbhw zzbhwVar) {
        this.zzewb = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    /* renamed from: zzafu */
    public final zzceo zzaeg() {
        zzehf.zza(this.zzewc, zzbuj.class);
        zzehf.zza(this.zzept, zzbqj.class);
        return new zzbir(this.zzewb, new zzbox(), new zzdhw(), new zzbpx(), new zzcin(), this.zzewc, this.zzept, new zzdie(), this.zzepv, this.zzepx, this.zzepy);
    }

    @Override // com.google.android.gms.internal.ads.zzcer
    public final /* synthetic */ zzcer zze(zzbqj zzbqjVar) {
        this.zzept = (zzbqj) zzehf.checkNotNull(zzbqjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcer
    public final /* synthetic */ zzcer zze(zzbuj zzbujVar) {
        this.zzewc = (zzbuj) zzehf.checkNotNull(zzbujVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzceo> zza(zzdee zzdeeVar) {
        this.zzepy = zzdeeVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzceo> zza(zzdfa zzdfaVar) {
        this.zzepx = zzdfaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzceo> zza(zzdha zzdhaVar) {
        this.zzepv = zzdhaVar;
        return this;
    }
}
