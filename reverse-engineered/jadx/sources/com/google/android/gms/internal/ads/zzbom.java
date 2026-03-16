package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbom implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzbrx zzflh;
    private AtomicBoolean zzfli = new AtomicBoolean(false);

    public zzbom(zzbrx zzbrxVar) {
        this.zzflh = zzbrxVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zztz() {
        this.zzfli.set(true);
        this.zzflh.onAdClosed();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzua() {
        this.zzflh.onAdOpened();
    }

    public final boolean isClosed() {
        return this.zzfli.get();
    }
}
