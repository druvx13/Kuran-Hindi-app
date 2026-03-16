package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbmf implements zzegz<zzbsh> {
    private final zzbma zzfjo;
    private final zzehm<Set<zzbvt<zzbsm>>> zzfjp;

    public zzbmf(zzbma zzbmaVar, zzehm<Set<zzbvt<zzbsm>>> zzehmVar) {
        this.zzfjo = zzbmaVar;
        this.zzfjp = zzehmVar;
    }

    public static zzbsh zza(zzbma zzbmaVar, Set<zzbvt<zzbsm>> set) {
        return (zzbsh) zzehf.zza(zzbmaVar.zza(set), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzfjo, this.zzfjp.get());
    }
}
