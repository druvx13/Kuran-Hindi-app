package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
public final class zzko extends zzkp {
    private final AlarmManager zzb;
    private final zzaf zzc;
    private Integer zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzko(zzks zzksVar) {
        super(zzksVar);
        this.zzb = (AlarmManager) zzn().getSystemService(NotificationCompat.CATEGORY_ALARM);
        this.zzc = new zzkn(this, zzksVar.zzs(), zzksVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzkp
    protected final boolean zze() {
        this.zzb.cancel(zzw());
        if (Build.VERSION.SDK_INT >= 24) {
            zzk();
            return false;
        }
        return false;
    }

    private final void zzk() {
        JobScheduler jobScheduler = (JobScheduler) zzn().getSystemService("jobscheduler");
        int zzv = zzv();
        if (!zzx()) {
            zzr().zzx().zza("Cancelling job. JobID", Integer.valueOf(zzv));
        }
        jobScheduler.cancel(zzv);
    }

    public final void zza(long j) {
        zzak();
        zzu();
        Context zzn = zzn();
        if (!zzgg.zza(zzn)) {
            zzr().zzw().zza("Receiver not registered/enabled");
        }
        if (!zzla.zza(zzn, false)) {
            zzr().zzw().zza("Service not registered/enabled");
        }
        zzf();
        if (zzx()) {
            zzr().zzx().zza("Scheduling upload, millis", Long.valueOf(j));
        }
        long elapsedRealtime = zzm().elapsedRealtime() + j;
        if (j < Math.max(0L, zzap.zzw.zza(null).longValue()) && !this.zzc.zzb()) {
            if (!zzx()) {
                zzr().zzx().zza("Scheduling upload with DelayedRunnable");
            }
            this.zzc.zza(j);
        }
        zzu();
        if (Build.VERSION.SDK_INT >= 24) {
            if (!zzx()) {
                zzr().zzx().zza("Scheduling upload with JobScheduler");
            }
            Context zzn2 = zzn();
            ComponentName componentName = new ComponentName(zzn2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int zzv = zzv();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new JobInfo.Builder(zzv, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            if (!zzx()) {
                zzr().zzx().zza("Scheduling job. JobID", Integer.valueOf(zzv));
            }
            com.google.android.gms.internal.measurement.zzh.zza(zzn2, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        if (!zzx()) {
            zzr().zzx().zza("Scheduling upload with AlarmManager");
        }
        this.zzb.setInexactRepeating(2, elapsedRealtime, Math.max(zzap.zzr.zza(null).longValue(), j), zzw());
    }

    private final int zzv() {
        if (this.zzd == null) {
            String valueOf = String.valueOf(zzn().getPackageName());
            this.zzd = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.zzd.intValue();
    }

    public final void zzf() {
        zzak();
        if (zzx()) {
            zzr().zzx().zza("Unscheduling upload");
        }
        this.zzb.cancel(zzw());
        this.zzc.zzc();
        if (Build.VERSION.SDK_INT >= 24) {
            zzk();
        }
    }

    private final PendingIntent zzw() {
        Context zzn = zzn();
        return PendingIntent.getBroadcast(zzn, 0, new Intent().setClassName(zzn, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    private final boolean zzx() {
        return com.google.android.gms.internal.measurement.zzkz.zzb() && zzt().zza(zzap.zzcy);
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ zzkw zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ zzn e_() {
        return super.e_();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ zzac zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzkq
    public final /* bridge */ /* synthetic */ zzgk zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzah zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ Clock zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ Context zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzfh zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzla zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ zzgj zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ zzfj zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzfv zzs() {
        return super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ zzx zzt() {
        return super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzhh, com.google.android.gms.measurement.internal.zzhj
    public final /* bridge */ /* synthetic */ zzw zzu() {
        return super.zzu();
    }
}
