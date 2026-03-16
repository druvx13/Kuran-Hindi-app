package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbvz implements zzegz<zzbvx> {
    private final zzehm<Set<zzbvt<zzbvy>>> zzfjp;

    private zzbvz(zzehm<Set<zzbvt<zzbvy>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbvz zzu(zzehm<Set<zzbvt<zzbvy>>> zzehmVar) {
        return new zzbvz(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbvx(this.zzfjp.get());
    }
}
