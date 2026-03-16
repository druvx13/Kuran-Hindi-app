package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbnk implements zzegz<zzbnl> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzazz> zzffv;
    private final zzehm<zzbek> zzfjg;
    private final zzehm<zzdgo> zzfkc;

    public zzbnk(zzehm<Context> zzehmVar, zzehm<zzbek> zzehmVar2, zzehm<zzdgo> zzehmVar3, zzehm<zzazz> zzehmVar4) {
        this.zzenp = zzehmVar;
        this.zzfjg = zzehmVar2;
        this.zzfkc = zzehmVar3;
        this.zzffv = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbnl(this.zzenp.get(), this.zzfjg.get(), this.zzfkc.get(), this.zzffv.get());
    }
}
