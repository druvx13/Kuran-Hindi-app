package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzciu implements zzegz<Set<zzbvt<zzdla>>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzcix> zzfyg;
    private final zzcin zzfzt;

    private zzciu(zzcin zzcinVar, zzehm<zzcix> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzfzt = zzcinVar;
        this.zzfyg = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    public static zzciu zzg(zzcin zzcinVar, zzehm<zzcix> zzehmVar, zzehm<Executor> zzehmVar2) {
        return new zzciu(zzcinVar, zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(zzcin.zzh(this.zzfyg.get(), this.zzenm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
