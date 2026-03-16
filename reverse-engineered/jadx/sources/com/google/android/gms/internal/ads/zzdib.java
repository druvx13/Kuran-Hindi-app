package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdib implements zzegz<zzdia> {
    private final zzehm<zzazz> zzfib;
    private final zzehm<Context> zzfmf;
    private final zzehm<zzawd> zzglv;

    public zzdib(zzehm<Context> zzehmVar, zzehm<zzazz> zzehmVar2, zzehm<zzawd> zzehmVar3) {
        this.zzfmf = zzehmVar;
        this.zzfib = zzehmVar2;
        this.zzglv = zzehmVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdia(this.zzfmf.get(), this.zzfib.get(), this.zzglv.get());
    }
}
