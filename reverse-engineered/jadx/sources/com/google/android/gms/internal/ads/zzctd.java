package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzctd implements zzegz<zzcsz> {
    private final zzehm<Executor> zzenm;

    public zzctd(zzehm<Executor> zzehmVar) {
        this.zzenm = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcsz(this.zzenm.get());
    }
}
