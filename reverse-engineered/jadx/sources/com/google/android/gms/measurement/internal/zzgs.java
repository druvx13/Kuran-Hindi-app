package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzgs implements Runnable {
    private final /* synthetic */ zzhs zza;
    private final /* synthetic */ zzgq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgs(zzgq zzgqVar, zzhs zzhsVar) {
        this.zzb = zzgqVar;
        this.zza = zzhsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza(this.zza);
        this.zzb.zza();
    }
}
