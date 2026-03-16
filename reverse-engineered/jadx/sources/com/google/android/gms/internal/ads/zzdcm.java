package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdcm implements zzegz<zzdck> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzapo> zzeoq;
    private final zzehm<ScheduledExecutorService> zzfvp;

    public zzdcm(zzehm<zzapo> zzehmVar, zzehm<ScheduledExecutorService> zzehmVar2, zzehm<Context> zzehmVar3) {
        this.zzeoq = zzehmVar;
        this.zzfvp = zzehmVar2;
        this.zzenp = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdck(this.zzeoq.get(), this.zzfvp.get(), this.zzenp.get());
    }
}
