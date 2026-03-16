package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbf implements zzdah<JSONObject> {
    private final JSONObject zzgpe;

    public zzdbf(JSONObject jSONObject) {
        this.zzgpe = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            JSONObject zzb = zzayu.zzb(jSONObject, "content_info");
            JSONObject jSONObject2 = this.zzgpe;
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                zzb.put(next, jSONObject2.get(next));
            }
        } catch (JSONException unused) {
            zzawr.zzeg("Failed putting app indexing json.");
        }
    }
}
