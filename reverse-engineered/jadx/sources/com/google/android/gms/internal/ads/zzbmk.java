package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbmk implements zzegz<zzbvt<zzbrp>> {
    private final zzehm<zzbnl> zzfip;
    private final zzbma zzfjo;

    public zzbmk(zzbma zzbmaVar, zzehm<zzbnl> zzehmVar) {
        this.zzfjo = zzbmaVar;
        this.zzfip = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfip.get(), zzbab.zzdzv), "Cannot return null from a non-@Nullable @Provides method");
    }
}
