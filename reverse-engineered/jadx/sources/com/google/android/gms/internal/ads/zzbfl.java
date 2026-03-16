package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbfl extends zzbfo {
    public zzbfl(zzbek zzbekVar, zzst zzstVar, boolean z) {
        super(zzbekVar, zzstVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzbej, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zza(webView, str, (Map<String, String>) null);
    }
}
