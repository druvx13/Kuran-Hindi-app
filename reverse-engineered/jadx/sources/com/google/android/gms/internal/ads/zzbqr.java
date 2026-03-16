package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbqr implements zzegz<zzbqs> {
    private final zzehm<zzdgo> zzfkc;
    private final zzehm<String> zzfmz;

    private zzbqr(zzehm<zzdgo> zzehmVar, zzehm<String> zzehmVar2) {
        this.zzfkc = zzehmVar;
        this.zzfmz = zzehmVar2;
    }

    public static zzbqr zzm(zzehm<zzdgo> zzehmVar, zzehm<String> zzehmVar2) {
        return new zzbqr(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbqs(this.zzfkc.get(), this.zzfmz.get());
    }
}
