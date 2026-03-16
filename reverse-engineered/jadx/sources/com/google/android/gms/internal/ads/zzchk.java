package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzchk implements zzegz<zzchj> {
    private final zzehm<zzst> zzfyg;
    private final zzehm<Map<zzdkr, zzchl>> zzfyo;

    private zzchk(zzehm<zzst> zzehmVar, zzehm<Map<zzdkr, zzchl>> zzehmVar2) {
        this.zzfyg = zzehmVar;
        this.zzfyo = zzehmVar2;
    }

    public static zzchk zzab(zzehm<zzst> zzehmVar, zzehm<Map<zzdkr, zzchl>> zzehmVar2) {
        return new zzchk(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzchj(this.zzfyg.get(), this.zzfyo.get());
    }
}
