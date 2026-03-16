package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbpg implements zzegz<zzbvt<zzbqx>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzbke> zzfip;

    private zzbpg(zzehm<zzbke> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzfip = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    public static zzbpg zzf(zzehm<zzbke> zzehmVar, zzehm<Executor> zzehmVar2) {
        return new zzbpg(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfip.get(), this.zzenm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
