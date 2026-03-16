package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbpo implements zzegz<zzbvt<com.google.android.gms.ads.internal.overlay.zzo>> {
    private final zzehm<zzbom> zzfip;
    private final zzbpm zzfme;

    private zzbpo(zzbpm zzbpmVar, zzehm<zzbom> zzehmVar) {
        this.zzfme = zzbpmVar;
        this.zzfip = zzehmVar;
    }

    public static zzbpo zza(zzbpm zzbpmVar, zzehm<zzbom> zzehmVar) {
        return new zzbpo(zzbpmVar, zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfip.get(), zzbab.zzdzw), "Cannot return null from a non-@Nullable @Provides method");
    }
}
