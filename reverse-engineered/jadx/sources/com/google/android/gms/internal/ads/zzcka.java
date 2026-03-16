package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcka implements zzegz<String> {
    private final zzehm<Context> zzenp;

    private zzcka(zzehm<Context> zzehmVar) {
        this.zzenp = zzehmVar;
    }

    public static zzcka zzad(zzehm<Context> zzehmVar) {
        return new zzcka(zzehmVar);
    }

    public static String zzcd(Context context) {
        return (String) zzehf.zza(context.getPackageName(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzcd(this.zzenp.get());
    }
}
