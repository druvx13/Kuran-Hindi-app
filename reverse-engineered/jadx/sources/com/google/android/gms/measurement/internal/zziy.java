package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zziy extends zze {
    protected zziv zza;
    private volatile zziv zzb;
    private zziv zzc;
    private final Map<Activity, zziv> zzd;
    private zziv zze;
    private String zzf;

    public zziy(zzgq zzgqVar) {
        super(zzgqVar);
        this.zzd = new ConcurrentHashMap();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    protected final boolean zzz() {
        return false;
    }

    public final zziv zzab() {
        zzw();
        zzd();
        return this.zza;
    }

    public final void zza(Activity activity, String str, String str2) {
        if (this.zzb == null) {
            zzr().zzk().zza("setCurrentScreen cannot be called while no activity active");
        } else if (this.zzd.get(activity) == null) {
            zzr().zzk().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = zza(activity.getClass().getCanonicalName());
            }
            boolean equals = this.zzb.zzb.equals(str2);
            boolean zzc = zzla.zzc(this.zzb.zza, str);
            if (equals && zzc) {
                zzr().zzk().zza("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                zzr().zzk().zza("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
                zzr().zzk().zza("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            } else {
                zzr().zzx().zza("Setting current screen to name, class", str == null ? "null" : str, str2);
                zziv zzivVar = new zziv(str, str2, zzp().zzg());
                this.zzd.put(activity, zzivVar);
                zza(activity, zzivVar, true);
            }
        }
    }

    public final zziv zzac() {
        zzb();
        return this.zzb;
    }

    private final void zza(Activity activity, zziv zzivVar, boolean z) {
        zziv zzivVar2 = this.zzb == null ? this.zzc : this.zzb;
        zziv zzivVar3 = zzivVar.zzb == null ? new zziv(zzivVar.zza, zza(activity.getClass().getCanonicalName()), zzivVar.zzc) : zzivVar;
        this.zzc = this.zzb;
        this.zzb = zzivVar3;
        zzq().zza(new zzix(this, z, zzm().elapsedRealtime(), zzivVar2, zzivVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zziv zzivVar, boolean z, long j) {
        zze().zza(zzm().elapsedRealtime());
        if (zzk().zza(zzivVar.zzd, z, j)) {
            zzivVar.zzd = false;
        }
    }

    public static void zza(zziv zzivVar, Bundle bundle, boolean z) {
        if (bundle != null && zzivVar != null && (!bundle.containsKey("_sc") || z)) {
            if (zzivVar.zza != null) {
                bundle.putString("_sn", zzivVar.zza);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", zzivVar.zzb);
            bundle.putLong("_si", zzivVar.zzc);
        } else if (bundle != null && zzivVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void zza(String str, zziv zzivVar) {
        zzd();
        synchronized (this) {
            if (this.zzf == null || this.zzf.equals(str) || zzivVar != null) {
                this.zzf = str;
                this.zze = zzivVar;
            }
        }
    }

    private static String zza(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    private final zziv zzd(Activity activity) {
        Preconditions.checkNotNull(activity);
        zziv zzivVar = this.zzd.get(activity);
        if (zzivVar == null) {
            zziv zzivVar2 = new zziv(null, zza(activity.getClass().getCanonicalName()), zzp().zzg());
            this.zzd.put(activity, zzivVar2);
            return zzivVar2;
        }
        return zzivVar;
    }

    public final void zza(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zziv(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zza(Activity activity) {
        zza(activity, zzd(activity), false);
        zzb zze = zze();
        zze.zzq().zza(new zzc(zze, zze.zzm().elapsedRealtime()));
    }

    public final void zzb(Activity activity) {
        zziv zzd = zzd(activity);
        this.zzc = this.zzb;
        this.zzb = null;
        zzq().zza(new zzja(this, zzd, zzm().elapsedRealtime()));
    }

    public final void zzb(Activity activity, Bundle bundle) {
        zziv zzivVar;
        if (bundle == null || (zzivVar = this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zzivVar.zzc);
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, zzivVar.zza);
        bundle2.putString("referrer_name", zzivVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void zzc(Activity activity) {
        this.zzd.remove(activity);
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzhh
    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzhr zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziz zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziy zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzff zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzke zzk() {
        return super.zzk();
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
