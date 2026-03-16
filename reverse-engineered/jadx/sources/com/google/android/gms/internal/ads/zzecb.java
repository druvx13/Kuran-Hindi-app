package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzecb implements zzedl {
    private static final zzecb zzhxq = new zzecb();

    private zzecb() {
    }

    public static zzecb zzben() {
        return zzhxq;
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final boolean zzc(Class<?> cls) {
        return zzecd.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzedl
    public final zzedm zzd(Class<?> cls) {
        if (!zzecd.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzedm) zzecd.zzf(cls.asSubclass(zzecd.class)).zza(zzecd.zzf.zzhyd, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
