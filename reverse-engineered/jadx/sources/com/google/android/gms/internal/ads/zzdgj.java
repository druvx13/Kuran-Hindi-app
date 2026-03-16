package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdgj implements zzegz<zzdgi> {
    private final zzehm<zzdgz> zzfek;
    private final zzehm<zzdfw> zzgqv;
    private final zzehm<zzdez> zzgqw;

    public zzdgj(zzehm<zzdfw> zzehmVar, zzehm<zzdez> zzehmVar2, zzehm<zzdgz> zzehmVar3) {
        this.zzgqv = zzehmVar;
        this.zzgqw = zzehmVar2;
        this.zzfek = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdgi(this.zzgqv.get(), this.zzgqw.get(), this.zzfek.get());
    }
}
