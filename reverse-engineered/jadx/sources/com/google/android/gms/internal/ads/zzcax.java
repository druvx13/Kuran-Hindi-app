package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcax implements zzegz<zzcat> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzawt> zzeqm;
    private final zzehm<zzcab> zzeyi;
    private final zzehm<zzcbb> zzeyj;
    private final zzehm<zzbzs> zzeyl;
    private final zzehm<Executor> zzfjj;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<zzbzx> zzfqt;

    private zzcax(zzehm<zzawt> zzehmVar, zzehm<zzdhe> zzehmVar2, zzehm<zzcab> zzehmVar3, zzehm<zzbzx> zzehmVar4, zzehm<zzcbb> zzehmVar5, zzehm<Executor> zzehmVar6, zzehm<Executor> zzehmVar7, zzehm<zzbzs> zzehmVar8) {
        this.zzeqm = zzehmVar;
        this.zzfjq = zzehmVar2;
        this.zzeyi = zzehmVar3;
        this.zzfqt = zzehmVar4;
        this.zzeyj = zzehmVar5;
        this.zzfjj = zzehmVar6;
        this.zzenm = zzehmVar7;
        this.zzeyl = zzehmVar8;
    }

    public static zzcax zza(zzehm<zzawt> zzehmVar, zzehm<zzdhe> zzehmVar2, zzehm<zzcab> zzehmVar3, zzehm<zzbzx> zzehmVar4, zzehm<zzcbb> zzehmVar5, zzehm<Executor> zzehmVar6, zzehm<Executor> zzehmVar7, zzehm<zzbzs> zzehmVar8) {
        return new zzcax(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5, zzehmVar6, zzehmVar7, zzehmVar8);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcat(this.zzeqm.get(), this.zzfjq.get(), this.zzeyi.get(), this.zzfqt.get(), this.zzeyj.get(), this.zzfjj.get(), this.zzenm.get(), this.zzeyl.get());
    }
}
