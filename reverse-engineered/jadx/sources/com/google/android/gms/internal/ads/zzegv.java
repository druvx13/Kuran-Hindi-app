package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zzegv<K, V, V2> {
    final LinkedHashMap<K, zzehm<V>> zzijb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzegv(int i) {
        this.zzijb = zzegy.zzhu(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public zzegv<K, V, V2> zza(K k, zzehm<V> zzehmVar) {
        this.zzijb.put(zzehf.zza(k, "key"), zzehf.zza(zzehmVar, "provider"));
        return this;
    }
}
