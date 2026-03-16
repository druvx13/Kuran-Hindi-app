package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzpo implements Runnable {
    private final /* synthetic */ zziy zzaim;
    private final /* synthetic */ zzpl zzbki;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzpo(zzpl zzplVar, zziy zziyVar) {
        this.zzbki = zzplVar;
        this.zzaim = zziyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzpm zzpmVar;
        zzpmVar = this.zzbki.zzbkh;
        zzpmVar.zze(this.zzaim);
    }
}
