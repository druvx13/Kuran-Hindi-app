package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzblg implements zzegz<Set<zzbvt<zzbsm>>> {
    private final zzble zzfio;
    private final zzehm<zzbnn> zzfip;

    public zzblg(zzble zzbleVar, zzehm<zzbnn> zzehmVar) {
        this.zzfio = zzbleVar;
        this.zzfip = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(Collections.singleton(new zzbvt(this.zzfip.get(), zzbab.zzdzw)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
