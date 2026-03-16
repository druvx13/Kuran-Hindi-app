package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbqd implements zzegz<zzbqa> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdgo> zzfkc;
    private final zzehm<zzapn> zzfmm;

    private zzbqd(zzehm<Context> zzehmVar, zzehm<zzdgo> zzehmVar2, zzehm<zzapn> zzehmVar3) {
        this.zzenp = zzehmVar;
        this.zzfkc = zzehmVar2;
        this.zzfmm = zzehmVar3;
    }

    public static zzbqd zzh(zzehm<Context> zzehmVar, zzehm<zzdgo> zzehmVar2, zzehm<zzapn> zzehmVar3) {
        return new zzbqd(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbqa(this.zzenp.get(), this.zzfkc.get(), this.zzfmm.get());
    }
}
