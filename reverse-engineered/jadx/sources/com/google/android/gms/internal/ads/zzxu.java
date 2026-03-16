package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzxu extends zzvi {
    private final /* synthetic */ zzxv zzcgw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzxu(zzxv zzxvVar) {
        this.zzcgw = zzxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvi, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        VideoController videoController;
        videoController = this.zzcgw.zzcgy;
        videoController.zza(this.zzcgw.zzdu());
        super.onAdLoaded();
    }

    @Override // com.google.android.gms.internal.ads.zzvi, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(int i) {
        VideoController videoController;
        videoController = this.zzcgw.zzcgy;
        videoController.zza(this.zzcgw.zzdu());
        super.onAdFailedToLoad(i);
    }
}
