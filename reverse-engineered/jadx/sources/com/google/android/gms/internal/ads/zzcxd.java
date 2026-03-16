package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxd implements zzegz<zzcxb> {
    private final zzehm<zzdee> zzfph;

    private zzcxd(zzehm<zzdee> zzehmVar) {
        this.zzfph = zzehmVar;
    }

    public static zzcxd zzal(zzehm<zzdee> zzehmVar) {
        return new zzcxd(zzehmVar);
    }

    public static zzcxb zzb(zzdee zzdeeVar) {
        return new zzcxb(zzdeeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzb(this.zzfph.get());
    }
}
