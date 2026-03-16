package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbyr implements zzegz<Set<String>> {
    private final zzehm<zzcae> zzfji;

    public zzbyr(zzehm<zzcae> zzehmVar) {
        this.zzfji = zzehmVar;
    }

    public static Set<String> zza(zzcae zzcaeVar) {
        Set emptySet;
        if (zzcaeVar.zzalo() != null) {
            emptySet = Collections.singleton("banner");
        } else {
            emptySet = Collections.emptySet();
        }
        return (Set) zzehf.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzfji.get());
    }
}
