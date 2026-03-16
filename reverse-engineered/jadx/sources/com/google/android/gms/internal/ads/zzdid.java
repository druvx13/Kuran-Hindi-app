package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdid implements zzegz<zzawt> {
    private final zzdie zzgvr;
    private final zzehm<zzdic> zzgvs;

    private zzdid(zzdie zzdieVar, zzehm<zzdic> zzehmVar) {
        this.zzgvr = zzdieVar;
        this.zzgvs = zzehmVar;
    }

    public static zzdid zza(zzdie zzdieVar, zzehm<zzdic> zzehmVar) {
        return new zzdid(zzdieVar, zzehmVar);
    }

    public static zzawt zza(zzdie zzdieVar, zzdic zzdicVar) {
        return (zzawt) zzehf.zza(zzdicVar.zzduw, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzgvr, this.zzgvs.get());
    }
}
