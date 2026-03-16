package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzchm implements zzegz<zzchn> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdhm> zzeph;
    private final zzehm<zzchz> zzepi;
    private final zzehm<zzdgo> zzfgv;
    private final zzehm<zzdha> zzfys;

    private zzchm(zzehm<Context> zzehmVar, zzehm<zzdhm> zzehmVar2, zzehm<zzchz> zzehmVar3, zzehm<zzdha> zzehmVar4, zzehm<zzdgo> zzehmVar5) {
        this.zzenp = zzehmVar;
        this.zzeph = zzehmVar2;
        this.zzepi = zzehmVar3;
        this.zzfys = zzehmVar4;
        this.zzfgv = zzehmVar5;
    }

    public static zzchm zzf(zzehm<Context> zzehmVar, zzehm<zzdhm> zzehmVar2, zzehm<zzchz> zzehmVar3, zzehm<zzdha> zzehmVar4, zzehm<zzdgo> zzehmVar5) {
        return new zzchm(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzchn(this.zzenp.get(), this.zzeph.get(), this.zzepi.get(), this.zzfys.get(), this.zzfgv.get());
    }
}
