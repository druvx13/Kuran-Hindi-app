package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqs implements zzegz<zzcqq> {
    private final zzehm<Context> zzenp;
    private final zzehm<Executor> zzfjj;
    private final zzehm<zzceo> zzges;

    public zzcqs(zzehm<Context> zzehmVar, zzehm<Executor> zzehmVar2, zzehm<zzceo> zzehmVar3) {
        this.zzenp = zzehmVar;
        this.zzfjj = zzehmVar2;
        this.zzges = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcqq(this.zzenp.get(), this.zzfjj.get(), this.zzges.get());
    }
}
