package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
final class zzdpi<K> extends zzdpb<K> {
    private final transient zzdou<K> zzhfg;
    private final transient zzdoy<K, ?> zzhfs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpi(zzdoy<K, ?> zzdoyVar, zzdou<K> zzdouVar) {
        this.zzhfs = zzdoyVar;
        this.zzhfg = zzdouVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final boolean zzavx() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final zzdpp<K> zzavs() {
        return (zzdpp) zzavw().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdot
    public final int zza(Object[] objArr, int i) {
        return zzavw().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzdpb, com.google.android.gms.internal.ads.zzdot
    public final zzdou<K> zzavw() {
        return this.zzhfg;
    }

    @Override // com.google.android.gms.internal.ads.zzdot, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return this.zzhfs.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzhfs.size();
    }

    @Override // com.google.android.gms.internal.ads.zzdpb, com.google.android.gms.internal.ads.zzdot, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
