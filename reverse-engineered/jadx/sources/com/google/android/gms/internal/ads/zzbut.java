package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbut implements zzegz<Set<zzbvt<zzbrc>>> {
    private final zzbuj zzfoh;

    private zzbut(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbut zzn(zzbuj zzbujVar) {
        return new zzbut(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(this.zzfoh.zzajd(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
