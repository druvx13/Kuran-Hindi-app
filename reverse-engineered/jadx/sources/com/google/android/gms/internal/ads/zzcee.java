package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcee implements zzegz<zzced> {
    private final zzehm<Context> zzenp;
    private final zzehm<Executor> zzfjj;
    private final zzehm<zzazz> zzfnd;
    private final zzehm<zzdt> zzfqu;
    private final zzehm<com.google.android.gms.ads.internal.zza> zzfvn;
    private final zzehm<zzbes> zzfwt;

    public zzcee(zzehm<Context> zzehmVar, zzehm<Executor> zzehmVar2, zzehm<zzdt> zzehmVar3, zzehm<zzazz> zzehmVar4, zzehm<com.google.android.gms.ads.internal.zza> zzehmVar5, zzehm<zzbes> zzehmVar6) {
        this.zzenp = zzehmVar;
        this.zzfjj = zzehmVar2;
        this.zzfqu = zzehmVar3;
        this.zzfnd = zzehmVar4;
        this.zzfvn = zzehmVar5;
        this.zzfwt = zzehmVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzced(this.zzenp.get(), this.zzfjj.get(), this.zzfqu.get(), this.zzfnd.get(), this.zzfvn.get(), this.zzfwt.get());
    }
}
