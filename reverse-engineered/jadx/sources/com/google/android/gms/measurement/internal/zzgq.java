package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public class zzgq implements zzhj {
    private static volatile zzgq zza;
    private long zzaa;
    private volatile Boolean zzab;
    private Boolean zzac;
    private Boolean zzad;
    private int zzae;
    private final long zzag;
    private final Context zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final boolean zzf;
    private final zzw zzg;
    private final zzx zzh;
    private final zzfv zzi;
    private final zzfj zzj;
    private final zzgj zzk;
    private final zzke zzl;
    private final zzla zzm;
    private final zzfh zzn;
    private final Clock zzo;
    private final zziy zzp;
    private final zzhr zzq;
    private final zzb zzr;
    private final zzip zzs;
    private zzff zzt;
    private zziz zzu;
    private zzah zzv;
    private zzfg zzw;
    private zzgb zzx;
    private Boolean zzz;
    private boolean zzy = false;
    private AtomicInteger zzaf = new AtomicInteger(0);

    private zzgq(zzhs zzhsVar) {
        boolean z = false;
        Preconditions.checkNotNull(zzhsVar);
        zzw zzwVar = new zzw(zzhsVar.zza);
        this.zzg = zzwVar;
        zzez.zza = zzwVar;
        this.zzb = zzhsVar.zza;
        this.zzc = zzhsVar.zzb;
        this.zzd = zzhsVar.zzc;
        this.zze = zzhsVar.zzd;
        this.zzf = zzhsVar.zzh;
        this.zzab = zzhsVar.zze;
        com.google.android.gms.internal.measurement.zzv zzvVar = zzhsVar.zzg;
        if (zzvVar != null && zzvVar.zzg != null) {
            Object obj = zzvVar.zzg.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzac = (Boolean) obj;
            }
            Object obj2 = zzvVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzad = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzcl.zza(this.zzb);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzo = defaultClock;
        this.zzag = defaultClock.currentTimeMillis();
        this.zzh = new zzx(this);
        zzfv zzfvVar = new zzfv(this);
        zzfvVar.zzab();
        this.zzi = zzfvVar;
        zzfj zzfjVar = new zzfj(this);
        zzfjVar.zzab();
        this.zzj = zzfjVar;
        zzla zzlaVar = new zzla(this);
        zzlaVar.zzab();
        this.zzm = zzlaVar;
        zzfh zzfhVar = new zzfh(this);
        zzfhVar.zzab();
        this.zzn = zzfhVar;
        this.zzr = new zzb(this);
        zziy zziyVar = new zziy(this);
        zziyVar.zzx();
        this.zzp = zziyVar;
        zzhr zzhrVar = new zzhr(this);
        zzhrVar.zzx();
        this.zzq = zzhrVar;
        zzke zzkeVar = new zzke(this);
        zzkeVar.zzx();
        this.zzl = zzkeVar;
        zzip zzipVar = new zzip(this);
        zzipVar.zzab();
        this.zzs = zzipVar;
        zzgj zzgjVar = new zzgj(this);
        zzgjVar.zzab();
        this.zzk = zzgjVar;
        if (zzhsVar.zzg != null && zzhsVar.zzg.zzb != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (this.zzb.getApplicationContext() instanceof Application) {
            zzhr zzh = zzh();
            if (zzh.zzn().getApplicationContext() instanceof Application) {
                Application application = (Application) zzh.zzn().getApplicationContext();
                if (zzh.zza == null) {
                    zzh.zza = new zzio(zzh, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(zzh.zza);
                    application.registerActivityLifecycleCallbacks(zzh.zza);
                    zzh.zzr().zzx().zza("Registered activity lifecycle callback");
                }
            }
        } else {
            zzr().zzi().zza("Application context is not an Application");
        }
        this.zzk.zza(new zzgs(this, zzhsVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzae() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzhs zzhsVar) {
        String concat;
        zzfl zzflVar;
        zzq().zzd();
        zzah zzahVar = new zzah(this);
        zzahVar.zzab();
        this.zzv = zzahVar;
        zzfg zzfgVar = new zzfg(this, zzhsVar.zzf);
        zzfgVar.zzx();
        this.zzw = zzfgVar;
        zzff zzffVar = new zzff(this);
        zzffVar.zzx();
        this.zzt = zzffVar;
        zziz zzizVar = new zziz(this);
        zzizVar.zzx();
        this.zzu = zzizVar;
        this.zzm.zzac();
        this.zzi.zzac();
        this.zzx = new zzgb(this);
        this.zzw.zzy();
        zzr().zzv().zza("App measurement initialized, version", Long.valueOf(this.zzh.zzf()));
        zzr().zzv().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzab = zzfgVar.zzab();
        if (TextUtils.isEmpty(this.zzc)) {
            if (zzi().zzf(zzab)) {
                zzflVar = zzr().zzv();
                concat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                zzfl zzv = zzr().zzv();
                String valueOf = String.valueOf(zzab);
                concat = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                zzflVar = zzv;
            }
            zzflVar.zza(concat);
        }
        zzr().zzw().zza("Debug-level message logging enabled");
        if (this.zzae != this.zzaf.get()) {
            zzr().zzf().zza("Not all components initialized", Integer.valueOf(this.zzae), Integer.valueOf(this.zzaf.get()));
        }
        this.zzy = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza() {
        zzq().zzd();
        if (zzc().zzc.zza() == 0) {
            zzc().zzc.zza(this.zzo.currentTimeMillis());
        }
        if (Long.valueOf(zzc().zzh.zza()).longValue() == 0) {
            zzr().zzx().zza("Persisting first open", Long.valueOf(this.zzag));
            zzc().zzh.zza(this.zzag);
        }
        if (!zzah()) {
            if (zzab()) {
                if (!zzi().zzd("android.permission.INTERNET")) {
                    zzr().zzf().zza("App is missing INTERNET permission");
                }
                if (!zzi().zzd("android.permission.ACCESS_NETWORK_STATE")) {
                    zzr().zzf().zza("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.packageManager(this.zzb).isCallerInstantApp() && !this.zzh.zzy()) {
                    if (!zzgg.zza(this.zzb)) {
                        zzr().zzf().zza("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zzla.zza(this.zzb, false)) {
                        zzr().zzf().zza("AppMeasurementService not registered/enabled");
                    }
                }
                zzr().zzf().zza("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(zzy().zzac()) || !TextUtils.isEmpty(zzy().zzad())) {
                zzi();
                if (zzla.zza(zzy().zzac(), zzc().zzh(), zzy().zzad(), zzc().zzi())) {
                    zzr().zzv().zza("Rechecking which service to use due to a GMP App Id change");
                    zzc().zzk();
                    zzk().zzab();
                    this.zzu.zzah();
                    this.zzu.zzaf();
                    zzc().zzh.zza(this.zzag);
                    zzc().zzj.zza(null);
                }
                zzc().zzc(zzy().zzac());
                zzc().zzd(zzy().zzad());
            }
            zzh().zza(zzc().zzj.zza());
            if (com.google.android.gms.internal.measurement.zzkb.zzb() && this.zzh.zza(zzap.zzcq) && !zzi().zzv() && !TextUtils.isEmpty(zzc().zzw.zza())) {
                zzr().zzi().zza("Remote config removed with active feature rollouts");
                zzc().zzw.zza(null);
            }
            if (!TextUtils.isEmpty(zzy().zzac()) || !TextUtils.isEmpty(zzy().zzad())) {
                boolean zzab = zzab();
                if (!zzc().zzx() && !this.zzh.zzh()) {
                    zzc().zzc(!zzab);
                }
                if (zzab) {
                    zzh().zzai();
                }
                zze().zza.zza();
                zzw().zza(new AtomicReference<>());
            }
        }
        zzc().zzo.zza(this.zzh.zza(zzap.zzbi));
        zzc().zzp.zza(this.zzh.zza(zzap.zzbj));
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public final zzw zzu() {
        return this.zzg;
    }

    public final zzx zzb() {
        return this.zzh;
    }

    public final zzfv zzc() {
        zza((zzhh) this.zzi);
        return this.zzi;
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public final zzfj zzr() {
        zzb(this.zzj);
        return this.zzj;
    }

    public final zzfj zzd() {
        zzfj zzfjVar = this.zzj;
        if (zzfjVar == null || !zzfjVar.zzz()) {
            return null;
        }
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public final zzgj zzq() {
        zzb(this.zzk);
        return this.zzk;
    }

    public final zzke zze() {
        zzb(this.zzl);
        return this.zzl;
    }

    public final zzgb zzf() {
        return this.zzx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzgj zzg() {
        return this.zzk;
    }

    public final zzhr zzh() {
        zzb(this.zzq);
        return this.zzq;
    }

    public final zzla zzi() {
        zza((zzhh) this.zzm);
        return this.zzm;
    }

    public final zzfh zzj() {
        zza((zzhh) this.zzn);
        return this.zzn;
    }

    public final zzff zzk() {
        zzb(this.zzt);
        return this.zzt;
    }

    private final zzip zzaj() {
        zzb(this.zzs);
        return this.zzs;
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public final Context zzn() {
        return this.zzb;
    }

    public final boolean zzl() {
        return TextUtils.isEmpty(this.zzc);
    }

    public final String zzo() {
        return this.zzc;
    }

    public final String zzp() {
        return this.zzd;
    }

    public final String zzs() {
        return this.zze;
    }

    public final boolean zzt() {
        return this.zzf;
    }

    @Override // com.google.android.gms.measurement.internal.zzhj
    public final Clock zzm() {
        return this.zzo;
    }

    public final zziy zzv() {
        zzb(this.zzp);
        return this.zzp;
    }

    public final zziz zzw() {
        zzb(this.zzu);
        return this.zzu;
    }

    public final zzah zzx() {
        zzb(this.zzv);
        return this.zzv;
    }

    public final zzfg zzy() {
        zzb(this.zzw);
        return this.zzw;
    }

    public final zzb zzz() {
        zzb zzbVar = this.zzr;
        if (zzbVar != null) {
            return zzbVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public static zzgq zza(Context context, String str, String str2, Bundle bundle) {
        return zza(context, new com.google.android.gms.internal.measurement.zzv(0L, 0L, true, null, null, null, bundle));
    }

    public static zzgq zza(Context context, com.google.android.gms.internal.measurement.zzv zzvVar) {
        if (zzvVar != null && (zzvVar.zze == null || zzvVar.zzf == null)) {
            zzvVar = new com.google.android.gms.internal.measurement.zzv(zzvVar.zza, zzvVar.zzb, zzvVar.zzc, zzvVar.zzd, null, null, zzvVar.zzg);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zza == null) {
            synchronized (zzgq.class) {
                if (zza == null) {
                    zza = new zzgq(new zzhs(context, zzvVar));
                }
            }
        } else if (zzvVar != null && zzvVar.zzg != null && zzvVar.zzg.containsKey("dataCollectionDefaultEnabled")) {
            zza.zza(zzvVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        return zza;
    }

    private final void zzak() {
        if (!this.zzy) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    private static void zzb(zzhk zzhkVar) {
        if (zzhkVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzhkVar.zzz()) {
            return;
        }
        String valueOf = String.valueOf(zzhkVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private static void zzb(zze zzeVar) {
        if (zzeVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzeVar.zzv()) {
            return;
        }
        String valueOf = String.valueOf(zzeVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private static void zza(zzhh zzhhVar) {
        if (zzhhVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(boolean z) {
        this.zzab = Boolean.valueOf(z);
    }

    public final boolean zzaa() {
        return this.zzab != null && this.zzab.booleanValue();
    }

    public final boolean zzab() {
        if (com.google.android.gms.internal.measurement.zzky.zzb() && this.zzh.zza(zzap.zzcx)) {
            return zzac() == 0;
        }
        zzq().zzd();
        zzak();
        if (this.zzh.zzh()) {
            return false;
        }
        Boolean bool = this.zzad;
        if (bool == null || !bool.booleanValue()) {
            Boolean zzv = zzc().zzv();
            if (zzv != null) {
                return zzv.booleanValue();
            }
            Boolean zzi = this.zzh.zzi();
            if (zzi != null) {
                return zzi.booleanValue();
            }
            Boolean bool2 = this.zzac;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            if (GoogleServices.isMeasurementExplicitlyDisabled()) {
                return false;
            }
            if (!this.zzh.zza(zzap.zzba) || this.zzab == null) {
                return true;
            }
            return this.zzab.booleanValue();
        }
        return false;
    }

    public final int zzac() {
        zzq().zzd();
        if (this.zzh.zzh()) {
            return 1;
        }
        Boolean bool = this.zzad;
        if (bool == null || !bool.booleanValue()) {
            Boolean zzv = zzc().zzv();
            if (zzv != null) {
                return zzv.booleanValue() ? 0 : 3;
            }
            Boolean zzi = this.zzh.zzi();
            if (zzi != null) {
                return zzi.booleanValue() ? 0 : 4;
            }
            Boolean bool2 = this.zzac;
            if (bool2 != null) {
                return bool2.booleanValue() ? 0 : 5;
            } else if (GoogleServices.isMeasurementExplicitlyDisabled()) {
                return 6;
            } else {
                return (!this.zzh.zza(zzap.zzba) || this.zzab == null || this.zzab.booleanValue()) ? 0 : 7;
            }
        }
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzad() {
        Long valueOf = Long.valueOf(zzc().zzh.zza());
        if (valueOf.longValue() == 0) {
            return this.zzag;
        }
        return Math.min(this.zzag, valueOf.longValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzaf() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzhk zzhkVar) {
        this.zzae++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zze zzeVar) {
        this.zzae++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzag() {
        this.zzaf.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzah() {
        zzak();
        zzq().zzd();
        Boolean bool = this.zzz;
        if (bool == null || this.zzaa == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzo.elapsedRealtime() - this.zzaa) > 1000)) {
            this.zzaa = this.zzo.elapsedRealtime();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(zzi().zzd("android.permission.INTERNET") && zzi().zzd("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzb).isCallerInstantApp() || this.zzh.zzy() || (zzgg.zza(this.zzb) && zzla.zza(this.zzb, false))));
            this.zzz = valueOf;
            if (valueOf.booleanValue()) {
                if (!zzi().zza(zzy().zzac(), zzy().zzad(), zzy().zzae()) && TextUtils.isEmpty(zzy().zzad())) {
                    z = false;
                }
                this.zzz = Boolean.valueOf(z);
            }
        }
        return this.zzz.booleanValue();
    }

    public final void zzai() {
        zzq().zzd();
        zzb(zzaj());
        String zzab = zzy().zzab();
        Pair<String, Boolean> zza2 = zzc().zza(zzab);
        if (!this.zzh.zzj().booleanValue() || ((Boolean) zza2.second).booleanValue() || TextUtils.isEmpty((CharSequence) zza2.first)) {
            zzr().zzw().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!zzaj().zzg()) {
            zzr().zzi().zza("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            URL zza3 = zzi().zza(zzy().zzt().zzf(), zzab, (String) zza2.first, zzc().zzv.zza() - 1);
            zzip zzaj = zzaj();
            zzis zzisVar = new zzis(this) { // from class: com.google.android.gms.measurement.internal.zzgp
                private final zzgq zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                }

                @Override // com.google.android.gms.measurement.internal.zzis
                public final void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
                    this.zza.zza(str, i, th, bArr, map);
                }
            };
            zzaj.zzd();
            zzaj.zzaa();
            Preconditions.checkNotNull(zza3);
            Preconditions.checkNotNull(zzisVar);
            zzaj.zzq().zzb(new zzir(zzaj, zzab, zza3, null, null, zzisVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        boolean z = true;
        if (!((i == 200 || i == 204 || i == 304) && th == null)) {
            zzr().zzi().zza("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        zzc().zzu.zza(true);
        if (bArr.length == 0) {
            zzr().zzw().zza("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                zzr().zzw().zza("Deferred Deep Link is empty.");
                return;
            }
            zzla zzi = zzi();
            zzi.zzb();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = zzi.zzn().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                zzr().zzi().zza("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.zzq.zza("auto", "_cmp", bundle);
            zzla zzi2 = zzi();
            if (TextUtils.isEmpty(optString) || !zzi2.zza(optString, optDouble)) {
                return;
            }
            zzi2.zzn().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            zzr().zzf().zza("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }
}
