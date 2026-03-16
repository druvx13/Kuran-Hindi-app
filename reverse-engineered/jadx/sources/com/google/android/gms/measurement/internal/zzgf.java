package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
final class zzgf implements Runnable {
    private final /* synthetic */ zzgq zza;
    private final /* synthetic */ zzfj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgf(zzgg zzggVar, zzgq zzgqVar, zzfj zzfjVar) {
        this.zza = zzgqVar;
        this.zzb = zzfjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zza.zzf() == null) {
            this.zzb.zzf().zza("Install Referrer Reporter is null");
        } else {
            this.zza.zzf().zza();
        }
    }
}
