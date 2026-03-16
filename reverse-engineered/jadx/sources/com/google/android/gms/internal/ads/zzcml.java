package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcml implements zzegz<zzbvt<zzbsm>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzcmt> zzfhv;

    private zzcml(zzehm<zzcmt> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzfhv = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    public static zzcml zzao(zzehm<zzcmt> zzehmVar, zzehm<Executor> zzehmVar2) {
        return new zzcml(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfhv.get(), this.zzenm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
