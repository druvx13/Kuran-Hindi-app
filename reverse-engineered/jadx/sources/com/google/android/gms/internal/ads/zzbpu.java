package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbpu implements zzegz<zzbpv> {
    private final zzehm<zzciz> zzeok;
    private final zzehm<zzawt> zzeqm;
    private final zzehm<zzazz> zzfib;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<Context> zzfmf;

    private zzbpu(zzehm<Context> zzehmVar, zzehm<zzdhe> zzehmVar2, zzehm<zzazz> zzehmVar3, zzehm<zzawt> zzehmVar4, zzehm<zzciz> zzehmVar5) {
        this.zzfmf = zzehmVar;
        this.zzfjq = zzehmVar2;
        this.zzfib = zzehmVar3;
        this.zzeqm = zzehmVar4;
        this.zzeok = zzehmVar5;
    }

    public static zzbpu zzb(zzehm<Context> zzehmVar, zzehm<zzdhe> zzehmVar2, zzehm<zzazz> zzehmVar3, zzehm<zzawt> zzehmVar4, zzehm<zzciz> zzehmVar5) {
        return new zzbpu(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbpv(this.zzfmf.get(), this.zzfjq.get(), this.zzfib.get(), this.zzeqm.get(), this.zzeok.get());
    }
}
