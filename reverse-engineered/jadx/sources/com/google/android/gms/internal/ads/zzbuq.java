package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbuq implements zzegz<Set<zzbvt<zzub>>> {
    private final zzbuj zzfoh;

    private zzbuq(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbuq zzk(zzbuj zzbujVar) {
        return new zzbuq(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(this.zzfoh.zzajh(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
