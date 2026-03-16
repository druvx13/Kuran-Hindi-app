package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
/* loaded from: classes.dex */
public final class zzdc {
    public static <T> zzcz<T> zza(zzcz<T> zzczVar) {
        if ((zzczVar instanceof zzde) || (zzczVar instanceof zzdb)) {
            return zzczVar;
        }
        if (zzczVar instanceof Serializable) {
            return new zzdb(zzczVar);
        }
        return new zzde(zzczVar);
    }

    public static <T> zzcz<T> zza(@NullableDecl T t) {
        return new zzdd(t);
    }
}
