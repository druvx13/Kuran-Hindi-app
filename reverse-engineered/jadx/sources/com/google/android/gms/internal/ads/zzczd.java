package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzczd implements zzdah<Bundle> {
    private String zzdmh;

    public zzczd(String str) {
        this.zzdmh = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        bundle.putString("request_id", this.zzdmh);
    }
}
