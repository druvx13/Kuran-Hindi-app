package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcit implements zzegz<Set<zzbvt<AppEventListener>>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzcix> zzfyg;
    private final zzcin zzfzt;

    private zzcit(zzcin zzcinVar, zzehm<zzcix> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzfzt = zzcinVar;
        this.zzfyg = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    public static zzcit zzf(zzcin zzcinVar, zzehm<zzcix> zzehmVar, zzehm<Executor> zzehmVar2) {
        return new zzcit(zzcinVar, zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(zzcin.zzb(this.zzfyg.get(), this.zzenm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
