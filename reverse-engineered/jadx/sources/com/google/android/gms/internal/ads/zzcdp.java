package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdp implements zzegz<zzcdn> {
    private final zzehm<zzcat> zzeym;
    private final zzehm<Context> zzfmf;
    private final zzehm<zzbzx> zzfqt;
    private final zzehm<zzbzm> zzfwa;

    private zzcdp(zzehm<Context> zzehmVar, zzehm<zzbzx> zzehmVar2, zzehm<zzcat> zzehmVar3, zzehm<zzbzm> zzehmVar4) {
        this.zzfmf = zzehmVar;
        this.zzfqt = zzehmVar2;
        this.zzeym = zzehmVar3;
        this.zzfwa = zzehmVar4;
    }

    public static zzcdp zzb(zzehm<Context> zzehmVar, zzehm<zzbzx> zzehmVar2, zzehm<zzcat> zzehmVar3, zzehm<zzbzm> zzehmVar4) {
        return new zzcdp(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcdn(this.zzfmf.get(), this.zzfqt.get(), this.zzeym.get(), this.zzfwa.get());
    }
}
