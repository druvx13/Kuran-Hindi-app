package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcfs implements zzegz<zzbvt<zzbrs>> {
    private final zzehm<zzcfr> zzfip;
    private final zzcft zzfxn;

    private zzcfs(zzcft zzcftVar, zzehm<zzcfr> zzehmVar) {
        this.zzfxn = zzcftVar;
        this.zzfip = zzehmVar;
    }

    public static zzcfs zza(zzcft zzcftVar, zzehm<zzcfr> zzehmVar) {
        return new zzcfs(zzcftVar, zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfip.get(), zzbab.zzdzv), "Cannot return null from a non-@Nullable @Provides method");
    }
}
