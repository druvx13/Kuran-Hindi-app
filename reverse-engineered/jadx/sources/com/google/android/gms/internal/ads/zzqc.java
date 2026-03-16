package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzqc implements Application.ActivityLifecycleCallbacks {
    private final Application zzxv;
    private final WeakReference<Application.ActivityLifecycleCallbacks> zzxw;
    private boolean zzxx = false;

    public zzqc(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzxw = new WeakReference<>(activityLifecycleCallbacks);
        this.zzxv = application;
    }

    private final void zza(zzqk zzqkVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.zzxw.get();
            if (activityLifecycleCallbacks != null) {
                zzqkVar.zza(activityLifecycleCallbacks);
            } else if (this.zzxx) {
            } else {
                this.zzxv.unregisterActivityLifecycleCallbacks(this);
                this.zzxx = true;
            }
        } catch (Exception e) {
            zzawr.zzc("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzqb(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(new zzqe(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(new zzqd(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(new zzqg(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zza(new zzqf(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzqi(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zza(new zzqh(this, activity));
    }
}
