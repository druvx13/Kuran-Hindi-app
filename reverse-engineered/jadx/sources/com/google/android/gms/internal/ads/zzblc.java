package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzblc implements zzqq {
    private final Clock zzbnt;
    private final ScheduledExecutorService zzfif;
    private ScheduledFuture<?> zzfig;
    private long zzfih = -1;
    private long zzfii = -1;
    private Runnable zzdva = null;
    private boolean zzfij = false;

    public zzblc(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.zzfif = scheduledExecutorService;
        this.zzbnt = clock;
        com.google.android.gms.ads.internal.zzq.zzkz().zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzqq
    public final void zzp(boolean z) {
        if (z) {
            zzagr();
        } else {
            zzagq();
        }
    }

    public final synchronized void zza(int i, Runnable runnable) {
        this.zzdva = runnable;
        long j = i;
        this.zzfih = this.zzbnt.elapsedRealtime() + j;
        this.zzfig = this.zzfif.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    private final synchronized void zzagq() {
        if (!this.zzfij) {
            if (this.zzfig != null && !this.zzfig.isDone()) {
                this.zzfig.cancel(true);
                this.zzfii = this.zzfih - this.zzbnt.elapsedRealtime();
            } else {
                this.zzfii = -1L;
            }
            this.zzfij = true;
        }
    }

    private final synchronized void zzagr() {
        if (this.zzfij) {
            if (this.zzfii > 0 && this.zzfig != null && this.zzfig.isCancelled()) {
                this.zzfig = this.zzfif.schedule(this.zzdva, this.zzfii, TimeUnit.MILLISECONDS);
            }
            this.zzfij = false;
        }
    }
}
