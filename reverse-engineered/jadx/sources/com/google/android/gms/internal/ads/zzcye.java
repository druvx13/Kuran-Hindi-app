package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcye implements zzdah<Bundle> {
    private final Bundle zzdmw;

    public zzcye(Bundle bundle) {
        this.zzdmw = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle zza = zzdhj.zza(bundle2, "device");
        zza.putBundle("android_mem_info", this.zzdmw);
        bundle2.putBundle("device", zza);
    }
}
