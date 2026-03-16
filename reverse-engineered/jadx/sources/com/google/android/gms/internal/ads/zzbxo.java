package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbxo implements zzegz<zzbxp> {
    private final zzehm<zzbsu> zzexm;
    private final zzehm<zzbvp> zzfdt;

    private zzbxo(zzehm<zzbsu> zzehmVar, zzehm<zzbvp> zzehmVar2) {
        this.zzexm = zzehmVar;
        this.zzfdt = zzehmVar2;
    }

    public static zzbxo zzp(zzehm<zzbsu> zzehmVar, zzehm<zzbvp> zzehmVar2) {
        return new zzbxo(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbxp(this.zzexm.get(), this.zzfdt.get());
    }
}
