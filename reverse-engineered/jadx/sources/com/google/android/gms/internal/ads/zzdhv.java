package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdhv implements zzegz<zzbvt<zzbrc>> {
    private final zzehm<zzdhy> zzflx;
    private final zzdhw zzgvo;

    private zzdhv(zzdhw zzdhwVar, zzehm<zzdhy> zzehmVar) {
        this.zzgvo = zzdhwVar;
        this.zzflx = zzehmVar;
    }

    public static zzdhv zza(zzdhw zzdhwVar, zzehm<zzdhy> zzehmVar) {
        return new zzdhv(zzdhwVar, zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzflx.get(), zzbab.zzdzw), "Cannot return null from a non-@Nullable @Provides method");
    }
}
