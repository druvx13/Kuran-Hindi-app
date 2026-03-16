package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbvd implements zzegz<Set<zzbvt<zzpz>>> {
    private final zzbuj zzfoh;

    private zzbvd(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbvd zzy(zzbuj zzbujVar) {
        return new zzbvd(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
