package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzedg<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void zza(zzebk zzebkVar, zzedf<K, V> zzedfVar, K k, V v) throws IOException {
        zzebt.zza(zzebkVar, zzedfVar.zzhzw, 1, k);
        zzebt.zza(zzebkVar, zzedfVar.zzhzy, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int zza(zzedf<K, V> zzedfVar, K k, V v) {
        return zzebt.zza(zzedfVar.zzhzw, 1, k) + zzebt.zza(zzedfVar.zzhzy, 2, v);
    }
}
