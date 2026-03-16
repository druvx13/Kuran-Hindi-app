package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdg implements zzegz<zzcdf> {
    private final zzehm<zzbzx> zzfqt;
    private final zzehm<zzbzm> zzfwa;

    private zzcdg(zzehm<zzbzm> zzehmVar, zzehm<zzbzx> zzehmVar2) {
        this.zzfwa = zzehmVar;
        this.zzfqt = zzehmVar2;
    }

    public static zzcdg zzs(zzehm<zzbzm> zzehmVar, zzehm<zzbzx> zzehmVar2) {
        return new zzcdg(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcdf(this.zzfwa.get(), this.zzfqt.get());
    }
}
