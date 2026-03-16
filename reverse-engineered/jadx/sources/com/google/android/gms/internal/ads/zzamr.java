package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzamr extends zzamc {
    private final NativeContentAdMapper zzdhf;

    public zzamr(NativeContentAdMapper nativeContentAdMapper) {
        this.zzdhf = nativeContentAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final zzack zzsb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final IObjectWrapper zzsc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final String getHeadline() {
        return this.zzdhf.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final List getImages() {
        List<NativeAd.Image> images = this.zzdhf.getImages();
        if (images != null) {
            ArrayList arrayList = new ArrayList();
            for (NativeAd.Image image : images) {
                arrayList.add(new zzace(image.getDrawable(), image.getUri(), image.getScale(), image.getWidth(), image.getHeight()));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final String getBody() {
        return this.zzdhf.getBody();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final zzacs zzsd() {
        NativeAd.Image logo = this.zzdhf.getLogo();
        if (logo != null) {
            return new zzace(logo.getDrawable(), logo.getUri(), logo.getScale(), logo.getWidth(), logo.getHeight());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final String getCallToAction() {
        return this.zzdhf.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final String getAdvertiser() {
        return this.zzdhf.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void recordImpression() {
        this.zzdhf.recordImpression();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzu(IObjectWrapper iObjectWrapper) {
        this.zzdhf.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzv(IObjectWrapper iObjectWrapper) {
        this.zzdhf.trackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        this.zzdhf.trackViews((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zzdhf.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final boolean getOverrideImpressionRecording() {
        return this.zzdhf.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final boolean getOverrideClickHandling() {
        return this.zzdhf.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final Bundle getExtras() {
        return this.zzdhf.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final IObjectWrapper zztr() {
        View adChoicesContent = this.zzdhf.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final zzxl getVideoController() {
        if (this.zzdhf.getVideoController() != null) {
            return this.zzdhf.getVideoController().zzdu();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final IObjectWrapper zzts() {
        View zzacu = this.zzdhf.zzacu();
        if (zzacu == null) {
            return null;
        }
        return ObjectWrapper.wrap(zzacu);
    }
}
