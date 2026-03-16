package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zztf;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbyg implements zzegz<zzbyh> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzauu> zzffy;
    private final zzehm<View> zzfgw;
    private final zzehm<zztf.zza.EnumC0025zza> zzfic;
    private final zzehm<zzaur> zzfko;

    private zzbyg(zzehm<zzaur> zzehmVar, zzehm<Context> zzehmVar2, zzehm<zzauu> zzehmVar3, zzehm<View> zzehmVar4, zzehm<zztf.zza.EnumC0025zza> zzehmVar5) {
        this.zzfko = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzffy = zzehmVar3;
        this.zzfgw = zzehmVar4;
        this.zzfic = zzehmVar5;
    }

    public static zzbyg zzd(zzehm<zzaur> zzehmVar, zzehm<Context> zzehmVar2, zzehm<zzauu> zzehmVar3, zzehm<View> zzehmVar4, zzehm<zztf.zza.EnumC0025zza> zzehmVar5) {
        return new zzbyg(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbyh(this.zzfko.get(), this.zzenp.get(), this.zzffy.get(), this.zzfgw.get(), this.zzfic.get());
    }
}
