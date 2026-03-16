package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbwa implements zzegz<zzbwb> {
    private final zzehm<zzdld> zzets;
    private final zzehm<zzdgo> zzfgv;

    private zzbwa(zzehm<zzdgo> zzehmVar, zzehm<zzdld> zzehmVar2) {
        this.zzfgv = zzehmVar;
        this.zzets = zzehmVar2;
    }

    public static zzbwa zzo(zzehm<zzdgo> zzehmVar, zzehm<zzdld> zzehmVar2) {
        return new zzbwa(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbwb(this.zzfgv.get(), this.zzets.get());
    }
}
