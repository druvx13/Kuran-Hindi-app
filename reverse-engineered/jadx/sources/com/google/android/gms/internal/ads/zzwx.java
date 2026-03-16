package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzwx extends zzwv {
    private final MuteThisAdListener zzcgj;

    public zzwx(MuteThisAdListener muteThisAdListener) {
        this.zzcgj = muteThisAdListener;
    }

    @Override // com.google.android.gms.internal.ads.zzws
    public final void onAdMuted() {
        this.zzcgj.onAdMuted();
    }
}
