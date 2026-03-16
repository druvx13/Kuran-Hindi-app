package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbxa implements zzegz<Set<zzbvt<zzbqx>>> {
    private final zzehm<zzbyd> zzfip;
    private final zzbwx zzfpa;

    private zzbxa(zzbwx zzbwxVar, zzehm<zzbyd> zzehmVar) {
        this.zzfpa = zzbwxVar;
        this.zzfip = zzehmVar;
    }

    public static zzbxa zza(zzbwx zzbwxVar, zzehm<zzbyd> zzehmVar) {
        return new zzbxa(zzbwxVar, zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(this.zzfpa.zza(this.zzfip.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
