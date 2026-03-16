package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcfn implements zzegz<zzcfa> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzbtw> zzevs;
    private final zzehm<zzbsl> zzewa;
    private final zzehm<zzbrx> zzewo;
    private final zzehm<zzbqw> zzewr;
    private final zzehm<zzbsu> zzexm;
    private final zzehm<zzbkp> zzeze;
    private final zzehm<zzbvs> zzezn;
    private final zzehm<zzbtl> zzfax;
    private final zzehm<zzaun> zzfmd;
    private final zzehm<zzdt> zzfqu;
    private final zzehm<com.google.android.gms.ads.internal.zzc> zzfxk;
    private final zzehm<zzbrr> zzfxl;

    private zzcfn(zzehm<zzbqw> zzehmVar, zzehm<zzbrx> zzehmVar2, zzehm<zzbsl> zzehmVar3, zzehm<zzbsu> zzehmVar4, zzehm<zzbtw> zzehmVar5, zzehm<Executor> zzehmVar6, zzehm<zzbvs> zzehmVar7, zzehm<zzbkp> zzehmVar8, zzehm<com.google.android.gms.ads.internal.zzc> zzehmVar9, zzehm<zzbrr> zzehmVar10, zzehm<zzaun> zzehmVar11, zzehm<zzdt> zzehmVar12, zzehm<zzbtl> zzehmVar13) {
        this.zzewr = zzehmVar;
        this.zzewo = zzehmVar2;
        this.zzewa = zzehmVar3;
        this.zzexm = zzehmVar4;
        this.zzevs = zzehmVar5;
        this.zzenm = zzehmVar6;
        this.zzezn = zzehmVar7;
        this.zzeze = zzehmVar8;
        this.zzfxk = zzehmVar9;
        this.zzfxl = zzehmVar10;
        this.zzfmd = zzehmVar11;
        this.zzfqu = zzehmVar12;
        this.zzfax = zzehmVar13;
    }

    public static zzcfn zza(zzehm<zzbqw> zzehmVar, zzehm<zzbrx> zzehmVar2, zzehm<zzbsl> zzehmVar3, zzehm<zzbsu> zzehmVar4, zzehm<zzbtw> zzehmVar5, zzehm<Executor> zzehmVar6, zzehm<zzbvs> zzehmVar7, zzehm<zzbkp> zzehmVar8, zzehm<com.google.android.gms.ads.internal.zzc> zzehmVar9, zzehm<zzbrr> zzehmVar10, zzehm<zzaun> zzehmVar11, zzehm<zzdt> zzehmVar12, zzehm<zzbtl> zzehmVar13) {
        return new zzcfn(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5, zzehmVar6, zzehmVar7, zzehmVar8, zzehmVar9, zzehmVar10, zzehmVar11, zzehmVar12, zzehmVar13);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcfa(this.zzewr.get(), this.zzewo.get(), this.zzewa.get(), this.zzexm.get(), this.zzevs.get(), this.zzenm.get(), this.zzezn.get(), this.zzeze.get(), this.zzfxk.get(), this.zzfxl.get(), this.zzfmd.get(), this.zzfqu.get(), this.zzfax.get());
    }
}
