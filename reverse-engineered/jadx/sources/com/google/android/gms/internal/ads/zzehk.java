package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzehk<T> {
    private final List<zzehm<T>> zzijj;
    private final List<zzehm<Collection<T>>> zzijk;

    private zzehk(int i, int i2) {
        this.zzijj = zzegy.zzhs(i);
        this.zzijk = zzegy.zzhs(i2);
    }

    public final zzehk<T> zzat(zzehm<? extends T> zzehmVar) {
        this.zzijj.add(zzehmVar);
        return this;
    }

    public final zzehk<T> zzau(zzehm<? extends Collection<? extends T>> zzehmVar) {
        this.zzijk.add(zzehmVar);
        return this;
    }

    public final zzehi<T> zzbit() {
        return new zzehi<>(this.zzijj, this.zzijk);
    }
}
