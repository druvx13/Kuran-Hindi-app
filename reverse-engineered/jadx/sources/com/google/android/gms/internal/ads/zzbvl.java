package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbvl implements zzbqx {
    private boolean zzfoj = false;

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdOpened() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zzb(zzasd zzasdVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdClosed() {
        this.zzfoj = true;
    }
}
