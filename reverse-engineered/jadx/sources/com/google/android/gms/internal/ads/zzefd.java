package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzefd extends AbstractList<String> implements zzecv, RandomAccess {
    private final zzecv zzicl;

    public zzefd(zzecv zzecvVar) {
        this.zzicl = zzecvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final zzecv zzbft() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final Object zzgy(int i) {
        return this.zzicl.zzgy(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzicl.size();
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final void zzaj(zzeaq zzeaqVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzefg(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzeff(this);
    }

    @Override // com.google.android.gms.internal.ads.zzecv
    public final List<?> zzbfs() {
        return this.zzicl.zzbfs();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zzicl.get(i);
    }
}
