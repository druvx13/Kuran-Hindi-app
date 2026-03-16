package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzuf extends zzvp {
    private final AdListener zzcee;

    public zzuf(AdListener adListener) {
        this.zzcee = adListener;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void onAdClosed() {
        this.zzcee.onAdClosed();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void onAdFailedToLoad(int i) {
        this.zzcee.onAdFailedToLoad(i);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void onAdLeftApplication() {
        this.zzcee.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void onAdLoaded() {
        this.zzcee.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void onAdOpened() {
        this.zzcee.onAdOpened();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void onAdClicked() {
        this.zzcee.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void onAdImpression() {
        this.zzcee.onAdImpression();
    }

    public final AdListener getAdListener() {
        return this.zzcee;
    }
}
