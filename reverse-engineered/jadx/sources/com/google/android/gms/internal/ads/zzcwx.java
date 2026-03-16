package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcwx implements zzdah<Bundle> {
    private final double zzdqd;
    private final boolean zzdqe;

    public zzcwx(double d, boolean z) {
        this.zzdqd = d;
        this.zzdqe = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle zza = zzdhj.zza(bundle2, "device");
        bundle2.putBundle("device", zza);
        Bundle zza2 = zzdhj.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzdqe);
        zza2.putDouble("battery_level", this.zzdqd);
    }
}
