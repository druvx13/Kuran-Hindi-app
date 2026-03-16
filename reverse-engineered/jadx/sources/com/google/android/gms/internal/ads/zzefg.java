package com.google.android.gms.internal.ads;

import java.util.ListIterator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzefg implements ListIterator<String> {
    private final /* synthetic */ int zzhhc;
    private final /* synthetic */ zzefd zzicn;
    private ListIterator<String> zzico;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefg(zzefd zzefdVar, int i) {
        zzecv zzecvVar;
        this.zzicn = zzefdVar;
        this.zzhhc = i;
        zzecvVar = this.zzicn.zzicl;
        this.zzico = zzecvVar.listIterator(this.zzhhc);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zzico.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzico.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzico.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzico.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.zzico.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.zzico.next();
    }
}
