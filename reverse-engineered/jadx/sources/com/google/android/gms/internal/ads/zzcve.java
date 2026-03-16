package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcve implements zzegz<zzcvc> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzckv> zzglj;

    public zzcve(zzehm<Executor> zzehmVar, zzehm<zzckv> zzehmVar2) {
        this.zzenm = zzehmVar;
        this.zzglj = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcvc(this.zzenm.get(), this.zzglj.get());
    }
}
