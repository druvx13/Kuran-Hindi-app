package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbry implements zzegz<zzbrr> {
    private final zzehm<Set<zzbvt<zzbrs>>> zzfjp;

    private zzbry(zzehm<Set<zzbvt<zzbrs>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbry zzj(zzehm<Set<zzbvt<zzbrs>>> zzehmVar) {
        return new zzbry(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbrr(this.zzfjp.get());
    }
}
