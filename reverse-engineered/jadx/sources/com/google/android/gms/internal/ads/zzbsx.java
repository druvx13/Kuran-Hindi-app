package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbsx implements zzegz<zzbsu> {
    private final zzehm<Set<zzbvt<com.google.android.gms.ads.internal.overlay.zzo>>> zzfjp;

    private zzbsx(zzehm<Set<zzbvt<com.google.android.gms.ads.internal.overlay.zzo>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbsx zzo(zzehm<Set<zzbvt<com.google.android.gms.ads.internal.overlay.zzo>>> zzehmVar) {
        return new zzbsx(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbsu(this.zzfjp.get());
    }
}
