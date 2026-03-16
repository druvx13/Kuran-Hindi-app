package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzccl implements zzegz<zzcca> {
    private final zzehm<Executor> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<zzcbv> zzeug;
    private final zzehm<zzccr> zzeui;
    private final zzehm<zzazz> zzffv;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<zzdt> zzfqu;
    private final zzehm<com.google.android.gms.ads.internal.zza> zzfvn;
    private final zzehm<zzst> zzfvo;
    private final zzehm<ScheduledExecutorService> zzfvp;

    public zzccl(zzehm<Context> zzehmVar, zzehm<zzcbv> zzehmVar2, zzehm<zzdt> zzehmVar3, zzehm<zzazz> zzehmVar4, zzehm<com.google.android.gms.ads.internal.zza> zzehmVar5, zzehm<zzst> zzehmVar6, zzehm<Executor> zzehmVar7, zzehm<zzdhe> zzehmVar8, zzehm<zzccr> zzehmVar9, zzehm<ScheduledExecutorService> zzehmVar10) {
        this.zzenp = zzehmVar;
        this.zzeug = zzehmVar2;
        this.zzfqu = zzehmVar3;
        this.zzffv = zzehmVar4;
        this.zzfvn = zzehmVar5;
        this.zzfvo = zzehmVar6;
        this.zzenm = zzehmVar7;
        this.zzfjq = zzehmVar8;
        this.zzeui = zzehmVar9;
        this.zzfvp = zzehmVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcca(this.zzenp.get(), this.zzeug.get(), this.zzfqu.get(), this.zzffv.get(), this.zzfvn.get(), this.zzfvo.get(), this.zzenm.get(), this.zzfjq.get(), this.zzeui.get(), this.zzfvp.get());
    }
}
