package com.google.android.gms.internal.ads;

import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzblh implements zzegz<View> {
    private final zzble zzfio;

    public zzblh(zzble zzbleVar) {
        this.zzfio = zzbleVar;
    }

    public static View zza(zzble zzbleVar) {
        return (View) zzehf.zza(zzbleVar.zzagt(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzfio);
    }
}
