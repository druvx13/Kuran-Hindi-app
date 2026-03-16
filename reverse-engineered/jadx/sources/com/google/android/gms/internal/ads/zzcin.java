package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcin {
    public static Set<zzbvt<zzbrs>> zza(zzcix zzcixVar, Executor executor) {
        return zzc(zzcixVar, executor);
    }

    public static Set<zzbvt<AppEventListener>> zzb(zzcix zzcixVar, Executor executor) {
        return zzc(zzcixVar, executor);
    }

    public static Set<zzbvt<zzbsm>> zzc(zzcix zzcixVar, Executor executor) {
        return zzc(zzcixVar, executor);
    }

    public static Set<zzbvt<zzbrc>> zzd(zzcix zzcixVar, Executor executor) {
        return zzc(zzcixVar, executor);
    }

    public static Set<zzbvt<zzbqx>> zze(zzcix zzcixVar, Executor executor) {
        return zzc(zzcixVar, executor);
    }

    public static Set<zzbvt<zzbrp>> zzf(zzcix zzcixVar, Executor executor) {
        return zzc(zzcixVar, executor);
    }

    public static Set<zzbvt<zzub>> zzg(zzcix zzcixVar, Executor executor) {
        return zzc(zzcixVar, executor);
    }

    public static Set<zzbvt<zzdla>> zzh(zzcix zzcixVar, Executor executor) {
        return zzc(zzcixVar, executor);
    }

    public static Set<zzbvt<zzbtm>> zzi(zzcix zzcixVar, Executor executor) {
        return zzc(zzcixVar, executor);
    }

    private static <T> Set<zzbvt<T>> zzc(T t, Executor executor) {
        if (zzabn.zzcxb.get().booleanValue()) {
            return Collections.singleton(new zzbvt(t, executor));
        }
        return Collections.emptySet();
    }
}
