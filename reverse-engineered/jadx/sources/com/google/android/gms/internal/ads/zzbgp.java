package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.common.util.PlatformVersion;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbgp {
    private static Boolean zzelu;

    private zzbgp() {
    }

    private static boolean zzb(WebView webView) {
        boolean booleanValue;
        synchronized (zzbgp.class) {
            if (zzelu == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", null);
                    zzelu = true;
                } catch (IllegalStateException unused) {
                    zzelu = false;
                }
            }
            booleanValue = zzelu.booleanValue();
        }
        return booleanValue;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(WebView webView, String str) {
        if (PlatformVersion.isAtLeastKitKat() && zzb(webView)) {
            webView.evaluateJavascript(str, null);
            return;
        }
        String valueOf = String.valueOf(str);
        webView.loadUrl(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
    }
}
