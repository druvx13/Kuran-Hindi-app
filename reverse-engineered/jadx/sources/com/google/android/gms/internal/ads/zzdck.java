package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdck implements zzdak<zzdch> {
    private ScheduledExecutorService zzfky;
    private zzapo zzgpy;
    private Context zzvf;

    public zzdck(zzapo zzapoVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zzgpy = zzapoVar;
        this.zzfky = scheduledExecutorService;
        this.zzvf = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdak
    public final zzdri<zzdch> zzaqa() {
        return zzdqw.zzb(zzdqw.zza(this.zzgpy.zzq(this.zzvf), ((Long) zzvj.zzpv().zzd(zzzz.zzcpo)).longValue(), TimeUnit.MILLISECONDS, this.zzfky), zzdcj.zzdsc, zzbab.zzdzr);
    }
}
