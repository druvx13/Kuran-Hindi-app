package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdbt implements zzdak<zzdah<JSONObject>> {
    private final JSONObject zzgpp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdbt(Context context) {
        this.zzgpp = zzarv.zzy(context);
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdah<JSONObject>> zzaqa() {
        return zzdqw.zzag(new zzdah(this) { // from class: com.google.android.gms.internal.ads.zzdbw
            private final zzdbt zzgpq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgpq = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdah
            public final void zzs(Object obj) {
                this.zzgpq.zzq((JSONObject) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zzgpp);
        } catch (JSONException unused) {
            zzawr.zzeg("Failed putting version constants.");
        }
    }
}
