package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbum implements zzegz<Set<zzbvt<zzbrs>>> {
    private final zzbuj zzfoh;

    private zzbum(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbum zzg(zzbuj zzbujVar) {
        return new zzbum(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
