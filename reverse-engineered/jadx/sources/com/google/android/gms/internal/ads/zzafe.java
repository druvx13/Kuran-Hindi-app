package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzafe extends zzaek {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zzczq;

    public zzafe(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zzczq = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzael
    public final void zza(zzaes zzaesVar) {
        this.zzczq.onUnifiedNativeAdLoaded(new zzaex(zzaesVar));
    }
}
