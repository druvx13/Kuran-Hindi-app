package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbj implements zzdah<JSONObject> {
    private String zzgpi;

    public zzdbj(String str) {
        this.zzgpi = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        try {
            JSONObject zzb = zzayu.zzb(jSONObject, "pii");
            if (TextUtils.isEmpty(this.zzgpi)) {
                return;
            }
            zzb.put("attok", this.zzgpi);
        } catch (JSONException e) {
            zzawr.zza("Failed putting attestation token.", e);
        }
    }
}
