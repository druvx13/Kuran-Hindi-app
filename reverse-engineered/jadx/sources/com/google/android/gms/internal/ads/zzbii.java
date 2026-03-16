package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbii implements zzbms {
    private zzbqj zzept;
    private zzdha zzepv;
    private zzbyl zzepw;
    private zzdfa zzepx;
    private zzdee zzepy;
    private final /* synthetic */ zzbhw zzewb;
    private zzbuj zzewc;
    private zzbls zzfbn;
    private zzcsm zzfcf;
    private zzbnp zzfcg;

    private zzbii(zzbhw zzbhwVar) {
        this.zzewb = zzbhwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    /* renamed from: zzafg */
    public final zzbmt zzaeg() {
        zzehf.zza(this.zzewc, zzbuj.class);
        zzehf.zza(this.zzept, zzbqj.class);
        zzehf.zza(this.zzfcf, zzcsm.class);
        zzehf.zza(this.zzfcg, zzbnp.class);
        zzehf.zza(this.zzfbn, zzbls.class);
        zzehf.zza(this.zzepw, zzbyl.class);
        return new zzbih(this.zzewb, this.zzfbn, this.zzepw, new zzbox(), new zzdhw(), new zzbpx(), new zzcin(), this.zzewc, this.zzept, new zzdie(), this.zzfcf, this.zzfcg, this.zzepv, this.zzepx, this.zzepy);
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final /* synthetic */ zzbms zzb(zzbyl zzbylVar) {
        this.zzepw = (zzbyl) zzehf.checkNotNull(zzbylVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final /* synthetic */ zzbms zzb(zzbls zzblsVar) {
        this.zzfbn = (zzbls) zzehf.checkNotNull(zzblsVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final /* synthetic */ zzbms zza(zzbnp zzbnpVar) {
        this.zzfcg = (zzbnp) zzehf.checkNotNull(zzbnpVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final /* synthetic */ zzbms zza(zzcsm zzcsmVar) {
        this.zzfcf = (zzcsm) zzehf.checkNotNull(zzcsmVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final /* synthetic */ zzbms zzc(zzbqj zzbqjVar) {
        this.zzept = (zzbqj) zzehf.checkNotNull(zzbqjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbms
    public final /* synthetic */ zzbms zzc(zzbuj zzbujVar) {
        this.zzewc = (zzbuj) zzehf.checkNotNull(zzbujVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzbmt> zza(zzdee zzdeeVar) {
        this.zzepy = zzdeeVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzbmt> zza(zzdfa zzdfaVar) {
        this.zzepx = zzdfaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final /* synthetic */ zzbqg<zzbmt> zza(zzdha zzdhaVar) {
        this.zzepv = zzdhaVar;
        return this;
    }
}
