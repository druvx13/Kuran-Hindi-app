package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxi implements zzegz<zzcxg<zzcwx>> {
    private final zzehm<Clock> zzfhq;
    private final zzehm<zzcxa> zzgmx;

    public zzcxi(zzehm<zzcxa> zzehmVar, zzehm<Clock> zzehmVar2) {
        this.zzgmx = zzehmVar;
        this.zzfhq = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzcxg) zzehf.zza(new zzcxg(this.zzgmx.get(), 10000L, this.zzfhq.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
