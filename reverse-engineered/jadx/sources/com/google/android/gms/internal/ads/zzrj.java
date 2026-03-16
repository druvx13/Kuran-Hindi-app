package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAdPresentationCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzrj extends zzrr {
    private final AppOpenAdPresentationCallback zzbry;

    public zzrj(AppOpenAdPresentationCallback appOpenAdPresentationCallback) {
        this.zzbry = appOpenAdPresentationCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzrs
    public final void onAppOpenAdClosed() {
        this.zzbry.onAppOpenAdClosed();
    }
}
