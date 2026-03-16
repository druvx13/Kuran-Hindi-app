package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbup implements zzegz<Set<zzbvt<zzbsm>>> {
    private final zzbuj zzfoh;

    private zzbup(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbup zzi(zzbuj zzbujVar) {
        return new zzbup(zzbujVar);
    }

    public static Set<zzbvt<zzbsm>> zzj(zzbuj zzbujVar) {
        return (Set) zzehf.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzj(this.zzfoh);
    }
}
