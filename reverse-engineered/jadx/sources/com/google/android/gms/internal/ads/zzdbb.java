package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbb implements zzdah<JSONObject> {
    private final String zzgpc;

    public zzdbb(String str) {
        this.zzgpc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            jSONObject.put("ms", this.zzgpc);
        } catch (JSONException e) {
            zzawr.zza("Failed putting Ad ID.", e);
        }
    }
}
