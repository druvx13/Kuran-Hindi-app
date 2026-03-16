package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbty implements zzegz<zzbtw> {
    private final zzehm<Set<zzbvt<AppEventListener>>> zzfjp;

    private zzbty(zzehm<Set<zzbvt<AppEventListener>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbty zzr(zzehm<Set<zzbvt<AppEventListener>>> zzehmVar) {
        return new zzbty(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbtw(this.zzfjp.get());
    }
}
