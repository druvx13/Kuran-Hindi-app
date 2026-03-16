package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzql {
    private final Object zzbqb = new Object();
    private zzqo zzbqc = null;
    private boolean zzbqd = false;

    public final void initialize(Context context) {
        synchronized (this.zzbqb) {
            if (!this.zzbqd) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    zzawr.zzfc("Can not cast Context to Application");
                    return;
                }
                if (this.zzbqc == null) {
                    this.zzbqc = new zzqo();
                }
                this.zzbqc.zza(application, context);
                this.zzbqd = true;
            }
        }
    }

    public final void zza(zzqq zzqqVar) {
        synchronized (this.zzbqb) {
            if (this.zzbqc == null) {
                this.zzbqc = new zzqo();
            }
            this.zzbqc.zza(zzqqVar);
        }
    }

    public final void zzb(zzqq zzqqVar) {
        synchronized (this.zzbqb) {
            if (this.zzbqc == null) {
                return;
            }
            this.zzbqc.zzb(zzqqVar);
        }
    }

    public final Activity getActivity() {
        synchronized (this.zzbqb) {
            if (this.zzbqc != null) {
                return this.zzbqc.getActivity();
            }
            return null;
        }
    }

    public final Context getContext() {
        synchronized (this.zzbqb) {
            if (this.zzbqc != null) {
                return this.zzbqc.getContext();
            }
            return null;
        }
    }
}
