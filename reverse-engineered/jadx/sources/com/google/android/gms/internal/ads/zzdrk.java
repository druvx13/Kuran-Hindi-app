package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdrk {
    public static Executor zzawr() {
        return zzdqp.INSTANCE;
    }

    public static zzdrh zza(ExecutorService executorService) {
        if (executorService instanceof zzdrh) {
            return (zzdrh) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new zzdro((ScheduledExecutorService) executorService);
        }
        return new zzdrl(executorService);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor zza(Executor executor, zzdpw<?> zzdpwVar) {
        zzdoj.checkNotNull(executor);
        zzdoj.checkNotNull(zzdpwVar);
        return executor == zzdqp.INSTANCE ? executor : new zzdrj(executor, zzdpwVar);
    }
}
