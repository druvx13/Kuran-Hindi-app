package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdav implements zzdah<JSONObject> {
    private final AdvertisingIdClient.Info zzgoy;
    private final String zzgoz;

    public zzdav(AdvertisingIdClient.Info info, String str) {
        this.zzgoy = info;
        this.zzgoz = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            JSONObject zzb = zzayu.zzb(jSONObject, "pii");
            if (this.zzgoy != null && !TextUtils.isEmpty(this.zzgoy.getId())) {
                zzb.put("rdid", this.zzgoy.getId());
                zzb.put("is_lat", this.zzgoy.isLimitAdTrackingEnabled());
                zzb.put("idtype", "adid");
                return;
            }
            zzb.put("pdid", this.zzgoz);
            zzb.put("pdidtype", "ssaid");
        } catch (JSONException e) {
            zzawr.zza("Failed putting Ad ID.", e);
        }
    }
}
