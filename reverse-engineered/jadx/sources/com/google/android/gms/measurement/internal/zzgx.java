package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
final class zzgx implements Callable<List<zzv>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzgr zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgx(zzgr zzgrVar, String str, String str2, String str3) {
        this.zzd = zzgrVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzv> call() throws Exception {
        zzks zzksVar;
        zzks zzksVar2;
        zzksVar = this.zzd.zza;
        zzksVar.zzo();
        zzksVar2 = this.zzd.zza;
        return zzksVar2.zze().zzb(this.zza, this.zzb, this.zzc);
    }
}
