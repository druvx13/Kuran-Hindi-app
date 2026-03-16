package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdqt<V> extends zzdqr<V> {
    private final zzdri<V> zzhhw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdqt(zzdri<V> zzdriVar) {
        this.zzhhw = (zzdri) zzdoj.checkNotNull(zzdriVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdpw, com.google.android.gms.internal.ads.zzdri
    public final void addListener(Runnable runnable, Executor executor) {
        this.zzhhw.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdpw, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zzhhw.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzdpw, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzhhw.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzdpw, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzhhw.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzdpw, java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return this.zzhhw.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdpw, java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zzhhw.get(j, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.zzdpw
    public final String toString() {
        return this.zzhhw.toString();
    }
}
