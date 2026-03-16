package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzdot<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zzhfe = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@NullableDecl Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzavs */
    public abstract zzdpp<E> iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    @NullableDecl
    public Object[] zzavt() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zzavx();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(zzhfe);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        zzdoj.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] zzavt = zzavt();
            if (zzavt != null) {
                return (T[]) Arrays.copyOfRange(zzavt, zzavu(), zzavv(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzavu() {
        throw new UnsupportedOperationException();
    }

    int zzavv() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public zzdou<E> zzavw() {
        return isEmpty() ? zzdou.zzavy() : zzdou.zzc(toArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        zzdpp zzdppVar = (zzdpp) iterator();
        while (zzdppVar.hasNext()) {
            objArr[i] = zzdppVar.next();
            i++;
        }
        return i;
    }
}
