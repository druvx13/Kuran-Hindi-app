package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxj implements zzdah<Bundle> {
    @Nullable
    private final Location zzmp;

    public zzcxj(@Nullable Location location) {
        this.zzmp = location;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.zzmp != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", this.zzmp.getAccuracy() * 1000.0f);
            bundle3.putLong("lat", (long) (this.zzmp.getLatitude() * 1.0E7d));
            bundle3.putLong("long", (long) (this.zzmp.getLongitude() * 1.0E7d));
            bundle3.putLong("time", this.zzmp.getTime() * 1000);
            bundle2.putBundle("uule", bundle3);
        }
    }
}
