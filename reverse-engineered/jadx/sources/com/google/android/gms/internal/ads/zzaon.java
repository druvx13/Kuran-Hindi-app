package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzaon implements Runnable {
    private final /* synthetic */ zzaol zzdhz;
    private final /* synthetic */ AdOverlayInfoParcel zzdih;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaon(zzaol zzaolVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzdhz = zzaolVar;
        this.zzdih = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        com.google.android.gms.ads.internal.zzq.zzkv();
        activity = this.zzdhz.zzdia;
        com.google.android.gms.ads.internal.overlay.zzn.zza(activity, this.zzdih, true);
    }
}
