package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcuv implements zzegz<zzcuh> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<zzdt> zzfgx;
    private final zzehm<zzazz> zzfib;
    private final zzehm<ScheduledExecutorService> zzfvp;
    private final zzehm<zzdhp<zzcdt>> zzgge;
    private final zzehm<zzbgy> zzglb;

    public zzcuv(zzehm<zzbgy> zzehmVar, zzehm<Context> zzehmVar2, zzehm<zzdt> zzehmVar3, zzehm<zzazz> zzehmVar4, zzehm<zzdhp<zzcdt>> zzehmVar5, zzehm<zzdrh> zzehmVar6, zzehm<ScheduledExecutorService> zzehmVar7) {
        this.zzglb = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzfgx = zzehmVar3;
        this.zzfib = zzehmVar4;
        this.zzgge = zzehmVar5;
        this.zzenm = zzehmVar6;
        this.zzfvp = zzehmVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcuh(this.zzglb.get(), this.zzenp.get(), this.zzfgx.get(), this.zzfib.get(), this.zzgge.get(), this.zzenm.get(), this.zzfvp.get());
    }
}
