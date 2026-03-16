package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbuw implements zzegz<Set<zzbvt<AdMetadataListener>>> {
    private final zzbuj zzfoh;

    private zzbuw(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbuw zzq(zzbuj zzbujVar) {
        return new zzbuw(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(this.zzfoh.zzajf(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
