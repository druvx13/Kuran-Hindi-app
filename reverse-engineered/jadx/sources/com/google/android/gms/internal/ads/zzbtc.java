package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbtc implements zzegz<zzbta> {
    private final zzehm<zzdgo> zzfgv;
    private final zzehm<Set<zzbvt<zzbtb>>> zzfjp;

    private zzbtc(zzehm<Set<zzbvt<zzbtb>>> zzehmVar, zzehm<zzdgo> zzehmVar2) {
        this.zzfjp = zzehmVar;
        this.zzfgv = zzehmVar2;
    }

    public static zzbtc zzn(zzehm<Set<zzbvt<zzbtb>>> zzehmVar, zzehm<zzdgo> zzehmVar2) {
        return new zzbtc(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbta(this.zzfjp.get(), this.zzfgv.get());
    }
}
