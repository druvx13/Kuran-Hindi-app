package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkm implements zzegz<zzbkn> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzpu> zzfhb;

    private zzbkm(zzehm<Context> zzehmVar, zzehm<zzpu> zzehmVar2) {
        this.zzenp = zzehmVar;
        this.zzfhb = zzehmVar2;
    }

    public static zzbkm zza(zzehm<Context> zzehmVar, zzehm<zzpu> zzehmVar2) {
        return new zzbkm(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzbkn(this.zzenp.get(), this.zzfhb.get());
    }
}
