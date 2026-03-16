package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzib implements Runnable {
    private final /* synthetic */ zzhw zzail;
    private final /* synthetic */ zzhf zzaiq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzib(zzhw zzhwVar, zzhf zzhfVar) {
        this.zzail = zzhwVar;
        this.zzaiq = zzhfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhx zzhxVar;
        zzhxVar = this.zzail.zzaih;
        zzhxVar.zzc(this.zzaiq);
    }
}
