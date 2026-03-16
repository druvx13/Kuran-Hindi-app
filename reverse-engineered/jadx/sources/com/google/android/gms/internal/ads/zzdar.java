package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdar implements zzdah<Bundle> {
    private final String zzdpx;
    private final int zzdpy;
    private final int zzdpz;
    private final int zzdqa;
    private final boolean zzdqb;
    private final int zzdqc;

    public zzdar(String str, int i, int i2, int i3, boolean z, int i4) {
        this.zzdpx = str;
        this.zzdpy = i;
        this.zzdpz = i2;
        this.zzdqa = i3;
        this.zzdqb = z;
        this.zzdqc = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.zzdpx;
        zzdhj.zza(bundle2, "carrier", str, !TextUtils.isEmpty(str));
        zzdhj.zza(bundle2, "cnt", Integer.valueOf(this.zzdpy), this.zzdpy != -2);
        bundle2.putInt("gnt", this.zzdpz);
        bundle2.putInt("pt", this.zzdqa);
        Bundle zza = zzdhj.zza(bundle2, "device");
        bundle2.putBundle("device", zza);
        Bundle zza2 = zzdhj.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzdqc);
        zza2.putBoolean("active_network_metered", this.zzdqb);
    }
}
