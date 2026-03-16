package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbbb implements Runnable {
    private final /* synthetic */ zzbav zzeba;
    private final /* synthetic */ int zzebe;
    private final /* synthetic */ int zzebf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbb(zzbav zzbavVar, int i, int i2) {
        this.zzeba = zzbavVar;
        this.zzebe = i;
        this.zzebf = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbbf zzbbfVar;
        zzbbf zzbbfVar2;
        zzbbfVar = this.zzeba.zzeay;
        if (zzbbfVar != null) {
            zzbbfVar2 = this.zzeba.zzeay;
            zzbbfVar2.zzk(this.zzebe, this.zzebf);
        }
    }
}
