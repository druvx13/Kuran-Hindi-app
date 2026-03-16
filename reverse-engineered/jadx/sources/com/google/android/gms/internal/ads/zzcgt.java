package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcgt implements zzegz<Set<zzbvt<zzdla>>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzchj> zzfhv;

    private zzcgt(zzehm<Executor> zzehmVar, zzehm<zzchj> zzehmVar2) {
        this.zzenm = zzehmVar;
        this.zzfhv = zzehmVar2;
    }

    public static zzcgt zzz(zzehm<Executor> zzehmVar, zzehm<zzchj> zzehmVar2) {
        return new zzcgt(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        Set emptySet;
        Executor executor = this.zzenm.get();
        zzchj zzchjVar = this.zzfhv.get();
        if (((Boolean) zzvj.zzpv().zzd(zzzz.zzcqq)).booleanValue()) {
            emptySet = Collections.singleton(new zzbvt(zzchjVar, executor));
        } else {
            emptySet = Collections.emptySet();
        }
        return (Set) zzehf.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
