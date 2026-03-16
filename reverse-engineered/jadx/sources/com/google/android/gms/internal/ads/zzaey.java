package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAppInstallAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzaey extends zzadv {
    private final NativeAppInstallAd.OnAppInstallAdLoadedListener zzczl;

    public zzaey(NativeAppInstallAd.OnAppInstallAdLoadedListener onAppInstallAdLoadedListener) {
        this.zzczl = onAppInstallAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzads
    public final void zza(zzadg zzadgVar) {
        this.zzczl.onAppInstallAdLoaded(new zzadl(zzadgVar));
    }
}
