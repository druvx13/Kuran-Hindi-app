package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcfm implements zzegz<zzcey> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzazz> zzffv;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<zzbte> zzfjr;
    private final zzehm<zzdt> zzfqu;
    private final zzehm<zzst> zzfvo;
    private final zzehm<zzbes> zzfwt;
    private final zzehm<com.google.android.gms.ads.internal.zza> zzfxi;
    private final zzehm<zzbwr> zzfxj;

    private zzcfm(zzehm<zzbes> zzehmVar, zzehm<Context> zzehmVar2, zzehm<zzdhe> zzehmVar3, zzehm<zzdt> zzehmVar4, zzehm<zzazz> zzehmVar5, zzehm<com.google.android.gms.ads.internal.zza> zzehmVar6, zzehm<zzst> zzehmVar7, zzehm<zzbte> zzehmVar8, zzehm<zzbwr> zzehmVar9) {
        this.zzfwt = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzfjq = zzehmVar3;
        this.zzfqu = zzehmVar4;
        this.zzffv = zzehmVar5;
        this.zzfxi = zzehmVar6;
        this.zzfvo = zzehmVar7;
        this.zzfjr = zzehmVar8;
        this.zzfxj = zzehmVar9;
    }

    public static zzcfm zza(zzehm<zzbes> zzehmVar, zzehm<Context> zzehmVar2, zzehm<zzdhe> zzehmVar3, zzehm<zzdt> zzehmVar4, zzehm<zzazz> zzehmVar5, zzehm<com.google.android.gms.ads.internal.zza> zzehmVar6, zzehm<zzst> zzehmVar7, zzehm<zzbte> zzehmVar8, zzehm<zzbwr> zzehmVar9) {
        return new zzcfm(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5, zzehmVar6, zzehmVar7, zzehmVar8, zzehmVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcey(this.zzfwt.get(), this.zzenp.get(), this.zzfjq.get(), this.zzfqu.get(), this.zzffv.get(), this.zzfxi.get(), this.zzfvo.get(), this.zzfjr.get(), this.zzfxj.get());
    }
}
