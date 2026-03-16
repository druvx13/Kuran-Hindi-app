package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzph implements MediaCodec.OnFrameRenderedListener {
    private final /* synthetic */ zzpg zzbjp;

    private zzph(zzpg zzpgVar, MediaCodec mediaCodec) {
        this.zzbjp = zzpgVar;
        mediaCodec.setOnFrameRenderedListener(this, new zzdns());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        if (this != this.zzbjp.zzbjm) {
            return;
        }
        this.zzbjp.zzji();
    }
}
