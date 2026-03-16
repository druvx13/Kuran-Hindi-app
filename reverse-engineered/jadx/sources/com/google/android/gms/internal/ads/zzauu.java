package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzauu {
    private final AtomicReference<ThreadPoolExecutor> zzdsp = new AtomicReference<>(null);
    private final Object zzdsq = new Object();
    private String zzdsr = null;
    private String zzdss = null;
    private final AtomicBoolean zzdst = new AtomicBoolean(false);
    private final AtomicInteger zzdsu = new AtomicInteger(-1);
    private final AtomicReference<Object> zzdsv = new AtomicReference<>(null);
    private final AtomicReference<Object> zzdsw = new AtomicReference<>(null);
    private final ConcurrentMap<String, Method> zzdsx = new ConcurrentHashMap(9);
    private final AtomicReference<zzbgr> zzdsy = new AtomicReference<>(null);
    private final BlockingQueue<FutureTask<?>> zzdsz = new ArrayBlockingQueue(20);
    private final Object zzdta = new Object();

    public final boolean zzab(Context context) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzckm)).booleanValue() && !this.zzdst.get()) {
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzckw)).booleanValue()) {
                return true;
            }
            if (this.zzdsu.get() == -1) {
                zzvj.zzpr();
                if (!zzazm.zzd(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    zzvj.zzpr();
                    if (zzazm.zzbm(context)) {
                        zzawr.zzfc("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zzdsu.set(0);
                    }
                }
                this.zzdsu.set(1);
            }
            if (this.zzdsu.get() == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzac(Context context) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzckt)).booleanValue()) {
            if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzvj.zzpv().zzd(zzzz.zzcku)).intValue()) {
                return false;
            }
            if (((Boolean) zzvj.zzpv().zzd(zzzz.zzckv)).booleanValue()) {
                try {
                    context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    return false;
                } catch (ClassNotFoundException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void zza(Context context, zzyy zzyyVar) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzckz)).booleanValue() && zzab(context) && zzac(context)) {
            synchronized (this.zzdta) {
            }
        }
    }

    public final void zza(Context context, zzuj zzujVar) {
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzckz)).booleanValue() && zzab(context) && zzac(context)) {
            synchronized (this.zzdta) {
            }
        }
    }

    public final void zze(Context context, final String str) {
        if (zzab(context)) {
            if (zzac(context)) {
                zza("beginAdUnitExposure", new zzavk(str) { // from class: com.google.android.gms.internal.ads.zzaut
                    private final String zzdcd;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdcd = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzavk
                    public final void zza(zzbgr zzbgrVar) {
                        zzbgrVar.beginAdUnitExposure(this.zzdcd);
                    }
                });
            } else {
                zza(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void zzf(Context context, final String str) {
        if (zzab(context)) {
            if (zzac(context)) {
                zza("endAdUnitExposure", new zzavk(str) { // from class: com.google.android.gms.internal.ads.zzava
                    private final String zzdcd;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdcd = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzavk
                    public final void zza(zzbgr zzbgrVar) {
                        zzbgrVar.endAdUnitExposure(this.zzdcd);
                    }
                });
            } else {
                zza(context, str, "endAdUnitExposure");
            }
        }
    }

    public final String zzad(Context context) {
        if (zzab(context)) {
            if (zzac(context)) {
                return (String) zza("getCurrentScreenNameOrScreenClass", "", zzauz.zzdtc);
            }
            if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdsv, true)) {
                try {
                    String str = (String) zzm(context, "getCurrentScreenName").invoke(this.zzdsv.get(), new Object[0]);
                    if (str == null) {
                        str = (String) zzm(context, "getCurrentScreenClass").invoke(this.zzdsv.get(), new Object[0]);
                    }
                    return str != null ? str : "";
                } catch (Exception e) {
                    zza(e, "getCurrentScreenName", false);
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    public final void zzg(final Context context, final String str) {
        if (zzab(context) && (context instanceof Activity)) {
            if (zzac(context)) {
                zza("setScreenName", new zzavk(context, str) { // from class: com.google.android.gms.internal.ads.zzavc
                    private final Context zzcit;
                    private final String zzdbv;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzcit = context;
                        this.zzdbv = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzavk
                    public final void zza(zzbgr zzbgrVar) {
                        Context context2 = this.zzcit;
                        zzbgrVar.zzb(ObjectWrapper.wrap(context2), this.zzdbv, context2.getPackageName());
                    }
                });
            } else if (zza(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzdsw, false)) {
                try {
                    zzn(context, "setCurrentScreen").invoke(this.zzdsw.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception e) {
                    zza(e, "setCurrentScreen", false);
                }
            }
        }
    }

    public final String zzae(Context context) {
        if (zzab(context)) {
            synchronized (this.zzdsq) {
                if (this.zzdsr != null) {
                    return this.zzdsr;
                }
                if (zzac(context)) {
                    this.zzdsr = (String) zza("getGmpAppId", this.zzdsr, zzavb.zzdtc);
                } else {
                    this.zzdsr = (String) zza("getGmpAppId", context);
                }
                return this.zzdsr;
            }
        }
        return null;
    }

    public final String zzaf(final Context context) {
        if (zzab(context)) {
            long longValue = ((Long) zzvj.zzpv().zzd(zzzz.zzckr)).longValue();
            if (zzac(context)) {
                try {
                    if (longValue < 0) {
                        return (String) zza("getAppInstanceId", (String) null, zzave.zzdtc);
                    }
                    return (String) zzvm().submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzavd
                        private final zzauu zzdtd;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdtd = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zzdtd.zzvn();
                        }
                    }).get(longValue, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    return "TIME_OUT";
                } catch (Exception unused2) {
                    return null;
                }
            } else if (longValue < 0) {
                return (String) zza("getAppInstanceId", context);
            } else {
                try {
                    return (String) zzvm().submit(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.zzavg
                        private final Context zzchn;
                        private final zzauu zzdtd;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdtd = this;
                            this.zzchn = context;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zzdtd.zzaj(this.zzchn);
                        }
                    }).get(longValue, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused3) {
                    return "TIME_OUT";
                } catch (Exception unused4) {
                    return null;
                }
            }
        }
        return null;
    }

    public final String zzag(Context context) {
        if (zzab(context)) {
            if (zzac(context)) {
                Long l = (Long) zza("getAdEventId", (String) null, zzavf.zzdtc);
                if (l != null) {
                    return Long.toString(l.longValue());
                }
                return null;
            }
            Object zza = zza("generateEventId", context);
            if (zza != null) {
                return zza.toString();
            }
            return null;
        }
        return null;
    }

    public final String zzah(Context context) {
        if (zzab(context)) {
            synchronized (this.zzdsq) {
                if (this.zzdss != null) {
                    return this.zzdss;
                }
                if (zzac(context)) {
                    this.zzdss = (String) zza("getAppIdOrigin", this.zzdss, zzauw.zzdtc);
                } else {
                    this.zzdss = "fa";
                }
                return this.zzdss;
            }
        }
        return null;
    }

    public final void zzh(Context context, String str) {
        zza(context, "_ac", str, (Bundle) null);
    }

    public final void zzi(Context context, String str) {
        zza(context, "_ai", str, (Bundle) null);
    }

    public final void zzj(Context context, String str) {
        zza(context, "_aq", str, (Bundle) null);
    }

    public final void zzk(Context context, String str) {
        zza(context, "_aa", str, (Bundle) null);
    }

    public final void zza(Context context, String str, String str2, String str3, int i) {
        if (zzab(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zza(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            zzawr.zzeg(sb.toString());
        }
    }

    private final void zza(Context context, final String str, String str2, Bundle bundle) {
        if (zzab(context)) {
            final Bundle zzl = zzl(str2, str);
            if (bundle != null) {
                zzl.putAll(bundle);
            }
            if (zzac(context)) {
                zza("logEventInternal", new zzavk(str, zzl) { // from class: com.google.android.gms.internal.ads.zzauv
                    private final String zzdcd;
                    private final Bundle zzdtb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdcd = str;
                        this.zzdtb = zzl;
                    }

                    @Override // com.google.android.gms.internal.ads.zzavk
                    public final void zza(zzbgr zzbgrVar) {
                        zzbgrVar.logEvent("am", this.zzdcd, this.zzdtb);
                    }
                });
            } else if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdsv, true)) {
                try {
                    zzai(context).invoke(this.zzdsv.get(), "am", str, zzl);
                } catch (Exception e) {
                    zza(e, "logEventInternal", true);
                }
            }
        }
    }

    private static Bundle zzl(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String valueOf = String.valueOf(str);
            zzawr.zzc(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Method zzai(Context context) {
        Method method = this.zzdsx.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
            this.zzdsx.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, "logEventInternal", true);
            return null;
        }
    }

    private final Method zzl(Context context, String str) {
        Method method = this.zzdsx.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, String.class);
            this.zzdsx.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzm(Context context, String str) {
        Method method = this.zzdsx.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzdsx.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzn(Context context, String str) {
        Method method = this.zzdsx.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, Activity.class, String.class, String.class);
            this.zzdsx.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final void zza(Context context, String str, String str2) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdsv, true)) {
            try {
                zzl(context, str2).invoke(this.zzdsv.get(), str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                zzawr.zzeg(sb.toString());
            } catch (Exception e) {
                zza(e, str2, false);
            }
        }
    }

    private final Object zza(String str, Context context) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdsv, true)) {
            try {
                return zzm(context, str).invoke(this.zzdsv.get(), new Object[0]);
            } catch (Exception e) {
                zza(e, str, true);
                return null;
            }
        }
        return null;
    }

    private final void zza(Exception exc, String str, boolean z) {
        if (this.zzdst.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        zzawr.zzfc(sb.toString());
        if (z) {
            zzawr.zzfc("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.zzdst.set(true);
        }
    }

    private final ThreadPoolExecutor zzvm() {
        if (this.zzdsp.get() == null) {
            this.zzdsp.compareAndSet(null, new ThreadPoolExecutor(((Integer) zzvj.zzpv().zzd(zzzz.zzcks)).intValue(), ((Integer) zzvj.zzpv().zzd(zzzz.zzcks)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzavi(this)));
        }
        return this.zzdsp.get();
    }

    private final boolean zza(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception e) {
                zza(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    private final void zza(final String str, final zzavk zzavkVar) {
        synchronized (this.zzdsy) {
            FutureTask<?> futureTask = new FutureTask<>(new Runnable(this, zzavkVar, str) { // from class: com.google.android.gms.internal.ads.zzauy
                private final String zzdep;
                private final zzauu zzdtd;
                private final zzavk zzdte;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdtd = this;
                    this.zzdte = zzavkVar;
                    this.zzdep = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzdtd.zza(this.zzdte, this.zzdep);
                }
            }, null);
            if (this.zzdsy.get() != null) {
                futureTask.run();
            } else {
                this.zzdsz.offer(futureTask);
            }
        }
    }

    private final <T> T zza(String str, T t, zzavh<T> zzavhVar) {
        synchronized (this.zzdsy) {
            if (this.zzdsy.get() != null) {
                try {
                    return zzavhVar.zzb(this.zzdsy.get());
                } catch (Exception e) {
                    zza(e, str, false);
                }
            }
            return t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzavk zzavkVar, String str) {
        if (this.zzdsy.get() != null) {
            try {
                zzavkVar.zza(this.zzdsy.get());
            } catch (Exception e) {
                zza(e, str, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzaj(Context context) throws Exception {
        return (String) zza("getAppInstanceId", context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzvn() throws Exception {
        return (String) zza("getAppInstanceId", (String) null, zzaux.zzdtc);
    }
}
