package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzapb;
import com.google.android.gms.internal.ads.zzapf;
import com.google.android.gms.internal.ads.zzawr;
import com.google.android.gms.internal.ads.zzaxa;
import com.google.android.gms.internal.ads.zzaxf;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzst;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzzz;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzc extends zzapf implements zzy {
    private static final int zzdjp = Color.argb(0, 0, 0, 0);
    protected final Activity zzaad;
    zzbek zzdce;
    AdOverlayInfoParcel zzdjq;
    private zzi zzdjr;
    private zzq zzdjs;
    private FrameLayout zzdju;
    private WebChromeClient.CustomViewCallback zzdjv;
    private zzj zzdjx;
    private Runnable zzdkb;
    private boolean zzdkc;
    private boolean zzdkd;
    private boolean zzdjt = false;
    private boolean zzdjw = false;
    private boolean zzblz = false;
    private boolean zzdjy = false;
    int zzdjz = 0;
    private final Object zzdka = new Object();
    private boolean zzdke = false;
    private boolean zzdkf = false;
    private boolean zzdkg = true;

    public zzc(Activity activity) {
        this.zzaad = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onRestart() {
    }

    public final void close() {
        this.zzdjz = 2;
        this.zzaad.finish();
    }

    public final void zzuf() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjq;
        if (adOverlayInfoParcel != null && this.zzdjt) {
            setRequestedOrientation(adOverlayInfoParcel.orientation);
        }
        if (this.zzdju != null) {
            this.zzaad.setContentView(this.zzdjx);
            this.zzdkd = true;
            this.zzdju.removeAllViews();
            this.zzdju = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzdjv;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzdjv = null;
        }
        this.zzdjt = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzy
    public final void zzug() {
        this.zzdjz = 1;
        this.zzaad.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onBackPressed() {
        this.zzdjz = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final boolean zzuh() {
        this.zzdjz = 0;
        zzbek zzbekVar = this.zzdce;
        if (zzbekVar == null) {
            return true;
        }
        boolean zzabq = zzbekVar.zzabq();
        if (!zzabq) {
            this.zzdce.zza("onbackblocked", Collections.emptyMap());
        }
        return zzabq;
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public void onCreate(Bundle bundle) {
        this.zzaad.requestWindowFeature(1);
        this.zzdjw = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(this.zzaad.getIntent());
            this.zzdjq = zzc;
            if (zzc == null) {
                throw new zzg("Could not get info for ad overlay.");
            }
            if (zzc.zzbmo.zzdzo > 7500000) {
                this.zzdjz = 3;
            }
            if (this.zzaad.getIntent() != null) {
                this.zzdkg = this.zzaad.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.zzdjq.zzdla != null) {
                this.zzblz = this.zzdjq.zzdla.zzblz;
            } else {
                this.zzblz = false;
            }
            if (this.zzblz && this.zzdjq.zzdla.zzbme != -1) {
                new zzl(this).zzwn();
            }
            if (bundle == null) {
                if (this.zzdjq.zzdkt != null && this.zzdkg) {
                    this.zzdjq.zzdkt.zzua();
                }
                if (this.zzdjq.zzdky != 1 && this.zzdjq.zzceb != null) {
                    this.zzdjq.zzceb.onAdClicked();
                }
            }
            zzj zzjVar = new zzj(this.zzaad, this.zzdjq.zzdkz, this.zzdjq.zzbmo.zzbnd);
            this.zzdjx = zzjVar;
            zzjVar.setId(1000);
            com.google.android.gms.ads.internal.zzq.zzky().zzg(this.zzaad);
            int i = this.zzdjq.zzdky;
            if (i == 1) {
                zzaj(false);
            } else if (i == 2) {
                this.zzdjr = new zzi(this.zzdjq.zzdce);
                zzaj(false);
            } else if (i == 3) {
                zzaj(true);
            } else {
                throw new zzg("Could not determine ad overlay type.");
            }
        } catch (zzg e) {
            zzawr.zzfc(e.getMessage());
            this.zzdjz = 3;
            this.zzaad.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onStart() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqn)).booleanValue()) {
            zzbek zzbekVar = this.zzdce;
            if (zzbekVar != null && !zzbekVar.isDestroyed()) {
                com.google.android.gms.ads.internal.zzq.zzky();
                zzaxf.zzb(this.zzdce);
                return;
            }
            zzawr.zzfc("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onResume() {
        if (this.zzdjq.zzdkt != null) {
            this.zzdjq.zzdkt.onResume();
        }
        zza(this.zzaad.getResources().getConfiguration());
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqn)).booleanValue()) {
            return;
        }
        zzbek zzbekVar = this.zzdce;
        if (zzbekVar != null && !zzbekVar.isDestroyed()) {
            com.google.android.gms.ads.internal.zzq.zzky();
            zzaxf.zzb(this.zzdce);
            return;
        }
        zzawr.zzfc("The webview does not exist. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onPause() {
        zzuf();
        if (this.zzdjq.zzdkt != null) {
            this.zzdjq.zzdkt.onPause();
        }
        if (!((Boolean) zzvj.zzpv().zzd(zzzz.zzcqn)).booleanValue() && this.zzdce != null && (!this.zzaad.isFinishing() || this.zzdjr == null)) {
            com.google.android.gms.ads.internal.zzq.zzky();
            zzaxf.zza(this.zzdce);
        }
        zzuj();
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zzad(IObjectWrapper iObjectWrapper) {
        zza((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzdjw);
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onStop() {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqn)).booleanValue() && this.zzdce != null && (!this.zzaad.isFinishing() || this.zzdjr == null)) {
            com.google.android.gms.ads.internal.zzq.zzky();
            zzaxf.zza(this.zzdce);
        }
        zzuj();
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void onDestroy() {
        zzbek zzbekVar = this.zzdce;
        if (zzbekVar != null) {
            try {
                this.zzdjx.removeView(zzbekVar.getView());
            } catch (NullPointerException unused) {
            }
        }
        zzuj();
    }

    private final void zzai(boolean z) {
        int intValue = ((Integer) zzvj.zzpv().zzd(zzzz.zzcqp)).intValue();
        zzp zzpVar = new zzp();
        zzpVar.size = 50;
        zzpVar.paddingLeft = z ? intValue : 0;
        zzpVar.paddingRight = z ? 0 : intValue;
        zzpVar.paddingTop = 0;
        zzpVar.paddingBottom = intValue;
        this.zzdjs = new zzq(this.zzaad, zzpVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.zzdjq.zzdkv);
        this.zzdjx.addView(this.zzdjs, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzapg
    public final void zzdp() {
        this.zzdkd = true;
    }

    public final void zza(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzvj.zzpv().zzd(zzzz.zzclu)).booleanValue() && (adOverlayInfoParcel2 = this.zzdjq) != null && adOverlayInfoParcel2.zzdla != null && this.zzdjq.zzdla.zzbmg;
        boolean z5 = ((Boolean) zzvj.zzpv().zzd(zzzz.zzclv)).booleanValue() && (adOverlayInfoParcel = this.zzdjq) != null && adOverlayInfoParcel.zzdla != null && this.zzdjq.zzdla.zzbmh;
        if (z && z2 && z4 && !z5) {
            new zzapb(this.zzdce, "useCustomClose").zzdv("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzq zzqVar = this.zzdjs;
        if (zzqVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzqVar.zzal(z3);
        }
    }

    public final void zzui() {
        this.zzdjx.removeView(this.zzdjs);
        zzai(true);
    }

    public final void setRequestedOrientation(int i) {
        if (this.zzaad.getApplicationInfo().targetSdkVersion >= ((Integer) zzvj.zzpv().zzd(zzzz.zzcsn)).intValue()) {
            if (this.zzaad.getApplicationInfo().targetSdkVersion <= ((Integer) zzvj.zzpv().zzd(zzzz.zzcso)).intValue()) {
                if (Build.VERSION.SDK_INT >= ((Integer) zzvj.zzpv().zzd(zzzz.zzcsp)).intValue()) {
                    if (Build.VERSION.SDK_INT <= ((Integer) zzvj.zzpv().zzd(zzzz.zzcsq)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzaad.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzq.zzla().zzb(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzaad);
        this.zzdju = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzdju.addView(view, -1, -1);
        this.zzaad.setContentView(this.zzdju);
        this.zzdkd = true;
        this.zzdjv = customViewCallback;
        this.zzdjt = true;
    }

    private final void zzaj(boolean z) throws zzg {
        if (!this.zzdkd) {
            this.zzaad.requestWindowFeature(1);
        }
        Window window = this.zzaad.getWindow();
        if (window == null) {
            throw new zzg("Invalid activity, no window available.");
        }
        zzbfw zzabj = this.zzdjq.zzdce != null ? this.zzdjq.zzdce.zzabj() : null;
        boolean z2 = zzabj != null && zzabj.zzaap();
        this.zzdjy = false;
        if (z2) {
            int i = this.zzdjq.orientation;
            com.google.android.gms.ads.internal.zzq.zzky();
            if (i == 6) {
                this.zzdjy = this.zzaad.getResources().getConfiguration().orientation == 1;
            } else {
                int i2 = this.zzdjq.orientation;
                com.google.android.gms.ads.internal.zzq.zzky();
                if (i2 == 7) {
                    this.zzdjy = this.zzaad.getResources().getConfiguration().orientation == 2;
                }
            }
        }
        boolean z3 = this.zzdjy;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(z3);
        zzawr.zzed(sb.toString());
        setRequestedOrientation(this.zzdjq.orientation);
        com.google.android.gms.ads.internal.zzq.zzky();
        window.setFlags(16777216, 16777216);
        zzawr.zzed("Hardware acceleration on the AdActivity window enabled.");
        if (!this.zzblz) {
            this.zzdjx.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        } else {
            this.zzdjx.setBackgroundColor(zzdjp);
        }
        this.zzaad.setContentView(this.zzdjx);
        this.zzdkd = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzq.zzkx();
                zzbek zza = zzbes.zza(this.zzaad, this.zzdjq.zzdce != null ? this.zzdjq.zzdce.zzabh() : null, this.zzdjq.zzdce != null ? this.zzdjq.zzdce.zzabi() : null, true, z2, null, this.zzdjq.zzbmo, null, null, this.zzdjq.zzdce != null ? this.zzdjq.zzdce.zzzi() : null, zzst.zzmz(), null, false);
                this.zzdce = zza;
                zza.zzabj().zza(null, this.zzdjq.zzczu, null, this.zzdjq.zzczw, this.zzdjq.zzdkx, true, null, this.zzdjq.zzdce != null ? this.zzdjq.zzdce.zzabj().zzaao() : null, null, null);
                this.zzdce.zzabj().zza(new zzbfv(this) { // from class: com.google.android.gms.ads.internal.overlay.zzf
                    private final zzc zzdkl;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdkl = this;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbfv
                    public final void zzak(boolean z4) {
                        zzc zzcVar = this.zzdkl;
                        if (zzcVar.zzdce != null) {
                            zzcVar.zzdce.zzum();
                        }
                    }
                });
                if (this.zzdjq.url != null) {
                    this.zzdce.loadUrl(this.zzdjq.url);
                } else if (this.zzdjq.zzdkw != null) {
                    this.zzdce.loadDataWithBaseURL(this.zzdjq.zzdku, this.zzdjq.zzdkw, "text/html", "UTF-8", null);
                } else {
                    throw new zzg("No URL or HTML to display in ad overlay.");
                }
                if (this.zzdjq.zzdce != null) {
                    this.zzdjq.zzdce.zzb(this);
                }
            } catch (Exception e) {
                zzawr.zzc("Error obtaining webview.", e);
                throw new zzg("Could not obtain webview for the overlay.");
            }
        } else {
            zzbek zzbekVar = this.zzdjq.zzdce;
            this.zzdce = zzbekVar;
            zzbekVar.zzbt(this.zzaad);
        }
        this.zzdce.zza(this);
        if (this.zzdjq.zzdce != null) {
            zzc(this.zzdjq.zzdce.zzabn(), this.zzdjx);
        }
        ViewParent parent = this.zzdce.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.zzdce.getView());
        }
        if (this.zzblz) {
            this.zzdce.zzabv();
        }
        this.zzdce.zza((ViewGroup) null, this.zzaad, this.zzdjq.zzdku, this.zzdjq.zzdkw);
        this.zzdjx.addView(this.zzdce.getView(), -1, -1);
        if (!z && !this.zzdjy) {
            zzum();
        }
        zzai(z2);
        if (this.zzdce.zzabl()) {
            zza(z2, true);
        }
    }

    private final void zzuj() {
        if (!this.zzaad.isFinishing() || this.zzdke) {
            return;
        }
        this.zzdke = true;
        zzbek zzbekVar = this.zzdce;
        if (zzbekVar != null) {
            zzbekVar.zzdn(this.zzdjz);
            synchronized (this.zzdka) {
                if (!this.zzdkc && this.zzdce.zzabr()) {
                    this.zzdkb = new Runnable(this) { // from class: com.google.android.gms.ads.internal.overlay.zze
                        private final zzc zzdkl;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdkl = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzdkl.zzuk();
                        }
                    };
                    zzaxa.zzdwf.postDelayed(this.zzdkb, ((Long) zzvj.zzpv().zzd(zzzz.zzclt)).longValue());
                    return;
                }
            }
        }
        zzuk();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzuk() {
        if (this.zzdkf) {
            return;
        }
        this.zzdkf = true;
        zzbek zzbekVar = this.zzdce;
        if (zzbekVar != null) {
            this.zzdjx.removeView(zzbekVar.getView());
            zzi zziVar = this.zzdjr;
            if (zziVar != null) {
                this.zzdce.zzbt(zziVar.zzvf);
                this.zzdce.zzba(false);
                this.zzdjr.parent.addView(this.zzdce.getView(), this.zzdjr.index, this.zzdjr.zzdkm);
                this.zzdjr = null;
            } else if (this.zzaad.getApplicationContext() != null) {
                this.zzdce.zzbt(this.zzaad.getApplicationContext());
            }
            this.zzdce = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzdjq;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.zzdkt != null) {
            this.zzdjq.zzdkt.zztz();
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdjq;
        if (adOverlayInfoParcel2 == null || adOverlayInfoParcel2.zzdce == null) {
            return;
        }
        zzc(this.zzdjq.zzdce.zzabn(), this.zzdjq.zzdce.getView());
    }

    private static void zzc(IObjectWrapper iObjectWrapper, View view) {
        if (iObjectWrapper == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzq.zzll().zza(iObjectWrapper, view);
    }

    public final void zzul() {
        if (this.zzdjy) {
            this.zzdjy = false;
            zzum();
        }
    }

    private final void zzum() {
        this.zzdce.zzum();
    }

    public final void zzun() {
        this.zzdjx.zzdko = true;
    }

    public final void zzuo() {
        synchronized (this.zzdka) {
            this.zzdkc = true;
            if (this.zzdkb != null) {
                zzaxa.zzdwf.removeCallbacks(this.zzdkb);
                zzaxa.zzdwf.post(this.zzdkb);
            }
        }
    }

    private final void zza(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzdjq;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || adOverlayInfoParcel2.zzdla == null || !this.zzdjq.zzdla.zzbma) ? false : true;
        boolean zza = com.google.android.gms.ads.internal.zzq.zzky().zza(this.zzaad, configuration);
        if ((this.zzblz && !z3) || zza) {
            z = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (adOverlayInfoParcel = this.zzdjq) != null && adOverlayInfoParcel.zzdla != null && this.zzdjq.zzdla.zzbmf) {
            z2 = true;
        }
        Window window = this.zzaad.getWindow();
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzclw)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            View decorView = window.getDecorView();
            int i = 256;
            if (z) {
                i = 5380;
                if (z2) {
                    i = 5894;
                }
            }
            decorView.setSystemUiVisibility(i);
        } else if (z) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (Build.VERSION.SDK_INT < 19 || !z2) {
                return;
            }
            window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
        }
    }
}
