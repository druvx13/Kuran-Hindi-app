package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.VideoController;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcbs implements zzegz<zzbvt<VideoController.VideoLifecycleCallbacks>> {
    private final zzehm<zzceh> zzfhv;
    private final zzehm<Executor> zzfjj;
    private final zzcbm zzfum;

    public zzcbs(zzcbm zzcbmVar, zzehm<zzceh> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzfum = zzcbmVar;
        this.zzfhv = zzehmVar;
        this.zzfjj = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfhv.get(), this.zzfjj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
