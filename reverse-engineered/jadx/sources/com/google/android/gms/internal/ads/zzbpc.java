package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbpc implements zzbqx, zzbrp, zzbsm, zzbtm, zzub {
    private final Clock zzbnt;
    private final zzawc zzfly;

    public zzbpc(Clock clock, zzawc zzawcVar) {
        this.zzbnt = clock;
        this.zzfly = zzawcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdOpened() {
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

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzd(zzarj zzarjVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzub
    public final void onAdClicked() {
        this.zzfly.zzvs();
    }

    @Override // com.google.android.gms.internal.ads.zzbsm
    public final void onAdLoaded() {
        this.zzfly.zzan(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void onAdImpression() {
        this.zzfly.zzvr();
    }

    public final void zzf(zzuj zzujVar) {
        this.zzfly.zze(zzujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void zzb(zzdha zzdhaVar) {
        this.zzfly.zzey(this.zzbnt.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void onAdClosed() {
        this.zzfly.zzvt();
    }

    public final String zzvu() {
        return this.zzfly.zzvu();
    }
}
