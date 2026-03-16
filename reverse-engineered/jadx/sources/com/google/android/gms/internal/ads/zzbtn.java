package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbtn implements zzegz<zzbtl> {
    private final zzehm<Set<zzbvt<zzbtq>>> zzfjp;

    private zzbtn(zzehm<Set<zzbvt<zzbtq>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbtn zzp(zzehm<Set<zzbvt<zzbtq>>> zzehmVar) {
        return new zzbtn(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbtl(this.zzfjp.get());
    }
}
