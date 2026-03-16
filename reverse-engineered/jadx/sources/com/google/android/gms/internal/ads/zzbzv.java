package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzv implements zzegz<zzbzs> {
    private final zzehm<zzbzk> zzfrx;

    private zzbzv(zzehm<zzbzk> zzehmVar) {
        this.zzfrx = zzehmVar;
    }

    public static zzbzv zzz(zzehm<zzbzk> zzehmVar) {
        return new zzbzv(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbzs(this.zzfrx.get());
    }
}
