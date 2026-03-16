package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbuz implements zzegz<Set<zzbvt<zzbsr>>> {
    private final zzbuj zzfoh;

    private zzbuz(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbuz zzu(zzbuj zzbujVar) {
        return new zzbuz(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(this.zzfoh.zzajj(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
