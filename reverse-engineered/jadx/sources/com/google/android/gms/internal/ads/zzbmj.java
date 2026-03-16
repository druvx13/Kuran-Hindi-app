package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbmj implements zzegz<zzblx> {
    private final zzehm<zzblz> zzfcz;
    private final zzbma zzfjo;

    public zzbmj(zzbma zzbmaVar, zzehm<zzblz> zzehmVar) {
        this.zzfjo = zzbmaVar;
        this.zzfcz = zzehmVar;
    }

    public static zzblx zza(zzbma zzbmaVar, Object obj) {
        return (zzblx) zzehf.zza((zzblz) obj, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzfjo, this.zzfcz.get());
    }
}
