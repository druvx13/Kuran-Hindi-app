package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcar extends zzacz implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcbj {
    public static final String[] zzfth = {NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};
    private FrameLayout zzbld;
    private zzacr zzchr;
    private final int zzdzo;
    private zzbzm zzftd;
    private zzpv zzfte;
    private final String zzftg;
    private FrameLayout zzfti;
    private zzdrh zzftj;
    private View zzftk;
    private boolean zzftm;
    private Map<String, WeakReference<View>> zzdli = new HashMap();
    private IObjectWrapper zzftl = null;
    private boolean zzejx = false;

    public zzcar(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        String str;
        this.zzfti = frameLayout;
        this.zzbld = frameLayout2;
        this.zzdzo = i;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = NativeAppInstallAd.ASSET_ATTRIBUTION_ICON_IMAGE;
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzftg = str;
        com.google.android.gms.ads.internal.zzq.zzlt();
        zzbar.zza((View) frameLayout, (ViewTreeObserver.OnGlobalLayoutListener) this);
        com.google.android.gms.ads.internal.zzq.zzlt();
        zzbar.zza((View) frameLayout, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzftj = zzbab.zzdzv;
        this.zzfte = new zzpv(this.zzfti.getContext(), this.zzfti);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final synchronized void zzb(String str, IObjectWrapper iObjectWrapper) {
        zza(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized void zza(String str, View view, boolean z) {
        if (this.zzejx) {
            return;
        }
        if (view == null) {
            this.zzdli.remove(str);
            return;
        }
        this.zzdli.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
            if (zzaza.zzdb(this.zzdzo)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final synchronized IObjectWrapper zzcq(String str) {
        return ObjectWrapper.wrap(zzgd(str));
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized View zzgd(String str) {
        if (this.zzejx) {
            return null;
        }
        WeakReference<View> weakReference = this.zzdli.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final synchronized void zza(IObjectWrapper iObjectWrapper) {
        if (this.zzejx) {
            return;
        }
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzbzm)) {
            zzawr.zzfc("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        if (this.zzftd != null) {
            this.zzftd.zzb(this);
        }
        zzamd();
        zzbzm zzbzmVar = (zzbzm) unwrap;
        this.zzftd = zzbzmVar;
        zzbzmVar.zza(this);
        this.zzftd.zzz(this.zzfti);
        this.zzftd.zzaa(this.zzbld);
        if (this.zzftm) {
            this.zzftd.zzakt().zza(this.zzchr);
        }
    }

    private final synchronized void zzamd() {
        this.zzftj.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcaq
            private final zzcar zzftf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzftf = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzftf.zzame();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final synchronized void destroy() {
        if (this.zzejx) {
            return;
        }
        if (this.zzftd != null) {
            this.zzftd.zzb(this);
            this.zzftd = null;
        }
        this.zzdli.clear();
        this.zzfti.removeAllViews();
        this.zzbld.removeAllViews();
        this.zzdli = null;
        this.zzfti = null;
        this.zzbld = null;
        this.zzftk = null;
        this.zzfte = null;
        this.zzejx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final synchronized void zzc(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        if (this.zzftd != null) {
            this.zzftd.cancelUnconfirmedClick();
            this.zzftd.zza(view, this.zzfti, zzaly(), zzalz(), false);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzftd != null) {
            this.zzftd.zza(view, motionEvent, this.zzfti);
        }
        return false;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        if (this.zzftd != null) {
            this.zzftd.zzb(this.zzfti, zzaly(), zzalz(), zzbzm.zzy(this.zzfti));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        if (this.zzftd != null) {
            this.zzftd.zzb(this.zzfti, zzaly(), zzalz(), zzbzm.zzy(this.zzfti));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized Map<String, WeakReference<View>> zzaly() {
        return this.zzdli;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized Map<String, WeakReference<View>> zzalz() {
        return this.zzdli;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized Map<String, WeakReference<View>> zzama() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized String zzamb() {
        return this.zzftg;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final FrameLayout zzalw() {
        return this.zzbld;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final zzpv zzalx() {
        return this.zzfte;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        this.zzftd.setClickConfirmingView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) {
        if (this.zzejx) {
            return;
        }
        this.zzftl = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final IObjectWrapper zzamc() {
        return this.zzftl;
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final void zzf(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzfti, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzacw
    public final synchronized void zza(zzacr zzacrVar) {
        if (this.zzejx) {
            return;
        }
        this.zzftm = true;
        this.zzchr = zzacrVar;
        if (this.zzftd != null) {
            this.zzftd.zzakt().zza(zzacrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final /* synthetic */ View zzahe() {
        return this.zzfti;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzame() {
        if (this.zzftk == null) {
            View view = new View(this.zzfti.getContext());
            this.zzftk = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzfti != this.zzftk.getParent()) {
            this.zzfti.addView(this.zzftk);
        }
    }
}
