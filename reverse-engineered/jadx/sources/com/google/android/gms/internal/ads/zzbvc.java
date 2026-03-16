package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbvc implements zzegz<Set<zzbvt<zzbvy>>> {
    private final zzbuj zzfoh;

    private zzbvc(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbvc zzx(zzbuj zzbujVar) {
        return new zzbvc(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
