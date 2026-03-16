package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzia implements Runnable {
    private final /* synthetic */ zzhw zzail;
    private final /* synthetic */ int zzain;
    private final /* synthetic */ long zzaio;
    private final /* synthetic */ long zzaip;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzia(zzhw zzhwVar, int i, long j, long j2) {
        this.zzail = zzhwVar;
        this.zzain = i;
        this.zzaio = j;
        this.zzaip = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhx zzhxVar;
        zzhxVar = this.zzail.zzaih;
        zzhxVar.zzb(this.zzain, this.zzaio, this.zzaip);
    }
}
