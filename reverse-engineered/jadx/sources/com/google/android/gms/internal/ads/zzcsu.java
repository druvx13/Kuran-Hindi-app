package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcsu implements zzegz<zzcsq> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzbxr> zzges;

    public zzcsu(zzehm<Context> zzehmVar, zzehm<zzbxr> zzehmVar2) {
        this.zzenp = zzehmVar;
        this.zzges = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcsq(this.zzenp.get(), this.zzges.get());
    }
}
