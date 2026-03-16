package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzc extends Thread {
    private static final boolean DEBUG = zzag.DEBUG;
    private final BlockingQueue<zzq<?>> zza;
    private final BlockingQueue<zzq<?>> zzb;
    private final zza zzc;
    private final zzaa zzd;
    private volatile boolean zze = false;
    private final zze zzf = new zze(this);

    public zzc(BlockingQueue<zzq<?>> blockingQueue, BlockingQueue<zzq<?>> blockingQueue2, zza zzaVar, zzaa zzaaVar) {
        this.zza = blockingQueue;
        this.zzb = blockingQueue2;
        this.zzc = zzaVar;
        this.zzd = zzaaVar;
    }

    public final void quit() {
        this.zze = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (DEBUG) {
            zzag.v("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzc.initialize();
        while (true) {
            try {
                processRequest();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzag.e("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private final void processRequest() throws InterruptedException {
        zzq<?> take = this.zza.take();
        take.zzb("cache-queue-take");
        take.zza(1);
        try {
            take.isCanceled();
            zzd zza = this.zzc.zza(take.zze());
            if (zza == null) {
                take.zzb("cache-miss");
                if (!zze.zza(this.zzf, take)) {
                    this.zzb.put(take);
                }
            } else if (zza.zza()) {
                take.zzb("cache-hit-expired");
                take.zza(zza);
                if (!zze.zza(this.zzf, take)) {
                    this.zzb.put(take);
                }
            } else {
                take.zzb("cache-hit");
                zzz<?> zza2 = take.zza(new zzo(zza.data, zza.zzl));
                take.zzb("cache-hit-parsed");
                if (!(zza.zzk < System.currentTimeMillis())) {
                    this.zzd.zzb(take, zza2);
                } else {
                    take.zzb("cache-hit-refresh-needed");
                    take.zza(zza);
                    zza2.zzbj = true;
                    if (!zze.zza(this.zzf, take)) {
                        this.zzd.zza(take, zza2, new zzf(this, take));
                    } else {
                        this.zzd.zzb(take, zza2);
                    }
                }
            }
        } finally {
            take.zza(2);
        }
    }
}
