package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzdqr<V> extends zzdra<V> {
    public static <V> zzdqr<V> zzg(zzdri<V> zzdriVar) {
        if (zzdriVar instanceof zzdqr) {
            return (zzdqr) zzdriVar;
        }
        return new zzdqt(zzdriVar);
    }

    public final <X extends Throwable> zzdqr<V> zza(Class<X> cls, zzdnx<? super X, ? extends V> zzdnxVar, Executor executor) {
        zzdpx zzdpxVar = new zzdpx(this, cls, zzdnxVar);
        addListener(zzdpxVar, zzdrk.zza(executor, zzdpxVar));
        return zzdpxVar;
    }

    public final zzdqr<V> zza(long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return (zzdqr) zzdqw.zza(this, j, timeUnit, scheduledExecutorService);
    }

    public final <T> zzdqr<T> zzb(zzdqj<? super V, T> zzdqjVar, Executor executor) {
        zzdoj.checkNotNull(executor);
        zzdqb zzdqbVar = new zzdqb(this, zzdqjVar);
        addListener(zzdqbVar, zzdrk.zza(executor, zzdqbVar));
        return zzdqbVar;
    }

    public final <T> zzdqr<T> zza(zzdnx<? super V, T> zzdnxVar, Executor executor) {
        zzdoj.checkNotNull(zzdnxVar);
        zzdqa zzdqaVar = new zzdqa(this, zzdnxVar);
        addListener(zzdqaVar, zzdrk.zza(executor, zzdqaVar));
        return zzdqaVar;
    }
}
