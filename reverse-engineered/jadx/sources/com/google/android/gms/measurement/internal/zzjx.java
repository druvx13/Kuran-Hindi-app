package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzkb;
/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
/* loaded from: classes.dex */
public final class zzjx<T extends Context & zzkb> {
    private final T zza;

    public zzjx(T t) {
        Preconditions.checkNotNull(t);
        this.zza = t;
    }

    public final void zza() {
        zzgq zza = zzgq.zza(this.zza, (com.google.android.gms.internal.measurement.zzv) null);
        zzfj zzr = zza.zzr();
        zza.zzu();
        zzr.zzx().zza("Local AppMeasurementService is starting up");
    }

    public final void zzb() {
        zzgq zza = zzgq.zza(this.zza, (com.google.android.gms.internal.measurement.zzv) null);
        zzfj zzr = zza.zzr();
        zza.zzu();
        zzr.zzx().zza("Local AppMeasurementService is shutting down");
    }

    public final int zza(final Intent intent, int i, final int i2) {
        zzgq zza = zzgq.zza(this.zza, (com.google.android.gms.internal.measurement.zzv) null);
        final zzfj zzr = zza.zzr();
        if (intent == null) {
            zzr.zzi().zza("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zza.zzu();
        zzr.zzx().zza("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            zza(new Runnable(this, i2, zzr, intent) { // from class: com.google.android.gms.measurement.internal.zzka
                private final zzjx zza;
                private final int zzb;
                private final zzfj zzc;
                private final Intent zzd;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = i2;
                    this.zzc = zzr;
                    this.zzd = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(this.zzb, this.zzc, this.zzd);
                }
            });
        }
        return 2;
    }

    private final void zza(Runnable runnable) {
        zzks zza = zzks.zza(this.zza);
        zza.zzq().zza(new zzkc(this, zza, runnable));
    }

    public final IBinder zza(Intent intent) {
        if (intent == null) {
            zzc().zzf().zza("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzgr(zzks.zza(this.zza));
        }
        zzc().zzi().zza("onBind received unknown action", action);
        return null;
    }

    public final boolean zzb(Intent intent) {
        if (intent == null) {
            zzc().zzf().zza("onUnbind called with null intent");
            return true;
        }
        zzc().zzx().zza("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final boolean zza(final JobParameters jobParameters) {
        zzgq zza = zzgq.zza(this.zza, (com.google.android.gms.internal.measurement.zzv) null);
        final zzfj zzr = zza.zzr();
        String string = jobParameters.getExtras().getString("action");
        zza.zzu();
        zzr.zzx().zza("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            zza(new Runnable(this, zzr, jobParameters) { // from class: com.google.android.gms.measurement.internal.zzjz
                private final zzjx zza;
                private final zzfj zzb;
                private final JobParameters zzc;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzr;
                    this.zzc = jobParameters;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(this.zzb, this.zzc);
                }
            });
            return true;
        }
        return true;
    }

    public final void zzc(Intent intent) {
        if (intent == null) {
            zzc().zzf().zza("onRebind called with null intent");
            return;
        }
        zzc().zzx().zza("onRebind called. action", intent.getAction());
    }

    private final zzfj zzc() {
        return zzgq.zza(this.zza, (com.google.android.gms.internal.measurement.zzv) null).zzr();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzfj zzfjVar, JobParameters jobParameters) {
        zzfjVar.zzx().zza("AppMeasurementJobService processed last upload request.");
        this.zza.zza(jobParameters, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, zzfj zzfjVar, Intent intent) {
        if (this.zza.zza(i)) {
            zzfjVar.zzx().zza("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            zzc().zzx().zza("Completed wakeful intent.");
            this.zza.zza(intent);
        }
    }
}
