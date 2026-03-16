package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbpw implements zzegz<zzbvt<zzbtm>> {
    private final zzehm<zzbpv> zzfhv;
    private final zzbpx zzfmg;

    private zzbpw(zzbpx zzbpxVar, zzehm<zzbpv> zzehmVar) {
        this.zzfmg = zzbpxVar;
        this.zzfhv = zzehmVar;
    }

    public static zzbpw zza(zzbpx zzbpxVar, zzehm<zzbpv> zzehmVar) {
        return new zzbpw(zzbpxVar, zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfhv.get(), zzbab.zzdzw), "Cannot return null from a non-@Nullable @Provides method");
    }
}
