package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcxu implements zzdah<Bundle> {
    private final String zzdnn;
    private final String zzgnb;
    private final Bundle zzgnc;

    private zzcxu(String str, String str2, Bundle bundle) {
        this.zzdnn = str;
        this.zzgnb = str2;
        this.zzgnc = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("consent_string", this.zzdnn);
        bundle2.putString("fc_consent", this.zzgnb);
        bundle2.putBundle("iab_consent_info", this.zzgnc);
    }
}
