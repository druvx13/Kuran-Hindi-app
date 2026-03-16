package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcmk implements zzegz<zzbvt<zzdla>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzcmw> zzfhv;

    private zzcmk(zzehm<zzcmw> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzfhv = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    public static zzcmk zzan(zzehm<zzcmw> zzehmVar, zzehm<Executor> zzehmVar2) {
        return new zzcmk(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfhv.get(), this.zzenm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
