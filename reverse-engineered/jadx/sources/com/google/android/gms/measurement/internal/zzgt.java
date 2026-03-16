package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
final class zzgt implements Runnable {
    private final /* synthetic */ zzv zza;
    private final /* synthetic */ zzgr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgt(zzgr zzgrVar, zzv zzvVar) {
        this.zzb = zzgrVar;
        this.zza = zzvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzks zzksVar2;
        zzks zzksVar3;
        zzksVar = this.zzb.zza;
        zzksVar.zzo();
        if (this.zza.zzc.zza() == null) {
            zzksVar3 = this.zzb.zza;
            zzksVar3.zzb(this.zza);
            return;
        }
        zzksVar2 = this.zzb.zza;
        zzksVar2.zza(this.zza);
    }
}
