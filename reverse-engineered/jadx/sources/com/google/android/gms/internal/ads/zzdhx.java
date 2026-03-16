package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdhx implements zzegz<zzdhy> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzawo> zzeqb;

    private zzdhx(zzehm<Context> zzehmVar, zzehm<zzawo> zzehmVar2) {
        this.zzenp = zzehmVar;
        this.zzeqb = zzehmVar2;
    }

    public static zzdhx zzbd(zzehm<Context> zzehmVar, zzehm<zzawo> zzehmVar2) {
        return new zzdhx(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdhy(this.zzenp.get(), this.zzeqb.get());
    }
}
