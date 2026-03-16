package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzps implements Runnable {
    private final /* synthetic */ zzpl zzbki;
    private final /* synthetic */ int zzbkm;
    private final /* synthetic */ int zzbkn;
    private final /* synthetic */ int zzbko;
    private final /* synthetic */ float zzbkp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzps(zzpl zzplVar, int i, int i2, int i3, float f) {
        this.zzbki = zzplVar;
        this.zzbkm = i;
        this.zzbkn = i2;
        this.zzbko = i3;
        this.zzbkp = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpm zzpmVar;
        zzpmVar = this.zzbki.zzbkh;
        zzpmVar.zzb(this.zzbkm, this.zzbkn, this.zzbko, this.zzbkp);
    }
}
