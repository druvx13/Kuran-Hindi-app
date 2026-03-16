package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
final class zzhd implements Callable<List<zzlb>> {
    private final /* synthetic */ zzm zza;
    private final /* synthetic */ zzgr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhd(zzgr zzgrVar, zzm zzmVar) {
        this.zzb = zzgrVar;
        this.zza = zzmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzlb> call() throws Exception {
        zzks zzksVar;
        zzks zzksVar2;
        zzksVar = this.zzb.zza;
        zzksVar.zzo();
        zzksVar2 = this.zzb.zza;
        return zzksVar2.zze().zza(this.zza.zza);
    }
}
