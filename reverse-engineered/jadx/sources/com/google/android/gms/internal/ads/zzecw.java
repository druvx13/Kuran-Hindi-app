package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzecw extends zzeak<String> implements zzecv, RandomAccess {
    private static final zzecw zzhzl;
    private static final zzecv zzhzm;
    private final List<Object> zzhzn;

    public zzecw() {
        this(10);
    }

    public zzecw(int i) {
        this(new ArrayList(i));
    }

    private zzecw(ArrayList<Object> arrayList) {
        this.zzhzn = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzhzn.size();
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzbck();
        if (collection instanceof zzecv) {
            collection = ((zzecv) collection).zzbfs();
        }
        boolean addAll = this.zzhzn.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbck();
        this.zzhzn.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final void zzaj(zzeaq zzeaqVar) {
        zzbck();
        this.zzhzn.add(zzeaqVar);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final Object zzgy(int i) {
        return this.zzhzn.get(i);
    }

    private static String zzam(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzeaq) {
            return ((zzeaq) obj).zzbco();
        }
        return zzecg.zzz((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final List<?> zzbfs() {
        return Collections.unmodifiableList(this.zzhzn);
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final zzecv zzbft() {
        return zzbci() ? new zzefd(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zzbck();
        return zzam(this.zzhzn.set(i, (String) obj));
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzbck();
        Object remove = this.zzhzn.remove(i);
        this.modCount++;
        return zzam(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzeak, com.google.android.gms.internal.ads.zzecl
    public final /* bridge */ /* synthetic */ boolean zzbci() {
        return super.zzbci();
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zzbck();
        this.zzhzn.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzeak, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzecl
    public final /* synthetic */ zzecl zzfn(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzhzn);
        return new zzecw(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzhzn.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzeaq) {
            zzeaq zzeaqVar = (zzeaq) obj;
            String zzbco = zzeaqVar.zzbco();
            if (zzeaqVar.zzbcp()) {
                this.zzhzn.set(i, zzbco);
            }
            return zzbco;
        }
        byte[] bArr = (byte[]) obj;
        String zzz = zzecg.zzz(bArr);
        if (zzecg.zzy(bArr)) {
            this.zzhzn.set(i, zzz);
        }
        return zzz;
    }

    static {
        zzecw zzecwVar = new zzecw();
        zzhzl = zzecwVar;
        zzecwVar.zzbcj();
        zzhzm = zzhzl;
    }
}
