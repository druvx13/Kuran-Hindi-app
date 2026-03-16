package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdlc implements zzegz<zzdkt> {
    private final zzehm<Set<zzbvt<zzdla>>> zzfjp;

    private zzdlc(zzehm<Set<zzbvt<zzdla>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzdlc zzaq(zzehm<Set<zzbvt<zzdla>>> zzehmVar) {
        return new zzdlc(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdkt(this.zzfjp.get());
    }
}
