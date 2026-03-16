package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaox {
    private final boolean zzdjc;
    private final boolean zzdjd;
    private final boolean zzdje;
    private final boolean zzdjf;
    private final boolean zzdjg;

    private zzaox(zzaoz zzaozVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        z = zzaozVar.zzdjc;
        this.zzdjc = z;
        z2 = zzaozVar.zzdjd;
        this.zzdjd = z2;
        z3 = zzaozVar.zzdje;
        this.zzdje = z3;
        z4 = zzaozVar.zzdjf;
        this.zzdjf = z4;
        z5 = zzaozVar.zzdjg;
        this.zzdjg = z5;
    }

    public final JSONObject zzuc() {
        try {
            return new JSONObject().put("sms", this.zzdjc).put("tel", this.zzdjd).put("calendar", this.zzdje).put("storePicture", this.zzdjf).put("inlineVideo", this.zzdjg);
        } catch (JSONException e) {
            zzawr.zzc("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
