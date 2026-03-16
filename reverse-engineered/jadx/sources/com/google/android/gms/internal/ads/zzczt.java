package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzczt implements zzegz<zzczr> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<zzauu> zzffy;

    private zzczt(zzehm<zzauu> zzehmVar, zzehm<zzdrh> zzehmVar2, zzehm<Context> zzehmVar3) {
        this.zzffy = zzehmVar;
        this.zzenm = zzehmVar2;
        this.zzenp = zzehmVar3;
    }

    public static zzczt zzt(zzehm<zzauu> zzehmVar, zzehm<zzdrh> zzehmVar2, zzehm<Context> zzehmVar3) {
        return new zzczt(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzczr(this.zzffy.get(), this.zzenm.get(), this.zzenp.get());
    }
}
