package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzegs<E> implements Iterator<E> {
    private int pos = 0;
    private final /* synthetic */ zzegp zziis;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegs(zzegp zzegpVar) {
        this.zziis = zzegpVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.pos < this.zziis.zziiq.size() || this.zziis.zziir.hasNext();
    }

    @Override // java.util.Iterator
    public final E next() {
        while (this.pos >= this.zziis.zziiq.size()) {
            this.zziis.zziiq.add(this.zziis.zziir.next());
        }
        List<E> list = this.zziis.zziiq;
        int i = this.pos;
        this.pos = i + 1;
        return list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
