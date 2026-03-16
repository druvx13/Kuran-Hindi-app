package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbte extends zzbui<zzbti> {
    private final Clock zzbnt;
    private boolean zzfhr;
    private final ScheduledExecutorService zzfif;
    private long zzfih;
    private long zzfii;
    private ScheduledFuture<?> zzfnn;

    public zzbte(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.zzfih = -1L;
        this.zzfii = -1L;
        this.zzfhr = false;
        this.zzfif = scheduledExecutorService;
        this.zzbnt = clock;
    }

    public final synchronized void onPause() {
        if (!this.zzfhr) {
            if (this.zzfnn != null && !this.zzfnn.isCancelled()) {
                this.zzfnn.cancel(true);
                this.zzfii = this.zzfih - this.zzbnt.elapsedRealtime();
            } else {
                this.zzfii = -1L;
            }
            this.zzfhr = true;
        }
    }

    public final synchronized void onResume() {
        if (this.zzfhr) {
            if (this.zzfii > 0 && this.zzfnn.isCancelled()) {
                zzfe(this.zzfii);
            }
            this.zzfhr = false;
        }
    }

    public final synchronized void zzaiv() {
        this.zzfhr = false;
        zzfe(0L);
    }

    public final synchronized void zzdp(int i) {
        if (i <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i);
        if (this.zzfhr) {
            if (this.zzfii <= 0 || millis >= this.zzfii) {
                millis = this.zzfii;
            }
            this.zzfii = millis;
            return;
        }
        if (this.zzbnt.elapsedRealtime() > this.zzfih || this.zzfih - this.zzbnt.elapsedRealtime() > millis) {
            zzfe(millis);
        }
    }

    private final synchronized void zzfe(long j) {
        if (this.zzfnn != null && !this.zzfnn.isDone()) {
            this.zzfnn.cancel(true);
        }
        this.zzfih = this.zzbnt.elapsedRealtime() + j;
        this.zzfnn = this.zzfif.schedule(new zzbtf(this), j, TimeUnit.MILLISECONDS);
    }

    public final void zzaiw() {
        zza(zzbtd.zzfnf);
    }
}
