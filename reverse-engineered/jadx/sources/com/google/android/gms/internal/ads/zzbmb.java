package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbmb implements zzegz<zzblz> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzbvx> zzexe;
    private final zzehm<zzbnv> zzeyc;
    private final zzehm<zzcte> zzfcy;
    private final zzehm<View> zzfgw;
    private final zzehm<zzdgn> zzfjf;
    private final zzehm<zzbek> zzfjg;
    private final zzehm<zzbnt> zzfjh;
    private final zzehm<zzcae> zzfji;
    private final zzehm<Executor> zzfjj;

    public zzbmb(zzehm<zzbnv> zzehmVar, zzehm<Context> zzehmVar2, zzehm<zzdgn> zzehmVar3, zzehm<View> zzehmVar4, zzehm<zzbek> zzehmVar5, zzehm<zzbnt> zzehmVar6, zzehm<zzcae> zzehmVar7, zzehm<zzbvx> zzehmVar8, zzehm<zzcte> zzehmVar9, zzehm<Executor> zzehmVar10) {
        this.zzeyc = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzfjf = zzehmVar3;
        this.zzfgw = zzehmVar4;
        this.zzfjg = zzehmVar5;
        this.zzfjh = zzehmVar6;
        this.zzfji = zzehmVar7;
        this.zzexe = zzehmVar8;
        this.zzfcy = zzehmVar9;
        this.zzfjj = zzehmVar10;
    }

    public static zzblz zza(zzbnv zzbnvVar, Context context, zzdgn zzdgnVar, View view, zzbek zzbekVar, zzbnt zzbntVar, zzcae zzcaeVar, zzbvx zzbvxVar, zzegt<zzcte> zzegtVar, Executor executor) {
        return new zzblz(zzbnvVar, context, zzdgnVar, view, zzbekVar, zzbntVar, zzcaeVar, zzbvxVar, zzegtVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzeyc.get(), this.zzenp.get(), this.zzfjf.get(), this.zzfgw.get(), this.zzfjg.get(), this.zzfjh.get(), this.zzfji.get(), this.zzexe.get(), zzeha.zzas(this.zzfcy), this.zzfjj.get());
    }
}
