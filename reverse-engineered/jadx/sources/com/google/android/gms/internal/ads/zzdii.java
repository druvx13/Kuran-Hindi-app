package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdii implements zzegz<zzawo> {
    private final zzdie zzgvr;
    private final zzehm<zzdic> zzgvs;

    private zzdii(zzdie zzdieVar, zzehm<zzdic> zzehmVar) {
        this.zzgvr = zzdieVar;
        this.zzgvs = zzehmVar;
    }

    public static zzdii zzc(zzdie zzdieVar, zzehm<zzdic> zzehmVar) {
        return new zzdii(zzdieVar, zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzawo) zzehf.zza(this.zzgvs.get().zzdtl, "Cannot return null from a non-@Nullable @Provides method");
    }
}
