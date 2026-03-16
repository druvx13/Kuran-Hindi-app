package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class zzbaj<T> implements zzdri<T> {
    private final zzdrp<T> zzeab = zzdrp.zzaws();

    public final boolean set(T t) {
        return zzas(this.zzeab.set(t));
    }

    public final boolean setException(Throwable th) {
        return zzas(this.zzeab.setException(th));
    }

    private static boolean zzas(boolean z) {
        if (!z) {
            com.google.android.gms.ads.internal.zzq.zzla().zzb(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzdri
    public void addListener(Runnable runnable, Executor executor) {
        this.zzeab.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.zzeab.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.zzeab.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.zzeab.isDone();
    }

    @Override // java.util.concurrent.Future
    public T get() throws ExecutionException, InterruptedException {
        return this.zzeab.get();
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zzeab.get(j, timeUnit);
    }
}
