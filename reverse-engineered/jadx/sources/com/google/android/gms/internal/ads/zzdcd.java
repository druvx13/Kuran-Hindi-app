package com.google.android.gms.internal.ads;

import android.location.Location;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdcd implements zzdah<JSONObject> {
    private final Location zzmp;

    public zzdcd(Location location) {
        this.zzmp = location;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        try {
            if (this.zzmp != null) {
                JSONObject jSONObject3 = new JSONObject();
                Float valueOf = Float.valueOf(this.zzmp.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(this.zzmp.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (this.zzmp.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (this.zzmp.getLongitude() * 1.0E7d));
                jSONObject3.put("radius", valueOf);
                jSONObject3.put("lat", valueOf3);
                jSONObject3.put("long", valueOf4);
                jSONObject3.put("time", valueOf2);
                jSONObject2.put("uule", jSONObject3);
            }
        } catch (JSONException e) {
            zzawr.zza("Failed adding location to the request JSON.", e);
        }
    }
}
