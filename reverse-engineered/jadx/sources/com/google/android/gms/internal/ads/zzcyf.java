package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcyf implements zzegz<zzcyd> {
    private final zzehm<zzdrh> zzenm;

    private zzcyf(zzehm<zzdrh> zzehmVar) {
        this.zzenm = zzehmVar;
    }

    public static zzcyf zzan(zzehm<zzdrh> zzehmVar) {
        return new zzcyf(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcyd(this.zzenm.get());
    }
}
