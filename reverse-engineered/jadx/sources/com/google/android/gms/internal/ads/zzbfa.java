package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzsv;
import com.google.android.gms.internal.ads.zztf;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
final class zzbfa extends WebView implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzbek {
    private int maxHeight;
    private int maxWidth;
    private String zzacf;
    private final zzazz zzbmo;
    private final WindowManager zzboo;
    private int zzdji;
    private int zzdjj;
    private boolean zzdkv;
    private String zzdmh;
    private Boolean zzdtw;
    private zzaak zzeec;
    private final zzst zzeht;
    private final zzbga zzejk;
    private final zzdt zzejl;
    private final com.google.android.gms.ads.internal.zzi zzejm;
    private final com.google.android.gms.ads.internal.zza zzejn;
    private final float zzejo;
    private final zzrv zzejp;
    private final boolean zzejq;
    private boolean zzejr;
    private boolean zzejs;
    private zzbej zzejt;
    private com.google.android.gms.ads.internal.overlay.zzc zzeju;
    private IObjectWrapper zzejv;
    private zzbfz zzejw;
    private boolean zzejx;
    private boolean zzejy;
    private boolean zzejz;
    private int zzeka;
    private boolean zzekb;
    private boolean zzekc;
    private zzbfe zzekd;
    private boolean zzeke;
    private boolean zzekf;
    private zzacg zzekg;
    private zzacf zzekh;
    private zzrh zzeki;
    private int zzekj;
    private int zzekk;
    private zzaak zzekl;
    private zzaak zzekm;
    private zzaan zzekn;
    private WeakReference<View.OnClickListener> zzeko;
    private com.google.android.gms.ads.internal.overlay.zzc zzekp;
    private boolean zzekq;
    private zzazj zzekr;
    private Map<String, zzbdl> zzeks;
    private final DisplayMetrics zzwz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbfa zzb(Context context, zzbfz zzbfzVar, String str, boolean z, boolean z2, zzdt zzdtVar, zzazz zzazzVar, zzaam zzaamVar, com.google.android.gms.ads.internal.zzi zziVar, com.google.android.gms.ads.internal.zza zzaVar, zzst zzstVar, zzrv zzrvVar, boolean z3) {
        return new zzbfa(new zzbga(context), zzbfzVar, str, z, z2, zzdtVar, zzazzVar, zzaamVar, zziVar, zzaVar, zzstVar, zzrvVar, z3);
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbft
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final boolean zzaby() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final zzbbq zzze() {
        return null;
    }

    private zzbfa(zzbga zzbgaVar, zzbfz zzbfzVar, String str, boolean z, boolean z2, zzdt zzdtVar, zzazz zzazzVar, zzaam zzaamVar, com.google.android.gms.ads.internal.zzi zziVar, com.google.android.gms.ads.internal.zza zzaVar, zzst zzstVar, zzrv zzrvVar, boolean z3) {
        super(zzbgaVar);
        this.zzejr = false;
        this.zzejs = false;
        this.zzekb = true;
        this.zzekc = false;
        this.zzdmh = "";
        this.zzdjj = -1;
        this.zzdji = -1;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.zzejk = zzbgaVar;
        this.zzejw = zzbfzVar;
        this.zzacf = str;
        this.zzejy = z;
        this.zzeka = -1;
        this.zzejl = zzdtVar;
        this.zzbmo = zzazzVar;
        this.zzejm = zziVar;
        this.zzejn = zzaVar;
        this.zzboo = (WindowManager) getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzq.zzkw();
        DisplayMetrics zza = zzaxa.zza(this.zzboo);
        this.zzwz = zza;
        this.zzejo = zza.density;
        this.zzeht = zzstVar;
        this.zzejp = zzrvVar;
        this.zzejq = z3;
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e) {
            zzawr.zzc("Unable to enable Javascript.", e);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        com.google.android.gms.ads.internal.zzq.zzkw().zza(zzbgaVar, zzazzVar.zzbnd, settings);
        com.google.android.gms.ads.internal.zzq.zzky().zza(getContext(), settings);
        setDownloadListener(this);
        zzace();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            addJavascriptInterface(zzbff.zzc(this), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.zzekr = new zzazj(this.zzejk.zzzh(), this, this, null);
        zzaci();
        zzaan zzaanVar = new zzaan(new zzaam(true, "make_wv", this.zzacf));
        this.zzekn = zzaanVar;
        zzaanVar.zzrn().zzc(zzaamVar);
        zzaak zzb = zzaah.zzb(this.zzekn.zzrn());
        this.zzeec = zzb;
        this.zzekn.zza("native:view_create", zzb);
        this.zzekm = null;
        this.zzekl = null;
        com.google.android.gms.ads.internal.zzq.zzky().zzbe(zzbgaVar);
        com.google.android.gms.ads.internal.zzq.zzla().zzvy();
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbek
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzbej) {
            this.zzejt = (zzbej) webViewClient;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx
    public final com.google.android.gms.ads.internal.zza zzzi() {
        return this.zzejn;
    }

    private final boolean zzacb() {
        int i;
        int i2;
        boolean z = false;
        if (this.zzejt.zzaap() || this.zzejt.zzaaq()) {
            zzvj.zzpr();
            DisplayMetrics displayMetrics = this.zzwz;
            int zzb = zzazm.zzb(displayMetrics, displayMetrics.widthPixels);
            zzvj.zzpr();
            DisplayMetrics displayMetrics2 = this.zzwz;
            int zzb2 = zzazm.zzb(displayMetrics2, displayMetrics2.heightPixels);
            Activity zzzh = this.zzejk.zzzh();
            if (zzzh == null || zzzh.getWindow() == null) {
                i = zzb;
                i2 = zzb2;
            } else {
                com.google.android.gms.ads.internal.zzq.zzkw();
                int[] zzd = zzaxa.zzd(zzzh);
                zzvj.zzpr();
                int zzb3 = zzazm.zzb(this.zzwz, zzd[0]);
                zzvj.zzpr();
                i2 = zzazm.zzb(this.zzwz, zzd[1]);
                i = zzb3;
            }
            if (this.zzdji == zzb && this.zzdjj == zzb2 && this.maxWidth == i && this.maxHeight == i2) {
                return false;
            }
            z = (this.zzdji == zzb && this.zzdjj == zzb2) ? true : true;
            this.zzdji = zzb;
            this.zzdjj = zzb2;
            this.maxWidth = i;
            this.maxHeight = i2;
            new zzapb(this).zza(zzb, zzb2, i, i2, this.zzwz.density, this.zzboo.getDefaultDisplay().getRotation());
            return z;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final void zza(String str, Map<String, ?> map) {
        try {
            zzb(str, com.google.android.gms.ads.internal.zzq.zzkw().zzj(map));
        } catch (JSONException unused) {
            zzawr.zzfc("Could not convert parameters to JSON.");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (isDestroyed()) {
            zzawr.zzfe("#004 The webview is destroyed. Ignoring action.");
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    private final synchronized void zzfp(String str) {
        if (!isDestroyed()) {
            loadUrl(str);
        } else {
            zzawr.zzfc("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbek
    public final synchronized void loadUrl(String str) {
        if (!isDestroyed()) {
            try {
                super.loadUrl(str);
                return;
            } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError e) {
                com.google.android.gms.ads.internal.zzq.zzla().zza(e, "AdWebViewImpl.loadUrl");
                zzawr.zzd("Could not call loadUrl. ", e);
                return;
            }
        }
        zzawr.zzfc("#004 The webview is destroyed. Ignoring action.");
    }

    private final synchronized void zzfq(String str) {
        try {
            super.loadUrl(str);
        } catch (Exception | IncompatibleClassChangeError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            com.google.android.gms.ads.internal.zzq.zzla().zza(e, "AdWebViewImpl.loadUrlUnsafe");
            zzawr.zzd("Could not call loadUrl. ", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbek
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadData(str, str2, str3);
        } else {
            zzawr.zzfc("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbek
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzawr.zzfc("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zzb(String str, String str2, String str3) {
        if (!isDestroyed()) {
            super.loadDataWithBaseURL(str, zzbfp.zzf(str2, zzbfp.zzack()), "text/html", "UTF-8", str3);
        } else {
            zzawr.zzfc("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final synchronized void zza(String str, ValueCallback<String> valueCallback) {
        if (!isDestroyed()) {
            evaluateJavascript(str, null);
        } else {
            zzawr.zzfc("#004 The webview is destroyed. Ignoring action.");
        }
    }

    private final void zzfr(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzvw() == null) {
                zzacc();
            }
            if (zzvw().booleanValue()) {
                zza(str, (ValueCallback<String>) null);
                return;
            }
            String valueOf = String.valueOf(str);
            zzfp(valueOf.length() != 0 ? "javascript:".concat(valueOf) : new String("javascript:"));
            return;
        }
        String valueOf2 = String.valueOf(str);
        zzfp(valueOf2.length() != 0 ? "javascript:".concat(valueOf2) : new String("javascript:"));
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void zzda(String str) {
        zzfr(str);
    }

    private final synchronized void zzacc() {
        Boolean zzvw = com.google.android.gms.ads.internal.zzq.zzla().zzvw();
        this.zzdtw = zzvw;
        if (zzvw == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zza((Boolean) true);
            } catch (IllegalStateException unused) {
                zza((Boolean) false);
            }
        }
    }

    private final void zza(Boolean bool) {
        synchronized (this) {
            this.zzdtw = bool;
        }
        com.google.android.gms.ads.internal.zzq.zzla().zza(bool);
    }

    private final synchronized Boolean zzvw() {
        return this.zzdtw;
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void zza(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(jSONObject2).length());
        sb.append(str);
        sb.append("(");
        sb.append(jSONObject2);
        sb.append(");");
        zzfr(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final void zzb(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("'");
        sb.append(",");
        sb.append(jSONObject2);
        sb.append(");");
        String valueOf = String.valueOf(sb.toString());
        zzawr.zzed(valueOf.length() != 0 ? "Dispatching AFMA event: ".concat(valueOf) : new String("Dispatching AFMA event: "));
        zzfr(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabc() {
        zzacd();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzbmo.zzbnd);
        zza("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzdn(int i) {
        if (i == 0) {
            zzaah.zza(this.zzekn.zzrn(), this.zzeec, "aebb2");
        }
        zzacd();
        if (this.zzekn.zzrn() != null) {
            this.zzekn.zzrn().zzh("close_type", String.valueOf(i));
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put("version", this.zzbmo.zzbnd);
        zza("onhide", hashMap);
    }

    private final void zzacd() {
        zzaah.zza(this.zzekn.zzrn(), this.zzeec, "aeh2");
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzum() {
        if (this.zzekl == null) {
            zzaah.zza(this.zzekn.zzrn(), this.zzeec, "aes2");
            zzaak zzb = zzaah.zzb(this.zzekn.zzrn());
            this.zzekl = zzb;
            this.zzekn.zza("native:view_show", zzb);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzbmo.zzbnd);
        zza("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabd() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzq.zzlb().zzqc()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzq.zzlb().zzqb()));
        hashMap.put("device_volume", String.valueOf(zzaxs.zzbg(getContext())));
        zza("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final void zza(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(FirebaseAnalytics.Param.SUCCESS, z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        zza("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized com.google.android.gms.ads.internal.overlay.zzc zzabf() {
        return this.zzeju;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized IObjectWrapper zzabn() {
        return this.zzejv;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized com.google.android.gms.ads.internal.overlay.zzc zzabg() {
        return this.zzekp;
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbfs
    public final synchronized zzbfz zzabh() {
        return this.zzejw;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized String zzabi() {
        return this.zzacf;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final WebViewClient zzabk() {
        return this.zzejt;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized boolean zzabl() {
        return this.zzdkv;
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbfr
    public final zzdt zzabm() {
        return this.zzejl;
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx, com.google.android.gms.internal.ads.zzbfu
    public final zzazz zzzk() {
        return this.zzbmo;
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbfm
    public final synchronized boolean zzabo() {
        return this.zzejy;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzq.zzkw();
            zzaxa.zza(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            zzawr.zzed(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.zzejt.zzaaq() && !this.zzejt.zzaar()) {
            synchronized (this) {
                if (this.zzekg != null) {
                    this.zzekg.zzc(motionEvent);
                }
            }
        } else {
            zzdt zzdtVar = this.zzejl;
            if (zzdtVar != null) {
                zzdtVar.zza(motionEvent);
            }
        }
        if (isDestroyed()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01d6 A[Catch: all -> 0x01fe, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:43:0x0084, B:42:0x0080, B:46:0x0091, B:48:0x0099, B:50:0x00ab, B:53:0x00b2, B:55:0x00ce, B:57:0x00d9, B:56:0x00d5, B:60:0x00de, B:63:0x00e3, B:65:0x00eb, B:68:0x00f8, B:77:0x011e, B:79:0x0125, B:84:0x012f, B:86:0x0141, B:88:0x0151, B:96:0x016b, B:98:0x01c0, B:99:0x01c4, B:101:0x01cb, B:104:0x01d6, B:106:0x01dc, B:107:0x01df, B:109:0x01e3, B:110:0x01ec, B:113:0x01f9), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141 A[Catch: all -> 0x01fe, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:43:0x0084, B:42:0x0080, B:46:0x0091, B:48:0x0099, B:50:0x00ab, B:53:0x00b2, B:55:0x00ce, B:57:0x00d9, B:56:0x00d5, B:60:0x00de, B:63:0x00e3, B:65:0x00eb, B:68:0x00f8, B:77:0x011e, B:79:0x0125, B:84:0x012f, B:86:0x0141, B:88:0x0151, B:96:0x016b, B:98:0x01c0, B:99:0x01c4, B:101:0x01cb, B:104:0x01d6, B:106:0x01dc, B:107:0x01df, B:109:0x01e3, B:110:0x01ec, B:113:0x01f9), top: B:119:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016b A[Catch: all -> 0x01fe, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:43:0x0084, B:42:0x0080, B:46:0x0091, B:48:0x0099, B:50:0x00ab, B:53:0x00b2, B:55:0x00ce, B:57:0x00d9, B:56:0x00d5, B:60:0x00de, B:63:0x00e3, B:65:0x00eb, B:68:0x00f8, B:77:0x011e, B:79:0x0125, B:84:0x012f, B:86:0x0141, B:88:0x0151, B:96:0x016b, B:98:0x01c0, B:99:0x01c4, B:101:0x01cb, B:104:0x01d6, B:106:0x01dc, B:107:0x01df, B:109:0x01e3, B:110:0x01ec, B:113:0x01f9), top: B:119:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final synchronized void onMeasure(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfa.onMeasure(int, int):void");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzacb = zzacb();
        com.google.android.gms.ads.internal.overlay.zzc zzabf = zzabf();
        if (zzabf == null || !zzacb) {
            return;
        }
        zzabf.zzul();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zza(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzeju = zzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zzap(IObjectWrapper iObjectWrapper) {
        this.zzejv = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zzb(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzekp = zzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zza(zzbfz zzbfzVar) {
        this.zzejw = zzbfzVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zzba(boolean z) {
        boolean z2 = z != this.zzejy;
        this.zzejy = z;
        zzace();
        if (z2) {
            if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzckc)).booleanValue() || !this.zzejw.zzaco()) {
                new zzapb(this).zzdx(z ? "expanded" : "default");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabs() {
        this.zzekr.zzxz();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isDestroyed()) {
            this.zzekr.onAttachedToWindow();
        }
        boolean z = this.zzeke;
        if (this.zzejt != null && this.zzejt.zzaaq()) {
            if (!this.zzekf) {
                this.zzejt.zzaas();
                this.zzejt.zzaat();
                this.zzekf = true;
            }
            zzacb();
            z = true;
        }
        zzbd(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        synchronized (this) {
            if (!isDestroyed()) {
                this.zzekr.onDetachedFromWindow();
            }
            super.onDetachedFromWindow();
            if (this.zzekf && this.zzejt != null && this.zzejt.zzaaq() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzejt.zzaas();
                this.zzejt.zzaat();
                this.zzekf = false;
            }
        }
        zzbd(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzbt(Context context) {
        this.zzejk.setBaseContext(context);
        this.zzekr.zzh(this.zzejk.zzzh());
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zzal(boolean z) {
        if (this.zzeju != null) {
            this.zzeju.zza(this.zzejt.zzaap(), z);
        } else {
            this.zzdkv = z;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void setRequestedOrientation(int i) {
        this.zzeka = i;
        if (this.zzeju != null) {
            this.zzeju.setRequestedOrientation(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx, com.google.android.gms.internal.ads.zzbfj
    public final Activity zzzh() {
        return this.zzejk.zzzh();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final Context zzabe() {
        return this.zzejk.zzabe();
    }

    private final synchronized void zzace() {
        if (!this.zzejy && !this.zzejw.zzaco()) {
            if (Build.VERSION.SDK_INT < 18) {
                zzawr.zzed("Disabling hardware acceleration on an AdView.");
                zzacf();
                return;
            }
            zzawr.zzed("Enabling hardware acceleration on an AdView.");
            zzacg();
            return;
        }
        zzawr.zzed("Enabling hardware acceleration on an overlay.");
        zzacg();
    }

    private final synchronized void zzacf() {
        if (!this.zzejz) {
            com.google.android.gms.ads.internal.zzq.zzky();
            setLayerType(1, null);
        }
        this.zzejz = true;
    }

    private final synchronized void zzacg() {
        if (this.zzejz) {
            com.google.android.gms.ads.internal.zzq.zzky();
            setLayerType(0, null);
        }
        this.zzejz = false;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbek
    public final synchronized void destroy() {
        zzaci();
        this.zzekr.zzya();
        if (this.zzeju != null) {
            this.zzeju.close();
            this.zzeju.onDestroy();
            this.zzeju = null;
        }
        this.zzejv = null;
        this.zzejt.reset();
        if (this.zzejx) {
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzls();
        zzbdm.zzc(this);
        zzach();
        this.zzejx = true;
        zzawr.zzeg("Initiating WebView self destruct sequence in 3...");
        zzawr.zzeg("Loading blank page in WebView, 2...");
        zzfq("about:blank");
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzejx) {
                    this.zzejt.reset();
                    com.google.android.gms.ads.internal.zzq.zzls();
                    zzbdm.zzc(this);
                    zzach();
                    zzvz();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zzabp() {
        zzawr.zzeg("Destroying WebView!");
        zzvz();
        zzaxa.zzdwf.post(new zzbfb(this));
    }

    private final synchronized void zzvz() {
        if (!this.zzekq) {
            this.zzekq = true;
            com.google.android.gms.ads.internal.zzq.zzla().zzvz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized boolean isDestroyed() {
        return this.zzejx;
    }

    @Override // android.webkit.WebView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (isDestroyed()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
        zzbej zzbejVar = this.zzejt;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabt() {
        if (this.zzekm == null) {
            zzaak zzb = zzaah.zzb(this.zzekn.zzrn());
            this.zzekm = zzb;
            this.zzekn.zza("native:view_load", zzb);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbek
    public final void onPause() {
        if (isDestroyed()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e) {
            zzawr.zzc("Could not pause webview.", e);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzbek
    public final void onResume() {
        if (isDestroyed()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e) {
            zzawr.zzc("Could not resume webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabw() {
        zzawr.zzeg("Cannot add text view to inner AdWebView");
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzax(boolean z) {
        this.zzejt.zzax(z);
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (isDestroyed()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e) {
            zzawr.zzc("Could not stop loading webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zzbb(boolean z) {
        this.zzekb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized boolean zzabq() {
        return this.zzekb;
    }

    @Override // com.google.android.gms.ads.internal.zzi
    public final synchronized void zzkc() {
        this.zzekc = true;
        if (this.zzejm != null) {
            this.zzejm.zzkc();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzi
    public final synchronized void zzkd() {
        this.zzekc = false;
        if (this.zzejm != null) {
            this.zzejm.zzkd();
        }
    }

    private final synchronized void zzach() {
        if (this.zzeks != null) {
            for (zzbdl zzbdlVar : this.zzeks.values()) {
                zzbdlVar.release();
            }
        }
        this.zzeks = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx
    public final synchronized void zza(String str, zzbdl zzbdlVar) {
        if (this.zzeks == null) {
            this.zzeks = new HashMap();
        }
        this.zzeks.put(str, zzbdlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final synchronized zzbdl zzfh(String str) {
        if (this.zzeks == null) {
            return null;
        }
        return this.zzeks.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final synchronized String getRequestId() {
        return this.zzdmh;
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final synchronized void zzzn() {
        if (this.zzekh != null) {
            this.zzekh.zzrw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zza(zzacf zzacfVar) {
        this.zzekh = zzacfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zza(zzrh zzrhVar) {
        this.zzeki = zzrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized zzrh zzabx() {
        return this.zzeki;
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final zzaak zzzg() {
        return this.zzeec;
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx
    public final zzaan zzzj() {
        return this.zzekn;
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbek
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzeko = new WeakReference<>(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zza(zzacg zzacgVar) {
        this.zzekg = zzacgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized zzacg zzabu() {
        return this.zzekg;
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx
    public final synchronized zzbfe zzzf() {
        return this.zzekd;
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx
    public final synchronized void zza(zzbfe zzbfeVar) {
        if (this.zzekd != null) {
            zzawr.zzfa("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzekd = zzbfeVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized boolean zzabr() {
        return this.zzekj > 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zzbc(boolean z) {
        int i = this.zzekj + (z ? 1 : -1);
        this.zzekj = i;
        if (i <= 0 && this.zzeju != null) {
            this.zzeju.zzuo();
        }
    }

    private final void zzaci() {
        zzaam zzrn;
        zzaan zzaanVar = this.zzekn;
        if (zzaanVar == null || (zzrn = zzaanVar.zzrn()) == null || com.google.android.gms.ads.internal.zzq.zzla().zzvv() == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzla().zzvv().zza(zzrn);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabv() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final void zzav(boolean z) {
        this.zzejt.zzav(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final void zzun() {
        com.google.android.gms.ads.internal.overlay.zzc zzabf = zzabf();
        if (zzabf != null) {
            zzabf.zzun();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final int zzzl() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final int zzzm() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.zzejt.zza(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzb(boolean z, int i) {
        this.zzejt.zzb(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(boolean z, int i, String str) {
        this.zzejt.zza(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(boolean z, int i, String str, String str2) {
        this.zzejt.zza(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zza(zzqa zzqaVar) {
        synchronized (this) {
            this.zzeke = zzqaVar.zzbot;
        }
        zzbd(zzqaVar.zzbot);
    }

    private final void zzbd(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : "0");
        zza("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zza(String str, zzaga<? super zzbek> zzagaVar) {
        zzbej zzbejVar = this.zzejt;
        if (zzbejVar != null) {
            zzbejVar.zza(str, zzagaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzb(String str, zzaga<? super zzbek> zzagaVar) {
        zzbej zzbejVar = this.zzejt;
        if (zzbejVar != null) {
            zzbejVar.zzb(str, zzagaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zza(String str, Predicate<zzaga<? super zzbek>> predicate) {
        zzbej zzbejVar = this.zzejt;
        if (zzbejVar != null) {
            zzbejVar.zza(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final boolean zzc(final boolean z, final int i) {
        destroy();
        this.zzeht.zza(new zzsw(z, i) { // from class: com.google.android.gms.internal.ads.zzbez
            private final int zzdwt;
            private final boolean zzejj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzejj = z;
                this.zzdwt = i;
            }

            @Override // com.google.android.gms.internal.ads.zzsw
            public final void zza(zztf.zzi.zza zzaVar) {
                zzbfa.zza(this.zzejj, this.zzdwt, zzaVar);
            }
        });
        this.zzeht.zza(zzsv.zza.EnumC0024zza.ANDROID_WEBVIEW_CRASH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zza(ViewGroup viewGroup, Activity activity, String str, String str2) {
        if (!zzaca()) {
            zzawr.zzeg("AR ad is not enabled or the ad from the server is not an AR ad.");
            return;
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        zzawr.zzeg("Initializing ArWebView object.");
        this.zzejp.zza(activity, this);
        this.zzejp.zzc(str, str2);
        if (viewGroup != null) {
            viewGroup.addView(this.zzejp.getView());
        } else {
            zzawr.zzfa("The FrameLayout object cannot be null.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final zzrv zzabz() {
        return this.zzejp;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final boolean zzaca() {
        return ((Boolean) zzvj.zzpv().zzd(zzzz.zzcte)).booleanValue() && this.zzejp != null && this.zzejq;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final /* synthetic */ zzbfw zzabj() {
        return this.zzejt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zza(boolean z, int i, zztf.zzi.zza zzaVar) {
        zztf.zzae.zza zzpe = zztf.zzae.zzpe();
        if (zzpe.zzpd() != z) {
            zzpe.zzw(z);
        }
        zzaVar.zzb((zztf.zzae) ((zzecd) zzpe.zzcr(i).zzbet()));
    }
}
