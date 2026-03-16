package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzeeq extends zzeew {
    private final /* synthetic */ zzeel zzicc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzeeq(zzeel zzeelVar) {
        super(zzeelVar, null);
        this.zzicc = zzeelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeew, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzeen(this.zzicc, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeeq(zzeel zzeelVar, zzeeo zzeeoVar) {
        this(zzeelVar);
    }
}
