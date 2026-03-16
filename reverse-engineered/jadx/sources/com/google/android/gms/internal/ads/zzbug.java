package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbug implements zzegz<zzbtx> {
    private final zzehm<Set<zzbvt<zzbuf>>> zzfjp;

    private zzbug(zzehm<Set<zzbvt<zzbuf>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbug zzs(zzehm<Set<zzbvt<zzbuf>>> zzehmVar) {
        return new zzbug(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbtx(this.zzfjp.get());
    }
}
