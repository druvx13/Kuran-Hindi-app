package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcuc implements zzdqx<zzbns> {
    private final /* synthetic */ zzctz zzgkk;
    private final /* synthetic */ zzbyp zzgkl;
    private final /* synthetic */ zzcub zzgkm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcuc(zzcub zzcubVar, zzctz zzctzVar, zzbyp zzbypVar) {
        this.zzgkm = zzcubVar;
        this.zzgkk = zzctzVar;
        this.zzgkl = zzbypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        this.zzgkl.zzaee().onAdFailedToLoad(zzcjk.zzd(th));
        zzdhn.zzc(th, "NativeAdLoader.onFailure");
        this.zzgkk.zzapn();
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(zzbns zzbnsVar) {
        zzbns zzbnsVar2 = zzbnsVar;
        synchronized (this.zzgkm) {
            this.zzgkk.onSuccess(zzbnsVar2);
        }
    }
}
