package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkh implements zzegz<zzbke> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdld> zzets;
    private final zzehm<zzdha> zzfgu;
    private final zzehm<zzdgo> zzfgv;
    private final zzehm<View> zzfgw;
    private final zzehm<zzdt> zzfgx;

    private zzbkh(zzehm<Context> zzehmVar, zzehm<zzdha> zzehmVar2, zzehm<zzdgo> zzehmVar3, zzehm<zzdld> zzehmVar4, zzehm<View> zzehmVar5, zzehm<zzdt> zzehmVar6) {
        this.zzenp = zzehmVar;
        this.zzfgu = zzehmVar2;
        this.zzfgv = zzehmVar3;
        this.zzets = zzehmVar4;
        this.zzfgw = zzehmVar5;
        this.zzfgx = zzehmVar6;
    }

    public static zzbkh zza(zzehm<Context> zzehmVar, zzehm<zzdha> zzehmVar2, zzehm<zzdgo> zzehmVar3, zzehm<zzdld> zzehmVar4, zzehm<View> zzehmVar5, zzehm<zzdt> zzehmVar6) {
        return new zzbkh(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5, zzehmVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbke(this.zzenp.get(), this.zzfgu.get(), this.zzfgv.get(), this.zzets.get(), this.zzfgw.get(), this.zzfgx.get());
    }
}
