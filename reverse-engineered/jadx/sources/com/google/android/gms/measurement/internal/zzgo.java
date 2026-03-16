package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzgo<V> extends FutureTask<V> implements Comparable<zzgo<V>> {
    final boolean zza;
    private final long zzb;
    private final String zzc;
    private final /* synthetic */ zzgj zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgo(zzgj zzgjVar, Callable<V> callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.zzd = zzgjVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzgj.zzj;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzgjVar.zzr().zzf().zza("Tasks index overflow");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgo(zzgj zzgjVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.zzd = zzgjVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzgj.zzj;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = false;
        if (andIncrement == Long.MAX_VALUE) {
            zzgjVar.zzr().zzf().zza("Tasks index overflow");
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.zzd.zzr().zzf().zza(this.zzc, th);
        if (th instanceof zzgm) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        zzgo zzgoVar = (zzgo) obj;
        boolean z = this.zza;
        if (z != zzgoVar.zza) {
            return z ? -1 : 1;
        }
        long j = this.zzb;
        long j2 = zzgoVar.zzb;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.zzd.zzr().zzg().zza("Two tasks share the same index. index", Long.valueOf(this.zzb));
        return 0;
    }
}
