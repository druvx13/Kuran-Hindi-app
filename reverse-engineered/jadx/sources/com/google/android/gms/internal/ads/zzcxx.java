package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxx implements zzegz<zzcxv> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<Context> zzenp;

    private zzcxx(zzehm<Context> zzehmVar, zzehm<zzdrh> zzehmVar2) {
        this.zzenp = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    public static zzcxx zzav(zzehm<Context> zzehmVar, zzehm<zzdrh> zzehmVar2) {
        return new zzcxx(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcxv(this.zzenp.get(), this.zzenm.get());
    }
}
