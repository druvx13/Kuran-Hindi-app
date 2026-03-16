package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbml implements zzegz<Set<zzbvt<zzbsm>>> {
    private final zzehm<zzbnn> zzfip;
    private final zzbma zzfjo;

    public zzbml(zzbma zzbmaVar, zzehm<zzbnn> zzehmVar) {
        this.zzfjo = zzbmaVar;
        this.zzfip = zzehmVar;
    }

    public static Set<zzbvt<zzbsm>> zza(zzbma zzbmaVar, zzbnn zzbnnVar) {
        return (Set) zzehf.zza(Collections.singleton(new zzbvt(zzbnnVar, zzbab.zzdzw)), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzfjo, this.zzfip.get());
    }
}
