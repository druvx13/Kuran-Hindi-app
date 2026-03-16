package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
final class zzhg implements Runnable {
    private final /* synthetic */ zzm zza;
    private final /* synthetic */ zzgr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhg(zzgr zzgrVar, zzm zzmVar) {
        this.zzb = zzgrVar;
        this.zza = zzmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzks zzksVar2;
        zzksVar = this.zzb.zza;
        zzksVar.zzo();
        zzksVar2 = this.zzb.zza;
        zzksVar2.zzb(this.zza);
    }
}
