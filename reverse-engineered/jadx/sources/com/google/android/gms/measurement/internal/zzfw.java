package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
final class zzfw implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzft zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfw(zzft zzftVar, boolean z) {
        this.zzb = zzftVar;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzksVar = this.zzb.zzb;
        zzksVar.zza(this.zza);
    }
}
