package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbow implements zzegz<zzbvt<zzub>> {
    private final zzbox zzflw;
    private final zzehm<zzbpc> zzflx;

    private zzbow(zzbox zzboxVar, zzehm<zzbpc> zzehmVar) {
        this.zzflw = zzboxVar;
        this.zzflx = zzehmVar;
    }

    public static zzbow zza(zzbox zzboxVar, zzehm<zzbpc> zzehmVar) {
        return new zzbow(zzboxVar, zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzflx.get(), zzbab.zzdzw), "Cannot return null from a non-@Nullable @Provides method");
    }
}
