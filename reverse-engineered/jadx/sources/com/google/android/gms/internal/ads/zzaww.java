package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaww implements zzawt {
    private SharedPreferences zzcip;
    private boolean zzdvi;
    private zzdri<?> zzdvk;
    private SharedPreferences.Editor zzdvm;
    private String zzdvo;
    private String zzdvp;
    private final Object lock = new Object();
    private final List<Runnable> zzdvj = new ArrayList();
    private zzqp zzdvl = null;
    private boolean zzdvn = false;
    private boolean zzdme = true;
    private boolean zzdmr = false;
    private String zzdmu = "";
    private long zzdvq = 0;
    private long zzdvr = 0;
    private long zzdvs = 0;
    private int zzdvt = -1;
    private int zzdvu = 0;
    private Set<String> zzdvv = Collections.emptySet();
    private JSONObject zzdvw = new JSONObject();
    private boolean zzdod = true;
    private boolean zzdop = true;
    private String zzdvx = null;
    private int zzdvy = -1;

    public final void zza(final Context context, String str, boolean z) {
        final String concat;
        synchronized (this.lock) {
            if (this.zzcip != null) {
                return;
            }
            if (str == null) {
                concat = "admob";
            } else {
                String valueOf = String.valueOf(str);
                concat = valueOf.length() != 0 ? "admob__".concat(valueOf) : new String("admob__");
            }
            this.zzdvk = zzbab.zzdzr.zzf(new Runnable(this, context, concat) { // from class: com.google.android.gms.internal.ads.zzawv
                private final Context zzchn;
                private final String zzdep;
                private final zzaww zzdvh;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdvh = this;
                    this.zzchn = context;
                    this.zzdep = concat;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzdvh.zzp(this.zzchn, this.zzdep);
                }
            });
            this.zzdvi = z;
        }
    }

    private final void zzxd() {
        zzdri<?> zzdriVar = this.zzdvk;
        if (zzdriVar == null || zzdriVar.isDone()) {
            return;
        }
        try {
            this.zzdvk.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            zzawr.zzd("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            zzawr.zzc("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            zzawr.zzc("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            zzawr.zzc("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final Bundle zzxe() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.lock) {
            bundle.putBoolean("use_https", this.zzdme);
            bundle.putBoolean("content_url_opted_out", this.zzdod);
            bundle.putBoolean("content_vertical_opted_out", this.zzdop);
            bundle.putBoolean("auto_collect_location", this.zzdmr);
            bundle.putInt("version_code", this.zzdvu);
            bundle.putStringArray("never_pool_slots", (String[]) this.zzdvv.toArray(new String[0]));
            bundle.putString("app_settings_json", this.zzdmu);
            bundle.putLong("app_settings_last_update_ms", this.zzdvq);
            bundle.putLong("app_last_background_time_ms", this.zzdvr);
            bundle.putInt("request_in_session_count", this.zzdvt);
            bundle.putLong("first_ad_req_time_ms", this.zzdvs);
            bundle.putString("native_advanced_settings", this.zzdvw.toString());
            bundle.putString("display_cutout", this.zzdvx);
            bundle.putInt("app_measurement_npa", this.zzdvy);
            if (this.zzdvo != null) {
                bundle.putString("content_url_hashes", this.zzdvo);
            }
            if (this.zzdvp != null) {
                bundle.putString("content_vertical_hashes", this.zzdvp);
            }
        }
        return bundle;
    }

    private final void zzc(Bundle bundle) {
        zzbab.zzdzr.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzawy
            private final zzaww zzdvh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdvh = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdvh.zzwp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final zzqp zzwp() {
        if (this.zzdvi) {
            if (!(zzwq() && zzws()) && zzabh.zzcwc.get().booleanValue()) {
                synchronized (this.lock) {
                    if (Looper.getMainLooper() == null) {
                        return null;
                    }
                    if (this.zzdvl == null) {
                        this.zzdvl = new zzqp();
                    }
                    this.zzdvl.zzmh();
                    zzawr.zzfb("start fetching content...");
                    return this.zzdvl;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zzao(boolean z) {
        zzxd();
        synchronized (this.lock) {
            if (this.zzdod == z) {
                return;
            }
            this.zzdod = z;
            if (this.zzdvm != null) {
                this.zzdvm.putBoolean("content_url_opted_out", z);
                this.zzdvm.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.zzdod);
            bundle.putBoolean("content_vertical_opted_out", this.zzdop);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final boolean zzwq() {
        boolean z;
        zzxd();
        synchronized (this.lock) {
            z = this.zzdod;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zzeh(String str) {
        zzxd();
        synchronized (this.lock) {
            if (str != null) {
                if (!str.equals(this.zzdvo)) {
                    this.zzdvo = str;
                    if (this.zzdvm != null) {
                        this.zzdvm.putString("content_url_hashes", str);
                        this.zzdvm.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_url_hashes", str);
                    zzc(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final String zzwr() {
        String str;
        zzxd();
        synchronized (this.lock) {
            str = this.zzdvo;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zzap(boolean z) {
        zzxd();
        synchronized (this.lock) {
            if (this.zzdop == z) {
                return;
            }
            this.zzdop = z;
            if (this.zzdvm != null) {
                this.zzdvm.putBoolean("content_vertical_opted_out", z);
                this.zzdvm.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.zzdod);
            bundle.putBoolean("content_vertical_opted_out", this.zzdop);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final boolean zzws() {
        boolean z;
        zzxd();
        synchronized (this.lock) {
            z = this.zzdop;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zzei(String str) {
        zzxd();
        synchronized (this.lock) {
            if (str != null) {
                if (!str.equals(this.zzdvp)) {
                    this.zzdvp = str;
                    if (this.zzdvm != null) {
                        this.zzdvm.putString("content_vertical_hashes", str);
                        this.zzdvm.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_vertical_hashes", str);
                    zzc(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final String zzwt() {
        String str;
        zzxd();
        synchronized (this.lock) {
            str = this.zzdvp;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zzaq(boolean z) {
        zzxd();
        synchronized (this.lock) {
            if (this.zzdmr == z) {
                return;
            }
            this.zzdmr = z;
            if (this.zzdvm != null) {
                this.zzdvm.putBoolean("auto_collect_location", z);
                this.zzdvm.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("auto_collect_location", z);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final boolean zzwu() {
        boolean z;
        zzxd();
        synchronized (this.lock) {
            z = this.zzdmr;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zzcy(int i) {
        zzxd();
        synchronized (this.lock) {
            if (this.zzdvu == i) {
                return;
            }
            this.zzdvu = i;
            if (this.zzdvm != null) {
                this.zzdvm.putInt("version_code", i);
                this.zzdvm.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("version_code", i);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final int zzwv() {
        int i;
        zzxd();
        synchronized (this.lock) {
            i = this.zzdvu;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zzej(String str) {
        zzxd();
        synchronized (this.lock) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis();
            this.zzdvq = currentTimeMillis;
            if (str != null && !str.equals(this.zzdmu)) {
                this.zzdmu = str;
                if (this.zzdvm != null) {
                    this.zzdvm.putString("app_settings_json", str);
                    this.zzdvm.putLong("app_settings_last_update_ms", currentTimeMillis);
                    this.zzdvm.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("app_settings_json", str);
                bundle.putLong("app_settings_last_update_ms", currentTimeMillis);
                zzc(bundle);
                for (Runnable runnable : this.zzdvj) {
                    runnable.run();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final zzawe zzww() {
        zzawe zzaweVar;
        zzxd();
        synchronized (this.lock) {
            zzaweVar = new zzawe(this.zzdmu, this.zzdvq);
        }
        return zzaweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zzb(Runnable runnable) {
        this.zzdvj.add(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zzez(long j) {
        zzxd();
        synchronized (this.lock) {
            if (this.zzdvr == j) {
                return;
            }
            this.zzdvr = j;
            if (this.zzdvm != null) {
                this.zzdvm.putLong("app_last_background_time_ms", j);
                this.zzdvm.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("app_last_background_time_ms", j);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final long zzwx() {
        long j;
        zzxd();
        synchronized (this.lock) {
            j = this.zzdvr;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zzcz(int i) {
        zzxd();
        synchronized (this.lock) {
            if (this.zzdvt == i) {
                return;
            }
            this.zzdvt = i;
            if (this.zzdvm != null) {
                this.zzdvm.putInt("request_in_session_count", i);
                this.zzdvm.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("request_in_session_count", i);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final int zzwy() {
        int i;
        zzxd();
        synchronized (this.lock) {
            i = this.zzdvt;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zzfa(long j) {
        zzxd();
        synchronized (this.lock) {
            if (this.zzdvs == j) {
                return;
            }
            this.zzdvs = j;
            if (this.zzdvm != null) {
                this.zzdvm.putLong("first_ad_req_time_ms", j);
                this.zzdvm.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("first_ad_req_time_ms", j);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final long zzwz() {
        long j;
        zzxd();
        synchronized (this.lock) {
            j = this.zzdvs;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zza(String str, String str2, boolean z) {
        zzxd();
        synchronized (this.lock) {
            JSONArray optJSONArray = this.zzdvw.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    } else {
                        length = i;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzq.zzld().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzdvw.put(str, optJSONArray);
            } catch (JSONException e) {
                zzawr.zzd("Could not update native advanced settings", e);
            }
            if (this.zzdvm != null) {
                this.zzdvm.putString("native_advanced_settings", this.zzdvw.toString());
                this.zzdvm.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.zzdvw.toString());
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final JSONObject zzxa() {
        JSONObject jSONObject;
        zzxd();
        synchronized (this.lock) {
            jSONObject = this.zzdvw;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zzxb() {
        zzxd();
        synchronized (this.lock) {
            this.zzdvw = new JSONObject();
            if (this.zzdvm != null) {
                this.zzdvm.remove("native_advanced_settings");
                this.zzdvm.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final String zzxc() {
        String str;
        zzxd();
        synchronized (this.lock) {
            str = this.zzdvx;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzawt
    public final void zzek(String str) {
        zzxd();
        synchronized (this.lock) {
            if (TextUtils.equals(this.zzdvx, str)) {
                return;
            }
            this.zzdvx = str;
            if (this.zzdvm != null) {
                this.zzdvm.putString("display_cutout", str);
                this.zzdvm.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("display_cutout", str);
            zzc(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.lock) {
            this.zzcip = sharedPreferences;
            this.zzdvm = edit;
            if (PlatformVersion.isAtLeastM() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.zzdvn = z;
            this.zzdme = this.zzcip.getBoolean("use_https", this.zzdme);
            this.zzdod = this.zzcip.getBoolean("content_url_opted_out", this.zzdod);
            this.zzdvo = this.zzcip.getString("content_url_hashes", this.zzdvo);
            this.zzdmr = this.zzcip.getBoolean("auto_collect_location", this.zzdmr);
            this.zzdop = this.zzcip.getBoolean("content_vertical_opted_out", this.zzdop);
            this.zzdvp = this.zzcip.getString("content_vertical_hashes", this.zzdvp);
            this.zzdvu = this.zzcip.getInt("version_code", this.zzdvu);
            this.zzdmu = this.zzcip.getString("app_settings_json", this.zzdmu);
            this.zzdvq = this.zzcip.getLong("app_settings_last_update_ms", this.zzdvq);
            this.zzdvr = this.zzcip.getLong("app_last_background_time_ms", this.zzdvr);
            this.zzdvt = this.zzcip.getInt("request_in_session_count", this.zzdvt);
            this.zzdvs = this.zzcip.getLong("first_ad_req_time_ms", this.zzdvs);
            this.zzdvv = this.zzcip.getStringSet("never_pool_slots", this.zzdvv);
            this.zzdvx = this.zzcip.getString("display_cutout", this.zzdvx);
            this.zzdvy = this.zzcip.getInt("app_measurement_npa", this.zzdvy);
            try {
                this.zzdvw = new JSONObject(this.zzcip.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                zzawr.zzd("Could not convert native advanced settings to json object", e);
            }
            zzc(zzxe());
        }
    }
}
