package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdgd implements zzegz<zzdgc> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdgz> zzfek;
    private final zzehm<String> zzgqu;
    private final zzehm<zzdfw> zzgqv;
    private final zzehm<zzdez> zzgqw;

    public zzdgd(zzehm<String> zzehmVar, zzehm<zzdfw> zzehmVar2, zzehm<Context> zzehmVar3, zzehm<zzdez> zzehmVar4, zzehm<zzdgz> zzehmVar5) {
        this.zzgqu = zzehmVar;
        this.zzgqv = zzehmVar2;
        this.zzenp = zzehmVar3;
        this.zzgqw = zzehmVar4;
        this.zzfek = zzehmVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdgc(this.zzgqu.get(), this.zzgqv.get(), this.zzenp.get(), this.zzgqw.get(), this.zzfek.get());
    }
}
