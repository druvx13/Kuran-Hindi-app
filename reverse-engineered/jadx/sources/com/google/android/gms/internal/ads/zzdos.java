package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
class zzdos<E> extends zzdov<E> {
    int size;
    Object[] zzhfc;
    boolean zzhfd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdos(int i) {
        zzdoo.zzj(i, "initialCapacity");
        this.zzhfc = new Object[i];
        this.size = 0;
    }

    private final void zzeg(int i) {
        Object[] objArr = this.zzhfc;
        if (objArr.length < i) {
            int length = objArr.length;
            if (i < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                i2 = Integer.highestOneBit(i - 1) << 1;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.zzhfc = Arrays.copyOf(objArr, i2);
            this.zzhfd = false;
        } else if (this.zzhfd) {
            this.zzhfc = (Object[]) objArr.clone();
            this.zzhfd = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdov
    /* renamed from: zzab */
    public zzdos<E> zzac(E e) {
        zzdoj.checkNotNull(e);
        zzeg(this.size + 1);
        Object[] objArr = this.zzhfc;
        int i = this.size;
        this.size = i + 1;
        objArr[i] = e;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdov
    public zzdov<E> zzg(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzeg(this.size + collection.size());
            if (collection instanceof zzdot) {
                this.size = ((zzdot) collection).zza(this.zzhfc, this.size);
                return this;
            }
        }
        super.zzg(iterable);
        return this;
    }
}
