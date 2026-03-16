package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcyb implements zzegz<zzcxz> {
    private final zzehm<zzdrh> zzenm;

    private zzcyb(zzehm<zzdrh> zzehmVar) {
        this.zzenm = zzehmVar;
    }

    public static zzcyb zzam(zzehm<zzdrh> zzehmVar) {
        return new zzcyb(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcxz(this.zzenm.get());
    }
}
