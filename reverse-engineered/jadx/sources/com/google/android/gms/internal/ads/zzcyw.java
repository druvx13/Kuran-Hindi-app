package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcyw implements zzegz<zzcyu> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdrh> zzgln;
    private final zzehm<Set<String>> zzgma;

    private zzcyw(zzehm<zzdrh> zzehmVar, zzehm<Context> zzehmVar2, zzehm<Set<String>> zzehmVar3) {
        this.zzgln = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzgma = zzehmVar3;
    }

    public static zzcyw zzs(zzehm<zzdrh> zzehmVar, zzehm<Context> zzehmVar2, zzehm<Set<String>> zzehmVar3) {
        return new zzcyw(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcyu(this.zzgln.get(), this.zzenp.get(), this.zzgma.get());
    }
}
