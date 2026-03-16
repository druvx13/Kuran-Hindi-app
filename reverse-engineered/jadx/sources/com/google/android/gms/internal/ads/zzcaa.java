package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcaa extends zzcab {
    private final boolean zzdfh;
    private final boolean zzdfi;
    private final boolean zzdos;
    private final JSONObject zzfsm;
    private final boolean zzfsn;

    public zzcaa(zzdgo zzdgoVar, JSONObject jSONObject) {
        super(zzdgoVar);
        boolean z = false;
        this.zzfsm = zzayu.zza(jSONObject, "tracking_urls_and_actions", "active_view");
        this.zzdfi = zzayu.zza(false, jSONObject, "allow_pub_owned_ad_view");
        this.zzdfh = zzayu.zza(false, jSONObject, "attribution", "allow_pub_rendering");
        this.zzdos = zzayu.zza(false, jSONObject, "enable_omid");
        if (jSONObject != null && jSONObject.optJSONObject("overlay") != null) {
            z = true;
        }
        this.zzfsn = z;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final JSONObject zzalh() {
        JSONObject jSONObject = this.zzfsm;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.zzfso.zzdob);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final boolean zzali() {
        return this.zzfsn;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final boolean zzalj() {
        return this.zzdfi;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final boolean zzaks() {
        return this.zzdos;
    }

    @Override // com.google.android.gms.internal.ads.zzcab
    public final boolean zzalk() {
        return this.zzdfh;
    }
}
