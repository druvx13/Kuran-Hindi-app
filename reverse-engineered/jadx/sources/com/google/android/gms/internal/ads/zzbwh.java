package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbwh implements zzegz<zzbwd> {
    private final zzehm<Set<zzbvt<zzagk>>> zzfjp;

    public zzbwh(zzehm<Set<zzbvt<zzagk>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbwd(this.zzfjp.get());
    }
}
