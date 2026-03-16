package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzle;
import com.google.android.gms.internal.measurement.zzlr;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzio implements Application.ActivityLifecycleCallbacks {
    private final /* synthetic */ zzhr zza;

    private zzio(zzhr zzhrVar) {
        this.zza = zzhrVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.zza.zzr().zzx().zza("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            Uri data = intent.getData();
            if (data != null && data.isHierarchical()) {
                this.zza.zzp();
                String str = zzla.zza(intent) ? "gs" : "auto";
                String queryParameter = data.getQueryParameter("referrer");
                boolean z = bundle == null;
                if (zzlr.zzb() && zzap.zzcd.zza(null).booleanValue()) {
                    this.zza.zzq().zza(new zzin(this, z, data, str, queryParameter));
                } else {
                    zza(z, data, str, queryParameter);
                }
            }
        } catch (Exception e) {
            this.zza.zzr().zzf().zza("Throwable caught in onActivityCreated", e);
        } finally {
            this.zza.zzi().zza(activity, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[Catch: Exception -> 0x01a7, TRY_ENTER, TryCatch #0 {Exception -> 0x01a7, blocks: (B:3:0x0006, B:6:0x0020, B:8:0x002e, B:33:0x009c, B:35:0x00aa, B:37:0x00bd, B:40:0x00c5, B:42:0x00cb, B:43:0x00de, B:45:0x00e5, B:48:0x00f5, B:51:0x0105, B:54:0x010d, B:56:0x0113, B:57:0x011e, B:60:0x0125, B:64:0x0146, B:66:0x015b, B:65:0x014c, B:68:0x0162, B:70:0x0168, B:72:0x016e, B:74:0x0174, B:76:0x017a, B:78:0x0182, B:82:0x018d, B:84:0x019b, B:86:0x01a1, B:12:0x003f, B:15:0x004c, B:17:0x0052, B:19:0x0058, B:21:0x005e, B:23:0x0064, B:24:0x0070, B:26:0x007c, B:28:0x0087, B:30:0x0091, B:27:0x0081), top: B:91:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5 A[Catch: Exception -> 0x01a7, TRY_ENTER, TryCatch #0 {Exception -> 0x01a7, blocks: (B:3:0x0006, B:6:0x0020, B:8:0x002e, B:33:0x009c, B:35:0x00aa, B:37:0x00bd, B:40:0x00c5, B:42:0x00cb, B:43:0x00de, B:45:0x00e5, B:48:0x00f5, B:51:0x0105, B:54:0x010d, B:56:0x0113, B:57:0x011e, B:60:0x0125, B:64:0x0146, B:66:0x015b, B:65:0x014c, B:68:0x0162, B:70:0x0168, B:72:0x016e, B:74:0x0174, B:76:0x017a, B:78:0x0182, B:82:0x018d, B:84:0x019b, B:86:0x01a1, B:12:0x003f, B:15:0x004c, B:17:0x0052, B:19:0x0058, B:21:0x005e, B:23:0x0064, B:24:0x0070, B:26:0x007c, B:28:0x0087, B:30:0x0091, B:27:0x0081), top: B:91:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125 A[Catch: Exception -> 0x01a7, TRY_LEAVE, TryCatch #0 {Exception -> 0x01a7, blocks: (B:3:0x0006, B:6:0x0020, B:8:0x002e, B:33:0x009c, B:35:0x00aa, B:37:0x00bd, B:40:0x00c5, B:42:0x00cb, B:43:0x00de, B:45:0x00e5, B:48:0x00f5, B:51:0x0105, B:54:0x010d, B:56:0x0113, B:57:0x011e, B:60:0x0125, B:64:0x0146, B:66:0x015b, B:65:0x014c, B:68:0x0162, B:70:0x0168, B:72:0x016e, B:74:0x0174, B:76:0x017a, B:78:0x0182, B:82:0x018d, B:84:0x019b, B:86:0x01a1, B:12:0x003f, B:15:0x004c, B:17:0x0052, B:19:0x0058, B:21:0x005e, B:23:0x0064, B:24:0x0070, B:26:0x007c, B:28:0x0087, B:30:0x0091, B:27:0x0081), top: B:91:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzio.zza(boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzi().zzc(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzi().zzb(activity);
        zzke zzk = this.zza.zzk();
        zzk.zzq().zza(new zzkg(zzk, zzk.zzm().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (zzle.zzb() && zzap.zzay.zza(null).booleanValue()) {
            this.zza.zzk().zzab();
            this.zza.zzi().zza(activity);
            return;
        }
        this.zza.zzi().zza(activity);
        this.zza.zzk().zzab();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzi().zzb(activity, bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzio(zzhr zzhrVar, zzht zzhtVar) {
        this(zzhrVar);
    }
}
