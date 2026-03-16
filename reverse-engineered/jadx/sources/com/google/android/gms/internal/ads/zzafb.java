package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeContentAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzafb extends zzadw {
    private final NativeContentAd.OnContentAdLoadedListener zzczn;

    public zzafb(NativeContentAd.OnContentAdLoadedListener onContentAdLoadedListener) {
        this.zzczn = onContentAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zza(zzadk zzadkVar) {
        this.zzczn.onContentAdLoaded(new zzadp(zzadkVar));
    }
}
