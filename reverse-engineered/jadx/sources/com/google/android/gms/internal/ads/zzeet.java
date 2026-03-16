package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzeet<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzicb;
    private final /* synthetic */ zzeel zzicc;
    private boolean zzicf;

    private zzeet(zzeel zzeelVar) {
        this.zzicc = zzeelVar;
        this.pos = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.pos + 1;
        list = this.zzicc.zzibs;
        if (i >= list.size()) {
            map = this.zzicc.zzibt;
            if (map.isEmpty() || !zzbha().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzicf) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzicf = false;
        this.zzicc.zzbgt();
        int i = this.pos;
        list = this.zzicc.zzibs;
        if (i < list.size()) {
            zzeel zzeelVar = this.zzicc;
            int i2 = this.pos;
            this.pos = i2 - 1;
            zzeelVar.zzhk(i2);
            return;
        }
        zzbha().remove();
    }

    private final Iterator<Map.Entry<K, V>> zzbha() {
        Map map;
        if (this.zzicb == null) {
            map = this.zzicc.zzibt;
            this.zzicb = map.entrySet().iterator();
        }
        return this.zzicb;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        List list2;
        this.zzicf = true;
        int i = this.pos + 1;
        this.pos = i;
        list = this.zzicc.zzibs;
        if (i >= list.size()) {
            return zzbha().next();
        }
        list2 = this.zzicc.zzibs;
        return (Map.Entry) list2.get(this.pos);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeet(zzeel zzeelVar, zzeeo zzeeoVar) {
        this(zzeelVar);
    }
}
