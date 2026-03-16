package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzma implements Runnable {
    private final /* synthetic */ zzly zzbau;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzma(zzly zzlyVar) {
        this.zzbau = zzlyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        zzmh zzmhVar;
        z = this.zzbau.zzaez;
        if (z) {
            return;
        }
        zzmhVar = this.zzbau.zzbbh;
        zzmhVar.zza((zzmh) this.zzbau);
    }
}
