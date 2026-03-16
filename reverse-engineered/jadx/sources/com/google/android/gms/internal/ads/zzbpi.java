package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbpi implements zzegz<zzbvt<zzbsm>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzbke> zzfip;

    private zzbpi(zzehm<zzbke> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzfip = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    public static zzbpi zzh(zzehm<zzbke> zzehmVar, zzehm<Executor> zzehmVar2) {
        return new zzbpi(zzehmVar, zzehmVar2);
    }

    public static zzbvt<zzbsm> zza(zzbke zzbkeVar, Executor executor) {
        return (zzbvt) zzehf.zza(new zzbvt(zzbkeVar, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzfip.get(), this.zzenm.get());
    }
}
