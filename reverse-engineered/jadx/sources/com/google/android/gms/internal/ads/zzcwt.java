package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcwt implements zzdah<Bundle> {
    private final float zzdmn;
    private final int zzdpr;
    private final boolean zzdps;
    private final boolean zzdpt;
    private final int zzdpu;
    private final int zzdpv;
    private final int zzdpw;
    private final boolean zzgmn;

    public zzcwt(int i, boolean z, boolean z2, int i2, int i3, int i4, float f, boolean z3) {
        this.zzdpr = i;
        this.zzdps = z;
        this.zzdpt = z2;
        this.zzdpu = i2;
        this.zzdpv = i3;
        this.zzdpw = i4;
        this.zzdmn = f;
        this.zzgmn = z3;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putInt("am", this.zzdpr);
        bundle2.putBoolean("ma", this.zzdps);
        bundle2.putBoolean("sp", this.zzdpt);
        bundle2.putInt("muv", this.zzdpu);
        bundle2.putInt("rm", this.zzdpv);
        bundle2.putInt("riv", this.zzdpw);
        bundle2.putFloat("android_app_volume", this.zzdmn);
        bundle2.putBoolean("android_app_muted", this.zzgmn);
    }
}
