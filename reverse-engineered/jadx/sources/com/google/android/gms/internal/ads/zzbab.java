package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbab {
    public static final zzdrh zzdzr = zza(new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), zzff("Default")));
    public static final zzdrh zzdzs;
    public static final zzdrh zzdzt;
    public static final ScheduledExecutorService zzdzu;
    public static final zzdrh zzdzv;
    public static final zzdrh zzdzw;

    private static ThreadFactory zzff(String str) {
        return new zzbae(str);
    }

    private static zzdrh zza(Executor executor) {
        return new zzbag(executor, null);
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzff("Loader"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        zzdzs = zza(threadPoolExecutor);
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzff("Activeview"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        zzdzt = zza(threadPoolExecutor2);
        zzdzu = new ScheduledThreadPoolExecutor(3, zzff("Schedule"));
        zzdzv = zza(new zzbad());
        zzdzw = zza(zzdrk.zzawr());
    }
}
