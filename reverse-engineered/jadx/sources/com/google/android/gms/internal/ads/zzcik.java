package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcik implements zzegz<zzcil> {
    private final zzehm<Clock> zzfhq;

    public zzcik(zzehm<Clock> zzehmVar) {
        this.zzfhq = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcil(this.zzfhq.get());
    }
}
