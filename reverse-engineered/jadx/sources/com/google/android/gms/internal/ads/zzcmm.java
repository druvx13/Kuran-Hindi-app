package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcmm implements zzegz<zzcmn> {
    private final zzehm<Context> zzenp;

    private zzcmm(zzehm<Context> zzehmVar) {
        this.zzenp = zzehmVar;
    }

    public static zzcmm zzae(zzehm<Context> zzehmVar) {
        return new zzcmm(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcmn(this.zzenp.get());
    }
}
