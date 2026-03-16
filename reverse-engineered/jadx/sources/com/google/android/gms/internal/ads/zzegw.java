package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
abstract class zzegw<K, V, V2> implements zzegz<Map<K, V2>> {
    private final Map<K, zzehm<V>> zzijc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegw(Map<K, zzehm<V>> map) {
        this.zzijc = Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, zzehm<V>> zzbir() {
        return this.zzijc;
    }
}
