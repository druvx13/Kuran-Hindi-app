package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbqy implements zzegz<zzbqw> {
    private final zzehm<Set<zzbvt<zzub>>> zzfjp;

    private zzbqy(zzehm<Set<zzbvt<zzub>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbqy zzg(zzehm<Set<zzbvt<zzub>>> zzehmVar) {
        return new zzbqy(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbqw(this.zzfjp.get());
    }
}
