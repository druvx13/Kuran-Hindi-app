package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbxw implements zzegz<zzcnj<zzbws>> {
    private final zzehm<zzdrh> zzfjj;
    private final zzehm<zzdku> zzfju;
    private final zzehm<zzcph> zzfjv;
    private final zzehm<zzcrq> zzfjw;

    public zzbxw(zzehm<zzdku> zzehmVar, zzehm<zzdrh> zzehmVar2, zzehm<zzcph> zzehmVar3, zzehm<zzcrq> zzehmVar4) {
        this.zzfju = zzehmVar;
        this.zzfjj = zzehmVar2;
        this.zzfjv = zzehmVar3;
        this.zzfjw = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzcnj) zzehf.zza(new zzcru(this.zzfju.get(), this.zzfjj.get(), this.zzfjw.get(), this.zzfjv.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
