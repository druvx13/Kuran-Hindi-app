package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxq implements zzegz<zzcxm> {
    private final zzehm<zzalc> zzeoq;
    private final zzehm<zzawt> zzeqm;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<ScheduledExecutorService> zzfvp;
    private final zzehm<ApplicationInfo> zzgbc;

    private zzcxq(zzehm<zzalc> zzehmVar, zzehm<ScheduledExecutorService> zzehmVar2, zzehm<zzawt> zzehmVar3, zzehm<ApplicationInfo> zzehmVar4, zzehm<zzdhe> zzehmVar5) {
        this.zzeoq = zzehmVar;
        this.zzfvp = zzehmVar2;
        this.zzeqm = zzehmVar3;
        this.zzgbc = zzehmVar4;
        this.zzfjq = zzehmVar5;
    }

    public static zzcxq zzh(zzehm<zzalc> zzehmVar, zzehm<ScheduledExecutorService> zzehmVar2, zzehm<zzawt> zzehmVar3, zzehm<ApplicationInfo> zzehmVar4, zzehm<zzdhe> zzehmVar5) {
        return new zzcxq(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcxm(this.zzeoq.get(), this.zzfvp.get(), this.zzeqm.get(), this.zzgbc.get(), this.zzfjq.get());
    }
}
