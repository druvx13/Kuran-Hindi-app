package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcsn<AdT> implements zzegz<zzcsj<AdT>> {
    private final zzehm<zzdrh> zzfjj;
    private final zzehm<zzdku> zzfju;
    private final zzehm<zzaas> zzgie;
    private final zzehm<zzcsk<AdT>> zzgil;

    public zzcsn(zzehm<zzdku> zzehmVar, zzehm<zzdrh> zzehmVar2, zzehm<zzaas> zzehmVar3, zzehm<zzcsk<AdT>> zzehmVar4) {
        this.zzfju = zzehmVar;
        this.zzfjj = zzehmVar2;
        this.zzgie = zzehmVar3;
        this.zzgil = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcsj(this.zzfju.get(), this.zzfjj.get(), this.zzgie.get(), this.zzgil.get());
    }
}
