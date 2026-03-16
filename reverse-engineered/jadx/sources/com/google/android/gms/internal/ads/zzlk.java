package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzlk implements zzli {
    private final int zzbao;
    private MediaCodecInfo[] zzbap;

    public zzlk(boolean z) {
        this.zzbao = z ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final boolean zzhk() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final int getCodecCount() {
        zzhl();
        return this.zzbap.length;
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final MediaCodecInfo getCodecInfoAt(int i) {
        zzhl();
        return this.zzbap[i];
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final boolean zza(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private final void zzhl() {
        if (this.zzbap == null) {
            this.zzbap = new MediaCodecList(this.zzbao).getCodecInfos();
        }
    }
}
