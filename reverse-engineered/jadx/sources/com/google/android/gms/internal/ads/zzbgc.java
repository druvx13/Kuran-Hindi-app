package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.File;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbgc extends zzbgl implements zzbfw {
    private volatile boolean zzbne;
    private zzub zzceb;
    private zzafj zzczu;
    private zzafl zzczw;
    private com.google.android.gms.ads.internal.zzc zzdas;
    private zzaor zzdat;
    private com.google.android.gms.ads.internal.overlay.zzo zzdkt;
    private com.google.android.gms.ads.internal.overlay.zzt zzdkx;
    private boolean zzdov;
    protected zzbek zzehs;
    private zzbfv zzehv;
    private zzbfy zzehw;
    private zzbfx zzehx;
    private boolean zzehz;
    private boolean zzeia;
    private boolean zzeib;
    private zzaoy zzeic;
    private zzaun zzeid;
    private boolean zzeie;
    private boolean zzeif;
    private int zzeig;
    private View.OnAttachStateChangeListener zzeih;
    private final Object lock = new Object();
    private boolean zzehy = false;
    private final zzair<zzbek> zzell = new zzair<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzbek zzbekVar, boolean z) {
        zzaoy zzaoyVar = new zzaoy(zzbekVar, zzbekVar.zzabe(), new zzzg(zzbekVar.getContext()));
        this.zzehs = zzbekVar;
        this.zzbne = z;
        this.zzeic = zzaoyVar;
        this.zzdat = null;
        this.zzell.zzg((zzair<zzbek>) zzbekVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zza(int i, int i2, boolean z) {
        this.zzeic.zzj(i, i2);
        zzaor zzaorVar = this.zzdat;
        if (zzaorVar != null) {
            zzaorVar.zza(i, i2, false);
        }
    }

    public final void zza(String str, zzaga<? super zzbek> zzagaVar) {
        this.zzell.zza(str, zzagaVar);
    }

    public final void zzb(String str, zzaga<? super zzbek> zzagaVar) {
        this.zzell.zzb(str, zzagaVar);
    }

    public final void zza(String str, Predicate<zzaga<? super zzbek>> predicate) {
        this.zzell.zza(str, predicate);
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
        return this.zzbne;
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
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        zzrv zzabz = this.zzehs.zzabz();
        if (zzabz != null && webView == zzabz.getWebView()) {
            zzabz.onPageStarted(webView, str, bitmap);
        }
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zza(zzbgo zzbgoVar) {
        this.zzeie = true;
        zzbfy zzbfyVar = this.zzehw;
        if (zzbfyVar != null) {
            zzbfyVar.zzsw();
            this.zzehw = null;
        }
        zzaaz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(View view, zzaun zzaunVar, int i) {
        if (!zzaunVar.zzvg() || i <= 0) {
            return;
        }
        zzaunVar.zzl(view);
        if (zzaunVar.zzvg()) {
            zzaxa.zzdwf.postDelayed(new zzbge(this, view, zzaunVar, i), 100L);
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
            this.zzeih = new zzbgd(this, zzaunVar);
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
        this.zzeif = true;
        zzaaz();
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
        zzbgg zzbggVar = zzabo ? null : new zzbgg(this.zzehs, this.zzdkt);
        zzafj zzafjVar = this.zzczu;
        zzafl zzaflVar = this.zzczw;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzdkx;
        zzbek zzbekVar = this.zzehs;
        zza(new AdOverlayInfoParcel(zzubVar, zzbggVar, zzafjVar, zzaflVar, zztVar, zzbekVar, z, i, str, zzbekVar.zzzk()));
    }

    public final void zza(boolean z, int i, String str, String str2) {
        boolean zzabo = this.zzehs.zzabo();
        zzub zzubVar = (!zzabo || this.zzehs.zzabh().zzaco()) ? this.zzceb : null;
        zzbgg zzbggVar = zzabo ? null : new zzbgg(this.zzehs, this.zzdkt);
        zzafj zzafjVar = this.zzczu;
        zzafl zzaflVar = this.zzczw;
        com.google.android.gms.ads.internal.overlay.zzt zztVar = this.zzdkx;
        zzbek zzbekVar = this.zzehs;
        zza(new AdOverlayInfoParcel(zzubVar, zzbggVar, zzafjVar, zzaflVar, zztVar, zzbekVar, z, i, str, str2, zzbekVar.zzzk()));
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

    public final void destroy() {
        zzaun zzaunVar = this.zzeid;
        if (zzaunVar != null) {
            zzaunVar.zzvi();
            this.zzeid = null;
        }
        zzaau();
        this.zzell.reset();
        this.zzell.zzg((zzair<zzbek>) null);
        synchronized (this.lock) {
            this.zzceb = null;
            this.zzdkt = null;
            this.zzehv = null;
            this.zzehw = null;
            this.zzczu = null;
            this.zzczw = null;
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

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final void zzb(zzbgo zzbgoVar) {
        this.zzell.zzg(zzbgoVar.uri);
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final boolean zzc(zzbgo zzbgoVar) {
        String valueOf = String.valueOf(zzbgoVar.url);
        zzawr.zzeg(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri uri = zzbgoVar.uri;
        if (this.zzell.zzg(uri)) {
            return true;
        }
        if (this.zzehy) {
            String scheme = uri.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                zzub zzubVar = this.zzceb;
                if (zzubVar != null) {
                    zzubVar.onAdClicked();
                    zzaun zzaunVar = this.zzeid;
                    if (zzaunVar != null) {
                        zzaunVar.zzdy(zzbgoVar.url);
                    }
                    this.zzceb = null;
                }
                return false;
            }
        }
        if (!this.zzehs.getWebView().willNotDraw()) {
            try {
                zzdt zzabm = this.zzehs.zzabm();
                if (zzabm != null && zzabm.zzb(uri)) {
                    uri = zzabm.zza(uri, this.zzehs.getContext(), this.zzehs.getView(), this.zzehs.zzzh());
                }
            } catch (zzdw unused) {
                String valueOf2 = String.valueOf(zzbgoVar.url);
                zzawr.zzfc(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
            }
            com.google.android.gms.ads.internal.zzc zzcVar = this.zzdas;
            if (zzcVar == null || zzcVar.zzjx()) {
                zza(new com.google.android.gms.ads.internal.overlay.zzd("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            } else {
                this.zzdas.zzbm(zzbgoVar.url);
            }
        } else {
            String valueOf3 = String.valueOf(zzbgoVar.url);
            zzawr.zzfc(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgl
    public final WebResourceResponse zzd(zzbgo zzbgoVar) {
        String str;
        WebResourceResponse zzd;
        zzse zza;
        zzaun zzaunVar = this.zzeid;
        if (zzaunVar != null) {
            zzaunVar.zza(zzbgoVar.url, zzbgoVar.zzab, 1);
        }
        if ("mraid.js".equalsIgnoreCase(new File(zzbgoVar.url).getName())) {
            zzui();
            if (this.zzehs.zzabh().zzaco()) {
                str = (String) zzvj.zzpv().zzd(zzzz.zzcka);
            } else if (this.zzehs.zzabo()) {
                str = (String) zzvj.zzpv().zzd(zzzz.zzcjz);
            } else {
                str = (String) zzvj.zzpv().zzd(zzzz.zzcjy);
            }
            com.google.android.gms.ads.internal.zzq.zzkw();
            zzd = zzaxa.zzd(this.zzehs.getContext(), this.zzehs.zzzk().zzbnd, str);
        } else {
            zzd = null;
        }
        if (zzd != null) {
            return zzd;
        }
        try {
            if (!zzavj.zzc(zzbgoVar.url, this.zzehs.getContext(), this.zzdov).equals(zzbgoVar.url)) {
                return zze(zzbgoVar);
            }
            zzsf zzbu = zzsf.zzbu(zzbgoVar.url);
            if (zzbu != null && (zza = com.google.android.gms.ads.internal.zzq.zzlc().zza(zzbu)) != null && zza.zzmv()) {
                return new WebResourceResponse("", "", zza.zzmw());
            }
            if (zzazq.isEnabled() && zzabi.zzcwi.get().booleanValue()) {
                return zze(zzbgoVar);
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

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
        com.google.android.gms.ads.internal.zzq.zzkw();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
        return com.google.android.gms.internal.ads.zzaxa.zzd(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse zze(com.google.android.gms.internal.ads.zzbgo r8) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbgc.zze(com.google.android.gms.internal.ads.zzbgo):android.webkit.WebResourceResponse");
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
            zzbab.zzdzv.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbgb
                private final zzbgc zzelk;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzelk = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbgc zzbgcVar = this.zzelk;
                    zzbgcVar.zzehs.zzabs();
                    com.google.android.gms.ads.internal.overlay.zzc zzabf = zzbgcVar.zzehs.zzabf();
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

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zzh(Uri uri) {
        this.zzell.zzh(uri);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zzehs.zzc(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
