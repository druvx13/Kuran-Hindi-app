package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdc implements zzegz<zzccr> {
    private final zzehm<Executor> zzfjj;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<zzcey> zzfuf;

    public zzcdc(zzehm<zzdhe> zzehmVar, zzehm<Executor> zzehmVar2, zzehm<zzcey> zzehmVar3) {
        this.zzfjq = zzehmVar;
        this.zzfjj = zzehmVar2;
        this.zzfuf = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzccr(this.zzfjq.get(), this.zzfjj.get(), this.zzfuf.get());
    }
}
