package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdkz implements zzegz<zzdku> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<zzdkt> zzerj;
    private final zzehm<ScheduledExecutorService> zzfix;

    private zzdkz(zzehm<zzdrh> zzehmVar, zzehm<ScheduledExecutorService> zzehmVar2, zzehm<zzdkt> zzehmVar3) {
        this.zzenm = zzehmVar;
        this.zzfix = zzehmVar2;
        this.zzerj = zzehmVar3;
    }

    public static zzdkz zzv(zzehm<zzdrh> zzehmVar, zzehm<ScheduledExecutorService> zzehmVar2, zzehm<zzdkt> zzehmVar3) {
        return new zzdkz(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdku(this.zzenm.get(), this.zzfix.get(), this.zzerj.get());
    }
}
