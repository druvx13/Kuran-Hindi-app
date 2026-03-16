package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcjl implements zzegz<zzciz> {
    private final zzehm<zzcfz> zzenj;
    private final zzehm<Executor> zzenm;
    private final zzehm<zzcij> zzeoj;
    private final zzehm<zzazz> zzfib;
    private final zzehm<Executor> zzfjj;
    private final zzehm<ScheduledExecutorService> zzfvp;
    private final zzehm<Context> zzgar;
    private final zzehm<WeakReference<Context>> zzgas;

    public zzcjl(zzehm<Executor> zzehmVar, zzehm<Context> zzehmVar2, zzehm<WeakReference<Context>> zzehmVar3, zzehm<Executor> zzehmVar4, zzehm<zzcfz> zzehmVar5, zzehm<ScheduledExecutorService> zzehmVar6, zzehm<zzcij> zzehmVar7, zzehm<zzazz> zzehmVar8) {
        this.zzfjj = zzehmVar;
        this.zzgar = zzehmVar2;
        this.zzgas = zzehmVar3;
        this.zzenm = zzehmVar4;
        this.zzenj = zzehmVar5;
        this.zzfvp = zzehmVar6;
        this.zzeoj = zzehmVar7;
        this.zzfib = zzehmVar8;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzciz(this.zzfjj.get(), this.zzgar.get(), this.zzgas.get(), this.zzenm.get(), this.zzenj.get(), this.zzfvp.get(), this.zzeoj.get(), this.zzfib.get());
    }
}
