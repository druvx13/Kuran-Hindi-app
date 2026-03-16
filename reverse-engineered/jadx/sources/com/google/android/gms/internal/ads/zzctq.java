package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzctq implements zzdqx<zzbws> {
    private final /* synthetic */ zzbxr zzgju;
    private final /* synthetic */ zzctr zzgjv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzctq(zzctr zzctrVar, zzbxr zzbxrVar) {
        this.zzgjv = zzctrVar;
        this.zzgju = zzbxrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        synchronized (this.zzgjv) {
            zzctr.zza(this.zzgjv, (zzdri) null);
            this.zzgju.zzaee().onAdFailedToLoad(zzcjk.zzd(th));
            zzdhn.zzc(th, "InterstitialAdManagerShim.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(zzbws zzbwsVar) {
        zzbws zzbwsVar2 = zzbwsVar;
        synchronized (this.zzgjv) {
            zzctr.zza(this.zzgjv, (zzdri) null);
            this.zzgjv.zzgjx = zzbwsVar2;
            zzbwsVar2.zzahk();
        }
    }
}
