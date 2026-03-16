package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdht implements zzegz<Clock> {
    private final zzdhu zzgvn;

    public zzdht(zzdhu zzdhuVar) {
        this.zzgvn = zzdhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Clock) zzehf.zza(DefaultClock.getInstance(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
