package com.google.android.gms.ads.formats;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzacw;
import com.google.android.gms.internal.ads.zzazw;
import com.google.android.gms.internal.ads.zzvj;
import com.google.android.gms.internal.ads.zzzz;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
@Deprecated
/* loaded from: classes.dex */
public class NativeAdView extends FrameLayout {
    private final FrameLayout zzbld;
    private final zzacw zzble;

    public NativeAdView(Context context) {
        super(context);
        this.zzbld = zzd(context);
        this.zzble = zzjs();
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbld = zzd(context);
        this.zzble = zzjs();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbld = zzd(context);
        this.zzble = zzjs();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zzbld = zzd(context);
        this.zzble = zzjs();
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        zza(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, adChoicesView);
    }

    public AdChoicesView getAdChoicesView() {
        View zzbl = zzbl(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW);
        if (zzbl instanceof AdChoicesView) {
            return (AdChoicesView) zzbl;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza(String str, View view) {
        try {
            this.zzble.zzb(str, ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzazw.zzc("Unable to call setAssetView on delegate", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View zzbl(String str) {
        try {
            IObjectWrapper zzcq = this.zzble.zzcq(str);
            if (zzcq != null) {
                return (View) ObjectWrapper.unwrap(zzcq);
            }
            return null;
        } catch (RemoteException e) {
            zzazw.zzc("Unable to call getAssetView on delegate", e);
            return null;
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        try {
            this.zzble.zza((IObjectWrapper) nativeAd.zzjq());
        } catch (RemoteException e) {
            zzazw.zzc("Unable to call setNativeAd on delegate", e);
        }
    }

    public void destroy() {
        try {
            this.zzble.destroy();
        } catch (RemoteException e) {
            zzazw.zzc("Unable to destroy native ad view", e);
        }
    }

    private final FrameLayout zzd(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final zzacw zzjs() {
        Preconditions.checkNotNull(this.zzbld, "createDelegate must be called after mOverlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return zzvj.zzps().zza(this.zzbld.getContext(), this, this.zzbld);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zzbld);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.zzbld == view) {
            return;
        }
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zzbld);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zzbld;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        zzacw zzacwVar = this.zzble;
        if (zzacwVar != null) {
            try {
                zzacwVar.zzc(ObjectWrapper.wrap(view), i);
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call onVisibilityChanged on delegate", e);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        zzacw zzacwVar;
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcoj)).booleanValue() && (zzacwVar = this.zzble) != null) {
            try {
                zzacwVar.zzf(ObjectWrapper.wrap(motionEvent));
            } catch (RemoteException e) {
                zzazw.zzc("Unable to call handleTouchEvent on delegate", e);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
