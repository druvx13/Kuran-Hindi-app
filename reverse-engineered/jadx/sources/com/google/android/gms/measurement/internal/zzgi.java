package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
final class zzgi implements Runnable {
    private final /* synthetic */ zzgq zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ Bundle zzc;
    private final /* synthetic */ Context zzd;
    private final /* synthetic */ zzfj zze;
    private final /* synthetic */ BroadcastReceiver.PendingResult zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgi(zzgg zzggVar, zzgq zzgqVar, long j, Bundle bundle, Context context, zzfj zzfjVar, BroadcastReceiver.PendingResult pendingResult) {
        this.zza = zzgqVar;
        this.zzb = j;
        this.zzc = bundle;
        this.zzd = context;
        this.zze = zzfjVar;
        this.zzf = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long zza = this.zza.zzc().zzh.zza();
        long j = this.zzb;
        if (zza > 0 && (j >= zza || j <= 0)) {
            j = zza - 1;
        }
        if (j > 0) {
            this.zzc.putLong("click_timestamp", j);
        }
        this.zzc.putString("_cis", "referrer broadcast");
        zzgq.zza(this.zzd, (com.google.android.gms.internal.measurement.zzv) null).zzh().zza("auto", "_cmp", this.zzc);
        this.zze.zzx().zza("Install campaign recorded");
        BroadcastReceiver.PendingResult pendingResult = this.zzf;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
