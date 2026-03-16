package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
final class zzhe implements Runnable {
    private final /* synthetic */ zzkz zza;
    private final /* synthetic */ zzm zzb;
    private final /* synthetic */ zzgr zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhe(zzgr zzgrVar, zzkz zzkzVar, zzm zzmVar) {
        this.zzc = zzgrVar;
        this.zza = zzkzVar;
        this.zzb = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzks zzksVar2;
        zzks zzksVar3;
        zzksVar = this.zzc.zza;
        zzksVar.zzo();
        if (this.zza.zza() == null) {
            zzksVar3 = this.zzc.zza;
            zzksVar3.zzb(this.zza, this.zzb);
            return;
        }
        zzksVar2 = this.zzc.zza;
        zzksVar2.zza(this.zza, this.zzb);
    }
}
