package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzai implements Runnable {
    private final /* synthetic */ zzhj zza;
    private final /* synthetic */ zzaf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzai(zzaf zzafVar, zzhj zzhjVar) {
        this.zzb = zzafVar;
        this.zza = zzhjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzu();
        if (zzw.zza()) {
            this.zza.zzq().zza(this);
            return;
        }
        boolean zzb = this.zzb.zzb();
        zzaf.zza(this.zzb, 0L);
        if (zzb) {
            this.zzb.zza();
        }
    }
}
