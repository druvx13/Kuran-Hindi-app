package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcia implements zzegz<zzchz> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzcie> zzeoi;

    public zzcia(zzehm<zzcie> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzeoi = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzchz(this.zzeoi.get(), this.zzenm.get());
    }
}
