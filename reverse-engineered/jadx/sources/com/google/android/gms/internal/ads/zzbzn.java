package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzn implements zzegz<zzbzk> {
    private final zzehm<zzbzx> zzfqt;

    private zzbzn(zzehm<zzbzx> zzehmVar) {
        this.zzfqt = zzehmVar;
    }

    public static zzbzn zzy(zzehm<zzbzx> zzehmVar) {
        return new zzbzn(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbzk(this.zzfqt.get());
    }
}
