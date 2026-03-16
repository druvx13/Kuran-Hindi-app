package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbni implements zzegz<zzbnd> {
    private final zzehm<zzbnv> zzeyc;
    private final zzehm<Runnable> zzfcj;
    private final zzehm<zzaem> zzfhv;
    private final zzehm<Executor> zzfjj;

    public zzbni(zzehm<zzbnv> zzehmVar, zzehm<zzaem> zzehmVar2, zzehm<Runnable> zzehmVar3, zzehm<Executor> zzehmVar4) {
        this.zzeyc = zzehmVar;
        this.zzfhv = zzehmVar2;
        this.zzfcj = zzehmVar3;
        this.zzfjj = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbnd(this.zzeyc.get(), this.zzfhv.get(), this.zzfcj.get(), this.zzfjj.get());
    }
}
