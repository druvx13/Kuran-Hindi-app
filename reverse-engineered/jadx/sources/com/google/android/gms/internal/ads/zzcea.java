package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcea implements com.google.android.gms.ads.internal.overlay.zzt {
    private final zzbrx zzfwm;

    private zzcea(zzbrx zzbrxVar) {
        this.zzfwm = zzbrxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.gms.ads.internal.overlay.zzt zza(zzbrx zzbrxVar) {
        return new zzcea(zzbrxVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzt
    public final void zzuq() {
        this.zzfwm.onAdLeftApplication();
    }
}
