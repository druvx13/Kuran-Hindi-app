package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbwo implements zzegz<zzbwi> {
    private final zzehm<Set<zzbvt<VideoController.VideoLifecycleCallbacks>>> zzfjp;

    private zzbwo(zzehm<Set<zzbvt<VideoController.VideoLifecycleCallbacks>>> zzehmVar) {
        this.zzfjp = zzehmVar;
    }

    public static zzbwo zzv(zzehm<Set<zzbvt<VideoController.VideoLifecycleCallbacks>>> zzehmVar) {
        return new zzbwo(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbwi(this.zzfjp.get());
    }
}
