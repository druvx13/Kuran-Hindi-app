package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzfv extends zzhk {
    static final Pair<String, Long> zza = new Pair<>("", 0L);
    private boolean zzaa;
    private long zzab;
    public zzfz zzb;
    public final zzga zzc;
    public final zzga zzd;
    public final zzga zze;
    public final zzga zzf;
    public final zzga zzg;
    public final zzga zzh;
    public final zzga zzi;
    public final zzgc zzj;
    public final zzga zzk;
    public final zzga zzl;
    public final zzfx zzm;
    public final zzgc zzn;
    public final zzfx zzo;
    public final zzfx zzp;
    public final zzga zzq;
    public final zzga zzr;
    public boolean zzs;
    public zzfx zzt;
    public zzfx zzu;
    public zzga zzv;
    public final zzgc zzw;
    private SharedPreferences zzy;
    private String zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair<String, Boolean> zza(String str) {
        zzd();
        long elapsedRealtime = zzm().elapsedRealtime();
        if (this.zzz != null && elapsedRealtime < this.zzab) {
            return new Pair<>(this.zzz, Boolean.valueOf(this.zzaa));
        }
        this.zzab = elapsedRealtime + zzt().zza(str, zzap.zza);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zzn());
            if (advertisingIdInfo != null) {
                this.zzz = advertisingIdInfo.getId();
                this.zzaa = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.zzz == null) {
                this.zzz = "";
            }
        } catch (Exception e) {
            zzr().zzw().zza("Unable to get advertising id", e);
            this.zzz = "";
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.zzz, Boolean.valueOf(this.zzaa));
    }

    @Override // com.google.android.gms.measurement.internal.zzhk
    protected final boolean zze() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzb(String str) {
        zzd();
        String str2 = (String) zza(str).first;
        MessageDigest zzi = zzla.zzi();
        if (zzi == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zzi.digest(str2.getBytes())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfv(zzgq zzgqVar) {
        super(zzgqVar);
        this.zzc = new zzga(this, "last_upload", 0L);
        this.zzd = new zzga(this, "last_upload_attempt", 0L);
        this.zze = new zzga(this, "backoff", 0L);
        this.zzf = new zzga(this, "last_delete_stale", 0L);
        this.zzk = new zzga(this, "time_before_start", 10000L);
        this.zzl = new zzga(this, "session_timeout", 1800000L);
        this.zzm = new zzfx(this, "start_new_session", true);
        this.zzq = new zzga(this, "last_pause_time", 0L);
        this.zzr = new zzga(this, "time_active", 0L);
        this.zzn = new zzgc(this, "non_personalized_ads", null);
        this.zzo = new zzfx(this, "use_dynamite_api", false);
        this.zzp = new zzfx(this, "allow_remote_dynamite", false);
        this.zzg = new zzga(this, "midnight_offset", 0L);
        this.zzh = new zzga(this, "first_open_time", 0L);
        this.zzi = new zzga(this, "app_install_time", 0L);
        this.zzj = new zzgc(this, "app_instance_id", null);
        this.zzt = new zzfx(this, "app_backgrounded", false);
        this.zzu = new zzfx(this, "deep_link_retrieval_complete", false);
        this.zzv = new zzga(this, "deep_link_retrieval_attempts", 0L);
        this.zzw = new zzgc(this, "firebase_feature_rollouts", null);
    }

    @Override // com.google.android.gms.measurement.internal.zzhk
    protected final void f_() {
        SharedPreferences sharedPreferences = zzn().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzy = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.zzs = z;
        if (!z) {
            SharedPreferences.Editor edit = this.zzy.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.zzb = new zzfz(this, "health_monitor", Math.max(0L, zzap.zzb.zza(null).longValue()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final SharedPreferences zzg() {
        zzd();
        zzaa();
        return this.zzy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(String str) {
        zzd();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzh() {
        zzd();
        return zzg().getString("gmp_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(String str) {
        zzd();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzi() {
        zzd();
        return zzg().getString("admob_app_id", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzj() {
        zzd();
        if (zzg().contains("use_service")) {
            return Boolean.valueOf(zzg().getBoolean("use_service", false));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(boolean z) {
        zzd();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzk() {
        zzd();
        Boolean zzv = zzv();
        SharedPreferences.Editor edit = zzg().edit();
        edit.clear();
        edit.apply();
        if (zzv != null) {
            zzb(zzv.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(boolean z) {
        zzd();
        SharedPreferences.Editor edit = zzg().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzv() {
        zzd();
        if (zzg().contains("measurement_enabled")) {
            return Boolean.valueOf(zzg().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String zzw() {
        zzd();
        String string = zzg().getString("previous_os_version", null);
        zzl().zzaa();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = zzg().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(boolean z) {
        zzd();
        zzr().zzx().zza("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = zzg().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzx() {
        return this.zzy.contains("deferred_analytics_collection");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(long j) {
        return j - this.zzl.zza() > this.zzq.zza();
    }
}
