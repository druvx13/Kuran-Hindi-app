package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzja implements Runnable {
    private final /* synthetic */ zziv zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zziy zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzja(zziy zziyVar, zziv zzivVar, long j) {
        this.zzc = zziyVar;
        this.zza = zzivVar;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza(this.zza, false, this.zzb);
        this.zzc.zza = null;
        this.zzc.zzh().zza((zziv) null);
    }
}
