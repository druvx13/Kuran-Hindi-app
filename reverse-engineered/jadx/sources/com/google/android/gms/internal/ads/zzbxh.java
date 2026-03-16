package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbxh implements zzegz<zzaur> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdhe> zzfjq;
    private final zzbwx zzfpa;

    private zzbxh(zzbwx zzbwxVar, zzehm<Context> zzehmVar, zzehm<zzdhe> zzehmVar2) {
        this.zzfpa = zzbwxVar;
        this.zzenp = zzehmVar;
        this.zzfjq = zzehmVar2;
    }

    public static zzbxh zza(zzbwx zzbwxVar, zzehm<Context> zzehmVar, zzehm<zzdhe> zzehmVar2) {
        return new zzbxh(zzbwxVar, zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzaur) zzehf.zza(new zzaur(this.zzenp.get(), this.zzfjq.get().zzgux), "Cannot return null from a non-@Nullable @Provides method");
    }
}
