package com.google.android.gms.internal.measurement;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
/* loaded from: classes.dex */
public final class zzgg<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void zza(zzen zzenVar, zzgf<K, V> zzgfVar, K k, V v) throws IOException {
        zzew.zza(zzenVar, zzgfVar.zza, 1, k);
        zzew.zza(zzenVar, zzgfVar.zzc, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int zza(zzgf<K, V> zzgfVar, K k, V v) {
        return zzew.zza(zzgfVar.zza, 1, k) + zzew.zza(zzgfVar.zzc, 2, v);
    }
}
