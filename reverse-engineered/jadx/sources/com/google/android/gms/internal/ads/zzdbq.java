package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbq implements zzegz<zzdbm> {
    private final zzehm<Executor> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<zzavz> zzeoq;
    private final zzehm<ScheduledExecutorService> zzfvp;
    private final zzehm<zzawd> zzglv;
    private final zzehm<Integer> zzgpm;

    public zzdbq(zzehm<zzavz> zzehmVar, zzehm<Integer> zzehmVar2, zzehm<Context> zzehmVar3, zzehm<zzawd> zzehmVar4, zzehm<ScheduledExecutorService> zzehmVar5, zzehm<Executor> zzehmVar6) {
        this.zzeoq = zzehmVar;
        this.zzgpm = zzehmVar2;
        this.zzenp = zzehmVar3;
        this.zzglv = zzehmVar4;
        this.zzfvp = zzehmVar5;
        this.zzenm = zzehmVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdbm(this.zzeoq.get(), this.zzgpm.get().intValue(), this.zzenp.get(), this.zzglv.get(), this.zzfvp.get(), this.zzenm.get());
    }
}
