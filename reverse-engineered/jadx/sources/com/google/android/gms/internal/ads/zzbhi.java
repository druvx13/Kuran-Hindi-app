package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbhi implements zzegz<zzcnk<zzdhq, zzcos>> {
    private final zzbhb zzeni;
    private final zzehm<zzcfz> zzenj;

    public zzbhi(zzbhb zzbhbVar, zzehm<zzcfz> zzehmVar) {
        this.zzeni = zzbhbVar;
        this.zzenj = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzcnk) zzehf.zza(new zzcrb(this.zzenj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
