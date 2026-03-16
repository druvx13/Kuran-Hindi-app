package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdbv implements zzegz<zzdbt> {
    private final zzehm<Context> zzfmf;

    public zzdbv(zzehm<Context> zzehmVar) {
        this.zzfmf = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdbt(this.zzfmf.get());
    }
}
