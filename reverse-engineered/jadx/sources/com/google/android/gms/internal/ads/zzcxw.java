package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxw implements zzdah<Bundle> {
    private final Bundle zzgnd;

    public zzcxw(Bundle bundle) {
        this.zzgnd = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        bundle.putBundle("content_info", this.zzgnd);
    }
}
