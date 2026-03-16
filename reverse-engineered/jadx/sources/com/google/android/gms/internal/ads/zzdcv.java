package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdcv implements zzdah<JSONObject> {
    private final Map<String, Object> zzgqb;

    public zzdcv(Map<String, Object> map) {
        this.zzgqb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            jSONObject.put("video_decoders", com.google.android.gms.ads.internal.zzq.zzkw().zzj(this.zzgqb));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e.getMessage());
            zzawr.zzeg(valueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(valueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}
