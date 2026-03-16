package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcay implements zzegz<zzcaw> {
    private final zzehm<zzcdt> zzezj;
    private final zzehm<Clock> zzfhq;

    public zzcay(zzehm<zzcdt> zzehmVar, zzehm<Clock> zzehmVar2) {
        this.zzezj = zzehmVar;
        this.zzfhq = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcaw(this.zzezj.get(), this.zzfhq.get());
    }
}
