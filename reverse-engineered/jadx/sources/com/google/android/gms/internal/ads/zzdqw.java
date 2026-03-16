package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdrc;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdqw extends zzdrd {
    public static <V> zzdri<V> zzag(@NullableDecl V v) {
        if (v == null) {
            return (zzdri<V>) zzdrc.zzhia;
        }
        return new zzdrc(v);
    }

    public static <V> zzdri<V> immediateFailedFuture(Throwable th) {
        zzdoj.checkNotNull(th);
        return new zzdrc.zza(th);
    }

    public static <O> zzdri<O> zza(zzdqh<O> zzdqhVar, Executor executor) {
        zzdrw zzdrwVar = new zzdrw(zzdqhVar);
        executor.execute(zzdrwVar);
        return zzdrwVar;
    }

    public static <V, X extends Throwable> zzdri<V> zzb(zzdri<? extends V> zzdriVar, Class<X> cls, zzdqj<? super X, ? extends V> zzdqjVar, Executor executor) {
        return zzdpv.zza(zzdriVar, cls, zzdqjVar, executor);
    }

    public static <V> zzdri<V> zza(zzdri<V> zzdriVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return zzdriVar.isDone() ? zzdriVar : zzdrs.zzb(zzdriVar, j, timeUnit, scheduledExecutorService);
    }

    public static <I, O> zzdri<O> zzb(zzdri<I> zzdriVar, zzdqj<? super I, ? extends O> zzdqjVar, Executor executor) {
        return zzdpy.zza(zzdriVar, zzdqjVar, executor);
    }

    public static <I, O> zzdri<O> zzb(zzdri<I> zzdriVar, zzdnx<? super I, ? extends O> zzdnxVar, Executor executor) {
        return zzdpy.zza(zzdriVar, zzdnxVar, executor);
    }

    public static <V> zzdri<List<V>> zzi(Iterable<? extends zzdri<? extends V>> iterable) {
        return new zzdql(zzdou.zzh(iterable), true);
    }

    @SafeVarargs
    public static <V> zzdrb<V> zza(zzdri<? extends V>... zzdriVarArr) {
        return new zzdrb<>(false, zzdou.zzb(zzdriVarArr), null);
    }

    public static <V> zzdrb<V> zzj(Iterable<? extends zzdri<? extends V>> iterable) {
        return new zzdrb<>(false, zzdou.zzh(iterable), null);
    }

    @SafeVarargs
    public static <V> zzdrb<V> zzb(zzdri<? extends V>... zzdriVarArr) {
        return new zzdrb<>(true, zzdou.zzb(zzdriVarArr), null);
    }

    public static <V> zzdrb<V> zzk(Iterable<? extends zzdri<? extends V>> iterable) {
        return new zzdrb<>(true, zzdou.zzh(iterable), null);
    }

    public static <V> void zza(zzdri<V> zzdriVar, zzdqx<? super V> zzdqxVar, Executor executor) {
        zzdoj.checkNotNull(zzdqxVar);
        zzdriVar.addListener(new zzdqy(zzdriVar, zzdqxVar), executor);
    }

    public static <V> V zza(Future<V> future) throws ExecutionException {
        if (!future.isDone()) {
            throw new IllegalStateException(zzdok.zzb("Future was expected to be done: %s", future));
        }
        return (V) zzdsa.getUninterruptibly(future);
    }

    public static <V> V zzb(Future<V> future) {
        zzdoj.checkNotNull(future);
        try {
            return (V) zzdsa.getUninterruptibly(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzdqo((Error) cause);
            }
            throw new zzdrx(cause);
        }
    }
}
