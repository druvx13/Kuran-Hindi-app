package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzhz implements Runnable {
    private final /* synthetic */ zzhw zzail;
    private final /* synthetic */ zziy zzaim;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhz(zzhw zzhwVar, zziy zziyVar) {
        this.zzail = zzhwVar;
        this.zzaim = zziyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhx zzhxVar;
        zzhxVar = this.zzail.zzaih;
        zzhxVar.zzc(this.zzaim);
    }
}
