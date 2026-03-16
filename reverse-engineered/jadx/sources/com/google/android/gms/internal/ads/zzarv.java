package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzarv extends zzarx {
    private final Object lock = new Object();
    private SharedPreferences zzdqt;
    private final zzakh<JSONObject, JSONObject> zzdqu;
    private final Context zzzo;

    public zzarv(Context context, zzakh<JSONObject, JSONObject> zzakhVar) {
        this.zzzo = context.getApplicationContext();
        this.zzdqu = zzakhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzarx
    public final zzdri<Void> zzvc() {
        synchronized (this.lock) {
            if (this.zzdqt == null) {
                this.zzdqt = this.zzzo.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis() - this.zzdqt.getLong("js_last_update", 0L) < zzabk.zzcwn.get().longValue()) {
            return zzdqw.zzag(null);
        }
        return zzdqw.zzb(this.zzdqu.zzi(zzy(this.zzzo)), new zzdnx(this) { // from class: com.google.android.gms.internal.ads.zzary
            private final zzarv zzdqx;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdqx = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdnx
            public final Object apply(Object obj) {
                return this.zzdqx.zzf((JSONObject) obj);
            }
        }, zzbab.zzdzw);
    }

    public static JSONObject zzy(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzazz.zzyi().zzbnd);
            jSONObject.put("mf", zzabk.zzcwm.get());
            jSONObject.put("cl", "305933803");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 20360);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zzf(JSONObject jSONObject) {
        zzzz.zza(this.zzzo, 1, jSONObject);
        this.zzdqt.edit().putLong("js_last_update", com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis()).apply();
        return null;
    }
}
