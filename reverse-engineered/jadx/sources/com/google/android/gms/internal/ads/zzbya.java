package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zztf;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbya implements zzegz<zzbyb> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzazz> zzffv;
    private final zzehm<zztf.zza.EnumC0025zza> zzfic;
    private final zzehm<zzbek> zzfjg;
    private final zzehm<zzdgo> zzfkc;

    private zzbya(zzehm<Context> zzehmVar, zzehm<zzbek> zzehmVar2, zzehm<zzdgo> zzehmVar3, zzehm<zzazz> zzehmVar4, zzehm<zztf.zza.EnumC0025zza> zzehmVar5) {
        this.zzenp = zzehmVar;
        this.zzfjg = zzehmVar2;
        this.zzfkc = zzehmVar3;
        this.zzffv = zzehmVar4;
        this.zzfic = zzehmVar5;
    }

    public static zzbya zzc(zzehm<Context> zzehmVar, zzehm<zzbek> zzehmVar2, zzehm<zzdgo> zzehmVar3, zzehm<zzazz> zzehmVar4, zzehm<zztf.zza.EnumC0025zza> zzehmVar5) {
        return new zzbya(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbyb(this.zzenp.get(), this.zzfjg.get(), this.zzfkc.get(), this.zzffv.get(), this.zzfic.get());
    }
}
