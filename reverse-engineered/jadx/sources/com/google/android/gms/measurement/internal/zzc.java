package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzc implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzc(zzb zzbVar, long j) {
        this.zzb = zzbVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
