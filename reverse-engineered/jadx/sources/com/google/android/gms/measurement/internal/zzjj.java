package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjj extends zzaf {
    private final /* synthetic */ zziz zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjj(zziz zzizVar, zzhj zzhjVar) {
        super(zzhjVar);
        this.zza = zzizVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaf
    public final void zza() {
        this.zza.zzr().zzi().zza("Tasks have been queued for a long time");
    }
}
