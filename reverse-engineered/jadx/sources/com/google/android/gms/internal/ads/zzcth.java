package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcth implements zzegz<zzcte> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<zzvm> zzgjc;
    private final zzehm<zzblx> zzgjd;

    public zzcth(zzehm<Context> zzehmVar, zzehm<zzvm> zzehmVar2, zzehm<zzdhe> zzehmVar3, zzehm<zzblx> zzehmVar4) {
        this.zzenp = zzehmVar;
        this.zzgjc = zzehmVar2;
        this.zzfjq = zzehmVar3;
        this.zzgjd = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcte(this.zzenp.get(), this.zzgjc.get(), this.zzfjq.get(), this.zzgjd.get());
    }
}
