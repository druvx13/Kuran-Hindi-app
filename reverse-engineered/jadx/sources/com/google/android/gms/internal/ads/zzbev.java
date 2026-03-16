package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbev extends FrameLayout implements zzbek {
    private final zzbek zzeje;
    private final zzbbq zzejf;
    private final AtomicBoolean zzejg;

    public zzbev(zzbek zzbekVar) {
        super(zzbekVar.getContext());
        this.zzejg = new AtomicBoolean();
        this.zzeje = zzbekVar;
        this.zzejf = new zzbbq(zzbekVar.zzabe(), this, this);
        if (zzaca()) {
            return;
        }
        addView(this.zzeje.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbft
    public final View getView() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final zzbbq zzze() {
        return this.zzejf;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void onPause() {
        this.zzejf.onPause();
        this.zzeje.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabp() {
        this.zzejf.onDestroy();
        this.zzeje.zzabp();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabv() {
        setBackgroundColor(0);
        this.zzeje.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final int zzzl() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final int zzzm() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final void zzzn() {
        this.zzeje.zzzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final WebView getWebView() {
        return this.zzeje.getWebView();
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final void zza(String str, Map<String, ?> map) {
        this.zzeje.zza(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzaif
    public final void zzb(String str, JSONObject jSONObject) {
        this.zzeje.zzb(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zza(String str, zzaga<? super zzbek> zzagaVar) {
        this.zzeje.zza(str, zzagaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzb(String str, zzaga<? super zzbek> zzagaVar) {
        this.zzeje.zzb(str, zzagaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zza(String str, Predicate<zzaga<? super zzbek>> predicate) {
        this.zzeje.zza(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabc() {
        this.zzeje.zzabc();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzdn(int i) {
        this.zzeje.zzdn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzum() {
        this.zzeje.zzum();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabd() {
        this.zzeje.zzabd();
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final void zza(boolean z, long j) {
        this.zzeje.zza(z, j);
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void zzda(String str) {
        this.zzeje.zzda(str);
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final void zza(String str, JSONObject jSONObject) {
        this.zzeje.zza(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx, com.google.android.gms.internal.ads.zzbfj
    public final Activity zzzh() {
        return this.zzeje.zzzh();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final Context zzabe() {
        return this.zzeje.zzabe();
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx
    public final com.google.android.gms.ads.internal.zza zzzi() {
        return this.zzeje.zzzi();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final com.google.android.gms.ads.internal.overlay.zzc zzabf() {
        return this.zzeje.zzabf();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final IObjectWrapper zzabn() {
        return this.zzeje.zzabn();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final com.google.android.gms.ads.internal.overlay.zzc zzabg() {
        return this.zzeje.zzabg();
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbfs
    public final zzbfz zzabh() {
        return this.zzeje.zzabh();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final String zzabi() {
        return this.zzeje.zzabi();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final zzbfw zzabj() {
        return this.zzeje.zzabj();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final WebViewClient zzabk() {
        return this.zzeje.zzabk();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final boolean zzabl() {
        return this.zzeje.zzabl();
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbfr
    public final zzdt zzabm() {
        return this.zzeje.zzabm();
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx, com.google.android.gms.internal.ads.zzbfu
    public final zzazz zzzk() {
        return this.zzeje.zzzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbfm
    public final boolean zzabo() {
        return this.zzeje.zzabo();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final boolean isDestroyed() {
        return this.zzeje.isDestroyed();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final boolean zzabq() {
        return this.zzeje.zzabq();
    }

    @Override // com.google.android.gms.ads.internal.zzi
    public final void zzkd() {
        this.zzeje.zzkd();
    }

    @Override // com.google.android.gms.ads.internal.zzi
    public final void zzkc() {
        this.zzeje.zzkc();
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final String getRequestId() {
        return this.zzeje.getRequestId();
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final zzaak zzzg() {
        return this.zzeje.zzzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx
    public final zzaan zzzj() {
        return this.zzeje.zzzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx
    public final zzbfe zzzf() {
        return this.zzeje.zzzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zza(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzeje.zza(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzap(IObjectWrapper iObjectWrapper) {
        this.zzeje.zzap(iObjectWrapper);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zza(zzbfz zzbfzVar) {
        this.zzeje.zza(zzbfzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzba(boolean z) {
        this.zzeje.zzba(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabs() {
        this.zzeje.zzabs();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzbt(Context context) {
        this.zzeje.zzbt(context);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzal(boolean z) {
        this.zzeje.zzal(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void setRequestedOrientation(int i) {
        this.zzeje.setRequestedOrientation(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzb(com.google.android.gms.ads.internal.overlay.zzc zzcVar) {
        this.zzeje.zzb(zzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzbb(boolean z) {
        this.zzeje.zzbb(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx
    public final void zza(String str, zzbdl zzbdlVar) {
        this.zzeje.zza(str, zzbdlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final zzbdl zzfh(String str) {
        return this.zzeje.zzfh(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabt() {
        this.zzeje.zzabt();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void destroy() {
        final IObjectWrapper zzabn = zzabn();
        if (zzabn != null) {
            zzaxa.zzdwf.post(new Runnable(zzabn) { // from class: com.google.android.gms.internal.ads.zzbey
                private final IObjectWrapper zzeji;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzeji = zzabn;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzq.zzll().zzac(this.zzeji);
                }
            });
            zzaxa.zzdwf.postDelayed(new zzbex(this), ((Integer) zzvj.zzpv().zzd(zzzz.zzcqx)).intValue());
            return;
        }
        this.zzeje.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void loadData(String str, String str2, String str3) {
        this.zzeje.loadData(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zzeje.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void loadUrl(String str) {
        this.zzeje.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzb(String str, String str2, String str3) {
        this.zzeje.zzb(str, str2, str3);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbek
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zzeje.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbek
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zzeje.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zzeje.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zzeje.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void onResume() {
        this.zzeje.onResume();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzabw() {
        TextView textView = new TextView(getContext());
        Resources resources = com.google.android.gms.ads.internal.zzq.zzla().getResources();
        textView.setText(resources != null ? resources.getString(R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzax(boolean z) {
        this.zzeje.zzax(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zza(zzacf zzacfVar) {
        this.zzeje.zza(zzacfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zza(zzrh zzrhVar) {
        this.zzeje.zza(zzrhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final zzrh zzabx() {
        return this.zzeje.zzabx();
    }

    @Override // com.google.android.gms.internal.ads.zzpz
    public final void zza(zzqa zzqaVar) {
        this.zzeje.zza(zzqaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zza(zzacg zzacgVar) {
        this.zzeje.zza(zzacgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final zzacg zzabu() {
        return this.zzeje.zzabu();
    }

    @Override // com.google.android.gms.internal.ads.zzbek, com.google.android.gms.internal.ads.zzbbx
    public final void zza(zzbfe zzbfeVar) {
        this.zzeje.zza(zzbfeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final boolean zzabr() {
        return this.zzeje.zzabr();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zzbc(boolean z) {
        this.zzeje.zzbc(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final void zzav(boolean z) {
        this.zzeje.zzav(z);
    }

    @Override // com.google.android.gms.internal.ads.zzbbx
    public final void zzun() {
        this.zzeje.zzun();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(com.google.android.gms.ads.internal.overlay.zzd zzdVar) {
        this.zzeje.zza(zzdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzb(boolean z, int i) {
        this.zzeje.zzb(z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(boolean z, int i, String str) {
        this.zzeje.zza(z, i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zza(boolean z, int i, String str, String str2) {
        this.zzeje.zza(z, i, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final boolean zzc(boolean z, int i) {
        if (this.zzejg.compareAndSet(false, true)) {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzclf)).booleanValue()) {
                return false;
            }
            if (this.zzeje.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.zzeje.getParent()).removeView(this.zzeje.getView());
            }
            return this.zzeje.zzc(z, i);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final boolean zzaby() {
        return this.zzejg.get();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final void zza(ViewGroup viewGroup, Activity activity, String str, String str2) {
        this.zzeje.zza(this, activity, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final zzrv zzabz() {
        return this.zzeje.zzabz();
    }

    @Override // com.google.android.gms.internal.ads.zzbek
    public final boolean zzaca() {
        return this.zzeje.zzaca();
    }
}
