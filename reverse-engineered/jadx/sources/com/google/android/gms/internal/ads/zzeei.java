package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzeei implements Iterator<zzebb> {
    private final ArrayDeque<zzeed> zzibp;
    private zzebb zzibq;

    private zzeei(zzeaq zzeaqVar) {
        zzeaq zzeaqVar2;
        if (zzeaqVar instanceof zzeed) {
            zzeed zzeedVar = (zzeed) zzeaqVar;
            ArrayDeque<zzeed> arrayDeque = new ArrayDeque<>(zzeedVar.zzbcs());
            this.zzibp = arrayDeque;
            arrayDeque.push(zzeedVar);
            zzeaqVar2 = zzeedVar.zzibc;
            this.zzibq = zzal(zzeaqVar2);
            return;
        }
        this.zzibp = null;
        this.zzibq = (zzebb) zzeaqVar;
    }

    private final zzebb zzal(zzeaq zzeaqVar) {
        while (zzeaqVar instanceof zzeed) {
            zzeed zzeedVar = (zzeed) zzeaqVar;
            this.zzibp.push(zzeedVar);
            zzeaqVar = zzeedVar.zzibc;
        }
        return (zzebb) zzeaqVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzibq != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzebb next() {
        zzebb zzebbVar;
        zzeaq zzeaqVar;
        zzebb zzebbVar2 = this.zzibq;
        if (zzebbVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque<zzeed> arrayDeque = this.zzibp;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                zzebbVar = null;
                break;
            }
            zzeaqVar = this.zzibp.pop().zzibd;
            zzebbVar = zzal(zzeaqVar);
        } while (zzebbVar.isEmpty());
        this.zzibq = zzebbVar;
        return zzebbVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeei(zzeaq zzeaqVar, zzeeg zzeegVar) {
        this(zzeaqVar);
    }
}
