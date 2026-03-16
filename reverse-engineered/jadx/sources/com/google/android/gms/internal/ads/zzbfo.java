package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzbfo extends zzbej {
    public zzbfo(zzbek zzbekVar, zzst zzstVar, boolean z) {
        super(zzbekVar, zzstVar, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zza(WebView webView, String str, Map<String, String> map) {
        String str2;
        if (!(webView instanceof zzbek)) {
            zzawr.zzfc("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzbek zzbekVar = (zzbek) webView;
        if (this.zzeid != null) {
            this.zzeid.zza(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzd(str, map);
        }
        if (zzbekVar.zzabj() != null) {
            zzbekVar.zzabj().zzui();
        }
        if (zzbekVar.zzabh().zzaco()) {
            str2 = (String) zzvj.zzpv().zzd(zzzz.zzcka);
        } else if (zzbekVar.zzabo()) {
            str2 = (String) zzvj.zzpv().zzd(zzzz.zzcjz);
        } else {
            str2 = (String) zzvj.zzpv().zzd(zzzz.zzcjy);
        }
        com.google.android.gms.ads.internal.zzq.zzkw();
        return zzaxa.zzd(zzbekVar.getContext(), zzbekVar.zzzk().zzbnd, str2);
    }
}
