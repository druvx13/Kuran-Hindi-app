package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzpq implements Runnable {
    private final /* synthetic */ zzhf zzaiq;
    private final /* synthetic */ zzpl zzbki;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpq(zzpl zzplVar, zzhf zzhfVar) {
        this.zzbki = zzplVar;
        this.zzaiq = zzhfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpm zzpmVar;
        zzpmVar = this.zzbki.zzbkh;
        zzpmVar.zzk(this.zzaiq);
    }
}
