package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcjv implements zzegz<zzdri<String>> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdt> zzfgx;
    private final zzehm<zzdrh> zzgba;

    private zzcjv(zzehm<zzdt> zzehmVar, zzehm<Context> zzehmVar2, zzehm<zzdrh> zzehmVar3) {
        this.zzfgx = zzehmVar;
        this.zzenp = zzehmVar2;
        this.zzgba = zzehmVar3;
    }

    public static zzcjv zzo(zzehm<zzdt> zzehmVar, zzehm<Context> zzehmVar2, zzehm<zzdrh> zzehmVar3) {
        return new zzcjv(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        final zzdt zzdtVar = this.zzfgx.get();
        final Context context = this.zzenp.get();
        return (zzdri) zzehf.zza(this.zzgba.get().zzd(new Callable(zzdtVar, context) { // from class: com.google.android.gms.internal.ads.zzcjs
            private final Context zzchn;
            private final zzdt zzgay;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgay = zzdtVar;
                this.zzchn = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdt zzdtVar2 = this.zzgay;
                return zzdtVar2.zzcb().zzb(this.zzchn);
            }
        }), "Cannot return null from a non-@Nullable @Provides method");
    }
}
