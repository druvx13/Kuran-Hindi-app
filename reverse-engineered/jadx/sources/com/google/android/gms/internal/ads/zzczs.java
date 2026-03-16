package com.google.android.gms.internal.ads;

import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzczs implements zzdah<Bundle> {
    private final String zzdsr;
    private final String zzgnw;
    private final String zzgnx;
    private final String zzgny;
    private final Long zzgnz;

    public zzczs(String str, String str2, String str3, String str4, Long l) {
        this.zzdsr = str;
        this.zzgnw = str2;
        this.zzgnx = str3;
        this.zzgny = str4;
        this.zzgnz = l;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzdhj.zza(bundle2, "gmp_app_id", this.zzdsr);
        zzdhj.zza(bundle2, "fbs_aiid", this.zzgnw);
        zzdhj.zza(bundle2, "fbs_aeid", this.zzgnx);
        zzdhj.zza(bundle2, "apm_id_origin", this.zzgny);
        Long l = this.zzgnz;
        if (l != null) {
            bundle2.putLong("sai_timeout", l.longValue());
        }
    }
}
