package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzki implements Runnable {
    long zza;
    final /* synthetic */ zzkf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzki(zzkf zzkfVar, long j) {
        this.zzb = zzkfVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzq().zza(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.zzkh
            private final zzki zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzki zzkiVar = this.zza;
                zzkf zzkfVar = zzkiVar.zzb;
                long j = zzkiVar.zza;
                zzkfVar.zza.zzd();
                zzkfVar.zza.zzr().zzw().zza("Application going to the background");
                zzkfVar.zza.zzf().zza("auto", "_ab", j, new Bundle());
            }
        });
    }
}
