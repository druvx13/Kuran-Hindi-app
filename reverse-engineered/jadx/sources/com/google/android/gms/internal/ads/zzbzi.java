package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzi implements zzegz<zzbvt<zzbrp>> {
    private final zzehm<zzcbi> zzfip;
    private final zzbza zzfqw;

    public zzbzi(zzbza zzbzaVar, zzehm<zzcbi> zzehmVar) {
        this.zzfqw = zzbzaVar;
        this.zzfip = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfip.get(), zzbab.zzdzw), "Cannot return null from a non-@Nullable @Provides method");
    }
}
