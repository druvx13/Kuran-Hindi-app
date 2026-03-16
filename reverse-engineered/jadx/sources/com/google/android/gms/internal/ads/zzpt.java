package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzpt implements Runnable {
    private final /* synthetic */ zziy zzais;
    private final /* synthetic */ zzpl zzbki;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpt(zzpl zzplVar, zziy zziyVar) {
        this.zzbki = zzplVar;
        this.zzais = zziyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpm zzpmVar;
        this.zzais.zzgm();
        zzpmVar = this.zzbki.zzbkh;
        zzpmVar.zzf(this.zzais);
    }
}
