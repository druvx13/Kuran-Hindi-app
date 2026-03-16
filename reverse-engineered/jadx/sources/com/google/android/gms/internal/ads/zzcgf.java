package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcgf implements zzegz<zzcgb> {
    private final zzehm<Executor> zzenm;

    public zzcgf(zzehm<Executor> zzehmVar) {
        this.zzenm = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcgb(this.zzenm.get());
    }
}
