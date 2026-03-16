package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcys implements zzegz<zzcyl> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<zzawt> zzeqm;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<PackageInfo> zzfmq;

    public zzcys(zzehm<zzdrh> zzehmVar, zzehm<zzdhe> zzehmVar2, zzehm<PackageInfo> zzehmVar3, zzehm<zzawt> zzehmVar4) {
        this.zzenm = zzehmVar;
        this.zzfjq = zzehmVar2;
        this.zzfmq = zzehmVar3;
        this.zzeqm = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcyl(this.zzenm.get(), this.zzfjq.get(), this.zzfmq.get(), this.zzeqm.get());
    }
}
