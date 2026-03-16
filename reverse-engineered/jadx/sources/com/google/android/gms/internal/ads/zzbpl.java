package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbpl implements zzegz<zzbnv> {
    private final zzehm<zzbrr> zzewi;
    private final zzehm<zzbsh> zzexi;
    private final zzehm<zzdha> zzfgu;
    private final zzehm<zzdgo> zzfkc;
    private final zzehm<zzder> zzfma;
    private final zzehm<zzbqs> zzfmb;

    private zzbpl(zzehm<zzdha> zzehmVar, zzehm<zzdgo> zzehmVar2, zzehm<zzbrr> zzehmVar3, zzehm<zzbsh> zzehmVar4, zzehm<zzder> zzehmVar5, zzehm<zzbqs> zzehmVar6) {
        this.zzfgu = zzehmVar;
        this.zzfkc = zzehmVar2;
        this.zzewi = zzehmVar3;
        this.zzexi = zzehmVar4;
        this.zzfma = zzehmVar5;
        this.zzfmb = zzehmVar6;
    }

    public static zzbpl zzb(zzehm<zzdha> zzehmVar, zzehm<zzdgo> zzehmVar2, zzehm<zzbrr> zzehmVar3, zzehm<zzbsh> zzehmVar4, zzehm<zzder> zzehmVar5, zzehm<zzbqs> zzehmVar6) {
        return new zzbpl(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5, zzehmVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbnv(this.zzfgu.get(), this.zzfkc.get(), this.zzewi.get(), this.zzexi.get(), this.zzfma.get(), this.zzfmb.get());
    }
}
