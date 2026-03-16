package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbur implements zzegz<Set<zzbvt<zzbtq>>> {
    private final zzbuj zzfoh;

    private zzbur(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbur zzl(zzbuj zzbujVar) {
        return new zzbur(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
