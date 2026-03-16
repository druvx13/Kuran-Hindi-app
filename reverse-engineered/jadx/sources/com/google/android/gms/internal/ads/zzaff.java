package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzaff implements Runnable {
    private final /* synthetic */ PublisherAdView zzczr;
    private final /* synthetic */ zzvz zzczs;
    private final /* synthetic */ zzafc zzczt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaff(zzafc zzafcVar, PublisherAdView publisherAdView, zzvz zzvzVar) {
        this.zzczt = zzafcVar;
        this.zzczr = publisherAdView;
        this.zzczs = zzvzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener;
        if (!this.zzczr.zza(this.zzczs)) {
            zzazw.zzfc("Could not bind.");
            return;
        }
        onPublisherAdViewLoadedListener = this.zzczt.zzczo;
        onPublisherAdViewLoadedListener.onPublisherAdViewLoaded(this.zzczr);
    }
}
