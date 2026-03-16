package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzang extends zzamh {
    private final UnifiedNativeAdMapper zzdhk;

    public zzang(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zzdhk = unifiedNativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final zzack zzsb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final String getHeadline() {
        return this.zzdhk.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final List getImages() {
        List<NativeAd.Image> images = this.zzdhk.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzace(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final String getBody() {
        return this.zzdhk.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final zzacs zzsa() {
        NativeAd.Image icon = this.zzdhk.getIcon();
        if (icon != null) {
            return new zzace(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final String getCallToAction() {
        return this.zzdhk.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final String getAdvertiser() {
        return this.zzdhk.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final double getStarRating() {
        if (this.zzdhk.getStarRating() != null) {
            return this.zzdhk.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final String getStore() {
        return this.zzdhk.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final String getPrice() {
        return this.zzdhk.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final zzxl getVideoController() {
        if (this.zzdhk.getVideoController() != null) {
            return this.zzdhk.getVideoController().zzdu();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final IObjectWrapper zztr() {
        View adChoicesContent = this.zzdhk.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final IObjectWrapper zzts() {
        View zzacu = this.zzdhk.zzacu();
        if (zzacu == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzacu);
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final float getMediaContentAspectRatio() {
        return this.zzdhk.getMediaContentAspectRatio();
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final float getVideoDuration() {
        return this.zzdhk.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final float getVideoCurrentTime() {
        return this.zzdhk.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final IObjectWrapper zzsc() {
        Object zzjv = this.zzdhk.zzjv();
        if (zzjv == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzjv);
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final Bundle getExtras() {
        return this.zzdhk.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final boolean getOverrideImpressionRecording() {
        return this.zzdhk.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final boolean getOverrideClickHandling() {
        return this.zzdhk.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final void recordImpression() {
        this.zzdhk.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final void zzu(IObjectWrapper iObjectWrapper) {
        this.zzdhk.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdhk.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzame
    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zzdhk.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
