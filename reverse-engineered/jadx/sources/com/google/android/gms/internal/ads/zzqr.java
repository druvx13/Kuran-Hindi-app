package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzqr implements Runnable {
    private ValueCallback<String> zzbqy = new zzqu(this);
    final /* synthetic */ zzqj zzbqz;
    final /* synthetic */ WebView zzbra;
    final /* synthetic */ boolean zzbrb;
    final /* synthetic */ zzqp zzbrc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqr(zzqp zzqpVar, zzqj zzqjVar, WebView webView, boolean z) {
        this.zzbrc = zzqpVar;
        this.zzbqz = zzqjVar;
        this.zzbra = webView;
        this.zzbrb = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzbra.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzbra.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zzbqy);
            } catch (Throwable unused) {
                this.zzbqy.onReceiveValue("");
            }
        }
    }
}
