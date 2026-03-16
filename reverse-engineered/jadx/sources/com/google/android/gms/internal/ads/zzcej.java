package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcej implements zzagk {
    private final zzbrx zzflh;
    private final zzatc zzfwu;
    private final String zzfwv;
    private final String zzfww;

    public zzcej(zzbrx zzbrxVar, zzdgo zzdgoVar) {
        this.zzflh = zzbrxVar;
        this.zzfwu = zzdgoVar.zzdoi;
        this.zzfwv = zzdgoVar.zzdgb;
        this.zzfww = zzdgoVar.zzdgc;
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzsm() {
        this.zzflh.onRewardedVideoStarted();
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    @ParametersAreNonnullByDefault
    public final void zza(zzatc zzatcVar) {
        String str;
        int i;
        zzatc zzatcVar2 = this.zzfwu;
        if (zzatcVar2 != null) {
            zzatcVar = zzatcVar2;
        }
        if (zzatcVar != null) {
            str = zzatcVar.type;
            i = zzatcVar.zzdqy;
        } else {
            str = "";
            i = 1;
        }
        this.zzflh.zzb(new zzasb(str, i), this.zzfwv, this.zzfww);
    }

    @Override // com.google.android.gms.internal.ads.zzagk
    public final void zzsn() {
        this.zzflh.onRewardedVideoCompleted();
    }
}
