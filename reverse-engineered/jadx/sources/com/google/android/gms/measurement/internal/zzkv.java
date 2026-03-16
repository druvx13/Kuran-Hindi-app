package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
public final class zzkv implements Callable<String> {
    private final /* synthetic */ zzm zza;
    private final /* synthetic */ zzks zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkv(zzks zzksVar, zzm zzmVar) {
        this.zzb = zzksVar;
        this.zza = zzmVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        zzg zzc = this.zzb.zzc(this.zza);
        if (zzc == null) {
            this.zzb.zzr().zzi().zza("App info was null when attempting to get app instance id");
            return null;
        }
        return zzc.zzd();
    }
}
