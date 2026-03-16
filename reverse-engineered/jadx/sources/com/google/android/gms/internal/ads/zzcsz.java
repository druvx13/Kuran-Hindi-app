package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcsz {
    private final Executor executor;
    private JSONObject zzfxw;
    private final Map<String, zzctc> zzgis = new ConcurrentHashMap();
    private final Map<String, Map<String, List<zzctc>>> zzgit = new ConcurrentHashMap();

    public zzcsz(Executor executor) {
        this.executor = executor;
    }

    public final void zzand() {
        com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzb(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcsy
            private final zzcsz zzgir;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgir = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgir.zzapi();
            }
        });
        this.executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzctb
            private final zzcsz zzgir;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgir = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgir.zzaph();
            }
        });
    }

    public final Map<String, List<Bundle>> zzs(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return Collections.emptyMap();
        }
        Map<String, List<zzctc>> map = this.zzgit.get(str);
        if (map == null) {
            return Collections.emptyMap();
        }
        List<zzctc> list = map.get(str2);
        if (list == null) {
            list = map.get(zzcge.zza(this.zzfxw, str2, str));
        }
        if (list == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (zzctc zzctcVar : list) {
            String str3 = zzctcVar.zzflf;
            if (!hashMap.containsKey(str3)) {
                hashMap.put(str3, new ArrayList());
            }
            ((List) hashMap.get(str3)).add(zzctcVar.zzelx);
        }
        return hashMap;
    }

    public final void zzgo(String str) {
        if (TextUtils.isEmpty(str) || this.zzgis.containsKey(str)) {
            return;
        }
        this.zzgis.put(str, new zzctc(str, "", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzapg */
    public final synchronized void zzapj() {
        JSONArray optJSONArray;
        JSONObject zzwk = com.google.android.gms.ads.internal.zzq.zzla().zzwb().zzww().zzwk();
        if (zzwk != null) {
            try {
                JSONArray optJSONArray2 = zzwk.optJSONArray("ad_unit_id_settings");
                this.zzfxw = zzwk.optJSONObject("ad_unit_patterns");
                if (optJSONArray2 != null) {
                    for (int i = 0; i < optJSONArray2.length(); i++) {
                        JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                        String optString = jSONObject.optString("ad_unit_id", "");
                        String optString2 = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                ArrayList arrayList2 = new ArrayList();
                                if (jSONObject2 != null) {
                                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (optJSONObject2 != null) {
                                        Iterator<String> keys = optJSONObject2.keys();
                                        while (keys.hasNext()) {
                                            String next = keys.next();
                                            bundle.putString(next, optJSONObject2.optString(next, ""));
                                        }
                                    }
                                    JSONArray optJSONArray3 = jSONObject2.optJSONArray("rtb_adapters");
                                    if (optJSONArray3 != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                            String optString3 = optJSONArray3.optString(i3, "");
                                            if (!TextUtils.isEmpty(optString3)) {
                                                arrayList3.add(optString3);
                                            }
                                        }
                                        ArrayList arrayList4 = arrayList3;
                                        int size = arrayList4.size();
                                        int i4 = 0;
                                        while (i4 < size) {
                                            Object obj = arrayList4.get(i4);
                                            i4++;
                                            String str = (String) obj;
                                            zzgo(str);
                                            if (this.zzgis.get(str) != null) {
                                                arrayList2.add(new zzctc(str, optString2, bundle));
                                            }
                                        }
                                    }
                                }
                                arrayList.addAll(arrayList2);
                            }
                        }
                        if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString)) {
                            Map<String, List<zzctc>> map = this.zzgit.get(optString2);
                            if (map == null) {
                                map = new ConcurrentHashMap<>();
                            }
                            this.zzgit.put(optString2, map);
                            List<zzctc> list = map.get(optString);
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            list.addAll(arrayList);
                            map.put(optString, list);
                        }
                    }
                }
            } catch (JSONException e) {
                zzawr.zza("Malformed config loading JSON.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzapi() {
        this.executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcta
            private final zzcsz zzgir;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgir = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgir.zzapj();
            }
        });
    }
}
