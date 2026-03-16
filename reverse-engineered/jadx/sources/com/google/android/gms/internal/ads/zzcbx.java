package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcbx implements zzegz<zzcbv> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzaym> zzeuf;
    private final zzehm<Clock> zzfhq;

    public zzcbx(zzehm<zzaym> zzehmVar, zzehm<Clock> zzehmVar2, zzehm<Executor> zzehmVar3) {
        this.zzeuf = zzehmVar;
        this.zzfhq = zzehmVar2;
        this.zzenm = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcbv(this.zzeuf.get(), this.zzfhq.get(), this.zzenm.get());
    }
}
