package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbvt<T> {
    public Executor executor;
    public T zzfom;

    public static <T> zzbvt<T> zzb(T t, Executor executor) {
        return new zzbvt<>(t, executor);
    }

    public zzbvt(T t, Executor executor) {
        this.zzfom = t;
        this.executor = executor;
    }
}
