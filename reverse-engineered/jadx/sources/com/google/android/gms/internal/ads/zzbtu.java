package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbtu implements zzegz<zzbtp> {
    private final zzehm<Set<zzbvt<zzbtt>>> zzfjp;

    private zzbtu(zzehm<Set<zzbvt<zzbtt>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbtu zzq(zzehm<Set<zzbvt<zzbtt>>> zzehmVar) {
        return new zzbtu(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbtp(this.zzfjp.get());
    }
}
