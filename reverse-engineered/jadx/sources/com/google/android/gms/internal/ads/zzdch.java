package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdch implements zzdah<JSONObject> {
    private Bundle zzgpw;

    public zzdch(Bundle bundle) {
        this.zzgpw = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzdah
    public final /* synthetic */ void zzs(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (this.zzgpw != null) {
            try {
                zzayu.zzb(zzayu.zzb(jSONObject2, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.zzq.zzkw().zzd(this.zzgpw));
            } catch (JSONException unused) {
                zzawr.zzeg("Failed putting parental controls bundle.");
            }
        }
    }
}
