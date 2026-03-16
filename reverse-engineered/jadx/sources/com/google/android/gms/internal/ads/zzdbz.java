package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbz implements zzegz<zzdbx> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<zzavv> zzeoq;
    private final zzehm<String> zzfmo;

    public zzdbz(zzehm<zzavv> zzehmVar, zzehm<zzdrh> zzehmVar2, zzehm<String> zzehmVar3) {
        this.zzeoq = zzehmVar;
        this.zzenm = zzehmVar2;
        this.zzfmo = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdbx(this.zzeoq.get(), this.zzenm.get(), this.zzfmo.get());
    }
}
