package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcpt implements zzegz<zzcpn> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<zzcbw> zzeul;
    private final zzehm<zzbyp> zzges;
    private final zzehm<zzdhp<zzcdt>> zzgge;

    public zzcpt(zzehm<zzbyp> zzehmVar, zzehm<zzdrh> zzehmVar2, zzehm<zzcbw> zzehmVar3, zzehm<zzdhp<zzcdt>> zzehmVar4) {
        this.zzges = zzehmVar;
        this.zzenm = zzehmVar2;
        this.zzeul = zzehmVar3;
        this.zzgge = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcpn(this.zzges.get(), this.zzenm.get(), this.zzeul.get(), this.zzgge.get());
    }
}
