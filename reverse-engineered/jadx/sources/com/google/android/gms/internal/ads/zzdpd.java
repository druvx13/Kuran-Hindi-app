package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
final class zzdpd<T> extends zzdpp<T> {
    private boolean zzhfo;
    private final /* synthetic */ Object zzhfp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpd(Object obj) {
        this.zzhfp = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzhfo;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (this.zzhfo) {
            throw new NoSuchElementException();
        }
        this.zzhfo = true;
        return (T) this.zzhfp;
    }
}
