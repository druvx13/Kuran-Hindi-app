package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbxl implements zzegz<zzbvt<zzbtq>> {
    private final zzehm<Executor> zzenm;
    private final zzbwx zzfpa;

    private zzbxl(zzbwx zzbwxVar, zzehm<Executor> zzehmVar) {
        this.zzfpa = zzbwxVar;
        this.zzenm = zzehmVar;
    }

    public static zzbxl zzd(zzbwx zzbwxVar, zzehm<Executor> zzehmVar) {
        return new zzbxl(zzbwxVar, zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(this.zzfpa.zzb(this.zzenm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
