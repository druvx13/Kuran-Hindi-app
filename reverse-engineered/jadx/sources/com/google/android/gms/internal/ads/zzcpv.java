package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcpv implements zzegz<zzcps> {
    private final zzehm<Context> zzenp;
    private final zzehm<Executor> zzfjj;
    private final zzehm<zzbyp> zzges;

    public zzcpv(zzehm<Context> zzehmVar, zzehm<zzbyp> zzehmVar2, zzehm<Executor> zzehmVar3) {
        this.zzenp = zzehmVar;
        this.zzges = zzehmVar2;
        this.zzfjj = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcps(this.zzenp.get(), this.zzges.get(), this.zzfjj.get());
    }
}
