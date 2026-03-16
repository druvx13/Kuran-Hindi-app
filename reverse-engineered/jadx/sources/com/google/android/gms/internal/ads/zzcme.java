package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcme implements zzegz<zzclo> {
    private final zzehm<Context> zzenp;
    private final zzehm<Executor> zzfjj;
    private final zzehm<zzasa> zzgcu;
    private final zzehm<zzbjv> zzgcv;
    private final zzehm<zzarx> zzgcw;
    private final zzehm<HashMap<String, zzcmd>> zzgcx;

    private zzcme(zzehm<Context> zzehmVar, zzehm<Executor> zzehmVar2, zzehm<zzasa> zzehmVar3, zzehm<zzbjv> zzehmVar4, zzehm<zzarx> zzehmVar5, zzehm<HashMap<String, zzcmd>> zzehmVar6) {
        this.zzenp = zzehmVar;
        this.zzfjj = zzehmVar2;
        this.zzgcu = zzehmVar3;
        this.zzgcv = zzehmVar4;
        this.zzgcw = zzehmVar5;
        this.zzgcx = zzehmVar6;
    }

    public static zzcme zzc(zzehm<Context> zzehmVar, zzehm<Executor> zzehmVar2, zzehm<zzasa> zzehmVar3, zzehm<zzbjv> zzehmVar4, zzehm<zzarx> zzehmVar5, zzehm<HashMap<String, zzcmd>> zzehmVar6) {
        return new zzcme(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5, zzehmVar6);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzclo(this.zzenp.get(), this.zzfjj.get(), this.zzgcu.get(), this.zzgcv.get(), this.zzgcw.get(), this.zzgcx.get());
    }
}
