package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcgb {
    private final Executor executor;
    private final Map<String, Map<String, JSONObject>> zzfxv = new ConcurrentHashMap();
    private JSONObject zzfxw;
    private boolean zzwa;

    public zzcgb(Executor executor) {
        this.executor = executor;
    }

    public final void zzand() {
        com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzb(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcga
            private final zzcgb zzfxu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxu = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfxu.zzang();
            }
        });
        this.executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcgd
            private final zzcgb zzfxu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxu = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfxu.zzanf();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzane */
    public final synchronized void zzanh() {
        Map<String, JSONObject> map;
        this.zzwa = true;
        zzawe zzww = com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzww();
        if (zzww == null) {
            return;
        }
        JSONObject zzwk = zzww.zzwk();
        if (zzwk == null) {
            return;
        }
        this.zzfxw = zzwk.optJSONObject("ad_unit_patterns");
        JSONArray optJSONArray = zzwk.optJSONArray("ad_unit_id_settings");
        if (optJSONArray == null) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("ad_unit_id");
                String optString2 = optJSONObject.optString("format");
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                if (optString != null && optJSONObject2 != null && optString2 != null) {
                    if (this.zzfxv.containsKey(optString2)) {
                        map = this.zzfxv.get(optString2);
                    } else {
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        this.zzfxv.put(optString2, concurrentHashMap);
                        map = concurrentHashMap;
                    }
                    map.put(optString, optJSONObject2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzang() {
        this.executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcgc
            private final zzcgb zzfxu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxu = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzfxu.zzanh();
            }
        });
    }
}
