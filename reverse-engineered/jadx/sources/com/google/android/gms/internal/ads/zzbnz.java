package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbnz<AdT> implements zzegz<zzbnw<AdT>> {
    private final zzehm<Map<String, zzcnj<AdT>>> zzfkw;

    private zzbnz(zzehm<Map<String, zzcnj<AdT>>> zzehmVar) {
        this.zzfkw = zzehmVar;
    }

    public static <AdT> zzbnz<AdT> zzd(zzehm<Map<String, zzcnj<AdT>>> zzehmVar) {
        return new zzbnz<>(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbnw(this.zzfkw.get());
    }
}
