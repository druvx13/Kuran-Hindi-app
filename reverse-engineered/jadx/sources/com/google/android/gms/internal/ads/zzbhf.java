package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbhf implements zzegz<zzcnk<zzdhq, zzcot>> {
    private final zzbhb zzeni;
    private final zzehm<zzcfz> zzenj;

    public zzbhf(zzbhb zzbhbVar, zzehm<zzcfz> zzehmVar) {
        this.zzeni = zzbhbVar;
        this.zzenj = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzcnk) zzehf.zza(new zzcpl(this.zzenj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
