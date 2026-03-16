package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbux implements zzegz<Set<zzbvt<zzbsm>>> {
    private final zzbuj zzfoh;

    private zzbux(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbux zzr(zzbuj zzbujVar) {
        return new zzbux(zzbujVar);
    }

    public static Set<zzbvt<zzbsm>> zzs(zzbuj zzbujVar) {
        return (Set) zzehf.zza(zzbujVar.zzajc(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzs(this.zzfoh);
    }
}
