package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzeec<E> extends zzeak<E> implements RandomAccess {
    private static final zzeec<Object> zziaz;
    private int size;
    private E[] zzhfr;

    public static <E> zzeec<E> zzbgn() {
        return (zzeec<E>) zziaz;
    }

    zzeec() {
        this(new Object[10], 0);
    }

    private zzeec(E[] eArr, int i) {
        this.zzhfr = eArr;
        this.size = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zzbck();
        int i = this.size;
        E[] eArr = this.zzhfr;
        if (i == eArr.length) {
            this.zzhfr = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzhfr;
        int i2 = this.size;
        this.size = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        zzbck();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfm(i));
        }
        E[] eArr = this.zzhfr;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.zzhfr, i, eArr2, i + 1, this.size - i);
            this.zzhfr = eArr2;
        }
        this.zzhfr[i] = e;
        this.size++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzfl(i);
        return this.zzhfr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        zzbck();
        zzfl(i);
        E[] eArr = this.zzhfr;
        E e = eArr[i];
        if (i < this.size - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zzbck();
        zzfl(i);
        E[] eArr = this.zzhfr;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    private final void zzfl(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzfm(i));
        }
    }

    private final String zzfm(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzecl
    public final /* synthetic */ zzecl zzfn(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzeec(Arrays.copyOf(this.zzhfr, i), this.size);
    }

    static {
        zzeec<Object> zzeecVar = new zzeec<>(new Object[0], 0);
        zziaz = zzeecVar;
        zzeecVar.zzbcj();
    }
}
