package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaax extends zzaav {
    private final OnCustomRenderedAdLoadedListener zzcha;

    public zzaax(OnCustomRenderedAdLoadedListener onCustomRenderedAdLoadedListener) {
        this.zzcha = onCustomRenderedAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final void zza(zzaar zzaarVar) {
        this.zzcha.onCustomRenderedAdLoaded(new zzaao(zzaarVar));
    }
}
