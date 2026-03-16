package com.google.android.gms.internal.ads;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzdod<T> implements Serializable {
    @NullableDecl
    public abstract T zzavo();

    public static <T> zzdod<T> zzz(@NullableDecl T t) {
        if (t == null) {
            return zzdnw.zzhdq;
        }
        return new zzdoi(t);
    }
}
