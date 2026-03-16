package com.google.android.gms.internal.ads;

import org.json.JSONException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbqs extends zzxj {
    private final String zzfna;
    private final String zzfnb;

    public zzbqs(zzdgo zzdgoVar, String str) {
        this.zzfnb = zzdgoVar == null ? null : zzdgoVar.zzfnb;
        String zzb = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) ? zzb(zzdgoVar) : null;
        this.zzfna = zzb != null ? zzb : str;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final String getMediationAdapterClassName() {
        return this.zzfna;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final String getResponseId() {
        return this.zzfnb;
    }

    private static String zzb(zzdgo zzdgoVar) {
        try {
            return zzdgoVar.zzgtu.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }
}
