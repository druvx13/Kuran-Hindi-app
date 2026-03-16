package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdd implements zzegz<zzccw> {
    private final zzehm<Executor> zzfjj;
    private final zzehm<zzbky> zzfug;
    private final zzehm<zzbvs> zzfvx;

    public zzcdd(zzehm<Executor> zzehmVar, zzehm<zzbky> zzehmVar2, zzehm<zzbvs> zzehmVar3) {
        this.zzfjj = zzehmVar;
        this.zzfug = zzehmVar2;
        this.zzfvx = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzccw(this.zzfjj.get(), this.zzfug.get(), this.zzfvx.get());
    }
}
