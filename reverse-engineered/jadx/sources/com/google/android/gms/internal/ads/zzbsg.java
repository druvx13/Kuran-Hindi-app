package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbsg implements zzegz<zzbrx> {
    private final zzehm<Set<zzbvt<zzbqx>>> zzfjp;

    private zzbsg(zzehm<Set<zzbvt<zzbqx>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbsg zzk(zzehm<Set<zzbvt<zzbqx>>> zzehmVar) {
        return new zzbsg(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbrx(this.zzfjp.get());
    }
}
