package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzaok implements com.google.android.gms.ads.internal.overlay.zzo {
    private final /* synthetic */ zzaol zzdhz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaok(zzaol zzaolVar) {
        this.zzdhz = zzaolVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zztz() {
        MediationInterstitialListener mediationInterstitialListener;
        zzazw.zzed("AdMobCustomTabsAdapter overlay is closed.");
        mediationInterstitialListener = this.zzdhz.zzdib;
        mediationInterstitialListener.onAdClosed(this.zzdhz);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
        zzazw.zzed("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
        zzazw.zzed("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzua() {
        MediationInterstitialListener mediationInterstitialListener;
        zzazw.zzed("Opening AdMobCustomTabsAdapter overlay.");
        mediationInterstitialListener = this.zzdhz.zzdib;
        mediationInterstitialListener.onAdOpened(this.zzdhz);
    }
}
