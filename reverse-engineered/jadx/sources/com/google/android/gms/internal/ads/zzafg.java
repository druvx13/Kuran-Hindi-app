package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzafg implements zzaga<Object> {
    private final zzafj zzczu;

    public zzafg(zzafj zzafjVar) {
        this.zzczu = zzafjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(Object obj, Map<String, String> map) {
        if (this.zzczu == null) {
            return;
        }
        String str = map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str == null) {
            zzawr.zzfb("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundle = null;
        if (map.containsKey("info")) {
            try {
                bundle = zzayu.zzh(new JSONObject(map.get("info")));
            } catch (JSONException e) {
                zzawr.zzc("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundle == null) {
            zzawr.zzfa("Failed to convert ad metadata to Bundle.");
        } else {
            this.zzczu.zza(str, bundle);
        }
    }
}
