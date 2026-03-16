package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbp implements zzdah<JSONObject> {
    private JSONObject zzgpl;

    public zzdbp(JSONObject jSONObject) {
        this.zzgpl = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            jSONObject.put("cache_state", this.zzgpl);
        } catch (JSONException unused) {
            zzawr.zzeg("Unable to get cache_state");
        }
    }
}
