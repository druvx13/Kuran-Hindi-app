package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbuv implements zzegz<Set<zzbvt<zzbrp>>> {
    private final zzbuj zzfoh;

    private zzbuv(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbuv zzp(zzbuj zzbujVar) {
        return new zzbuv(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(this.zzfoh.zzaji(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
