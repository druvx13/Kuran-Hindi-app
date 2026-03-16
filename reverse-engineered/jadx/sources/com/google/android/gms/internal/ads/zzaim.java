package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzaim {
    public static void zza(zzain zzainVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        zzainVar.zzj(str, jSONObject.toString());
    }

    public static void zza(zzain zzainVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zzainVar.zzda(sb.toString());
    }

    public static void zzb(zzain zzainVar, String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        zzawr.zzed(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        zzainVar.zzda(sb.toString());
    }

    public static void zza(zzain zzainVar, String str, Map map) {
        try {
            zzainVar.zzb(str, com.google.android.gms.ads.internal.zzq.zzkw().zzj(map));
        } catch (JSONException unused) {
            zzawr.zzfc("Could not convert parameters to JSON.");
        }
    }
}
