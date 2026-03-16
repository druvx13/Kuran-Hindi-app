package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcvt implements zzegz<zzcvr> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzcxg<zzdan>> zzeoz;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<zzawd> zzglv;

    private zzcvt(zzehm<zzcxg<zzdan>> zzehmVar, zzehm<zzdhe> zzehmVar2, zzehm<Context> zzehmVar3, zzehm<zzawd> zzehmVar4) {
        this.zzeoz = zzehmVar;
        this.zzfjq = zzehmVar2;
        this.zzenp = zzehmVar3;
        this.zzglv = zzehmVar4;
    }

    public static zzcvt zze(zzehm<zzcxg<zzdan>> zzehmVar, zzehm<zzdhe> zzehmVar2, zzehm<Context> zzehmVar3, zzehm<zzawd> zzehmVar4) {
        return new zzcvt(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcvr(this.zzeoz.get(), this.zzfjq.get(), this.zzenp.get(), this.zzglv.get());
    }
}
