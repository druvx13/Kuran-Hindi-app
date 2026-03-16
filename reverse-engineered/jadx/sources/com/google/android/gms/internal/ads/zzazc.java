package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzazc {
    private long zzdyj;
    private long zzdyk = Long.MIN_VALUE;
    private final Object lock = new Object();

    public zzazc(long j) {
        this.zzdyj = j;
    }

    public final boolean tryAcquire() {
        synchronized (this.lock) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzq.zzld().elapsedRealtime();
            if (this.zzdyk + this.zzdyj > elapsedRealtime) {
                return false;
            }
            this.zzdyk = elapsedRealtime;
            return true;
        }
    }

    public final void zzfb(long j) {
        synchronized (this.lock) {
            this.zzdyj = j;
        }
    }
}
