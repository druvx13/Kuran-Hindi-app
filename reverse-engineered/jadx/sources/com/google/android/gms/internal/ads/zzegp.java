package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzegp<E> extends AbstractList<E> {
    private static final zzegr zzcr = zzegr.zzn(zzegp.class);
    List<E> zziiq;
    Iterator<E> zziir;

    public zzegp(List<E> list, Iterator<E> it) {
        this.zziiq = list;
        this.zziir = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        if (this.zziiq.size() > i) {
            return this.zziiq.get(i);
        }
        if (this.zziir.hasNext()) {
            this.zziiq.add(this.zziir.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new zzegs(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        zzcr.zzig("potentially expensive size() call");
        zzcr.zzig("blowup running");
        while (this.zziir.hasNext()) {
            this.zziiq.add(this.zziir.next());
        }
        return this.zziiq.size();
    }
}
