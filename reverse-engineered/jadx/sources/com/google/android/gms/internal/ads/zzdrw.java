package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdrw<V> extends zzdqq<V> implements RunnableFuture<V> {
    private volatile zzdre<?> zzhis;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzdrw<V> zze(Callable<V> callable) {
        return new zzdrw<>(callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzdrw<V> zza(Runnable runnable, @NullableDecl V v) {
        return new zzdrw<>(Executors.callable(runnable, v));
    }

    private zzdrw(Callable<V> callable) {
        this.zzhis = new zzdry(this, callable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrw(zzdqh<V> zzdqhVar) {
        this.zzhis = new zzdrv(this, zzdqhVar);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzdre<?> zzdreVar = this.zzhis;
        if (zzdreVar != null) {
            zzdreVar.run();
        }
        this.zzhis = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdpw
    public final void afterDone() {
        zzdre<?> zzdreVar;
        super.afterDone();
        if (wasInterrupted() && (zzdreVar = this.zzhis) != null) {
            zzdreVar.interruptTask();
        }
        this.zzhis = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdpw
    public final String pendingToString() {
        zzdre<?> zzdreVar = this.zzhis;
        if (zzdreVar != null) {
            String valueOf = String.valueOf(zzdreVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7);
            sb.append("task=[");
            sb.append(valueOf);
            sb.append("]");
            return sb.toString();
        }
        return super.pendingToString();
    }
}
