package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcck {
    private final Executor executor;
    private final zzcca zzfus;

    public zzcck(Executor executor, zzcca zzccaVar) {
        this.executor = executor;
        this.zzfus = zzccaVar;
    }

    public final zzdri<List<zzccp>> zzg(JSONObject jSONObject, String str) {
        zzdri zzag;
        final String optString;
        char c;
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return zzdqw.zzag(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null && (optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME)) != null) {
                String optString2 = optJSONObject.optString("type");
                if ("string".equals(optString2)) {
                    c = 1;
                } else {
                    c = "image".equals(optString2) ? (char) 2 : (char) 0;
                }
                if (c == 1) {
                    zzag = zzdqw.zzag(new zzccp(optString, optJSONObject.optString("string_value")));
                } else if (c == 2) {
                    zzag = zzdqw.zzb(this.zzfus.zzc(optJSONObject, "image_value"), new zzdnx(optString) { // from class: com.google.android.gms.internal.ads.zzccm
                        private final String zzdcd;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdcd = optString;
                        }

                        @Override // com.google.android.gms.internal.ads.zzdnx
                        public final Object apply(Object obj) {
                            return new zzccp(this.zzdcd, (zzace) obj);
                        }
                    }, this.executor);
                }
                arrayList.add(zzag);
            }
            zzag = zzdqw.zzag(null);
            arrayList.add(zzag);
        }
        return zzdqw.zzb(zzdqw.zzi(arrayList), zzccn.zzdsc, this.executor);
    }
}
