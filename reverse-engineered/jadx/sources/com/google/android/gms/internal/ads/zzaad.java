package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaad {
    private String zzbnd;
    private String zzcul = zzabg.zzcvz.get();
    private Map<String, String> zzcuo;
    private Context zzvf;

    public zzaad(Context context, String str) {
        String packageName;
        this.zzvf = null;
        this.zzbnd = null;
        this.zzvf = context;
        this.zzbnd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzcuo = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.zzcuo.put("v", "3");
        this.zzcuo.put("os", Build.VERSION.RELEASE);
        this.zzcuo.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.zzcuo;
        com.google.android.gms.ads.internal.zzq.zzkw();
        map.put("device", zzaxa.zzxh());
        Map<String, String> map2 = this.zzcuo;
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        map2.put("app", packageName);
        Map<String, String> map3 = this.zzcuo;
        com.google.android.gms.ads.internal.zzq.zzkw();
        map3.put("is_lite_sdk", zzaxa.zzay(context) ? "1" : "0");
        Future<zzars> zzx = com.google.android.gms.ads.internal.zzq.zzlh().zzx(this.zzvf);
        try {
            this.zzcuo.put("network_coarse", Integer.toString(zzx.get().zzdpy));
            this.zzcuo.put("network_fine", Integer.toString(zzx.get().zzdpz));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzq.zzla().zza(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzrh() {
        return this.zzcul;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context getContext() {
        return this.zzvf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzkr() {
        return this.zzbnd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zzri() {
        return this.zzcuo;
    }
}
