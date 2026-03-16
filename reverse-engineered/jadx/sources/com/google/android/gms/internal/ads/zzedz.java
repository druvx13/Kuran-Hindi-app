package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzedz {
    private static final zzedz zziaw = new zzedz();
    private final ConcurrentMap<Class<?>, zzeek<?>> zziay = new ConcurrentHashMap();
    private final zzeej zziax = new zzedb();

    public static zzedz zzbgk() {
        return zziaw;
    }

    public final <T> zzeek<T> zzh(Class<T> cls) {
        zzecg.zza(cls, "messageType");
        zzeek<T> zzeekVar = (zzeek<T>) this.zziay.get(cls);
        if (zzeekVar == null) {
            zzeek<T> zzg = this.zziax.zzg(cls);
            zzecg.zza(cls, "messageType");
            zzecg.zza(zzg, "schema");
            zzeek<T> zzeekVar2 = (zzeek<T>) this.zziay.putIfAbsent(cls, zzg);
            return zzeekVar2 != null ? zzeekVar2 : zzg;
        }
        return zzeekVar;
    }

    public final <T> zzeek<T> zzax(T t) {
        return zzh(t.getClass());
    }

    private zzedz() {
    }
}
