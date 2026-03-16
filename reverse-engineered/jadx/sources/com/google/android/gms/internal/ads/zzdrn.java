package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzdrn<V> extends zzdqu<V> implements zzdri<V>, ScheduledFuture<V> {
    private final ScheduledFuture<?> zzhik;

    public zzdrn(zzdri<V> zzdriVar, ScheduledFuture<?> scheduledFuture) {
        super(zzdriVar);
        this.zzhik = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzdqs, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = super.cancel(z);
        if (cancel) {
            this.zzhik.cancel(z);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zzhik.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return this.zzhik.compareTo(delayed);
    }
}
