package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzpp implements Runnable {
    private final /* synthetic */ zzpl zzbki;
    private final /* synthetic */ int zzbkj;
    private final /* synthetic */ long zzbkk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpp(zzpl zzplVar, int i, long j) {
        this.zzbki = zzplVar;
        this.zzbkj = i;
        this.zzbkk = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpm zzpmVar;
        zzpmVar = this.zzbki.zzbkh;
        zzpmVar.zzf(this.zzbkj, this.zzbkk);
    }
}
