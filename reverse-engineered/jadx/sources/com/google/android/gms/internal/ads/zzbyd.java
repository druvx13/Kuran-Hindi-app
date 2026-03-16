package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbyd implements zzbqx {
    private final zzbro zzfpi;
    private final zzdgo zzfpj;

    public zzbyd(zzbro zzbroVar, zzdgo zzdgoVar) {
        this.zzfpi = zzbroVar;
        this.zzfpj = zzdgoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdClosed() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zzb(zzasd zzasdVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdOpened() {
        if (this.zzfpj.zzgub == 0 || this.zzfpj.zzgub == 1) {
            this.zzfpi.onAdImpression();
        }
    }
}
