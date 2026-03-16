package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcnd implements zzegz<zzcmy> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzcmv> zzeqw;
    private final zzehm<zzcmp> zzetl;
    private final zzehm<zzbqc> zzgee;

    private zzcnd(zzehm<Context> zzehmVar, zzehm<zzbqc> zzehmVar2, zzehm<zzcmv> zzehmVar3, zzehm<zzcmp> zzehmVar4) {
        this.zzenp = zzehmVar;
        this.zzgee = zzehmVar2;
        this.zzeqw = zzehmVar3;
        this.zzetl = zzehmVar4;
    }

    public static zzcnd zzc(zzehm<Context> zzehmVar, zzehm<zzbqc> zzehmVar2, zzehm<zzcmv> zzehmVar3, zzehm<zzcmp> zzehmVar4) {
        return new zzcnd(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcmy(this.zzenp.get(), this.zzgee.get(), this.zzeqw.get(), this.zzetl.get());
    }
}
