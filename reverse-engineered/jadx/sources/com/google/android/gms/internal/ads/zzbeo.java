package com.google.android.gms.internal.ads;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbeo implements Runnable {
    private final /* synthetic */ View val$view;
    private final /* synthetic */ zzaun zzeij;
    private final /* synthetic */ zzbej zzeik;
    private final /* synthetic */ int zzeil;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbeo(zzbej zzbejVar, View view, zzaun zzaunVar, int i) {
        this.zzeik = zzbejVar;
        this.val$view = view;
        this.zzeij = zzaunVar;
        this.zzeil = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzeik.zza(this.val$view, this.zzeij, this.zzeil - 1);
    }
}
