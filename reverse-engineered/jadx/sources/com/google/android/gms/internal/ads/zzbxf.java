package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbxf implements zzegz<zzbvt<com.google.android.gms.ads.internal.overlay.zzo>> {
    private final zzehm<zzbyb> zzfip;
    private final zzbwx zzfpa;

    private zzbxf(zzbwx zzbwxVar, zzehm<zzbyb> zzehmVar) {
        this.zzfpa = zzbwxVar;
        this.zzfip = zzehmVar;
    }

    public static zzbxf zzc(zzbwx zzbwxVar, zzehm<zzbyb> zzehmVar) {
        return new zzbxf(zzbwxVar, zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfip.get(), zzbab.zzdzv), "Cannot return null from a non-@Nullable @Provides method");
    }
}
