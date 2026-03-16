package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public interface zzbek extends com.google.android.gms.ads.internal.zzi, zzaif, zzajc, zzbbx, zzbfj, zzbfm, zzbfq, zzbfr, zzbft, zzbfu, zzpz {
    void destroy();

    @Override // com.google.android.gms.internal.ads.zzbbx, com.google.android.gms.internal.ads.zzbfj
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    ViewParent getParent();

    @Override // com.google.android.gms.internal.ads.zzbft
    View getView();

    WebView getWebView();

    int getWidth();

    boolean isDestroyed();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzbbx
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void zza(ViewGroup viewGroup, Activity activity, String str, String str2);

    void zza(com.google.android.gms.ads.internal.overlay.zzc zzcVar);

    void zza(zzacf zzacfVar);

    void zza(zzacg zzacgVar);

    @Override // com.google.android.gms.internal.ads.zzbbx
    void zza(zzbfe zzbfeVar);

    void zza(zzbfz zzbfzVar);

    void zza(zzrh zzrhVar);

    void zza(String str, Predicate<zzaga<? super zzbek>> predicate);

    void zza(String str, zzaga<? super zzbek> zzagaVar);

    @Override // com.google.android.gms.internal.ads.zzbbx
    void zza(String str, zzbdl zzbdlVar);

    void zzabc();

    void zzabd();

    Context zzabe();

    com.google.android.gms.ads.internal.overlay.zzc zzabf();

    com.google.android.gms.ads.internal.overlay.zzc zzabg();

    @Override // com.google.android.gms.internal.ads.zzbfs
    zzbfz zzabh();

    String zzabi();

    zzbfw zzabj();

    WebViewClient zzabk();

    boolean zzabl();

    @Override // com.google.android.gms.internal.ads.zzbfr
    zzdt zzabm();

    IObjectWrapper zzabn();

    @Override // com.google.android.gms.internal.ads.zzbfm
    boolean zzabo();

    void zzabp();

    boolean zzabq();

    boolean zzabr();

    void zzabs();

    void zzabt();

    zzacg zzabu();

    void zzabv();

    void zzabw();

    zzrh zzabx();

    boolean zzaby();

    zzrv zzabz();

    boolean zzaca();

    void zzal(boolean z);

    void zzap(IObjectWrapper iObjectWrapper);

    void zzax(boolean z);

    void zzb(com.google.android.gms.ads.internal.overlay.zzc zzcVar);

    void zzb(String str, zzaga<? super zzbek> zzagaVar);

    void zzb(String str, String str2, String str3);

    void zzba(boolean z);

    void zzbb(boolean z);

    void zzbc(boolean z);

    void zzbt(Context context);

    boolean zzc(boolean z, int i);

    void zzdn(int i);

    void zzum();

    @Override // com.google.android.gms.internal.ads.zzbbx
    zzbfe zzzf();

    @Override // com.google.android.gms.internal.ads.zzbbx, com.google.android.gms.internal.ads.zzbfj
    Activity zzzh();

    @Override // com.google.android.gms.internal.ads.zzbbx
    com.google.android.gms.ads.internal.zza zzzi();

    @Override // com.google.android.gms.internal.ads.zzbbx
    zzaan zzzj();

    @Override // com.google.android.gms.internal.ads.zzbbx, com.google.android.gms.internal.ads.zzbfu
    zzazz zzzk();
}
