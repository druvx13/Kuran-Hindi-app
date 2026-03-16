package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzx extends zzhh {
    private Boolean zza;
    private zzz zzb;
    private Boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(zzgq zzgqVar) {
        super(zzgqVar);
        this.zzb = zzaa.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzz zzzVar) {
        this.zzb = zzzVar;
    }

    public final int zze() {
        return (com.google.android.gms.internal.measurement.zzjj.zzb() && zzt().zzd(null, zzap.zzdg) && zzp().zzj() >= 2147483) ? 100 : 25;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zza(String str) {
        if (com.google.android.gms.internal.measurement.zzjj.zzb() && zzd(null, zzap.zzdf)) {
            return zza(str, zzap.zzag, 500, 2000);
        }
        return 500;
    }

    public final int zzb(String str) {
        return zzb(str, zzap.zzn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzc(String str) {
        if (com.google.android.gms.internal.measurement.zzjj.zzb() && zzd(null, zzap.zzdf)) {
            return zza(str, zzap.zzaf, 25, 100);
        }
        return 25;
    }

    public final long zzf() {
        zzu();
        return 25001L;
    }

    public final boolean zzg() {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    ApplicationInfo applicationInfo = zzn().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.zzc = Boolean.valueOf(str != null && str.equals(myProcessName));
                    }
                    if (this.zzc == null) {
                        this.zzc = Boolean.TRUE;
                        zzr().zzf().zza("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzc.booleanValue();
    }

    public final long zza(String str, zzfc<Long> zzfcVar) {
        if (str == null) {
            return zzfcVar.zza(null).longValue();
        }
        String zza = this.zzb.zza(str, zzfcVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfcVar.zza(null).longValue();
        }
        try {
            return zzfcVar.zza(Long.valueOf(Long.parseLong(zza))).longValue();
        } catch (NumberFormatException unused) {
            return zzfcVar.zza(null).longValue();
        }
    }

    public final int zzb(String str, zzfc<Integer> zzfcVar) {
        if (str == null) {
            return zzfcVar.zza(null).intValue();
        }
        String zza = this.zzb.zza(str, zzfcVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfcVar.zza(null).intValue();
        }
        try {
            return zzfcVar.zza(Integer.valueOf(Integer.parseInt(zza))).intValue();
        } catch (NumberFormatException unused) {
            return zzfcVar.zza(null).intValue();
        }
    }

    public final int zza(String str, zzfc<Integer> zzfcVar, int i, int i2) {
        return Math.max(Math.min(zzb(str, zzfcVar), i2), i);
    }

    public final double zzc(String str, zzfc<Double> zzfcVar) {
        if (str == null) {
            return zzfcVar.zza(null).doubleValue();
        }
        String zza = this.zzb.zza(str, zzfcVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfcVar.zza(null).doubleValue();
        }
        try {
            return zzfcVar.zza(Double.valueOf(Double.parseDouble(zza))).doubleValue();
        } catch (NumberFormatException unused) {
            return zzfcVar.zza(null).doubleValue();
        }
    }

    public final boolean zzd(String str, zzfc<Boolean> zzfcVar) {
        if (str == null) {
            return zzfcVar.zza(null).booleanValue();
        }
        String zza = this.zzb.zza(str, zzfcVar.zza());
        if (TextUtils.isEmpty(zza)) {
            return zzfcVar.zza(null).booleanValue();
        }
        return zzfcVar.zza(Boolean.valueOf(Boolean.parseBoolean(zza))).booleanValue();
    }

    public final boolean zze(String str, zzfc<Boolean> zzfcVar) {
        return zzd(str, zzfcVar);
    }

    public final boolean zza(zzfc<Boolean> zzfcVar) {
        return zzd(null, zzfcVar);
    }

    private final Bundle zzz() {
        try {
            if (zzn().getPackageManager() == null) {
                zzr().zzf().zza("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(zzn()).getApplicationInfo(zzn().getPackageName(), 128);
            if (applicationInfo == null) {
                zzr().zzf().zza("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            zzr().zzf().zza("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean zzd(String str) {
        Preconditions.checkNotEmpty(str);
        Bundle zzz = zzz();
        if (zzz == null) {
            zzr().zzf().zza("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (zzz.containsKey(str)) {
            return Boolean.valueOf(zzz.getBoolean(str));
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> zze(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            android.os.Bundle r0 = r3.zzz()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.zzfj r4 = r3.zzr()
            com.google.android.gms.measurement.internal.zzfl r4 = r4.zzf()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.zza(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.zzn()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.zzfj r0 = r3.zzr()
            com.google.android.gms.measurement.internal.zzfl r0 = r0.zzf()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.zza(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zze(java.lang.String):java.util.List");
    }

    public final boolean zzh() {
        zzu();
        Boolean zzd = zzd("firebase_analytics_collection_deactivated");
        return zzd != null && zzd.booleanValue();
    }

    public final Boolean zzi() {
        zzu();
        return zzd("firebase_analytics_collection_enabled");
    }

    public final Boolean zzj() {
        zzb();
        Boolean zzd = zzd("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(zzd == null || zzd.booleanValue());
    }

    public static long zzk() {
        return zzap.zzac.zza(null).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String zza(com.google.android.gms.measurement.internal.zzg r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.zze()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
            boolean r1 = com.google.android.gms.internal.measurement.zzll.zzb()
            if (r1 == 0) goto L2f
            com.google.android.gms.measurement.internal.zzx r1 = r5.zzt()
            java.lang.String r2 = r6.zzc()
            com.google.android.gms.measurement.internal.zzfc<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzap.zzch
            boolean r1 = r1.zzd(r2, r3)
            if (r1 == 0) goto L2f
            java.lang.String r1 = r6.zzg()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
        L2f:
            java.lang.String r1 = r6.zzf()
        L33:
            com.google.android.gms.measurement.internal.zzfc<java.lang.String> r2 = com.google.android.gms.measurement.internal.zzap.zzd
            r3 = 0
            java.lang.Object r2 = r2.zza(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.zzfc<java.lang.String> r4 = com.google.android.gms.measurement.internal.zzap.zze
            java.lang.Object r3 = r4.zza(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L5d
            java.lang.String r1 = r3.concat(r1)
            goto L62
        L5d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L62:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.zzd()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            long r1 = r5.zzf()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "gmp_version"
            r6.appendQueryParameter(r2, r1)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzx.zza(com.google.android.gms.measurement.internal.zzg):java.lang.String");
    }

    public static long zzv() {
        return zzap.zzc.zza(null).longValue();
    }

    public final String zzw() {
        return zza("debug.firebase.analytics.app", "");
    }

    public final String zzx() {
        return zza("debug.deferred.deeplink", "");
    }

    private final String zza(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e) {
            zzr().zzf().zza("Could not find SystemProperties class", e);
            return str2;
        } catch (IllegalAccessException e2) {
            zzr().zzf().zza("Could not access SystemProperties.get()", e2);
            return str2;
        } catch (NoSuchMethodException e3) {
            zzr().zzf().zza("Could not find SystemProperties.get() method", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            zzr().zzf().zza("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    public final boolean zzf(String str) {
        return "1".equals(this.zzb.zza(str, "gaia_collection_enabled"));
    }

    public final boolean zzg(String str) {
        return "1".equals(this.zzb.zza(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzh(String str) {
        return zzd(str, zzap.zzaj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzi(String str) {
        zzfc<String> zzfcVar = zzap.zzak;
        if (str == null) {
            return zzfcVar.zza(null);
        }
        return zzfcVar.zza(this.zzb.zza(str, zzfcVar.zza()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzy() {
        if (this.zza == null) {
            Boolean zzd = zzd("app_measurement_lite");
            this.zza = zzd;
            if (zzd == null) {
                this.zza = false;
            }
        }
        return this.zza.booleanValue() || !this.zzx.zzt();
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
