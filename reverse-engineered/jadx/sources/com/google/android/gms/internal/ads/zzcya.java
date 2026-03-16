package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcya implements zzdah<Bundle> {
    private final String zzdmx;
    private final boolean zzdmz;

    public zzcya(String str, boolean z) {
        this.zzdmx = str;
        this.zzdmz = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.zzdmx);
        if (this.zzdmz) {
            bundle2.putString("de", "1");
        }
    }
}
