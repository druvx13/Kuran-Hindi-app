package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
final class zzdpg<K, V> extends zzdpb<Map.Entry<K, V>> {
    private final transient int size;
    private final transient zzdoy<K, V> zzhfs;
    private final transient Object[] zzhft;
    private final transient int zzhfu = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpg(zzdoy<K, V> zzdoyVar, Object[] objArr, int i, int i2) {
        this.zzhfs = zzdoyVar;
        this.zzhft = objArr;
        this.size = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final boolean zzavx() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final zzdpp<Map.Entry<K, V>> zzavs() {
        return (zzdpp) zzavw().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final int zza(Object[] objArr, int i) {
        return zzavw().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzdpb
    final zzdou<Map.Entry<K, V>> zzawe() {
        return new zzdpj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzdot, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zzhfs.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdpb, com.google.android.gms.internal.ads.zzdot, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
