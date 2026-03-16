package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
final class zzhf implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzgr zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhf(zzgr zzgrVar, String str, String str2, String str3, long j) {
        this.zze = zzgrVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzks zzksVar;
        zzks zzksVar2;
        String str = this.zza;
        if (str != null) {
            zziv zzivVar = new zziv(this.zzc, str, this.zzd);
            zzksVar = this.zze.zza;
            zzksVar.zzs().zzv().zza(this.zzb, zzivVar);
            return;
        }
        zzksVar2 = this.zze.zza;
        zzksVar2.zzs().zzv().zza(this.zzb, (zziv) null);
    }
}
