package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdac implements zzegz<zzdaa> {
    private final zzehm<zzdfa> zzfph;

    private zzdac(zzehm<zzdfa> zzehmVar) {
        this.zzfph = zzehmVar;
    }

    public static zzdac zzap(zzehm<zzdfa> zzehmVar) {
        return new zzdac(zzehmVar);
    }

    public static zzdaa zzb(zzdfa zzdfaVar) {
        return new zzdaa(zzdfaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzb(this.zzfph.get());
    }
}
