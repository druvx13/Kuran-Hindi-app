package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbbc implements Runnable {
    private final /* synthetic */ zzbav zzeba;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbc(zzbav zzbavVar) {
        this.zzeba = zzbavVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbbf zzbbfVar;
        zzbbf zzbbfVar2;
        zzbbfVar = this.zzeba.zzeay;
        if (zzbbfVar != null) {
            zzbbfVar2 = this.zzeba.zzeay;
            zzbbfVar2.zzyp();
        }
    }
}
