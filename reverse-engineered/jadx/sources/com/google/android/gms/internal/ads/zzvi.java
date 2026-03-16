package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public class zzvi extends AdListener {
    private final Object lock = new Object();
    private AdListener zzcfy;

    public final void zza(AdListener adListener) {
        synchronized (this.lock) {
            this.zzcfy = adListener;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        synchronized (this.lock) {
            if (this.zzcfy != null) {
                this.zzcfy.onAdClosed();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(int i) {
        synchronized (this.lock) {
            if (this.zzcfy != null) {
                this.zzcfy.onAdFailedToLoad(i);
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLeftApplication() {
        synchronized (this.lock) {
            if (this.zzcfy != null) {
                this.zzcfy.onAdLeftApplication();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        synchronized (this.lock) {
            if (this.zzcfy != null) {
                this.zzcfy.onAdOpened();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.lock) {
            if (this.zzcfy != null) {
                this.zzcfy.onAdLoaded();
            }
        }
    }
}
