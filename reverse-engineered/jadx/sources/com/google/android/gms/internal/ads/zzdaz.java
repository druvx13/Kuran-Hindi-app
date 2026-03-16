package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdaz implements zzegz<zzday> {
    private final zzehm<Executor> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<zzavz> zzeoq;
    private final zzehm<ScheduledExecutorService> zzfvp;

    public zzdaz(zzehm<zzavz> zzehmVar, zzehm<Context> zzehmVar2, zzehm<ScheduledExecutorService> zzehmVar3, zzehm<Executor> zzehmVar4) {
        this.zzeoq = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzfvp = zzehmVar3;
        this.zzenm = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzday(this.zzeoq.get(), this.zzenp.get(), this.zzfvp.get(), this.zzenm.get());
    }
}
