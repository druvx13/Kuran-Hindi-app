package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzafd extends zzaec {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zzczp;

    public zzafd(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener) {
        this.zzczp = onCustomTemplateAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzaed
    public final void zzb(zzado zzadoVar) {
        this.zzczp.onCustomTemplateAdLoaded(zzadt.zza(zzadoVar));
    }
}
