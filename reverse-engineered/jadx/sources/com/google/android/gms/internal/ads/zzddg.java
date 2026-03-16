package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzddg implements zzegz<zzdcz> {
    private final zzehm<zzbgy> zzenk;
    private final zzehm<Executor> zzfjj;
    private final zzehm<Context> zzgqo;
    private final zzehm<zzdeu<zzbll, zzblr>> zzgqp;
    private final zzehm<zzddn> zzgqq;
    private final zzehm<zzdhg> zzgqr;

    public zzddg(zzehm<Context> zzehmVar, zzehm<Executor> zzehmVar2, zzehm<zzbgy> zzehmVar3, zzehm<zzdeu<zzbll, zzblr>> zzehmVar4, zzehm<zzddn> zzehmVar5, zzehm<zzdhg> zzehmVar6) {
        this.zzgqo = zzehmVar;
        this.zzfjj = zzehmVar2;
        this.zzenk = zzehmVar3;
        this.zzgqp = zzehmVar4;
        this.zzgqq = zzehmVar5;
        this.zzgqr = zzehmVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdcz(this.zzgqo.get(), this.zzfjj.get(), this.zzenk.get(), this.zzgqp.get(), this.zzgqq.get(), this.zzgqr.get());
    }
}
