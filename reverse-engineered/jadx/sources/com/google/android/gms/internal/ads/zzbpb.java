package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbpb implements zzegz<zzbvt<zzbsm>> {
    private final zzbox zzflw;
    private final zzehm<zzbpc> zzflx;

    private zzbpb(zzbox zzboxVar, zzehm<zzbpc> zzehmVar) {
        this.zzflw = zzboxVar;
        this.zzflx = zzehmVar;
    }

    public static zzbpb zzd(zzbox zzboxVar, zzehm<zzbpc> zzehmVar) {
        return new zzbpb(zzboxVar, zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzflx.get(), zzbab.zzdzw), "Cannot return null from a non-@Nullable @Provides method");
    }
}
