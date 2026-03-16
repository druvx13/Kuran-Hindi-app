package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbu implements zzegz<zzdbs> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<zzsh> zzeoq;

    public zzdbu(zzehm<zzsh> zzehmVar, zzehm<zzdrh> zzehmVar2, zzehm<Context> zzehmVar3) {
        this.zzeoq = zzehmVar;
        this.zzenm = zzehmVar2;
        this.zzenp = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdbs(this.zzeoq.get(), this.zzenm.get(), this.zzenp.get());
    }
}
