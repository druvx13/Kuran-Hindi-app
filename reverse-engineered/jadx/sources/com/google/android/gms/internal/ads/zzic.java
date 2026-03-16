package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzic implements Runnable {
    private final /* synthetic */ zzhw zzail;
    private final /* synthetic */ int zzair;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzic(zzhw zzhwVar, int i) {
        this.zzail = zzhwVar;
        this.zzair = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzhx zzhxVar;
        zzhxVar = this.zzail.zzaih;
        zzhxVar.zzu(this.zzair);
    }
}
