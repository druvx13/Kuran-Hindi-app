package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzdqs<V> extends zzdor implements Future<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdor
    /* renamed from: zzawp */
    public abstract Future<? extends V> zzavr();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return zzavr().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return zzavr().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return zzavr().isDone();
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return zzavr().get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return zzavr().get(j, timeUnit);
    }
}
