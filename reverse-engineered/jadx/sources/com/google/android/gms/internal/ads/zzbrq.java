package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbrq implements zzegz<zzbro> {
    private final zzehm<Set<zzbvt<zzbrp>>> zzfjp;

    private zzbrq(zzehm<Set<zzbvt<zzbrp>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbrq zzi(zzehm<Set<zzbvt<zzbrp>>> zzehmVar) {
        return new zzbrq(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbro(this.zzfjp.get());
    }
}
