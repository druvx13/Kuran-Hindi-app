package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzl implements zzegz<zzbky> {
    private final zzehm<Executor> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<Clock> zzfhq;
    private final zzehm<zzpu> zzfqz;

    public zzbzl(zzehm<zzpu> zzehmVar, zzehm<Executor> zzehmVar2, zzehm<Context> zzehmVar3, zzehm<Clock> zzehmVar4) {
        this.zzfqz = zzehmVar;
        this.zzenm = zzehmVar2;
        this.zzenp = zzehmVar3;
        this.zzfhq = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbky) zzehf.zza(new zzbky(this.zzenm.get(), new zzbkn(this.zzenp.get(), this.zzfqz.get()), this.zzfhq.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
