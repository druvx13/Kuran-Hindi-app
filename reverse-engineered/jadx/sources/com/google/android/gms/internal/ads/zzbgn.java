package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.webkit.ValueCallback;
import android.webkit.WebViewClient;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzbgn extends zzbgm implements zzbgs {
    private boolean zzejx;
    private boolean zzekq;
    private final zzbgl zzelt;

    public zzbgn(Context context, zzbgl zzbglVar) {
        super(context);
        com.google.android.gms.ads.internal.zzq.zzla().zzvy();
        this.zzelt = zzbglVar;
        super.setWebViewClient(zzbglVar);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
    }

    protected void zzbe(boolean z) {
    }

    public final synchronized boolean isDestroyed() {
        return this.zzejx;
    }

    @Override // android.webkit.WebView
    public synchronized void destroy() {
        if (this.zzejx) {
            return;
        }
        this.zzejx = true;
        this.zzelt.zza(this);
        zzbe(false);
        zzawr.zzeg("Initiating WebView self destruct sequence in 3...");
        zzawr.zzeg("Loading blank page in WebView, 2...");
        try {
            super.loadUrl("about:blank");
        } catch (UnsatisfiedLinkError e) {
            com.google.android.gms.ads.internal.zzq.zzla().zza(e, "AdWebViewImpl.loadUrlUnsafe");
            zzawr.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgs
    public final synchronized void zza(zzbgo zzbgoVar) {
        zzawr.zzeg("Blank page loaded, 1...");
        zzabp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void zzabp() {
        zzawr.zzeg("Destroying WebView!");
        zzvz();
        zzbab.zzdzv.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbgq
            private final zzbgn zzelv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzelv = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzelv.zzacs();
            }
        });
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!isDestroyed()) {
                    zzbe(true);
                }
                zzvz();
            }
        } finally {
            super.finalize();
        }
    }

    private final synchronized void zzvz() {
        if (!this.zzekq) {
            this.zzekq = true;
            com.google.android.gms.ads.internal.zzq.zzla().zzvz();
        }
    }

    @Override // android.webkit.WebView
    public synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (isDestroyed()) {
            zzawr.zzfc("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.zzbgm, android.webkit.WebView
    public synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            super.loadUrl(str);
        } else {
            zzawr.zzfc("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView
    public synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            zzawr.zzfc("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView
    public synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzawr.zzfc("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return !isDestroyed() && super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.webkit.WebView, android.view.View
    public void onDraw(Canvas canvas) {
        if (isDestroyed()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbek
    public void onPause() {
        if (isDestroyed()) {
            return;
        }
        super.onPause();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbek
    public void onResume() {
        if (isDestroyed()) {
            return;
        }
        super.onResume();
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        if (isDestroyed()) {
            return;
        }
        super.stopLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzbgm, android.webkit.WebView
    public /* bridge */ /* synthetic */ void addJavascriptInterface(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbgm, com.google.android.gms.internal.ads.zzain, com.google.android.gms.internal.ads.zzajc
    public /* bridge */ /* synthetic */ void zzda(String str) {
        super.zzda(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzacs() {
        super.destroy();
    }
}
