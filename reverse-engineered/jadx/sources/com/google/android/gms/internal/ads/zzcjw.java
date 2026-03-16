package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcjw implements zzegz<ApplicationInfo> {
    private final zzehm<Context> zzenp;

    private zzcjw(zzehm<Context> zzehmVar) {
        this.zzenp = zzehmVar;
    }

    public static zzcjw zzac(zzehm<Context> zzehmVar) {
        return new zzcjw(zzehmVar);
    }

    public static ApplicationInfo zzcc(Context context) {
        return (ApplicationInfo) zzehf.zza(context.getApplicationInfo(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzcc(this.zzenp.get());
    }
}
