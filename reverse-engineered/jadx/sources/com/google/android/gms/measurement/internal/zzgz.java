package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
final class zzgz implements Runnable {
    private final /* synthetic */ zzan zza;
    private final /* synthetic */ zzm zzb;
    private final /* synthetic */ zzgr zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgz(zzgr zzgrVar, zzan zzanVar, zzm zzmVar) {
        this.zzc = zzgrVar;
        this.zza = zzanVar;
        this.zzb = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzks zzksVar2;
        zzan zzb = this.zzc.zzb(this.zza, this.zzb);
        zzksVar = this.zzc.zza;
        zzksVar.zzo();
        zzksVar2 = this.zzc.zza;
        zzksVar2.zza(zzb, this.zzb);
    }
}
