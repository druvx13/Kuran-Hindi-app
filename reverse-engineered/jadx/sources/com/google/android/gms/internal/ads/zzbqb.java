package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbqb implements zzegz<zzbte> {
    private final zzehm<zzbte> zzfmi;

    private zzbqb(zzehm<zzbte> zzehmVar) {
        this.zzfmi = zzehmVar;
    }

    public static zzbqb zzf(zzehm<zzbte> zzehmVar) {
        return new zzbqb(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbte) zzehf.zza(this.zzfmi.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
