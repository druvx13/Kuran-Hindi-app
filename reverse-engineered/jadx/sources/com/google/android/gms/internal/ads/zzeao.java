package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzeao extends zzeak<Boolean> implements zzecl<Boolean>, zzeea, RandomAccess {
    private static final zzeao zzhsz;
    private int size;
    private boolean[] zzhta;

    zzeao() {
        this(new boolean[10], 0);
    }

    private zzeao(boolean[] zArr, int i) {
        this.zzhta = zArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbck();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzhta;
        System.arraycopy(zArr, i2, zArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzeao)) {
            return super.equals(obj);
        }
        zzeao zzeaoVar = (zzeao) obj;
        if (this.size != zzeaoVar.size) {
            return false;
        }
        boolean[] zArr = zzeaoVar.zzhta;
        for (int i = 0; i < this.size; i++) {
            if (this.zzhta[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzecg.zzbu(this.zzhta[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void addBoolean(boolean z) {
        zzbck();
        int i = this.size;
        boolean[] zArr = this.zzhta;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.zzhta = zArr2;
        }
        boolean[] zArr3 = this.zzhta;
        int i2 = this.size;
        this.size = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zzbck();
        zzecg.checkNotNull(collection);
        if (!(collection instanceof zzeao)) {
            return super.addAll(collection);
        }
        zzeao zzeaoVar = (zzeao) collection;
        int i = zzeaoVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.zzhta;
        if (i3 > zArr.length) {
            this.zzhta = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(zzeaoVar.zzhta, 0, this.zzhta, this.size, zzeaoVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzbck();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Boolean.valueOf(this.zzhta[i]))) {
                boolean[] zArr = this.zzhta;
                System.arraycopy(zArr, i + 1, zArr, i, (this.size - i) - 1);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbck();
        zzfl(i);
        boolean[] zArr = this.zzhta;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zzbck();
        zzfl(i);
        boolean[] zArr = this.zzhta;
        boolean z = zArr[i];
        if (i < this.size - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzbck();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfm(i));
        }
        boolean[] zArr = this.zzhta;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.zzhta, i, zArr2, i + 1, this.size - i);
            this.zzhta = zArr2;
        }
        this.zzhta[i] = booleanValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        addBoolean(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzecl
    public final /* synthetic */ zzecl<Boolean> zzfn(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzeao(Arrays.copyOf(this.zzhta, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzfl(i);
        return Boolean.valueOf(this.zzhta[i]);
    }

    static {
        zzeao zzeaoVar = new zzeao(new boolean[0], 0);
        zzhsz = zzeaoVar;
        zzeaoVar.zzbcj();
    }
}
