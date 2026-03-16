package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbqj;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcqa implements zzegz<zzcqb> {
    private final zzehm<zzbgy> zzfpu;
    private final zzehm<zzbqj.zza> zzfpv;
    private final zzehm<zzbuj> zzfpw;
    private final zzehm<zzbyl> zzfpx;

    public zzcqa(zzehm<zzbgy> zzehmVar, zzehm<zzbyl> zzehmVar2, zzehm<zzbqj.zza> zzehmVar3, zzehm<zzbuj> zzehmVar4) {
        this.zzfpu = zzehmVar;
        this.zzfpx = zzehmVar2;
        this.zzfpv = zzehmVar3;
        this.zzfpw = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcqb(this.zzfpu.get(), this.zzfpx.get(), this.zzfpv.get(), this.zzfpw.get());
    }
}
