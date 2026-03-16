package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbsj implements zzegz<zzbsh> {
    private final zzehm<Set<zzbvt<zzbsm>>> zzfjp;

    private zzbsj(zzehm<Set<zzbvt<zzbsm>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbsj zzl(zzehm<Set<zzbvt<zzbsm>>> zzehmVar) {
        return new zzbsj(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbsh(this.zzfjp.get());
    }
}
