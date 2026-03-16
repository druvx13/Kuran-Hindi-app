package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzddm implements zzegz<zzddf> {
    private final zzehm<zzbgy> zzenk;
    private final zzehm<Context> zzenp;
    private final zzehm<zzazz> zzfib;
    private final zzehm<String> zzgqu;
    private final zzehm<zzdcz> zzgqv;
    private final zzehm<zzddn> zzgqw;

    public zzddm(zzehm<zzbgy> zzehmVar, zzehm<Context> zzehmVar2, zzehm<String> zzehmVar3, zzehm<zzdcz> zzehmVar4, zzehm<zzddn> zzehmVar5, zzehm<zzazz> zzehmVar6) {
        this.zzenk = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzgqu = zzehmVar3;
        this.zzgqv = zzehmVar4;
        this.zzgqw = zzehmVar5;
        this.zzfib = zzehmVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzddf(this.zzenk.get(), this.zzenp.get(), this.zzgqu.get(), this.zzgqv.get(), this.zzgqw.get(), this.zzfib.get());
    }
}
