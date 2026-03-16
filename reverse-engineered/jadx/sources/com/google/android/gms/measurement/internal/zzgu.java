package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
final class zzgu implements Runnable {
    private final /* synthetic */ zzm zza;
    private final /* synthetic */ zzgr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgu(zzgr zzgrVar, zzm zzmVar) {
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
        zzm zzmVar = this.zza;
        zzksVar2.zzq().zzd();
        zzksVar2.zzk();
        Preconditions.checkNotEmpty(zzmVar.zza);
        zzksVar2.zzc(zzmVar);
    }
}
