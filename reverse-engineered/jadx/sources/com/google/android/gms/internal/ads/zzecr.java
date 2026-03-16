package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzecr<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzecp> zzhzg;

    private zzecr(Map.Entry<K, zzecp> entry) {
        this.zzhzg = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zzhzg.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zzhzg.getValue() == null) {
            return null;
        }
        return zzecp.zzbfp();
    }

    public final zzecp zzbfr() {
        return this.zzhzg.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzedo)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return this.zzhzg.getValue().zzn((zzedo) obj);
    }
}
