package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbrj implements zzegz<zzbri> {
    private final zzehm<Set<zzbvt<zzbrl>>> zzfjp;

    private zzbrj(zzehm<Set<zzbvt<zzbrl>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbrj zzh(zzehm<Set<zzbvt<zzbrl>>> zzehmVar) {
        return new zzbrj(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbri(this.zzfjp.get());
    }
}
