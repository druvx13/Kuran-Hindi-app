package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzhy implements Runnable {
    private final /* synthetic */ String zzaii;
    private final /* synthetic */ long zzaij;
    private final /* synthetic */ long zzaik;
    private final /* synthetic */ zzhw zzail;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhy(zzhw zzhwVar, String str, long j, long j2) {
        this.zzail = zzhwVar;
        this.zzaii = str;
        this.zzaij = j;
        this.zzaik = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhx zzhxVar;
        zzhxVar = this.zzail.zzaih;
        zzhxVar.zzb(this.zzaii, this.zzaij, this.zzaik);
    }
}
