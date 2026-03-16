package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.firebase.analytics.FirebaseAnalytics;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
final class zzgd implements Runnable {
    private final /* synthetic */ com.google.android.gms.internal.measurement.zzd zza;
    private final /* synthetic */ ServiceConnection zzb;
    private final /* synthetic */ zzge zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgd(zzge zzgeVar, com.google.android.gms.internal.measurement.zzd zzdVar, ServiceConnection serviceConnection) {
        this.zzc = zzgeVar;
        this.zza = zzdVar;
        this.zzb = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        zzgb zzgbVar = this.zzc.zza;
        str = this.zzc.zzb;
        com.google.android.gms.internal.measurement.zzd zzdVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        Bundle zza = zzgbVar.zza(str, zzdVar);
        zzgbVar.zza.zzq().zzd();
        if (zza != null) {
            long j = zza.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                zzgbVar.zza.zzr().zzf().zza("Service response is missing Install Referrer install timestamp");
            } else {
                String string = zza.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    zzgbVar.zza.zzr().zzf().zza("No referrer defined in Install Referrer response");
                } else {
                    zzgbVar.zza.zzr().zzx().zza("InstallReferrer API result", string);
                    zzla zzi = zzgbVar.zza.zzi();
                    String valueOf = String.valueOf(string);
                    Bundle zza2 = zzi.zza(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (zza2 == null) {
                        zzgbVar.zza.zzr().zzf().zza("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = zza2.getString(FirebaseAnalytics.Param.MEDIUM);
                        if ((string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) ? false : true) {
                            long j2 = zza.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                zzgbVar.zza.zzr().zzf().zza("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                zza2.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == zzgbVar.zza.zzc().zzi.zza()) {
                            zzgbVar.zza.zzu();
                            zzgbVar.zza.zzr().zzx().zza("Install Referrer campaign has already been logged");
                        } else if (!com.google.android.gms.internal.measurement.zzkm.zzb() || !zzgbVar.zza.zzb().zza(zzap.zzcw) || zzgbVar.zza.zzab()) {
                            zzgbVar.zza.zzc().zzi.zza(j);
                            zzgbVar.zza.zzu();
                            zzgbVar.zza.zzr().zzx().zza("Logging Install Referrer campaign from sdk with ", "referrer API");
                            zza2.putString("_cis", "referrer API");
                            zzgbVar.zza.zzh().zza("auto", "_cmp", zza2);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            ConnectionTracker.getInstance().unbindService(zzgbVar.zza.zzn(), serviceConnection);
        }
    }
}
