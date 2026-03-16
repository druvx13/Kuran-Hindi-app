package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzczp implements zzegz<zzczm> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<zzcsz> zzeod;
    private final zzehm<String> zzfic;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<ScheduledExecutorService> zzfvp;
    private final zzehm<zzcsx> zzghp;

    private zzczp(zzehm<zzdrh> zzehmVar, zzehm<ScheduledExecutorService> zzehmVar2, zzehm<String> zzehmVar3, zzehm<zzcsz> zzehmVar4, zzehm<Context> zzehmVar5, zzehm<zzdhe> zzehmVar6, zzehm<zzcsx> zzehmVar7) {
        this.zzenm = zzehmVar;
        this.zzfvp = zzehmVar2;
        this.zzfic = zzehmVar3;
        this.zzeod = zzehmVar4;
        this.zzenp = zzehmVar5;
        this.zzfjq = zzehmVar6;
        this.zzghp = zzehmVar7;
    }

    public static zzczp zza(zzehm<zzdrh> zzehmVar, zzehm<ScheduledExecutorService> zzehmVar2, zzehm<String> zzehmVar3, zzehm<zzcsz> zzehmVar4, zzehm<Context> zzehmVar5, zzehm<zzdhe> zzehmVar6, zzehm<zzcsx> zzehmVar7) {
        return new zzczp(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5, zzehmVar6, zzehmVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzczm(this.zzenm.get(), this.zzfvp.get(), this.zzfic.get(), this.zzeod.get(), this.zzenp.get(), this.zzfjq.get(), this.zzghp.get());
    }
}
