package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcmi implements zzegz<zzbvt<zzbrc>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzcmt> zzfhv;

    private zzcmi(zzehm<zzcmt> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzfhv = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    public static zzcmi zzam(zzehm<zzcmt> zzehmVar, zzehm<Executor> zzehmVar2) {
        return new zzcmi(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfhv.get(), this.zzenm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
