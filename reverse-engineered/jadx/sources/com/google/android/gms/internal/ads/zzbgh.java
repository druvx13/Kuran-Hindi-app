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
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
final class zzbgh extends zzbgn implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzain, zzbek {
    private int maxHeight;
    private int maxWidth;
    private String zzacf;
    private final zzazz zzbmo;
    private final WindowManager zzboo;
    private int zzdji;
    private int zzdjj;
    private boolean zzdkv;
    private String zzdmh;
    private zzaak zzeec;
    private final zzst zzeht;
    private final zzbga zzejk;
    private final zzdt zzejl;
    private final com.google.android.gms.ads.internal.zzi zzejm;
    private final com.google.android.gms.ads.internal.zza zzejn;
    private final zzrv zzejp;
    private final boolean zzejq;
    private com.google.android.gms.ads.internal.overlay.zzc zzeju;
    private zzbfz zzejw;
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
    private zzazj zzekr;
    private Map<String, zzbdl> zzeks;
    private final zzbgc zzeln;
    private final AtomicReference<IObjectWrapper> zzelo;
    private final DisplayMetrics zzwz;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbgh(zzbga zzbgaVar, zzbgc zzbgcVar, zzbfz zzbfzVar, String str, boolean z, boolean z2, zzdt zzdtVar, zzazz zzazzVar, zzaam zzaamVar, com.google.android.gms.ads.internal.zzi zziVar, com.google.android.gms.ads.internal.zza zzaVar, zzst zzstVar, zzrv zzrvVar, boolean z3) {
        super(zzbgaVar, zzbgcVar);
        this.zzekb = true;
        this.zzekc = false;
        this.zzdmh = "";
        this.zzelo = new AtomicReference<>();
        this.zzdjj = -1;
        this.zzdji = -1;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.zzejk = zzbgaVar;
        this.zzeln = zzbgcVar;
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
        this.zzwz = zzaxa.zza(this.zzboo);
        this.zzeht = zzstVar;
        this.zzejp = zzrvVar;
        this.zzejq = z3;
        this.zzekr = new zzazj(this.zzejk.zzzh(), this, this, null);
        com.google.android.gms.ads.internal.zzq.zzkw().zza(zzbgaVar, zzazzVar.zzbnd, getSettings());
        setDownloadListener(this);
        zzace();
        if (PlatformVersion.isAtLeastJellyBeanMR1()) {
            addJavascriptInterface(zzbff.zzc(this), "googleAdsJsInterface");
        }
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
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbft
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final WebView getWebView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final void zza(String str, Map map) {
        zzaim.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void zza(String str, JSONObject jSONObject) {
        zzaim.zza(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn, com.google.android.gms.internal.ads.zzbek
    public final void zzabp() {
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final boolean zzaby() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzain, com.google.android.gms.internal.ads.zzaif
    public final void zzb(String str, JSONObject jSONObject) {
        zzaim.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzain
    public final void zzj(String str, String str2) {
        zzaim.zza(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final zzbbq zzze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx
    public final com.google.android.gms.ads.internal.zza zzzi() {
        return this.zzejn;
    }

    private final boolean zzacb() {
        int i;
        int i2;
        boolean z = false;
        if (this.zzeln.zzaap() || this.zzeln.zzaaq()) {
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

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized void zzb(String str, String str2, String str3) {
        super.loadDataWithBaseURL(str, zzbfp.zzf(str2, zzbfp.zzack()), "text/html", "UTF-8", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn, com.google.android.gms.internal.ads.zzbgm, com.google.android.gms.internal.ads.zzain, com.google.android.gms.internal.ads.zzajc
    public final synchronized void zzda(String str) {
        if (!isDestroyed()) {
            super.zzda(str);
        } else {
            zzawr.zzfc("The webview is destroyed. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabc() {
        zzacd();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zzbmo.zzbnd);
        zzaim.zza(this, "onhide", hashMap);
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
        zzaim.zza(this, "onhide", hashMap);
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
        zzaim.zza(this, "onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabd() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzq.zzlb().zzqc()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzq.zzlb().zzqb()));
        hashMap.put("device_volume", String.valueOf(zzaxs.zzbg(getContext())));
        zzaim.zza(this, "volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final void zza(boolean z, long j) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(FirebaseAnalytics.Param.SUCCESS, z ? "1" : "0");
        hashMap.put("duration", Long.toString(j));
        zzaim.zza(this, "onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final synchronized com.google.android.gms.ads.internal.overlay.zzc zzabf() {
        return this.zzeju;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final IObjectWrapper zzabn() {
        return this.zzelo.get();
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
        return this.zzeln;
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

    @Override // com.google.android.gms.internal.ads.zzbgn, android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.zzeln.zzaaq() && !this.zzeln.zzaar()) {
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d8 A[Catch: all -> 0x01f3, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:43:0x0084, B:42:0x0080, B:46:0x0091, B:48:0x0099, B:50:0x00ab, B:53:0x00b2, B:55:0x00ca, B:57:0x00d9, B:56:0x00d5, B:60:0x00de, B:63:0x00e3, B:65:0x00eb, B:68:0x00f8, B:77:0x011e, B:79:0x0125, B:84:0x012f, B:86:0x0141, B:88:0x0155, B:96:0x0172, B:98:0x01cf, B:99:0x01d3, B:102:0x01d8, B:104:0x01de, B:105:0x01e1, B:108:0x01ee), top: B:114:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141 A[Catch: all -> 0x01f3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:43:0x0084, B:42:0x0080, B:46:0x0091, B:48:0x0099, B:50:0x00ab, B:53:0x00b2, B:55:0x00ca, B:57:0x00d9, B:56:0x00d5, B:60:0x00de, B:63:0x00e3, B:65:0x00eb, B:68:0x00f8, B:77:0x011e, B:79:0x0125, B:84:0x012f, B:86:0x0141, B:88:0x0155, B:96:0x0172, B:98:0x01cf, B:99:0x01d3, B:102:0x01d8, B:104:0x01de, B:105:0x01e1, B:108:0x01ee), top: B:114:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0172 A[Catch: all -> 0x01f3, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:43:0x0084, B:42:0x0080, B:46:0x0091, B:48:0x0099, B:50:0x00ab, B:53:0x00b2, B:55:0x00ca, B:57:0x00d9, B:56:0x00d5, B:60:0x00de, B:63:0x00e3, B:65:0x00eb, B:68:0x00f8, B:77:0x011e, B:79:0x0125, B:84:0x012f, B:86:0x0141, B:88:0x0155, B:96:0x0172, B:98:0x01cf, B:99:0x01d3, B:102:0x01d8, B:104:0x01de, B:105:0x01e1, B:108:0x01ee), top: B:114:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final synchronized void onMeasure(int r8, int r9) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgh.onMeasure(int, int):void");
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
    public final void zzap(IObjectWrapper iObjectWrapper) {
        this.zzelo.set(iObjectWrapper);
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
        if (this.zzeln != null && this.zzeln.zzaaq()) {
            if (!this.zzekf) {
                this.zzeln.zzaas();
                this.zzeln.zzaat();
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
            if (this.zzekf && this.zzeln != null && this.zzeln.zzaaq() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzeln.zzaas();
                this.zzeln.zzaat();
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
            this.zzeju.zza(this.zzeln.zzaap(), z);
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

    @Override // com.google.android.gms.internal.ads.zzbgn
    protected final synchronized void zzbe(boolean z) {
        if (!z) {
            zzaci();
            this.zzekr.zzya();
            if (this.zzeju != null) {
                this.zzeju.close();
                this.zzeju.onDestroy();
                this.zzeju = null;
            }
        }
        this.zzelo.set(null);
        this.zzeln.destroy();
        com.google.android.gms.ads.internal.zzq.zzls();
        zzbdm.zzc(this);
        zzach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbgn, android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
        zzbgc zzbgcVar = this.zzeln;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabt() {
        if (this.zzekm == null) {
            zzaak zzb = zzaah.zzb(this.zzekn.zzrn());
            this.zzekm = zzb;
            this.zzekn.zza("native:view_load", zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgn, android.webkit.WebView, com.google.android.gms.internal.ads.zzbek
    public final void onPause() {
        try {
            super.onPause();
        } catch (Exception e) {
            zzawr.zzc("Could not pause webview.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgn, android.webkit.WebView, com.google.android.gms.internal.ads.zzbek
    public final void onResume() {
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
        this.zzeln.zzax(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn, android.webkit.WebView
    public final void stopLoading() {
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
        this.zzeln.zzav(z);
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
        this.zzeln.zza(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzb(boolean z, int i) {
        this.zzeln.zzb(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(boolean z, int i, String str) {
        this.zzeln.zza(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(boolean z, int i, String str, String str2) {
        this.zzeln.zza(z, i, str, str2);
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
        zzaim.zza(this, "onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zza(String str, zzaga<? super zzbek> zzagaVar) {
        zzbgc zzbgcVar = this.zzeln;
        if (zzbgcVar != null) {
            zzbgcVar.zza(str, zzagaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzb(String str, zzaga<? super zzbek> zzagaVar) {
        zzbgc zzbgcVar = this.zzeln;
        if (zzbgcVar != null) {
            zzbgcVar.zzb(str, zzagaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zza(String str, Predicate<zzaga<? super zzbek>> predicate) {
        zzbgc zzbgcVar = this.zzeln;
        if (zzbgcVar != null) {
            zzbgcVar.zza(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final boolean zzc(final boolean z, final int i) {
        destroy();
        this.zzeht.zza(new zzsw(z, i) { // from class: com.google.android.gms.internal.ads.zzbgk
            private final int zzdwt;
            private final boolean zzejj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzejj = z;
                this.zzdwt = i;
            }

            @Override // com.google.android.gms.internal.ads.zzsw
            public final void zza(zztf.zzi.zza zzaVar) {
                zzbgh.zza(this.zzejj, this.zzdwt, zzaVar);
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
        return this.zzeln;
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
