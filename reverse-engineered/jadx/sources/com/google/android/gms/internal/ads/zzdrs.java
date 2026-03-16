package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdrs<V> extends zzdqq<V> {
    @NullableDecl
    private zzdri<V> zzhin;
    @NullableDecl
    private ScheduledFuture<?> zzhio;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <V> zzdri<V> zzb(zzdri<V> zzdriVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzdrs zzdrsVar = new zzdrs(zzdriVar);
        zzdru zzdruVar = new zzdru(zzdrsVar);
        zzdrsVar.zzhio = scheduledExecutorService.schedule(zzdruVar, j, timeUnit);
        zzdriVar.addListener(zzdruVar, zzdqp.INSTANCE);
        return zzdrsVar;
    }

    private zzdrs(zzdri<V> zzdriVar) {
        this.zzhin = (zzdri) zzdoj.checkNotNull(zzdriVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdpw
    public final String pendingToString() {
        zzdri<V> zzdriVar = this.zzhin;
        ScheduledFuture<?> scheduledFuture = this.zzhio;
        if (zzdriVar != null) {
            String valueOf = String.valueOf(zzdriVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("]");
            String sb2 = sb.toString();
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    String valueOf2 = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
                    sb3.append(valueOf2);
                    sb3.append(", remaining delay=[");
                    sb3.append(delay);
                    sb3.append(" ms]");
                    return sb3.toString();
                }
                return sb2;
            }
            return sb2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdpw
    public final void afterDone() {
        maybePropagateCancellationTo(this.zzhin);
        ScheduledFuture<?> scheduledFuture = this.zzhio;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zzhin = null;
        this.zzhio = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ScheduledFuture zza(zzdrs zzdrsVar, ScheduledFuture scheduledFuture) {
        zzdrsVar.zzhio = null;
        return null;
    }
}
