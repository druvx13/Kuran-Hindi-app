package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcyj implements zzegz<zzcyh> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<zzdgm> zzgfg;

    private zzcyj(zzehm<zzdrh> zzehmVar, zzehm<zzdgm> zzehmVar2) {
        this.zzenm = zzehmVar;
        this.zzgfg = zzehmVar2;
    }

    public static zzcyj zzaw(zzehm<zzdrh> zzehmVar, zzehm<zzdgm> zzehmVar2) {
        return new zzcyj(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcyh(this.zzenm.get(), this.zzgfg.get());
    }
}
