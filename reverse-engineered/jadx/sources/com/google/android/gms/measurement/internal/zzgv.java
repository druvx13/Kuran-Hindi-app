package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
final class zzgv implements Callable<List<zzlb>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzgr zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgv(zzgr zzgrVar, String str, String str2, String str3) {
        this.zzd = zzgrVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzlb> call() throws Exception {
        zzks zzksVar;
        zzks zzksVar2;
        zzksVar = this.zzd.zza;
        zzksVar.zzo();
        zzksVar2 = this.zzd.zza;
        return zzksVar2.zze().zza(this.zza, this.zzb, this.zzc);
    }
}
