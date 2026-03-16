package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzecu<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zzhzk;

    public zzecu(Iterator<Map.Entry<K, Object>> it) {
        this.zzhzk = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzhzk.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzhzk.remove();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.zzhzk.next();
        return next.getValue() instanceof zzecp ? new zzecr(next) : next;
    }
}
