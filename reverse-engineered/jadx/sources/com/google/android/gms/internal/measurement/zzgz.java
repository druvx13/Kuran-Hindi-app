package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
/* loaded from: classes.dex */
public final class zzgz {
    private static final zzgz zza = new zzgz();
    private final ConcurrentMap<Class<?>, zzhd<?>> zzc = new ConcurrentHashMap();
    private final zzhg zzb = new zzgb();

    public static zzgz zza() {
        return zza;
    }

    public final <T> zzhd<T> zza(Class<T> cls) {
        zzff.zza(cls, "messageType");
        zzhd<T> zzhdVar = (zzhd<T>) this.zzc.get(cls);
        if (zzhdVar == null) {
            zzhd<T> zza2 = this.zzb.zza(cls);
            zzff.zza(cls, "messageType");
            zzff.zza(zza2, "schema");
            zzhd<T> zzhdVar2 = (zzhd<T>) this.zzc.putIfAbsent(cls, zza2);
            return zzhdVar2 != null ? zzhdVar2 : zza2;
        }
        return zzhdVar;
    }

    public final <T> zzhd<T> zza(T t) {
        return zza((Class) t.getClass());
    }

    private zzgz() {
    }
}
