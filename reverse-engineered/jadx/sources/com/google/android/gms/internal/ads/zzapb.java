package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzapb {
    private final zzbek zzdce;
    private final String zzdjm;

    public zzapb(zzbek zzbekVar) {
        this(zzbekVar, "");
    }

    public zzapb(zzbek zzbekVar, String str) {
        this.zzdce = zzbekVar;
        this.zzdjm = str;
    }

    public final void zzdv(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzdjm);
            if (this.zzdce != null) {
                this.zzdce.zzb("onError", put);
            }
        } catch (JSONException e) {
            zzawr.zzc("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzdw(String str) {
        try {
            this.zzdce.zzb("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            zzawr.zzc("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        try {
            this.zzdce.zzb("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzawr.zzc("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4) {
        try {
            this.zzdce.zzb("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzawr.zzc("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzdx(String str) {
        try {
            this.zzdce.zzb("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            zzawr.zzc("Error occurred while dispatching state change.", e);
        }
    }

    public final void zza(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zzdce.zzb("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            zzawr.zzc("Error occurred while obtaining screen information.", e);
        }
    }
}
