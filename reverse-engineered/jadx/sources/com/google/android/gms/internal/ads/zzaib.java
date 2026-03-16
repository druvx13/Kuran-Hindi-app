package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.instream.InstreamAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaib extends zzahx {
    private final InstreamAd.InstreamAdLoadCallback zzdbp;

    public zzaib(InstreamAd.InstreamAdLoadCallback instreamAdLoadCallback) {
        this.zzdbp = instreamAdLoadCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void zza(zzaho zzahoVar) {
        this.zzdbp.onInstreamAdLoaded(new zzahz(zzahoVar));
    }

    @Override // com.google.android.gms.internal.ads.zzahu
    public final void onInstreamAdFailedToLoad(int i) {
        this.zzdbp.onInstreamAdFailedToLoad(i);
    }
}
