package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbyi implements zzegz<zzbyj> {
    private final zzehm<zzcae> zzfji;
    private final zzehm<Map<String, zzcnj<zzbny>>> zzfkw;
    private final zzehm<Map<String, zzcnj<zzbzm>>> zzfpm;
    private final zzehm<Map<String, zzcpk<zzbzm>>> zzfpn;
    private final zzehm<zzbnx<zzblx>> zzfpo;

    public zzbyi(zzehm<Map<String, zzcnj<zzbny>>> zzehmVar, zzehm<Map<String, zzcnj<zzbzm>>> zzehmVar2, zzehm<Map<String, zzcpk<zzbzm>>> zzehmVar3, zzehm<zzbnx<zzblx>> zzehmVar4, zzehm<zzcae> zzehmVar5) {
        this.zzfkw = zzehmVar;
        this.zzfpm = zzehmVar2;
        this.zzfpn = zzehmVar3;
        this.zzfpo = zzehmVar4;
        this.zzfji = zzehmVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbyj(this.zzfkw.get(), this.zzfpm.get(), this.zzfpn.get(), this.zzfpo, this.zzfji.get());
    }
}
