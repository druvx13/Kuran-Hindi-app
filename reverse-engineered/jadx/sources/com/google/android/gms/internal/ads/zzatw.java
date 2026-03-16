package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAdCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzatw extends zzatj {
    private final RewardedAdCallback zzdrk;

    public zzatw(RewardedAdCallback rewardedAdCallback) {
        this.zzdrk = rewardedAdCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void onRewardedAdOpened() {
        RewardedAdCallback rewardedAdCallback = this.zzdrk;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdOpened();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void onRewardedAdClosed() {
        RewardedAdCallback rewardedAdCallback = this.zzdrk;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdClosed();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void zza(zzate zzateVar) {
        RewardedAdCallback rewardedAdCallback = this.zzdrk;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onUserEarnedReward(new zzatt(zzateVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatk
    public final void onRewardedAdFailedToShow(int i) {
        RewardedAdCallback rewardedAdCallback = this.zzdrk;
        if (rewardedAdCallback != null) {
            rewardedAdCallback.onRewardedAdFailedToShow(i);
        }
    }
}
