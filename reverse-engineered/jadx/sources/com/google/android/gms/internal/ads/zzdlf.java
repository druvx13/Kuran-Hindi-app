package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdlf implements zzegz<zzdld> {
    private final zzehm<Executor> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<zzbaa> zzeoh;
    private final zzehm<zzdgz> zzfek;
    private final zzehm<zzdt> zzfgx;
    private final zzehm<Clock> zzfhq;
    private final zzehm<zzazz> zzfib;
    private final zzehm<String> zzgmb;
    private final zzehm<String> zzgml;
    private final zzehm<zzcqi> zzhaq;

    private zzdlf(zzehm<Executor> zzehmVar, zzehm<zzbaa> zzehmVar2, zzehm<zzcqi> zzehmVar3, zzehm<zzazz> zzehmVar4, zzehm<String> zzehmVar5, zzehm<String> zzehmVar6, zzehm<Context> zzehmVar7, zzehm<zzdgz> zzehmVar8, zzehm<Clock> zzehmVar9, zzehm<zzdt> zzehmVar10) {
        this.zzenm = zzehmVar;
        this.zzeoh = zzehmVar2;
        this.zzhaq = zzehmVar3;
        this.zzfib = zzehmVar4;
        this.zzgmb = zzehmVar5;
        this.zzgml = zzehmVar6;
        this.zzenp = zzehmVar7;
        this.zzfek = zzehmVar8;
        this.zzfhq = zzehmVar9;
        this.zzfgx = zzehmVar10;
    }

    public static zzdlf zzb(zzehm<Executor> zzehmVar, zzehm<zzbaa> zzehmVar2, zzehm<zzcqi> zzehmVar3, zzehm<zzazz> zzehmVar4, zzehm<String> zzehmVar5, zzehm<String> zzehmVar6, zzehm<Context> zzehmVar7, zzehm<zzdgz> zzehmVar8, zzehm<Clock> zzehmVar9, zzehm<zzdt> zzehmVar10) {
        return new zzdlf(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5, zzehmVar6, zzehmVar7, zzehmVar8, zzehmVar9, zzehmVar10);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdld(this.zzenm.get(), this.zzeoh.get(), this.zzhaq.get(), this.zzfib.get(), this.zzgmb.get(), this.zzgml.get(), this.zzenp.get(), this.zzfek.get(), this.zzfhq.get(), this.zzfgx.get());
    }
}
