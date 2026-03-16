package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcju implements zzegz<zzdri<String>> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdku> zzfju;

    private zzcju(zzehm<zzdku> zzehmVar, zzehm<Context> zzehmVar2) {
        this.zzfju = zzehmVar;
        this.zzenp = zzehmVar2;
    }

    public static zzcju zzai(zzehm<zzdku> zzehmVar, zzehm<Context> zzehmVar2) {
        return new zzcju(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        final Context context = this.zzenp.get();
        return (zzdri) zzehf.zza(this.zzfju.get().zzu(zzdkr.WEBVIEW_COOKIE).zzc(new Callable(context) { // from class: com.google.android.gms.internal.ads.zzcjq
            private final Context zzcit;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcit = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager zzbf = com.google.android.gms.ads.internal.zzq.zzky().zzbf(this.zzcit);
                return zzbf != null ? zzbf.getCookie("googleads.g.doubleclick.net") : "";
            }
        }).zza(1L, TimeUnit.SECONDS).zza(Exception.class, zzcjt.zzgaz).zzaud(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
