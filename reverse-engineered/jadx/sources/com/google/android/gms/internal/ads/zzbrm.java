package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbrm implements zzegz<zzbre> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzbri> zzexw;
    private final zzehm<Set<zzbvt<zzbrb>>> zzfjp;

    private zzbrm(zzehm<zzbri> zzehmVar, zzehm<Set<zzbvt<zzbrb>>> zzehmVar2, zzehm<Executor> zzehmVar3) {
        this.zzexw = zzehmVar;
        this.zzfjp = zzehmVar2;
        this.zzenm = zzehmVar3;
    }

    public static zzbrm zzi(zzehm<zzbri> zzehmVar, zzehm<Set<zzbvt<zzbrb>>> zzehmVar2, zzehm<Executor> zzehmVar3) {
        return new zzbrm(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbre(this.zzexw.get(), this.zzfjp.get(), this.zzenm.get());
    }
}
