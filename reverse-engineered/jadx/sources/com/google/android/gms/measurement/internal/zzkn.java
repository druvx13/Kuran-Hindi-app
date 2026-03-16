package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
public final class zzkn extends zzaf {
    private final /* synthetic */ zzks zza;
    private final /* synthetic */ zzko zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkn(zzko zzkoVar, zzhj zzhjVar, zzks zzksVar) {
        super(zzhjVar);
        this.zzb = zzkoVar;
        this.zza = zzksVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaf
    public final void zza() {
        this.zzb.zzf();
        this.zzb.zzr().zzx().zza("Starting upload from DelayedRunnable");
        this.zza.zzl();
    }
}
