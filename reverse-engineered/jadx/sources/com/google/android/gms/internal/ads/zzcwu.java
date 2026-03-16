package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcwu implements zzegz<zzcwq> {
    private final zzehm<Executor> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<ScheduledExecutorService> zzfvp;

    private zzcwu(zzehm<Context> zzehmVar, zzehm<ScheduledExecutorService> zzehmVar2, zzehm<Executor> zzehmVar3) {
        this.zzenp = zzehmVar;
        this.zzfvp = zzehmVar2;
        this.zzenm = zzehmVar3;
    }

    public static zzcwu zzr(zzehm<Context> zzehmVar, zzehm<ScheduledExecutorService> zzehmVar2, zzehm<Executor> zzehmVar3) {
        return new zzcwu(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcwq(this.zzenp.get(), this.zzfvp.get(), this.zzenm.get());
    }
}
