package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcor implements zzdqx<zzblx> {
    private final /* synthetic */ zzcom zzgfj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcor(zzcom zzcomVar) {
        this.zzgfj = zzcomVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
        zzbra zzbraVar;
        zzbraVar = this.zzgfj.zzfoe;
        zzbraVar.onAdFailedToLoad(zzcjk.zzd(th));
        zzdhn.zzc(th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(zzblx zzblxVar) {
        zzblxVar.zzahk();
    }
}
