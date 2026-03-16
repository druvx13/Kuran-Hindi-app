package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbpd implements zzegz<zzawc> {
    private final zzehm<zzawo> zzeqb;
    private final zzehm<Clock> zzfhq;
    private final zzehm<zzdhe> zzfjq;

    private zzbpd(zzehm<Clock> zzehmVar, zzehm<zzawo> zzehmVar2, zzehm<zzdhe> zzehmVar3) {
        this.zzfhq = zzehmVar;
        this.zzeqb = zzehmVar2;
        this.zzfjq = zzehmVar3;
    }

    public static zzbpd zzg(zzehm<Clock> zzehmVar, zzehm<zzawo> zzehmVar2, zzehm<zzdhe> zzehmVar3) {
        return new zzbpd(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzawc) zzehf.zza(this.zzeqb.get().zza(this.zzfhq.get(), this.zzfjq.get().zzgux), "Cannot return null from a non-@Nullable @Provides method");
    }
}
