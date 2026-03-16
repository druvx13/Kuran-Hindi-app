package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcie {
    private final Executor executor;
    private final String packageName;
    private final String zzbnd;
    private final zzbaa zzdyh;
    private final boolean zzfzi;
    private final Context zzvf;
    private final String zzcul = zzabg.zzcvz.get();
    private final Map<String, String> zzfzb = new HashMap();

    public zzcie(Executor executor, zzbaa zzbaaVar, Context context, zzazz zzazzVar) {
        this.executor = executor;
        this.zzdyh = zzbaaVar;
        this.zzvf = context;
        this.packageName = context.getPackageName();
        this.zzfzi = ((double) zzvj.zzpy().nextFloat()) <= zzabg.zzcvy.get().doubleValue();
        this.zzbnd = zzazzVar.zzbnd;
        this.zzfzb.put("s", "gmob_sdk");
        this.zzfzb.put("v", "3");
        this.zzfzb.put("os", Build.VERSION.RELEASE);
        this.zzfzb.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.zzfzb;
        com.google.android.gms.ads.internal.zzq.zzkw();
        map.put("device", zzaxa.zzxh());
        this.zzfzb.put("app", this.packageName);
        Map<String, String> map2 = this.zzfzb;
        com.google.android.gms.ads.internal.zzq.zzkw();
        map2.put("is_lite_sdk", zzaxa.zzay(this.zzvf) ? "1" : "0");
        this.zzfzb.put("e", TextUtils.join(",", zzzz.zzrb()));
        this.zzfzb.put("sdkVersion", this.zzbnd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzn(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.zzcul).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        final String uri = buildUpon.build().toString();
        if (this.zzfzi) {
            this.executor.execute(new Runnable(this, uri) { // from class: com.google.android.gms.internal.ads.zzcih
                private final String zzdbv;
                private final zzcie zzfzl;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfzl = this;
                    this.zzdbv = uri;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzfzl.zzgg(this.zzdbv);
                }
            });
        }
        zzawr.zzeg(uri);
    }

    public final Map<String, String> zzaob() {
        return new HashMap(this.zzfzb);
    }

    public final ConcurrentHashMap<String, String> zzaoc() {
        return new ConcurrentHashMap<>(this.zzfzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzgg(String str) {
        this.zzdyh.zzeq(str);
    }
}
