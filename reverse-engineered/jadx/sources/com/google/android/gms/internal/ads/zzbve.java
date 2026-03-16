package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbve implements zzegz<zzcqi> {
    private final zzehm<zzcqk> zzerm;
    private final zzehm<Clock> zzfhq;
    private final zzbuj zzfoh;

    private zzbve(zzbuj zzbujVar, zzehm<Clock> zzehmVar, zzehm<zzcqk> zzehmVar2) {
        this.zzfoh = zzbujVar;
        this.zzfhq = zzehmVar;
        this.zzerm = zzehmVar2;
    }

    public static zzbve zza(zzbuj zzbujVar, zzehm<Clock> zzehmVar, zzehm<zzcqk> zzehmVar2) {
        return new zzbve(zzbujVar, zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzcqi) zzehf.zza(this.zzfoh.zza(this.zzfhq.get(), this.zzerm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
