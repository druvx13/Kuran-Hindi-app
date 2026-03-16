package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzclv implements zzdkb {
    static final zzdkb zzgaz = new zzclv();

    private zzclv() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkb
    public final Object apply(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        zzawr.zzeg("Ad request signals:");
        zzawr.zzeg(jSONObject.toString(2));
        return jSONObject;
    }
}
