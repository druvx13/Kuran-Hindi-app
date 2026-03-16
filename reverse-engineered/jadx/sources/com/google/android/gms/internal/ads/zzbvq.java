package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbvq implements zzegz<zzbvp> {
    private final zzehm<Set<zzbvt<zzbvm>>> zzfjp;

    private zzbvq(zzehm<Set<zzbvt<zzbvm>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbvq zzt(zzehm<Set<zzbvt<zzbvm>>> zzehmVar) {
        return new zzbvq(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbvp(this.zzfjp.get());
    }
}
