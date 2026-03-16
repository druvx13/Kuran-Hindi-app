package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzx;
import com.google.android.gms.measurement.internal.zzgq;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.3.0 */
/* loaded from: classes.dex */
final class zzb implements Callable<String> {
    private final /* synthetic */ FirebaseAnalytics zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(FirebaseAnalytics firebaseAnalytics) {
        this.zza = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        String zzb;
        boolean z;
        zzgq zzgqVar;
        String zzc;
        zzx zzxVar;
        zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        z = this.zza.zzd;
        if (z) {
            zzxVar = this.zza.zzc;
            zzc = zzxVar.zzh();
        } else {
            zzgqVar = this.zza.zzb;
            zzc = zzgqVar.zzh().zzc(120000L);
        }
        if (zzc == null) {
            throw new TimeoutException();
        }
        this.zza.zza(zzc);
        return zzc;
    }
}
