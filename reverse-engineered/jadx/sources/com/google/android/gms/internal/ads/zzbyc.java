package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbyc implements zzegz<zzbyd> {
    private final zzehm<zzbro> zzfpg;
    private final zzehm<zzdgo> zzfph;

    private zzbyc(zzehm<zzbro> zzehmVar, zzehm<zzdgo> zzehmVar2) {
        this.zzfpg = zzehmVar;
        this.zzfph = zzehmVar2;
    }

    public static zzbyc zzq(zzehm<zzbro> zzehmVar, zzehm<zzdgo> zzehmVar2) {
        return new zzbyc(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbyd(this.zzfpg.get(), this.zzfph.get());
    }
}
