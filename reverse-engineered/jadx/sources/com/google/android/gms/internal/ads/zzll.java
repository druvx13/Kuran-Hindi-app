package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzll implements zzli {
    private zzll() {
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final boolean zzhk() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final int getCodecCount() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final MediaCodecInfo getCodecInfoAt(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.google.android.gms.internal.ads.zzli
    public final boolean zza(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
