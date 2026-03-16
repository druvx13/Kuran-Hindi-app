package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzczx implements zzegz<zzczv> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<zzazz> zzffv;

    private zzczx(zzehm<zzdrh> zzehmVar, zzehm<Context> zzehmVar2, zzehm<zzazz> zzehmVar3) {
        this.zzenm = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzffv = zzehmVar3;
    }

    public static zzczx zzu(zzehm<zzdrh> zzehmVar, zzehm<Context> zzehmVar2, zzehm<zzazz> zzehmVar3) {
        return new zzczx(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzczv(this.zzenm.get(), this.zzenp.get(), this.zzffv.get());
    }
}
