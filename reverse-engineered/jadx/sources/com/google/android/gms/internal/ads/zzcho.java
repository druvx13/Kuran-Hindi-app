package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcho implements zzegz<zzchp> {
    private final zzehm<zzcie> zzeoi;
    private final zzehm<zzchx> zzeqp;

    private zzcho(zzehm<zzchx> zzehmVar, zzehm<zzcie> zzehmVar2) {
        this.zzeqp = zzehmVar;
        this.zzeoi = zzehmVar2;
    }

    public static zzcho zzac(zzehm<zzchx> zzehmVar, zzehm<zzcie> zzehmVar2) {
        return new zzcho(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzchp(this.zzeqp.get(), this.zzeoi.get());
    }
}
