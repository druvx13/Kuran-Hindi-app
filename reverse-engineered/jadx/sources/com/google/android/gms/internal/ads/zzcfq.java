package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcfq implements zzegz<zzcfr> {
    private final zzehm<zzbek> zzfjg;

    private zzcfq(zzehm<zzbek> zzehmVar) {
        this.zzfjg = zzehmVar;
    }

    public static zzcfq zzaa(zzehm<zzbek> zzehmVar) {
        return new zzcfq(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcfr(this.zzfjg.get());
    }
}
