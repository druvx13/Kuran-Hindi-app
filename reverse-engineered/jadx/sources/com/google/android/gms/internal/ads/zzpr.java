package com.google.android.gms.internal.ads;

import android.view.Surface;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzpr implements Runnable {
    private final /* synthetic */ zzpl zzbki;
    private final /* synthetic */ Surface zzbkl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpr(zzpl zzplVar, Surface surface) {
        this.zzbki = zzplVar;
        this.zzbkl = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpm zzpmVar;
        zzpmVar = this.zzbki.zzbkh;
        zzpmVar.zzb(this.zzbkl);
    }
}
