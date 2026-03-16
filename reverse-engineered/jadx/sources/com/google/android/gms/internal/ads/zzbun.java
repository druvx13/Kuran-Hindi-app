package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbun implements zzegz<zzbra> {
    private final zzbuj zzfoh;
    private final zzehm<Set<zzbvt<zzbrc>>> zzfoi;

    private zzbun(zzbuj zzbujVar, zzehm<Set<zzbvt<zzbrc>>> zzehmVar) {
        this.zzfoh = zzbujVar;
        this.zzfoi = zzehmVar;
    }

    public static zzbun zza(zzbuj zzbujVar, zzehm<Set<zzbvt<zzbrc>>> zzehmVar) {
        return new zzbun(zzbujVar, zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbra) zzehf.zza(this.zzfoh.zzc(this.zzfoi.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
