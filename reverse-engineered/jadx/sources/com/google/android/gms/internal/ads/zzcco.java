package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcco implements zzegz<zzcck> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzcca> zzfvh;

    public zzcco(zzehm<Executor> zzehmVar, zzehm<zzcca> zzehmVar2) {
        this.zzenm = zzehmVar;
        this.zzfvh = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcck(this.zzenm.get(), this.zzfvh.get());
    }
}
