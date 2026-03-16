package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbvu implements zzegz<zzbvs> {
    private final zzehm<Context> zzenp;
    private final zzehm<Set<zzbvt<zzpz>>> zzfjp;
    private final zzehm<zzdgo> zzfkc;

    private zzbvu(zzehm<Context> zzehmVar, zzehm<Set<zzbvt<zzpz>>> zzehmVar2, zzehm<zzdgo> zzehmVar3) {
        this.zzenp = zzehmVar;
        this.zzfjp = zzehmVar2;
        this.zzfkc = zzehmVar3;
    }

    public static zzbvu zzj(zzehm<Context> zzehmVar, zzehm<Set<zzbvt<zzpz>>> zzehmVar2, zzehm<zzdgo> zzehmVar3) {
        return new zzbvu(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbvs(this.zzenp.get(), this.zzfjp.get(), this.zzfkc.get());
    }
}
