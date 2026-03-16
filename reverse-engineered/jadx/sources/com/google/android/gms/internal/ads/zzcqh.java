package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqj;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqh implements zzegz<zzcqe> {
    private final zzehm<zzbgy> zzfpu;
    private final zzehm<zzbqj.zza> zzfpv;
    private final zzehm<zzbuj> zzfpw;
    private final zzehm<zzcsm> zzggj;

    public zzcqh(zzehm<zzbgy> zzehmVar, zzehm<zzbqj.zza> zzehmVar2, zzehm<zzcsm> zzehmVar3, zzehm<zzbuj> zzehmVar4) {
        this.zzfpu = zzehmVar;
        this.zzfpv = zzehmVar2;
        this.zzggj = zzehmVar3;
        this.zzfpw = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcqe(this.zzfpu.get(), this.zzfpv.get(), this.zzggj.get(), this.zzfpw.get());
    }
}
