package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbvh implements zzegz<Set<zzbvt<VideoController.VideoLifecycleCallbacks>>> {
    private final zzbuj zzfoh;

    private zzbvh(zzbuj zzbujVar) {
        this.zzfoh = zzbujVar;
    }

    public static zzbvh zzaa(zzbuj zzbujVar) {
        return new zzbvh(zzbujVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Set) zzehf.zza(Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
