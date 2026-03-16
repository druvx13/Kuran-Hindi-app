package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzalk {
    public final List<zzall> zzdes;
    private final long zzdet;
    private final List<String> zzdeu;
    private final List<String> zzdev;
    private final List<String> zzdew;
    private final List<String> zzdex;
    private final List<String> zzdey;
    private final boolean zzdez;
    private final String zzdfa;
    private final long zzdfb;
    private final String zzdfc;
    private final int zzdfd;
    private final int zzdfe;
    private final long zzdff;
    private final boolean zzdfg;
    private final boolean zzdfh;
    private final boolean zzdfi;
    private final boolean zzdfj;
    private int zzdfk;
    private int zzdfl;
    private boolean zzdfm;

    public zzalk(JSONObject jSONObject) throws JSONException {
        if (zzawr.isLoggable(2)) {
            String valueOf = String.valueOf(jSONObject.toString(2));
            zzawr.zzeg(valueOf.length() != 0 ? "Mediation Response JSON: ".concat(valueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i = -1;
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                zzall zzallVar = new zzall(jSONArray.getJSONObject(i2));
                boolean z = true;
                if ("banner".equalsIgnoreCase(zzallVar.zzdgi)) {
                    this.zzdfm = true;
                }
                arrayList.add(zzallVar);
                if (i < 0) {
                    Iterator<String> it = zzallVar.zzdfp.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        i = i2;
                    }
                }
            } catch (JSONException unused) {
            }
        }
        this.zzdfk = i;
        this.zzdfl = jSONArray.length();
        this.zzdes = Collections.unmodifiableList(arrayList);
        this.zzdfa = jSONObject.optString("qdata");
        this.zzdfe = jSONObject.optInt("fs_model_type", -1);
        this.zzdff = jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            this.zzdet = optJSONObject.optLong("ad_network_timeout_millis", -1L);
            com.google.android.gms.ads.internal.zzq.zzlo();
            this.zzdeu = zzaln.zza(optJSONObject, "click_urls");
            com.google.android.gms.ads.internal.zzq.zzlo();
            this.zzdev = zzaln.zza(optJSONObject, "imp_urls");
            com.google.android.gms.ads.internal.zzq.zzlo();
            this.zzdew = zzaln.zza(optJSONObject, "downloaded_imp_urls");
            com.google.android.gms.ads.internal.zzq.zzlo();
            this.zzdex = zzaln.zza(optJSONObject, "nofill_urls");
            com.google.android.gms.ads.internal.zzq.zzlo();
            this.zzdey = zzaln.zza(optJSONObject, "remote_ping_urls");
            this.zzdez = optJSONObject.optBoolean("render_in_browser", false);
            long optLong = optJSONObject.optLong("refresh", -1L);
            this.zzdfb = optLong > 0 ? 1000 * optLong : -1L;
            zzatc zza = zzatc.zza(optJSONObject.optJSONArray("rewards"));
            if (zza == null) {
                this.zzdfc = null;
                this.zzdfd = 0;
            } else {
                this.zzdfc = zza.type;
                this.zzdfd = zza.zzdqy;
            }
            this.zzdfg = optJSONObject.optBoolean("use_displayed_impression", false);
            this.zzdfh = optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            this.zzdfi = optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            this.zzdfj = optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.zzdet = -1L;
        this.zzdeu = null;
        this.zzdev = null;
        this.zzdew = null;
        this.zzdex = null;
        this.zzdey = null;
        this.zzdfb = -1L;
        this.zzdfc = null;
        this.zzdfd = 0;
        this.zzdfg = false;
        this.zzdez = false;
        this.zzdfh = false;
        this.zzdfi = false;
        this.zzdfj = false;
    }
}
