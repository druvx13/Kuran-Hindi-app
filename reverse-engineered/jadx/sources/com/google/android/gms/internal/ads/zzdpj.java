package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
final class zzdpj<K, V> extends zzdou<Map.Entry<K, V>> {
    private final /* synthetic */ zzdpg zzhfx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpj(zzdpg zzdpgVar) {
        this.zzhfx = zzdpgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final boolean zzavx() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zzhfx.size;
        return i;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zzhfx.size;
        zzdoj.zzs(i, i2);
        objArr = this.zzhfx.zzhft;
        int i3 = i * 2;
        zzdpg zzdpgVar = this.zzhfx;
        Object obj = objArr[i3];
        objArr2 = zzdpgVar.zzhft;
        return new AbstractMap.SimpleImmutableEntry(obj, objArr2[i3 + 1]);
    }
}
