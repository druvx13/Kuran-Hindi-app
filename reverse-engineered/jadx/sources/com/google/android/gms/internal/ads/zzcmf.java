package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzcmf implements zzaki<zzcmc> {
    @Override // com.google.android.gms.internal.ads.zzaki
    public final /* synthetic */ JSONObject zzj(zzcmc zzcmcVar) throws JSONException {
        zzcmc zzcmcVar2 = zzcmcVar;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", zzcmcVar2.zzgcs.zzuw());
        jSONObject2.put("signals", zzcmcVar2.zzgcr);
        jSONObject3.put("body", zzcmcVar2.zzgcq.zzdnr);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.zzq.zzkw().zzj(zzcmcVar2.zzgcq.zzab));
        jSONObject3.put("response_code", zzcmcVar2.zzgcq.zzgcz);
        jSONObject3.put("latency", zzcmcVar2.zzgcq.zzgda);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzcmcVar2.zzgcs.zzuz());
        return jSONObject;
    }
}
