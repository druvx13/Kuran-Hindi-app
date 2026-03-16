package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcan implements zzegz<zzaur> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdhe> zzfjq;
    private final zzcaj zzfsy;

    private zzcan(zzcaj zzcajVar, zzehm<Context> zzehmVar, zzehm<zzdhe> zzehmVar2) {
        this.zzfsy = zzcajVar;
        this.zzenp = zzehmVar;
        this.zzfjq = zzehmVar2;
    }

    public static zzcan zza(zzcaj zzcajVar, zzehm<Context> zzehmVar, zzehm<zzdhe> zzehmVar2) {
        return new zzcan(zzcajVar, zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzaur) zzehf.zza(new zzaur(this.zzenp.get(), this.zzfjq.get().zzgux), "Cannot return null from a non-@Nullable @Provides method");
    }
}
