package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcoq implements zzegz<zzcom> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<zzbmt> zzfbp;
    private final zzehm<zzcns> zzfbt;
    private final zzehm<ScheduledExecutorService> zzfvp;
    private final zzehm<zzbra> zzgfi;

    public zzcoq(zzehm<zzbmt> zzehmVar, zzehm<zzcns> zzehmVar2, zzehm<zzbra> zzehmVar3, zzehm<ScheduledExecutorService> zzehmVar4, zzehm<zzdrh> zzehmVar5) {
        this.zzfbp = zzehmVar;
        this.zzfbt = zzehmVar2;
        this.zzgfi = zzehmVar3;
        this.zzfvp = zzehmVar4;
        this.zzenm = zzehmVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcom(this.zzfbp.get(), this.zzfbt.get(), this.zzgfi.get(), this.zzfvp.get(), this.zzenm.get());
    }
}
