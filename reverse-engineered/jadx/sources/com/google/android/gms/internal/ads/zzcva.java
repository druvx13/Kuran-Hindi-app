package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcva implements zzegz<Set<String>> {
    private final zzcuu zzglc;

    public zzcva(zzcuu zzcuuVar) {
        this.zzglc = zzcuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(this.zzglc.zzapx(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
