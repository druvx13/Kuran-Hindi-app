package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcvx implements zzdah<Bundle> {
    private final Bundle zzglz;

    private zzcvx(Bundle bundle) {
        this.zzglz = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.zzglz.isEmpty()) {
            return;
        }
        bundle2.putBundle("installed_adapter_data", this.zzglz);
    }
}
