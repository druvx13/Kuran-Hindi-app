package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbmp implements zzegz<zzaur> {
    private final zzehm<Context> zzenp;
    private final zzbma zzfjo;
    private final zzehm<zzdhe> zzfjq;

    public zzbmp(zzbma zzbmaVar, zzehm<Context> zzehmVar, zzehm<zzdhe> zzehmVar2) {
        this.zzfjo = zzbmaVar;
        this.zzenp = zzehmVar;
        this.zzfjq = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzaur) zzehf.zza(new zzaur(this.zzenp.get(), this.zzfjq.get().zzgux), "Cannot return null from a non-@Nullable @Provides method");
    }
}
