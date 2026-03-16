package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcob implements zzegz<zzcns> {
    private final zzehm<Context> zzenp;
    private final zzehm<Executor> zzfjj;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<zzcey> zzfuf;
    private final zzehm<zzbmt> zzges;
    private final zzehm<zzdnx<zzdgo, zzaxr>> zzgev;

    public zzcob(zzehm<zzbmt> zzehmVar, zzehm<Context> zzehmVar2, zzehm<Executor> zzehmVar3, zzehm<zzcey> zzehmVar4, zzehm<zzdhe> zzehmVar5, zzehm<zzdnx<zzdgo, zzaxr>> zzehmVar6) {
        this.zzges = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzfjj = zzehmVar3;
        this.zzfuf = zzehmVar4;
        this.zzfjq = zzehmVar5;
        this.zzgev = zzehmVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcns(this.zzges.get(), this.zzenp.get(), this.zzfjj.get(), this.zzfuf.get(), this.zzfjq.get(), this.zzgev.get());
    }
}
