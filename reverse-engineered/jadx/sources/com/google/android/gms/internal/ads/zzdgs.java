package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import android.util.JsonWriter;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdgs implements zzayv {
    public final String zzdku;
    public final String zzdkw;
    public final JSONObject zzfpz;
    private final JSONObject zzgui;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdgs(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzc = zzayu.zzc(jsonReader);
        this.zzgui = zzc;
        this.zzdkw = zzc.optString("ad_html", null);
        this.zzdku = this.zzgui.optString("ad_base_url", null);
        this.zzfpz = this.zzgui.optJSONObject("ad_json");
    }

    @Override // com.google.android.gms.internal.ads.zzayv
    public final void zza(JsonWriter jsonWriter) throws IOException {
        zzayu.zza(jsonWriter, this.zzgui);
    }
}
