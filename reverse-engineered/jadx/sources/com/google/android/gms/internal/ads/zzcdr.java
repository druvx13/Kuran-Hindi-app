package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdr implements zzegz<zzcdo> {
    private final zzehm<String> zzfmz;
    private final zzehm<zzbzx> zzfqt;
    private final zzehm<zzbzm> zzfwa;

    private zzcdr(zzehm<String> zzehmVar, zzehm<zzbzm> zzehmVar2, zzehm<zzbzx> zzehmVar3) {
        this.zzfmz = zzehmVar;
        this.zzfwa = zzehmVar2;
        this.zzfqt = zzehmVar3;
    }

    public static zzcdr zzm(zzehm<String> zzehmVar, zzehm<zzbzm> zzehmVar2, zzehm<zzbzx> zzehmVar3) {
        return new zzcdr(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcdo(this.zzfmz.get(), this.zzfwa.get(), this.zzfqt.get());
    }
}
