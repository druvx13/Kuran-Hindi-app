package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcvk implements zzdah<Bundle> {
    private final zzdhe zzfll;

    public zzcvk(zzdhe zzdheVar) {
        Preconditions.checkNotNull(zzdheVar, "the targeting must not be null");
        this.zzfll = zzdheVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzuj zzujVar = this.zzfll.zzguw;
        bundle2.putString("slotname", this.zzfll.zzgux);
        int i = zzcvj.zzfwx[this.zzfll.zzgvd.zzguh - 1];
        if (i == 1) {
            bundle2.putBoolean("is_new_rewarded", true);
        } else if (i == 2) {
            bundle2.putBoolean("is_rewarded_interstitial", true);
        }
        zzdhj.zza(bundle2, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzujVar.zzceg)), zzujVar.zzceg != -1);
        zzdhj.zza(bundle2, "extras", zzujVar.extras);
        zzdhj.zza(bundle2, "cust_gender", Integer.valueOf(zzujVar.zzceh), zzujVar.zzceh != -1);
        zzdhj.zza(bundle2, "kw", zzujVar.zzcei);
        zzdhj.zza(bundle2, "tag_for_child_directed_treatment", Integer.valueOf(zzujVar.zzacq), zzujVar.zzacq != -1);
        if (zzujVar.zzcej) {
            bundle2.putBoolean("test_request", zzujVar.zzcej);
        }
        zzdhj.zza(bundle2, "d_imp_hdr", (Integer) 1, zzujVar.versionCode >= 2 && zzujVar.zzbli);
        zzdhj.zza(bundle2, "ppid", zzujVar.zzcek, zzujVar.versionCode >= 2 && !TextUtils.isEmpty(zzujVar.zzcek));
        if (zzujVar.zzmp != null) {
            Location location = zzujVar.zzmp;
            Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
            Long valueOf2 = Long.valueOf(location.getTime() * 1000);
            Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
            Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", valueOf.floatValue());
            bundle3.putLong("lat", valueOf3.longValue());
            bundle3.putLong("long", valueOf4.longValue());
            bundle3.putLong("time", valueOf2.longValue());
            bundle2.putBundle("uule", bundle3);
        }
        zzdhj.zza(bundle2, ImagesContract.URL, zzujVar.zzcem);
        zzdhj.zza(bundle2, "neighboring_content_urls", zzujVar.zzcet);
        zzdhj.zza(bundle2, "custom_targeting", zzujVar.zzceo);
        zzdhj.zza(bundle2, "category_exclusions", zzujVar.zzcep);
        zzdhj.zza(bundle2, "request_agent", zzujVar.zzceq);
        zzdhj.zza(bundle2, "request_pkg", zzujVar.zzcer);
        zzdhj.zza(bundle2, "is_designed_for_families", Boolean.valueOf(zzujVar.zzces), zzujVar.versionCode >= 7);
        if (zzujVar.versionCode >= 8) {
            zzdhj.zza(bundle2, "tag_for_under_age_of_consent", Integer.valueOf(zzujVar.zzacr), zzujVar.zzacr != -1);
            zzdhj.zza(bundle2, "max_ad_content_rating", zzujVar.zzacs);
        }
    }
}
