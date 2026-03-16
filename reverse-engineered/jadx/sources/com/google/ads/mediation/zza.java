package com.google.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.reward.AdMetadataListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zza extends AdMetadataListener {
    private final /* synthetic */ AbstractAdViewAdapter zzmd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zza(AbstractAdViewAdapter abstractAdViewAdapter) {
        this.zzmd = abstractAdViewAdapter;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        InterstitialAd interstitialAd;
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener;
        InterstitialAd interstitialAd2;
        MediationRewardedVideoAdListener mediationRewardedVideoAdListener2;
        interstitialAd = this.zzmd.zzma;
        if (interstitialAd != null) {
            mediationRewardedVideoAdListener = this.zzmd.zzmb;
            if (mediationRewardedVideoAdListener != null) {
                interstitialAd2 = this.zzmd.zzma;
                Bundle adMetadata = interstitialAd2.getAdMetadata();
                mediationRewardedVideoAdListener2 = this.zzmd.zzmb;
                mediationRewardedVideoAdListener2.zzb(adMetadata);
            }
        }
    }
}
