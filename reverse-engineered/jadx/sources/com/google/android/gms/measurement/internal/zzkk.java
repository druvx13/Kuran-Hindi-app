package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzkk {
    private long zza;
    private long zzb;
    private final zzaf zzc;
    private final /* synthetic */ zzke zzd;

    public zzkk(zzke zzkeVar) {
        this.zzd = zzkeVar;
        this.zzc = new zzkj(this, this.zzd.zzx);
        long elapsedRealtime = zzkeVar.zzm().elapsedRealtime();
        this.zza = elapsedRealtime;
        this.zzb = elapsedRealtime;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(long j) {
        this.zzd.zzd();
        this.zzc.zzc();
        this.zza = j;
        this.zzb = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(long j) {
        this.zzc.zzc();
        if (this.zza != 0) {
            this.zzd.zzs().zzr.zza(this.zzd.zzs().zzr.zza() + (j - this.zza));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza() {
        this.zzc.zzc();
        this.zza = 0L;
        this.zzb = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc() {
        this.zzd.zzd();
        zza(false, false, this.zzd.zzm().elapsedRealtime());
        this.zzd.zze().zza(this.zzd.zzm().elapsedRealtime());
    }

    public final boolean zza(boolean z, boolean z2, long j) {
        this.zzd.zzd();
        this.zzd.zzw();
        if (!com.google.android.gms.internal.measurement.zzkn.zzb() || !this.zzd.zzt().zza(zzap.zzcv)) {
            j = this.zzd.zzm().elapsedRealtime();
        }
        if (!zzle.zzb() || !this.zzd.zzt().zza(zzap.zzcr) || this.zzd.zzx.zzab()) {
            this.zzd.zzs().zzq.zza(this.zzd.zzm().currentTimeMillis());
        }
        long j2 = j - this.zza;
        if (!z && j2 < 1000) {
            this.zzd.zzr().zzx().zza("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
            return false;
        }
        if (this.zzd.zzt().zza(zzap.zzbb) && !z2) {
            j2 = zzb();
        }
        this.zzd.zzs().zzr.zza(j2);
        this.zzd.zzr().zzx().zza("Recording user engagement, ms", Long.valueOf(j2));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        zziy.zza(this.zzd.zzi().zzab(), bundle, true);
        if (this.zzd.zzt().zza(zzap.zzbb) && !this.zzd.zzt().zza(zzap.zzbc) && z2) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.zzd.zzt().zza(zzap.zzbc) || !z2) {
            this.zzd.zzf().zza("auto", "_e", bundle);
        }
        this.zza = j;
        this.zzc.zzc();
        this.zzc.zza(Math.max(0L, 3600000 - this.zzd.zzs().zzr.zza()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzb() {
        long elapsedRealtime = this.zzd.zzm().elapsedRealtime();
        long j = elapsedRealtime - this.zzb;
        this.zzb = elapsedRealtime;
        return j;
    }
}
