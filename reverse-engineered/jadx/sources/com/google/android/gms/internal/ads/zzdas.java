package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdas implements zzegz<zzdaq> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<Context> zzenp;

    public zzdas(zzehm<zzdrh> zzehmVar, zzehm<Context> zzehmVar2) {
        this.zzenm = zzehmVar;
        this.zzenp = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdaq(this.zzenm.get(), this.zzenp.get());
    }
}
