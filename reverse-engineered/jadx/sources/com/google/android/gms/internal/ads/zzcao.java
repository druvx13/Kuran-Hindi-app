package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcao extends zzadc implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzcbj {
    private final WeakReference<View> zzfsz;
    private final Map<String, WeakReference<View>> zzfta = new HashMap();
    private final Map<String, WeakReference<View>> zzftb = new HashMap();
    private final Map<String, WeakReference<View>> zzftc = new HashMap();
    private zzbzm zzftd;
    private zzpv zzfte;

    public zzcao(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzq.zzlt();
        zzbar.zza(view, (ViewTreeObserver.OnGlobalLayoutListener) this);
        com.google.android.gms.ads.internal.zzq.zzlt();
        zzbar.zza(view, (ViewTreeObserver.OnScrollChangedListener) this);
        this.zzfsz = new WeakReference<>(view);
        for (Map.Entry<String, View> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            View value = entry.getValue();
            if (value != null) {
                this.zzfta.put(key, new WeakReference<>(value));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(key)) {
                    value.setOnTouchListener(this);
                    value.setClickable(true);
                    value.setOnClickListener(this);
                }
            }
        }
        this.zzftc.putAll(this.zzfta);
        for (Map.Entry<String, View> entry2 : hashMap2.entrySet()) {
            View value2 = entry2.getValue();
            if (value2 != null) {
                this.zzftb.put(entry2.getKey(), new WeakReference<>(value2));
                value2.setOnTouchListener(this);
                value2.setClickable(false);
            }
        }
        this.zzftc.putAll(this.zzftb);
        this.zzfte = new zzpv(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final FrameLayout zzalw() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final synchronized void unregisterNativeAd() {
        if (this.zzftd != null) {
            this.zzftd.zzb(this);
            this.zzftd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final synchronized void zza(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzbzm)) {
            zzawr.zzfc("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        if (this.zzftd != null) {
            this.zzftd.zzb(this);
        }
        if (((zzbzm) unwrap).zzakr()) {
            zzbzm zzbzmVar = (zzbzm) unwrap;
            this.zzftd = zzbzmVar;
            zzbzmVar.zza(this);
            this.zzftd.zzz(zzahe());
            return;
        }
        zzawr.zzfa("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final View zzahe() {
        return this.zzfsz.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final zzpv zzalx() {
        return this.zzfte;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized void zza(String str, View view, boolean z) {
        if (view == null) {
            this.zzftc.remove(str);
            this.zzfta.remove(str);
            this.zzftb.remove(str);
            return;
        }
        this.zzftc.put(str, new WeakReference<>(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str)) {
            this.zzfta.put(str, new WeakReference<>(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized Map<String, WeakReference<View>> zzaly() {
        return this.zzftc;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized Map<String, WeakReference<View>> zzalz() {
        return this.zzfta;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized Map<String, WeakReference<View>> zzama() {
        return this.zzftb;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized View zzgd(String str) {
        WeakReference<View> weakReference = this.zzftc.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized String zzamb() {
        return NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE;
    }

    @Override // com.google.android.gms.internal.ads.zzcbj
    public final synchronized IObjectWrapper zzamc() {
        return null;
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.zzftd != null) {
            this.zzftd.zza(view, motionEvent, zzahe());
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        if (this.zzftd != null) {
            this.zzftd.zza(view, zzahe(), zzaly(), zzalz(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        if (this.zzftd != null) {
            this.zzftd.zzb(zzahe(), zzaly(), zzalz(), zzbzm.zzy(zzahe()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        if (this.zzftd != null) {
            this.zzftd.zzb(zzahe(), zzaly(), zzalz(), zzbzm.zzy(zzahe()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadd
    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        if (this.zzftd != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof View)) {
                zzawr.zzfc("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zzftd.setClickConfirmingView((View) unwrap);
        }
    }
}
