package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcpa implements zzegz<zzcov> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzazz> zzfib;
    private final zzehm<Executor> zzfjj;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<zzcey> zzfuf;
    private final zzehm<zzbxr> zzges;

    public zzcpa(zzehm<Context> zzehmVar, zzehm<zzazz> zzehmVar2, zzehm<zzdhe> zzehmVar3, zzehm<Executor> zzehmVar4, zzehm<zzbxr> zzehmVar5, zzehm<zzcey> zzehmVar6) {
        this.zzenp = zzehmVar;
        this.zzfib = zzehmVar2;
        this.zzfjq = zzehmVar3;
        this.zzfjj = zzehmVar4;
        this.zzges = zzehmVar5;
        this.zzfuf = zzehmVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcov(this.zzenp.get(), this.zzfib.get(), this.zzfjq.get(), this.zzfjj.get(), this.zzges.get(), this.zzfuf.get());
    }
}
