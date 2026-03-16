package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkq implements zzegz<zzbkp> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzaku> zzfhn;
    private final zzehm<zzbkn> zzfho;
    private final zzehm<zzbkg> zzfhp;
    private final zzehm<Clock> zzfhq;

    private zzbkq(zzehm<zzaku> zzehmVar, zzehm<zzbkn> zzehmVar2, zzehm<Executor> zzehmVar3, zzehm<zzbkg> zzehmVar4, zzehm<Clock> zzehmVar5) {
        this.zzfhn = zzehmVar;
        this.zzfho = zzehmVar2;
        this.zzenm = zzehmVar3;
        this.zzfhp = zzehmVar4;
        this.zzfhq = zzehmVar5;
    }

    public static zzbkq zza(zzehm<zzaku> zzehmVar, zzehm<zzbkn> zzehmVar2, zzehm<Executor> zzehmVar3, zzehm<zzbkg> zzehmVar4, zzehm<Clock> zzehmVar5) {
        return new zzbkq(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbkp(this.zzfhn.get(), this.zzfho.get(), this.zzenm.get(), this.zzfhp.get(), this.zzfhq.get());
    }
}
