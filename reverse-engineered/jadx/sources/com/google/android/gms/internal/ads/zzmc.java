package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzmc implements Runnable {
    private final /* synthetic */ zzly zzbau;
    private final /* synthetic */ IOException zzbca;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmc(zzly zzlyVar, IOException iOException) {
        this.zzbau = zzlyVar;
        this.zzbca = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmf zzmfVar;
        zzmfVar = this.zzbau.zzbaw;
        zzmfVar.zzb(this.zzbca);
    }
}
