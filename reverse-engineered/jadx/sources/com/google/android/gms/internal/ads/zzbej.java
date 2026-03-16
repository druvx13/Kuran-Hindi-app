package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzsv;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzbej extends WebViewClient implements zzbfw {
    private final Object lock;
    private boolean zzbne;
    private zzub zzceb;
    private zzafj zzczu;
    private zzafl zzczw;
    private com.google.android.gms.ads.internal.zzc zzdas;
    private zzaor zzdat;
    private com.google.android.gms.ads.internal.overlay.zzo zzdkt;
    private com.google.android.gms.ads.internal.overlay.zzt zzdkx;
    private boolean zzdov;
    protected zzbek zzehs;
    private final zzst zzeht;
    private final HashMap<String, List<zzaga<? super zzbek>>> zzehu;
    private zzbfv zzehv;
    private zzbfy zzehw;
    private zzbfx zzehx;
    private boolean zzehy;
    private boolean zzehz;
    private boolean zzeia;
    private boolean zzeib;
    private final zzaoy zzeic;
    protected zzaun zzeid;
    private boolean zzeie;
    private boolean zzeif;
    private int zzeig;
    private View.OnAttachStateChangeListener zzeih;

    public zzbej(zzbek zzbekVar, zzst zzstVar, boolean z) {
        this(zzbekVar, zzstVar, z, new zzaoy(zzbekVar, zzbekVar.zzabe(), new zzzg(zzbekVar.getContext())), null);
    }

    private zzbej(zzbek zzbekVar, zzst zzstVar, boolean z, zzaoy zzaoyVar, zzaor zzaorVar) {
        this.zzehu = new HashMap<>();
        this.lock = new Object();
        this.zzehy = false;
        this.zzeht = zzstVar;
        this.zzehs = zzbekVar;
        this.zzbne = z;
        this.zzeic = zzaoyVar;
        this.zzdat = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zza(int i, int i2, boolean z) {
        this.zzeic.zzj(i, i2);
        zzaor zzaorVar = this.zzdat;
        if (zzaorVar != null) {
            zzaorVar.zza(i, i2, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zza(zzub zzubVar, zzafj zzafjVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzafl zzaflVar, com.google.android.gms.ads.internal.overlay.zzt zztVar, boolean z, zzagd zzagdVar, com.google.android.gms.ads.internal.zzc zzcVar, zzapa zzapaVar, zzaun zzaunVar) {
        if (zzcVar == null) {
            zzcVar = new com.google.android.gms.ads.internal.zzc(this.zzehs.getContext(), zzaunVar, null);
        }
        this.zzdat = new zzaor(this.zzehs, zzapaVar);
        this.zzeid = zzaunVar;
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzclm)).booleanValue()) {
            zza("/adMetadata", new zzafg(zzafjVar));
        }
        zza("/appEvent", new zzafi(zzaflVar));
        zza("/backButton", zzafn.zzdah);
        zza("/refresh", zzafn.zzdai);
        zza("/canOpenURLs", zzafn.zzczy);
        zza("/canOpenIntents", zzafn.zzczz);
        zza("/click", zzafn.zzdaa);
        zza("/close", zzafn.zzdab);
        zza("/customClose", zzafn.zzdac);
        zza("/instrument", zzafn.zzdal);
        zza("/delayPageLoaded", zzafn.zzdan);
        zza("/delayPageClosed", zzafn.zzdao);
        zza("/getLocationInfo", zzafn.zzdap);
        zza("/httpTrack", zzafn.zzdad);
        zza("/log", zzafn.zzdae);
        zza("/mraid", new zzagf(zzcVar, this.zzdat, zzapaVar));
        zza("/mraidLoaded", this.zzeic);
        zza("/open", new zzage(zzcVar, this.zzdat));
        zza("/precache", new zzbdu());
        zza("/touch", zzafn.zzdag);
        zza("/video", zzafn.zzdaj);
        zza("/videoMeta", zzafn.zzdak);
        if (com.google.android.gms.ads.internal.zzq.zzlu().zzab(this.zzehs.getContext())) {
            zza("/logScionEvent", new zzagc(this.zzehs.getContext()));
        }
        this.zzceb = zzubVar;
        this.zzdkt = zzoVar;
        this.zzczu = zzafjVar;
        this.zzczw = zzaflVar;
        this.zzdkx = zztVar;
        this.zzdas = zzcVar;
        this.zzehy = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final com.google.android.gms.ads.internal.zzc zzaao() {
        return this.zzdas;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final boolean zzaap() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzbne;
        }
        return z;
    }

    public final boolean zzaaq() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzehz;
        }
        return z;
    }

    public final boolean zzaar() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzeia;
        }
        return z;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzaas() {
        synchronized (this.lock) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzaat() {
        synchronized (this.lock) {
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzrv zzabz = this.zzehs.zzabz();
        if (zzabz != null && webView == zzabz.getWebView()) {
            zzabz.onPageStarted(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.lock) {
            if (this.zzehs.isDestroyed()) {
                zzawr.zzeg("Blank page loaded, 1...");
                this.zzehs.zzabp();
                return;
            }
            this.zzeie = true;
            zzbfy zzbfyVar = this.zzehw;
            if (zzbfyVar != null) {
                zzbfyVar.zzsw();
                this.zzehw = null;
            }
            zzaaz();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(View view, zzaun zzaunVar, int i) {
        if (!zzaunVar.zzvg() || i <= 0) {
            return;
        }
        zzaunVar.zzl(view);
        if (zzaunVar.zzvg()) {
            zzaxa.zzdwf.postDelayed(new zzbeo(this, view, zzaunVar, i), 100L);
        }
    }

    private final void zzaau() {
        if (this.zzeih == null) {
            return;
        }
        this.zzehs.getView().removeOnAttachStateChangeListener(this.zzeih);
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zzaav() {
        zzaun zzaunVar = this.zzeid;
        if (zzaunVar != null) {
            WebView webView = this.zzehs.getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                zza(webView, zzaunVar, 10);
                return;
            }
            zzaau();
            this.zzeih = new zzben(this, zzaunVar);
            this.zzehs.getView().addOnAttachStateChangeListener(this.zzeih);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zzaaw() {
        synchronized (this.lock) {
            this.zzeib = true;
        }
        this.zzeig++;
        zzaaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zzaax() {
        this.zzeig--;
        zzaaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zzaay() {
        zzst zzstVar = this.zzeht;
        if (zzstVar != null) {
            zzstVar.zza(zzsv.zza.EnumC0024zza.DELAY_PAGE_LOAD_CANCELLED_AD);
        }
        this.zzeif = true;
        zzaaz();
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcrz)).booleanValue()) {
            this.zzehs.destroy();
        }
    }

    private final void zzaaz() {
        if (this.zzehv != null && ((this.zzeie && this.zzeig <= 0) || this.zzeif)) {
            this.zzehv.zzak(!this.zzeif);
            this.zzehv = null;
        }
        this.zzehs.zzabt();
    }

    public final void zza(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        boolean zzabo = this.zzehs.zzabo();
        zza(new AdOverlayInfoParcel(zzdVar, (!zzabo || this.zzehs.zzabh().zzaco()) ? this.zzceb : null, zzabo ? null : this.zzdkt, this.zzdkx, this.zzehs.zzzk()));
    }

    public final void zzb(boolean z, int i) {
        zzub zzubVar = (!this.zzehs.zzabo() || this.zzehs.zzabh().zzaco()) ? this.zzceb : null;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzdkt;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzdkx;
        zzbek zzbekVar = this.zzehs;
        zza(new AdOverlayInfoParcel(zzubVar, zzoVar, zztVar, zzbekVar, z, i, zzbekVar.zzzk()));
    }

    public final void zza(boolean z, int i, String str) {
        boolean zzabo = this.zzehs.zzabo();
        zzub zzubVar = (!zzabo || this.zzehs.zzabh().zzaco()) ? this.zzceb : null;
        zzbep zzbepVar = zzabo ? null : new zzbep(this.zzehs, this.zzdkt);
        zzafj zzafjVar = this.zzczu;
        zzafl zzaflVar = this.zzczw;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzdkx;
        zzbek zzbekVar = this.zzehs;
        zza(new AdOverlayInfoParcel(zzubVar, zzbepVar, zzafjVar, zzaflVar, zztVar, zzbekVar, z, i, str, zzbekVar.zzzk()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        boolean zzabo = this.zzehs.zzabo();
        zzub zzubVar = (!zzabo || this.zzehs.zzabh().zzaco()) ? this.zzceb : null;
        zzbep zzbepVar = zzabo ? null : new zzbep(this.zzehs, this.zzdkt);
        zzafj zzafjVar = this.zzczu;
        zzafl zzaflVar = this.zzczw;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzdkx;
        zzbek zzbekVar = this.zzehs;
        zza(new AdOverlayInfoParcel(zzubVar, zzbepVar, zzafjVar, zzaflVar, zztVar, zzbekVar, z, i, str, str2, zzbekVar.zzzk()));
    }

    private final void zza(AdOverlayInfoParcel adOverlayInfoParcel) {
        zzaor zzaorVar = this.zzdat;
        boolean zzub = zzaorVar != null ? zzaorVar.zzub() : false;
        com.google.android.gms.ads.internal.zzq.zzkv();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zzehs.getContext(), adOverlayInfoParcel, !zzub);
        if (this.zzeid != null) {
            String str = adOverlayInfoParcel.url;
            if (str == null && adOverlayInfoParcel.zzdks != null) {
                str = adOverlayInfoParcel.zzdks.url;
            }
            this.zzeid.zzdy(str);
        }
    }

    public final void zza(String str, zzaga<? super zzbek> zzagaVar) {
        synchronized (this.lock) {
            List<zzaga<? super zzbek>> list = this.zzehu.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.zzehu.put(str, list);
            }
            list.add(zzagaVar);
        }
    }

    public final void zzb(String str, zzaga<? super zzbek> zzagaVar) {
        synchronized (this.lock) {
            List<zzaga<? super zzbek>> list = this.zzehu.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzagaVar);
        }
    }

    public final void zza(String str, Predicate<zzaga<? super zzbek>> predicate) {
        synchronized (this.lock) {
            List<zzaga<? super zzbek>> list = this.zzehu.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzaga<? super zzbek> zzagaVar : list) {
                if (predicate.apply(zzagaVar)) {
                    arrayList.add(zzagaVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void reset() {
        zzaun zzaunVar = this.zzeid;
        if (zzaunVar != null) {
            zzaunVar.zzvi();
            this.zzeid = null;
        }
        zzaau();
        synchronized (this.lock) {
            this.zzehu.clear();
            this.zzceb = null;
            this.zzdkt = null;
            this.zzehv = null;
            this.zzehw = null;
            this.zzczu = null;
            this.zzczw = null;
            this.zzehy = false;
            this.zzbne = false;
            this.zzehz = false;
            this.zzeib = false;
            this.zzdkx = null;
            this.zzehx = null;
            if (this.zzdat != null) {
                this.zzdat.zzac(true);
                this.zzdat = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zza(zzbfv zzbfvVar) {
        this.zzehv = zzbfvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zza(zzbfy zzbfyVar) {
        this.zzehw = zzbfyVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzawr.zzeg(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzh(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        zzawr.zzeg(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzh(parse);
        } else {
            if (this.zzehy && webView == this.zzehs.getWebView()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    zzub zzubVar = this.zzceb;
                    if (zzubVar != null) {
                        zzubVar.onAdClicked();
                        zzaun zzaunVar = this.zzeid;
                        if (zzaunVar != null) {
                            zzaunVar.zzdy(str);
                        }
                        this.zzceb = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzehs.getWebView().willNotDraw()) {
                try {
                    zzdt zzabm = this.zzehs.zzabm();
                    if (zzabm != null && zzabm.zzb(parse)) {
                        parse = zzabm.zza(parse, this.zzehs.getContext(), this.zzehs.getView(), this.zzehs.zzzh());
                    }
                } catch (zzdw unused) {
                    String valueOf2 = String.valueOf(str);
                    zzawr.zzfc(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                com.google.android.gms.ads.internal.zzc zzcVar = this.zzdas;
                if (zzcVar == null || zzcVar.zzjx()) {
                    zza(new com.google.android.gms.ads.internal.overlay.zzd("android.intent.action.VIEW", parse.toString(), null, null, null, null, null));
                } else {
                    this.zzdas.zzbm(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                zzawr.zzfc(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzd(str, Collections.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zzd(String str, Map<String, String> map) {
        zzse zza;
        try {
            String zzc = zzavj.zzc(str, this.zzehs.getContext(), this.zzdov);
            if (!zzc.equals(str)) {
                return zze(zzc, map);
            }
            zzsf zzbu = zzsf.zzbu(str);
            if (zzbu != null && (zza = com.google.android.gms.ads.internal.zzq.zzlc().zza(zzbu)) != null && zza.zzmv()) {
                return new WebResourceResponse("", "", zza.zzmw());
            }
            if (zzazq.isEnabled() && zzabi.zzcwi.get().booleanValue()) {
                return zze(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e) {
            com.google.android.gms.ads.internal.zzq.zzla().zza(e, "AdWebViewClient.interceptRequest");
            return zzaba();
        }
    }

    private static WebResourceResponse zzaba() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzclc)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
        com.google.android.gms.ads.internal.zzq.zzkw();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
        return com.google.android.gms.internal.ads.zzaxa.zzd(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse zze(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbej.zze(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void zzav(boolean z) {
        this.zzehy = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final zzaun zzabb() {
        return this.zzeid;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zzui() {
        synchronized (this.lock) {
            this.zzehy = false;
            this.zzbne = true;
            zzbab.zzdzv.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbem
                private final zzbej zzeii;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzeii = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbej zzbejVar = this.zzeii;
                    zzbejVar.zzehs.zzabs();
                    com.google.android.gms.ads.internal.overlay.zzc zzabf = zzbejVar.zzehs.zzabf();
                    if (zzabf != null) {
                        zzabf.zzui();
                    }
                }
            });
        }
    }

    public final void zzax(boolean z) {
        this.zzdov = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zzi(int i, int i2) {
        zzaor zzaorVar = this.zzdat;
        if (zzaorVar != null) {
            zzaorVar.zzi(i, i2);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zzh(Uri uri) {
        final String path = uri.getPath();
        List<zzaga<? super zzbek>> list = this.zzehu.get(path);
        if (list != null) {
            if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcrv)).booleanValue()) {
                com.google.android.gms.ads.internal.zzq.zzkw();
                zza(zzaxa.zzj(uri), list, path);
                return;
            }
            zzdqw.zza(com.google.android.gms.ads.internal.zzq.zzkw().zzi(uri), new zzbeq(this, list, path), zzbab.zzdzw);
            return;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
        sb.append("No GMSG handler found for GMSG: ");
        sb.append(valueOf);
        zzawr.zzeg(sb.toString());
        if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzctz)).booleanValue() || com.google.android.gms.ads.internal.zzq.zzla().zzvv() == null) {
            return;
        }
        zzbab.zzdzr.execute(new Runnable(path) { // from class: com.google.android.gms.internal.ads.zzbel
            private final String zzdcd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdcd = path;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.ads.internal.zzq.zzla().zzvv().zzct(this.zzdcd.substring(1));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Map<String, String> map, List<zzaga<? super zzbek>> list, String str) {
        if (zzawr.isLoggable(2)) {
            String valueOf = String.valueOf(str);
            zzawr.zzeg(valueOf.length() != 0 ? "Received GMSG: ".concat(valueOf) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                zzawr.zzeg(sb.toString());
            }
        }
        for (zzaga<? super zzbek> zzagaVar : list) {
            zzagaVar.zza(this.zzehs, map);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zzay(boolean z) {
        synchronized (this.lock) {
            this.zzehz = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zzaz(boolean z) {
        synchronized (this.lock) {
            this.zzeia = z;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzehs.zzc(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
