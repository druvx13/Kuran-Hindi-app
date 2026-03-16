package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdao<T> implements zzegz<zzdaj<T>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<Set<zzdak<? extends zzdah<T>>>> zzgov;

    private zzdao(zzehm<Executor> zzehmVar, zzehm<Set<zzdak<? extends zzdah<T>>>> zzehmVar2) {
        this.zzenm = zzehmVar;
        this.zzgov = zzehmVar2;
    }

    public static <T> zzdao<T> zzbb(zzehm<Executor> zzehmVar, zzehm<Set<zzdak<? extends zzdah<T>>>> zzehmVar2) {
        return new zzdao<>(zzehmVar, zzehmVar2);
    }

    public static <T> zzdaj<T> zza(Executor executor, Set<zzdak<? extends zzdah<T>>> set) {
        return new zzdaj<>(executor, set);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzenm.get(), this.zzgov.get());
    }
}
