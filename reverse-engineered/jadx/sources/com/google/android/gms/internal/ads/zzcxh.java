package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxh implements zzegz<zzcxg<zzdan>> {
    private final zzehm<zzdaq> zzeoz;
    private final zzehm<Clock> zzfhq;

    public zzcxh(zzehm<zzdaq> zzehmVar, zzehm<Clock> zzehmVar2) {
        this.zzeoz = zzehmVar;
        this.zzfhq = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzcxg) zzehf.zza(new zzcxg(this.zzeoz.get(), zzabf.zzcvx.get().longValue(), this.zzfhq.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
