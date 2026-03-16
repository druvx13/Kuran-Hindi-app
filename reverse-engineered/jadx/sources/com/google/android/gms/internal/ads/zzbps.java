package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbps implements zzegz<zzbvt<zzbsm>> {
    private final zzehm<zzbqa> zzfhv;
    private final zzbpm zzfme;

    private zzbps(zzbpm zzbpmVar, zzehm<zzbqa> zzehmVar) {
        this.zzfme = zzbpmVar;
        this.zzfhv = zzehmVar;
    }

    public static zzbps zzb(zzbpm zzbpmVar, zzehm<zzbqa> zzehmVar) {
        return new zzbps(zzbpmVar, zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfhv.get(), zzbab.zzdzw), "Cannot return null from a non-@Nullable @Provides method");
    }
}
