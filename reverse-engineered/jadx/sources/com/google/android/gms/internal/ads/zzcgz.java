package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcgz implements zzegz<zzcgs> {
    private final zzehm<zzdfa> zzeqj;
    private final zzehm<zzst> zzfyg;

    private zzcgz(zzehm<zzst> zzehmVar, zzehm<zzdfa> zzehmVar2) {
        this.zzfyg = zzehmVar;
        this.zzeqj = zzehmVar2;
    }

    public static zzcgz zzaa(zzehm<zzst> zzehmVar, zzehm<zzdfa> zzehmVar2) {
        return new zzcgz(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcgs(this.zzfyg.get(), this.zzeqj.get());
    }
}
