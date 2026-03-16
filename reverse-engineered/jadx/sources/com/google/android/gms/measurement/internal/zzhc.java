package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
final class zzhc implements Runnable {
    private final /* synthetic */ zzan zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzgr zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhc(zzgr zzgrVar, zzan zzanVar, String str) {
        this.zzc = zzgrVar;
        this.zza = zzanVar;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzks zzksVar2;
        zzksVar = this.zzc.zza;
        zzksVar.zzo();
        zzksVar2 = this.zzc.zza;
        zzksVar2.zza(this.zza, this.zzb);
    }
}
