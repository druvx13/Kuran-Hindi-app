package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
final class zzhb implements Callable<byte[]> {
    private final /* synthetic */ zzan zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzgr zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhb(zzgr zzgrVar, zzan zzanVar, String str) {
        this.zzc = zzgrVar;
        this.zza = zzanVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ byte[] call() throws Exception {
        zzks zzksVar;
        zzks zzksVar2;
        zzksVar = this.zzc.zza;
        zzksVar.zzo();
        zzksVar2 = this.zzc.zza;
        return zzksVar2.zzg().zza(this.zza, this.zzb);
    }
}
