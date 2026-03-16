package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzdpb<E> extends zzdot<E> implements Set<E> {
    @NullableDecl
    private transient zzdou<E> zzhfn;

    public static <E> zzdpb<E> zzae(E e) {
        return new zzdpm(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzv(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    boolean zzawd() {
        return false;
    }

    @SafeVarargs
    public static <E> zzdpb<E> zza(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        zzdoj.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return zza(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> zzdpb<E> zza(int i, Object... objArr) {
        while (i != 0) {
            if (i == 1) {
                return zzae(objArr[0]);
            }
            int zzeh = zzeh(i);
            Object[] objArr2 = new Object[zzeh];
            int i2 = zzeh - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object zzd = zzdpf.zzd(objArr[i5], i5);
                int hashCode = zzd.hashCode();
                int zzef = zzdoq.zzef(hashCode);
                while (true) {
                    int i6 = zzef & i2;
                    Object obj = objArr2[i6];
                    if (obj == null) {
                        objArr[i4] = zzd;
                        objArr2[i6] = zzd;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (!obj.equals(zzd)) {
                        zzef++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new zzdpm(objArr[0], i3);
            }
            if (zzeh(i4) >= zzeh / 2) {
                if (zzv(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzdpk(objArr, i3, objArr2, i2, i4);
            }
            i = i4;
        }
        return zzdpk.zzhfy;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzeh(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= max) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            zzdoj.checkArgument(max < 1073741824, "collection too large");
            return 1073741824;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdpb) && zzawd() && ((zzdpb) obj).zzawd() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzdpn.zza(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzdpn.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public zzdou<E> zzavw() {
        zzdou<E> zzdouVar = this.zzhfn;
        if (zzdouVar == null) {
            zzdou<E> zzawe = zzawe();
            this.zzhfn = zzawe;
            return zzawe;
        }
        return zzdouVar;
    }

    zzdou<E> zzawe() {
        return zzdou.zzc(toArray());
    }

    public static <E> zzdpa<E> zzei(int i) {
        zzdoo.zzj(i, "expectedSize");
        return new zzdpa<>(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdot, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
