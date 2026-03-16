package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdpm<E> extends zzdpb<E> {
    private final transient E zzhgb;
    private transient int zzhgc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpm(E e) {
        this.zzhgb = (E) zzdoj.checkNotNull(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final boolean zzavx() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpm(E e, int i) {
        this.zzhgb = e;
        this.zzhgc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdot, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zzhgb.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final zzdpp<E> zzavs() {
        return new zzdpd(this.zzhgb);
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    final zzdou<E> zzawe() {
        return zzdou.zzad(this.zzhgb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final int zza(Object[] objArr, int i) {
        objArr[i] = this.zzhgb;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.zzhgc;
        if (i == 0) {
            int hashCode = this.zzhgb.hashCode();
            this.zzhgc = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    final boolean zzawd() {
        return this.zzhgc != 0;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zzhgb.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdpb, com.google.android.gms.internal.ads.zzdot, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
