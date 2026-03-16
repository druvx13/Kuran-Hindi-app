package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbxi implements zzegz<Set<zzbvt<zzbvm>>> {
    private final zzehm<zzbyf> zzfip;

    private zzbxi(zzehm<zzbyf> zzehmVar) {
        this.zzfip = zzehmVar;
    }

    public static zzbxi zzw(zzehm<zzbyf> zzehmVar) {
        return new zzbxi(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(Collections.singleton(zzbvt.zzb(this.zzfip.get(), zzbab.zzdzw)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
