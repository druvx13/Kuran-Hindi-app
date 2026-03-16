package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxk implements zzegz<zzdgm> {
    private final zzehm<Clock> zzfhq;

    public zzcxk(zzehm<Clock> zzehmVar) {
        this.zzfhq = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzdgm) zzehf.zza(new zzdgm(this.zzfhq.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
