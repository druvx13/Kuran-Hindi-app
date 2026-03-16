package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcir implements zzegz<Set<zzbvt<zzbsm>>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzcix> zzfyg;
    private final zzcin zzfzt;

    private zzcir(zzcin zzcinVar, zzehm<zzcix> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzfzt = zzcinVar;
        this.zzfyg = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    public static zzcir zzd(zzcin zzcinVar, zzehm<zzcix> zzehmVar, zzehm<Executor> zzehmVar2) {
        return new zzcir(zzcinVar, zzehmVar, zzehmVar2);
    }

    public static Set<zzbvt<zzbsm>> zzb(zzcin zzcinVar, zzcix zzcixVar, Executor executor) {
        return (Set) zzehf.zza(zzcin.zzc(zzcixVar, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzb(this.zzfzt, this.zzfyg.get(), this.zzenm.get());
    }
}
