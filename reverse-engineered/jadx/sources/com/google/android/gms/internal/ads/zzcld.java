package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcld implements zzegz<zzcla> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzauu> zzffy;

    private zzcld(zzehm<Context> zzehmVar, zzehm<zzauu> zzehmVar2) {
        this.zzenp = zzehmVar;
        this.zzffy = zzehmVar2;
    }

    public static zzcld zzal(zzehm<Context> zzehmVar, zzehm<zzauu> zzehmVar2) {
        return new zzcld(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcla(this.zzenp.get(), this.zzffy.get());
    }
}
