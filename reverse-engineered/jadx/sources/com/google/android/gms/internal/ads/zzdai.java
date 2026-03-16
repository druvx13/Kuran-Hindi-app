package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdai implements zzegz<zzdab> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<Context> zzfmf;

    private zzdai(zzehm<zzdrh> zzehmVar, zzehm<Context> zzehmVar2) {
        this.zzenm = zzehmVar;
        this.zzfmf = zzehmVar2;
    }

    public static zzdai zzba(zzehm<zzdrh> zzehmVar, zzehm<Context> zzehmVar2) {
        return new zzdai(zzehmVar, zzehmVar2);
    }

    public static zzdab zza(zzdrh zzdrhVar, Context context) {
        return new zzdab(zzdrhVar, context);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzenm.get(), this.zzfmf.get());
    }
}
