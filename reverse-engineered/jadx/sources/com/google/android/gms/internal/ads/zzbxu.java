package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbxu implements zzegz<String> {
    public static zzbxu zzajz() {
        zzbxu zzbxuVar;
        zzbxuVar = zzbxx.zzfpe;
        return zzbxuVar;
    }

    public static String zzaka() {
        return (String) zzehf.zza("interstitial", "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzaka();
    }
}
