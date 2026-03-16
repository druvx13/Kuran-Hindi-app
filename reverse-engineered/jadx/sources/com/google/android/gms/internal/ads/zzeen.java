package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzeen<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzicb;
    private final /* synthetic */ zzeel zzicc;

    private zzeen(zzeel zzeelVar) {
        List list;
        this.zzicc = zzeelVar;
        list = this.zzicc.zzibs;
        this.pos = list.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.pos;
        if (i > 0) {
            list = this.zzicc.zzibs;
            if (i <= list.size()) {
                return true;
            }
        }
        return zzbha().hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zzbha() {
        Map map;
        if (this.zzicb == null) {
            map = this.zzicc.zzibv;
            this.zzicb = map.entrySet().iterator();
        }
        return this.zzicb;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        if (zzbha().hasNext()) {
            return zzbha().next();
        }
        list = this.zzicc.zzibs;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) list.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeen(zzeel zzeelVar, zzeeo zzeeoVar) {
        this(zzeelVar);
    }
}
