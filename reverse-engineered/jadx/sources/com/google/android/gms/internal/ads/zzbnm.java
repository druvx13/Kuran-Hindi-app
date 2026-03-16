package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbnm implements zzegz<zzbnn> {
    private final zzehm<zzdgo> zzfgv;
    private final zzehm<zzbro> zzfkg;
    private final zzehm<zzbsq> zzfkh;

    private zzbnm(zzehm<zzdgo> zzehmVar, zzehm<zzbro> zzehmVar2, zzehm<zzbsq> zzehmVar3) {
        this.zzfgv = zzehmVar;
        this.zzfkg = zzehmVar2;
        this.zzfkh = zzehmVar3;
    }

    public static zzbnm zzf(zzehm<zzdgo> zzehmVar, zzehm<zzbro> zzehmVar2, zzehm<zzbsq> zzehmVar3) {
        return new zzbnm(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbnn(this.zzfgv.get(), this.zzfkg.get(), this.zzfkh.get());
    }
}
