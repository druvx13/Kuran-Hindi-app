package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcnw implements Runnable {
    private final zzbek zzelg;

    private zzcnw(zzbek zzbekVar) {
        this.zzelg = zzbekVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzh(zzbek zzbekVar) {
        return new zzcnw(zzbekVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzelg.zzabw();
    }
}
