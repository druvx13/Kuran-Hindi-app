package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzid implements Runnable {
    private final /* synthetic */ zzhw zzail;
    private final /* synthetic */ zziy zzais;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzid(zzhw zzhwVar, zziy zziyVar) {
        this.zzail = zzhwVar;
        this.zzais = zziyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhx zzhxVar;
        this.zzais.zzgm();
        zzhxVar = this.zzail.zzaih;
        zzhxVar.zzd(this.zzais);
    }
}
