package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzzf extends zzxp {
    private final VideoController.VideoLifecycleCallbacks zzacx;

    public zzzf(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zzacx = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void onVideoStart() {
        this.zzacx.onVideoStart();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void onVideoPlay() {
        this.zzacx.onVideoPlay();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void onVideoPause() {
        this.zzacx.onVideoPause();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void onVideoEnd() {
        this.zzacx.onVideoEnd();
    }

    @Override // com.google.android.gms.internal.ads.zzxm
    public final void onVideoMute(boolean z) {
        this.zzacx.onVideoMute(z);
    }
}
