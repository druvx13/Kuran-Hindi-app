package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzbso implements zzbuk {
    static final zzbuk zzfnf = new zzbso();

    private zzbso() {
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void zzp(Object obj) {
        ((AdMetadataListener) obj).onAdMetadataChanged();
    }
}
