package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqn implements zzegz<zzcqk> {
    private final zzehm<zzcfu> zzeny;
    private final zzehm<zzdhm> zzeph;
    private final zzehm<zzchz> zzepi;

    private zzcqn(zzehm<zzdhm> zzehmVar, zzehm<zzcfu> zzehmVar2, zzehm<zzchz> zzehmVar3) {
        this.zzeph = zzehmVar;
        this.zzeny = zzehmVar2;
        this.zzepi = zzehmVar3;
    }

    public static zzcqn zzp(zzehm<zzdhm> zzehmVar, zzehm<zzcfu> zzehmVar2, zzehm<zzchz> zzehmVar3) {
        return new zzcqn(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcqk(this.zzeph.get(), this.zzeny.get(), this.zzepi.get());
    }
}
