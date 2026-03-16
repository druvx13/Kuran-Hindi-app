package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdpk<E> extends zzdpb<E> {
    static final zzdpk<Object> zzhfy = new zzdpk<>(new Object[0], 0, null, 0, 0);
    private final transient int mask;
    private final transient int size;
    private final transient int zzahb;
    private final transient Object[] zzhfz;
    private final transient Object[] zzhga;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpk(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzhfz = objArr;
        this.zzhga = objArr2;
        this.mask = i2;
        this.zzahb = i;
        this.size = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final int zzavu() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final boolean zzavx() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    final boolean zzawd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdot, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.zzhga;
        if (obj == null || objArr == null) {
            return false;
        }
        int zzef = zzdoq.zzef(obj == null ? 0 : obj.hashCode());
        while (true) {
            int i = zzef & this.mask;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzef = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final zzdpp<E> zzavs() {
        return (zzdpp) zzavw().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final Object[] zzavt() {
        return this.zzhfz;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    final int zzavv() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzhfz, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    final zzdou<E> zzawe() {
        return zzdou.zzb(this.zzhfz, this.size);
    }

    @Override // com.google.android.gms.internal.ads.zzdpb, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzahb;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb, com.google.android.gms.internal.ads.zzdot, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
