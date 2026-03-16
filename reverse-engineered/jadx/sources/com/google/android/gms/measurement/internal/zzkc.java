package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
final class zzkc implements Runnable {
    private final /* synthetic */ zzks zza;
    private final /* synthetic */ Runnable zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkc(zzjx zzjxVar, zzks zzksVar, Runnable runnable) {
        this.zza = zzksVar;
        this.zzb = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzo();
        this.zza.zza(this.zzb);
        this.zza.zzl();
    }
}
