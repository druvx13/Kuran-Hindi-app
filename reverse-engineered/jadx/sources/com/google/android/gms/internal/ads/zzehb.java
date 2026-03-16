package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzehb<K, V> extends zzegw<K, V, V> {
    private static final zzehm<Map<Object, Object>> zzijg = zzehc.zzbb(Collections.emptyMap());

    public static <K, V> zzehd<K, V> zzhw(int i) {
        return new zzehd<>(i);
    }

    private zzehb(Map<K, zzehm<V>> map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        LinkedHashMap zzhu = zzegy.zzhu(zzbir().size());
        for (Map.Entry<K, zzehm<V>> entry : zzbir().entrySet()) {
            zzhu.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(zzhu);
    }
}
