package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcxt implements zzegz<zzcxp> {
    private final zzehm<zzdrh> zzenm;
    private final zzehm<Context> zzfmf;

    private zzcxt(zzehm<Context> zzehmVar, zzehm<zzdrh> zzehmVar2) {
        this.zzfmf = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    public static zzcxt zzau(zzehm<Context> zzehmVar, zzehm<zzdrh> zzehmVar2) {
        return new zzcxt(zzehmVar, zzehmVar2);
    }

    public static zzcxp zza(Context context, zzdrh zzdrhVar) {
        return new zzcxp(context, zzdrhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzfmf.get(), this.zzenm.get());
    }
}
