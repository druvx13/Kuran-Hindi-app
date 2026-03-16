package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzamo extends zzamb {
    private final NativeAppInstallAdMapper zzdha;

    public zzamo(NativeAppInstallAdMapper nativeAppInstallAdMapper) {
        this.zzdha = nativeAppInstallAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final zzack zzsb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final IObjectWrapper zzsc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final String getHeadline() {
        return this.zzdha.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final List getImages() {
        List<NativeAd.Image> images = this.zzdha.getImages();
        if (images != null) {
            ArrayList arrayList = new ArrayList();
            for (NativeAd.Image image : images) {
                arrayList.add(new zzace(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final String getBody() {
        return this.zzdha.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final zzacs zzsa() {
        NativeAd.Image icon = this.zzdha.getIcon();
        if (icon != null) {
            return new zzace(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.getWidth(), icon.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final String getCallToAction() {
        return this.zzdha.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final double getStarRating() {
        return this.zzdha.getStarRating();
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final String getStore() {
        return this.zzdha.getStore();
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final String getPrice() {
        return this.zzdha.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void recordImpression() {
        this.zzdha.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzu(IObjectWrapper iObjectWrapper) {
        this.zzdha.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzv(IObjectWrapper iObjectWrapper) {
        this.zzdha.trackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdha.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zzdha.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final boolean getOverrideImpressionRecording() {
        return this.zzdha.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final boolean getOverrideClickHandling() {
        return this.zzdha.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final Bundle getExtras() {
        return this.zzdha.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final zzxl getVideoController() {
        if (this.zzdha.getVideoController() != null) {
            return this.zzdha.getVideoController().zzdu();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final IObjectWrapper zztr() {
        View adChoicesContent = this.zzdha.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzaly
    public final IObjectWrapper zzts() {
        View zzacu = this.zzdha.zzacu();
        if (zzacu == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzacu);
    }
}
