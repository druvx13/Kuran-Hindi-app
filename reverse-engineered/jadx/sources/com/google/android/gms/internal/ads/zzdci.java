package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdci implements zzegz<zzdcg> {
    private final zzehm<zzalc> zzeoq;
    private final zzehm<ScheduledExecutorService> zzfvp;
    private final zzehm<ApplicationInfo> zzgbc;
    private final zzehm<Boolean> zzgpx;

    public zzdci(zzehm<zzalc> zzehmVar, zzehm<ScheduledExecutorService> zzehmVar2, zzehm<Boolean> zzehmVar3, zzehm<ApplicationInfo> zzehmVar4) {
        this.zzeoq = zzehmVar;
        this.zzfvp = zzehmVar2;
        this.zzgpx = zzehmVar3;
        this.zzgbc = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdcg(this.zzeoq.get(), this.zzfvp.get(), this.zzgpx.get().booleanValue(), this.zzgbc.get());
    }
}
