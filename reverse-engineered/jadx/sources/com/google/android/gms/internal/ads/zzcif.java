package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcif implements zzegz<zzcid> {
    private final zzehm<Clock> zzfhq;
    private final zzehm<zzchx> zzfzj;
    private final zzehm<Set<zzcic>> zzfzk;

    private zzcif(zzehm<zzchx> zzehmVar, zzehm<Set<zzcic>> zzehmVar2, zzehm<Clock> zzehmVar3) {
        this.zzfzj = zzehmVar;
        this.zzfzk = zzehmVar2;
        this.zzfhq = zzehmVar3;
    }

    public static zzcif zzn(zzehm<zzchx> zzehmVar, zzehm<Set<zzcic>> zzehmVar2, zzehm<Clock> zzehmVar3) {
        return new zzcif(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcid(this.zzfzj.get(), this.zzfzk.get(), this.zzfhq.get());
    }
}
