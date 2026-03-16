package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbmn implements zzegz<zzbvt<zzbsm>> {
    private final zzehm<zzbnl> zzfip;
    private final zzbma zzfjo;

    public zzbmn(zzbma zzbmaVar, zzehm<zzbnl> zzehmVar) {
        this.zzfjo = zzbmaVar;
        this.zzfip = zzehmVar;
    }

    public static zzbvt<zzbsm> zza(zzbma zzbmaVar, zzbnl zzbnlVar) {
        return (zzbvt) zzehf.zza(new zzbvt(zzbnlVar, zzbab.zzdzv), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzfjo, this.zzfip.get());
    }
}
