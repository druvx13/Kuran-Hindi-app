package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbby {
    public final boolean zzedr;
    public final int zzeds;
    public final int zzedt;
    public final int zzedu;
    private final String zzedv;
    public final int zzedw;
    public final int zzedx;
    public final int zzedy;
    public final int zzedz;
    public final boolean zzeea;
    public final int zzeeb;

    public zzbby(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zzedr = zza(jSONObject, "aggressive_media_codec_release", zzzz.zzcju);
        this.zzeds = zzb(jSONObject, "byte_buffer_precache_limit", zzzz.zzcjd);
        this.zzedt = zzb(jSONObject, "exo_cache_buffer_size", zzzz.zzcjj);
        this.zzedu = zzb(jSONObject, "exo_connect_timeout_millis", zzzz.zzciz);
        this.zzedv = zzc(jSONObject, "exo_player_version", zzzz.zzciy);
        this.zzedw = zzb(jSONObject, "exo_read_timeout_millis", zzzz.zzcja);
        this.zzedx = zzb(jSONObject, "load_check_interval_bytes", zzzz.zzcjb);
        this.zzedy = zzb(jSONObject, "player_precache_limit", zzzz.zzcjc);
        this.zzedz = zzb(jSONObject, "socket_receive_buffer_size", zzzz.zzcje);
        this.zzeea = zza(jSONObject, "use_cache_data_source", zzzz.zzcpw);
        this.zzeeb = zzb(jSONObject, "min_retry_count", zzzz.zzcjg);
    }

    private static boolean zza(JSONObject jSONObject, String str, zzzk<Boolean> zzzkVar) {
        return zza(jSONObject, str, ((Boolean) zzvj.zzpv().zzd(zzzkVar)).booleanValue());
    }

    private static boolean zza(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return z;
    }

    private static int zzb(JSONObject jSONObject, String str, zzzk<Integer> zzzkVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzvj.zzpv().zzd(zzzkVar)).intValue();
    }

    private static String zzc(JSONObject jSONObject, String str, zzzk<String> zzzkVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getString(str);
            } catch (JSONException unused) {
            }
        }
        return (String) zzvj.zzpv().zzd(zzzkVar);
    }
}
