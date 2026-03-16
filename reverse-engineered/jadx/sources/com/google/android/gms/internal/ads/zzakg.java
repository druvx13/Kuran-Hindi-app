package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzakg {
    private final Object zzddq = new Object();
    private final Object zzddr = new Object();
    private zzakp zzdds;
    private zzakp zzddt;

    public final zzakp zza(Context context, zzazz zzazzVar) {
        zzakp zzakpVar;
        synchronized (this.zzddr) {
            if (this.zzddt == null) {
                this.zzddt = new zzakp(zzk(context), zzazzVar, zzabs.zzcxl.get());
            }
            zzakpVar = this.zzddt;
        }
        return zzakpVar;
    }

    public final zzakp zzb(Context context, zzazz zzazzVar) {
        zzakp zzakpVar;
        synchronized (this.zzddq) {
            if (this.zzdds == null) {
                this.zzdds = new zzakp(zzk(context), zzazzVar, (String) zzvj.zzpv().zzd(zzzz.zzciu));
            }
            zzakpVar = this.zzdds;
        }
        return zzakpVar;
    }

    private static Context zzk(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
