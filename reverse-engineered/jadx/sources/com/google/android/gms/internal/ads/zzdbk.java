package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbk implements zzegz<zzdbi> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<zzarq> zzeoq;
    private final zzehm<String> zzfmo;

    public zzdbk(zzehm<zzarq> zzehmVar, zzehm<Context> zzehmVar2, zzehm<String> zzehmVar3, zzehm<zzdrh> zzehmVar4) {
        this.zzeoq = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzfmo = zzehmVar3;
        this.zzenm = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdbi(this.zzeoq.get(), this.zzenp.get(), this.zzfmo.get(), this.zzenm.get());
    }
}
