package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbxj implements zzegz<zzbvt<zzbqx>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzbyh> zzfip;
    private final zzbwx zzfpa;

    private zzbxj(zzbwx zzbwxVar, zzehm<zzbyh> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzfpa = zzbwxVar;
        this.zzfip = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    public static zzbxj zzb(zzbwx zzbwxVar, zzehm<zzbyh> zzehmVar, zzehm<Executor> zzehmVar2) {
        return new zzbxj(zzbwxVar, zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfip.get(), this.zzenm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
