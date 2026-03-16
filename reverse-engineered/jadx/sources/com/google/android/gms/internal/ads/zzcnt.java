package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcnt implements zzegz<zzcnp> {
    private final zzehm<Context> zzenp;
    private final zzehm<Executor> zzfjj;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<zzcey> zzfuf;
    private final zzehm<zzbll> zzges;

    public zzcnt(zzehm<zzbll> zzehmVar, zzehm<Context> zzehmVar2, zzehm<Executor> zzehmVar3, zzehm<zzcey> zzehmVar4, zzehm<zzdhe> zzehmVar5) {
        this.zzges = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzfjj = zzehmVar3;
        this.zzfuf = zzehmVar4;
        this.zzfjq = zzehmVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcnp(this.zzges.get(), this.zzenp.get(), this.zzfjj.get(), this.zzfuf.get(), this.zzfjq.get());
    }
}
