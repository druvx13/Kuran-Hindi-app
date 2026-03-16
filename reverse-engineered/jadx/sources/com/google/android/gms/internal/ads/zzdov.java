package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzdov<E> {
    public abstract zzdov<E> zzac(E e);

    public zzdov<E> zzg(Iterable<? extends E> iterable) {
        for (E e : iterable) {
            zzac(e);
        }
        return this;
    }

    public zzdov<E> zza(Iterator<? extends E> it) {
        while (it.hasNext()) {
            zzac(it.next());
        }
        return this;
    }
}
