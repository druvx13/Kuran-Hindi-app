package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzkd implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzke zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkd(zzke zzkeVar, long j) {
        this.zzb = zzkeVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza);
    }
}
