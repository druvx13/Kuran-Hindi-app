package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdby implements zzdah<JSONObject> {
    private String zzgps;
    private String zzgpt;

    public zzdby(String str, String str2) {
        this.zzgps = str;
        this.zzgpt = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            JSONObject zzb = zzayu.zzb(jSONObject, "pii");
            zzb.put("doritos", this.zzgps);
            zzb.put("doritos_v2", this.zzgpt);
        } catch (JSONException unused) {
            zzawr.zzeg("Failed putting doritos string.");
        }
    }
}
