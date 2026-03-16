package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzblu implements zzegz<zzbte> {
    private final zzehm<Clock> zzfhq;
    private final zzehm<ScheduledExecutorService> zzfix;

    public zzblu(zzehm<ScheduledExecutorService> zzehmVar, zzehm<Clock> zzehmVar2) {
        this.zzfix = zzehmVar;
        this.zzfhq = zzehmVar2;
    }

    public static zzbte zza(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        return (zzbte) zzehf.zza(new zzbte(scheduledExecutorService, clock), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzfix.get(), this.zzfhq.get());
    }
}
