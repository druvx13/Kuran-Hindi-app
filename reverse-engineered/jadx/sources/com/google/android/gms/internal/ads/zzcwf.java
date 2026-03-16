package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcwf implements zzegz<zzcwd> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<zzdhe> zzfjq;

    private zzcwf(zzehm<zzdrh> zzehmVar, zzehm<zzdhe> zzehmVar2) {
        this.zzenm = zzehmVar;
        this.zzfjq = zzehmVar2;
    }

    public static zzcwf zzar(zzehm<zzdrh> zzehmVar, zzehm<zzdhe> zzehmVar2) {
        return new zzcwf(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcwd(this.zzenm.get(), this.zzfjq.get());
    }
}
