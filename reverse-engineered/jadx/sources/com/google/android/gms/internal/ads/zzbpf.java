package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbpf implements zzegz<zzbpc> {
    private final zzehm<Clock> zzfhq;
    private final zzehm<zzawc> zzflz;

    private zzbpf(zzehm<Clock> zzehmVar, zzehm<zzawc> zzehmVar2) {
        this.zzfhq = zzehmVar;
        this.zzflz = zzehmVar2;
    }

    public static zzbpf zze(zzehm<Clock> zzehmVar, zzehm<zzawc> zzehmVar2) {
        return new zzbpf(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbpc(this.zzfhq.get(), this.zzflz.get());
    }
}
