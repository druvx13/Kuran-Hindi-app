package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzm extends Thread {
    private final zzn zzaa;
    private final zza zzc;
    private final zzaa zzd;
    private volatile boolean zze = false;
    private final BlockingQueue<zzq<?>> zzz;

    public zzm(BlockingQueue<zzq<?>> blockingQueue, zzn zznVar, zza zzaVar, zzaa zzaaVar) {
        this.zzz = blockingQueue;
        this.zzaa = zznVar;
        this.zzc = zzaVar;
        this.zzd = zzaaVar;
    }

    public final void quit() {
        this.zze = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                processRequest();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzag.e("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private final void processRequest() throws InterruptedException {
        zzq<?> take = this.zzz.take();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        take.zza(3);
        try {
            take.zzb("network-queue-take");
            take.isCanceled();
            TrafficStats.setThreadStatsTag(take.zzd());
            zzo zzc = this.zzaa.zzc(take);
            take.zzb("network-http-complete");
            if (zzc.zzac && take.zzl()) {
                take.zzc("not-modified");
                take.zzm();
                return;
            }
            zzz<?> zza = take.zza(zzc);
            take.zzb("network-parse-complete");
            if (take.zzh() && zza.zzbh != null) {
                this.zzc.zza(take.zze(), zza.zzbh);
                take.zzb("network-cache-written");
            }
            take.zzk();
            this.zzd.zzb(take, zza);
            take.zza(zza);
        } catch (Exception e) {
            zzag.zza(e, "Unhandled exception %s", e.toString());
            zzae zzaeVar = new zzae(e);
            zzaeVar.zza(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.zzd.zza(take, zzaeVar);
            take.zzm();
        } catch (zzae e2) {
            e2.zza(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.zzd.zza(take, e2);
            take.zzm();
        } finally {
            take.zza(4);
        }
    }
}
