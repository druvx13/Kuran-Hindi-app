package com.google.android.gms.internal.ads;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbge implements Runnable {
    private final /* synthetic */ View val$view;
    private final /* synthetic */ zzaun zzeij;
    private final /* synthetic */ int zzeil;
    private final /* synthetic */ zzbgc zzelm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbge(zzbgc zzbgcVar, View view, zzaun zzaunVar, int i) {
        this.zzelm = zzbgcVar;
        this.val$view = view;
        this.zzeij = zzaunVar;
        this.zzeil = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzelm.zza(this.val$view, this.zzeij, this.zzeil - 1);
    }
}
