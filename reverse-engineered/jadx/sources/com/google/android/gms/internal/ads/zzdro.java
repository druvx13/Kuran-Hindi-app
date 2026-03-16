package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdro extends zzdrl implements zzdrh, ScheduledExecutorService {
    private final ScheduledExecutorService zzhil;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdro(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.zzhil = (ScheduledExecutorService) zzdoj.checkNotNull(scheduledExecutorService);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzdrq zzdrqVar = new zzdrq(runnable);
        return new zzdrn(zzdrqVar, this.zzhil.scheduleWithFixedDelay(zzdrqVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzdrq zzdrqVar = new zzdrq(runnable);
        return new zzdrn(zzdrqVar, this.zzhil.scheduleAtFixedRate(zzdrqVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzdrw zze = zzdrw.zze(callable);
        return new zzdrn(zze, this.zzhil.schedule(zze, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzdrw zza = zzdrw.zza(runnable, (Object) null);
        return new zzdrn(zza, this.zzhil.schedule(zza, j, timeUnit));
    }
}
