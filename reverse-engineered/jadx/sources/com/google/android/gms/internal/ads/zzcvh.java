package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcvh implements zzegz<zzcvf> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<ViewGroup> zzggk;
    private final zzehm<zzdrh> zzgln;

    public zzcvh(zzehm<zzdrh> zzehmVar, zzehm<Context> zzehmVar2, zzehm<zzdhe> zzehmVar3, zzehm<ViewGroup> zzehmVar4) {
        this.zzgln = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzfjq = zzehmVar3;
        this.zzggk = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcvf(this.zzgln.get(), this.zzenp.get(), this.zzfjq.get(), this.zzggk.get());
    }
}
