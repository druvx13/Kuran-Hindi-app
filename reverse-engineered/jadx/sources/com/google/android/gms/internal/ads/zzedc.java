package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzedc extends zzeak<Long> implements zzecm, zzeea, RandomAccess {
    private static final zzedc zzhzt;
    private int size;
    private long[] zzhzu;

    public static zzedc zzbfx() {
        return zzhzt;
    }

    zzedc() {
        this(new long[10], 0);
    }

    private zzedc(long[] jArr, int i) {
        this.zzhzu = jArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbck();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzhzu;
        System.arraycopy(jArr, i2, jArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzedc)) {
            return super.equals(obj);
        }
        zzedc zzedcVar = (zzedc) obj;
        if (this.size != zzedcVar.size) {
            return false;
        }
        long[] jArr = zzedcVar.zzhzu;
        for (int i = 0; i < this.size; i++) {
            if (this.zzhzu[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzecg.zzfr(this.zzhzu[i2]);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzecl
    /* renamed from: zzgx */
    public final zzecm zzfn(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzedc(Arrays.copyOf(this.zzhzu, i), this.size);
    }

    public final long getLong(int i) {
        zzfl(i);
        return this.zzhzu[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzfs(long j) {
        zzbck();
        int i = this.size;
        long[] jArr = this.zzhzu;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzhzu = jArr2;
        }
        long[] jArr3 = this.zzhzu;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zzbck();
        zzecg.checkNotNull(collection);
        if (!(collection instanceof zzedc)) {
            return super.addAll(collection);
        }
        zzedc zzedcVar = (zzedc) collection;
        int i = zzedcVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzhzu;
        if (i3 > jArr.length) {
            this.zzhzu = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(zzedcVar.zzhzu, 0, this.zzhzu, this.size, zzedcVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzbck();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.zzhzu[i]))) {
                long[] jArr = this.zzhzu;
                System.arraycopy(jArr, i + 1, jArr, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
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

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbck();
        zzfl(i);
        long[] jArr = this.zzhzu;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zzbck();
        zzfl(i);
        long[] jArr = this.zzhzu;
        long j = jArr[i];
        if (i < this.size - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        zzbck();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfm(i));
        }
        long[] jArr = this.zzhzu;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzhzu, i, jArr2, i + 1, this.size - i);
            this.zzhzu = jArr2;
        }
        this.zzhzu[i] = longValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzfs(((Long) obj).longValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    static {
        zzedc zzedcVar = new zzedc(new long[0], 0);
        zzhzt = zzedcVar;
        zzedcVar.zzbcj();
    }
}
