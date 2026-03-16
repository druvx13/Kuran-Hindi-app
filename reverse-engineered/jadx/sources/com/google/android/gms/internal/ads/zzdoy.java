package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzdoy<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zzhfh = new Map.Entry[0];
    private transient zzdpb<Map.Entry<K, V>> zzhfi;
    private transient zzdpb<K> zzhfj;
    private transient zzdot<V> zzhfk;

    public static <K, V> zzdoy<K, V> zza(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        zzdoo.zzb(k, v);
        zzdoo.zzb(k2, v2);
        zzdoo.zzb(k3, v3);
        zzdoo.zzb(k4, v4);
        zzdoo.zzb(k5, v5);
        return zzdph.zzc(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    abstract zzdpb<Map.Entry<K, V>> zzavz();

    abstract zzdpb<K> zzawa();

    abstract zzdot<V> zzawb();

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return ((zzdot) values()).contains(obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzdpn.zzg((zzdpb) entrySet());
    }

    public String toString() {
        int size = size();
        zzdoo.zzj(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzdpb<Map.Entry<K, V>> zzdpbVar = this.zzhfi;
        if (zzdpbVar == null) {
            zzdpb<Map.Entry<K, V>> zzavz = zzavz();
            this.zzhfi = zzavz;
            return zzavz;
        }
        return zzdpbVar;
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzdot<V> zzdotVar = this.zzhfk;
        if (zzdotVar == null) {
            zzdot<V> zzawb = zzawb();
            this.zzhfk = zzawb;
            return zzawb;
        }
        return zzdotVar;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzdpb<K> zzdpbVar = this.zzhfj;
        if (zzdpbVar == null) {
            zzdpb<K> zzawa = zzawa();
            this.zzhfj = zzawa;
            return zzawa;
        }
        return zzdpbVar;
    }
}
