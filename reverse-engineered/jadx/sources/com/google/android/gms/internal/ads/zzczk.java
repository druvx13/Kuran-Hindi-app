package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzczk implements zzegz<zzczi> {
    private final zzehm<Context> zzenp;
    private final zzehm<String> zzepz;

    private zzczk(zzehm<Context> zzehmVar, zzehm<String> zzehmVar2) {
        this.zzenp = zzehmVar;
        this.zzepz = zzehmVar2;
    }

    public static zzczk zzaz(zzehm<Context> zzehmVar, zzehm<String> zzehmVar2) {
        return new zzczk(zzehmVar, zzehmVar2);
    }

    public static zzczi zzt(Context context, String str) {
        return new zzczi(context, str);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzt(this.zzenp.get(), this.zzepz.get());
    }
}
