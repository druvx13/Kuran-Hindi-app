package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkt implements zzegz<zzbkg> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzpu> zzfhx;
    private final zzehm<zzaku> zzfhy;

    private zzbkt(zzehm<zzpu> zzehmVar, zzehm<zzaku> zzehmVar2, zzehm<Executor> zzehmVar3) {
        this.zzfhx = zzehmVar;
        this.zzfhy = zzehmVar2;
        this.zzenm = zzehmVar3;
    }

    public static zzbkt zzb(zzehm<zzpu> zzehmVar, zzehm<zzaku> zzehmVar2, zzehm<Executor> zzehmVar3) {
        return new zzbkt(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbkg) zzehf.zza(new zzbkg(this.zzfhx.get().zzkt(), this.zzfhy.get(), this.zzenm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
