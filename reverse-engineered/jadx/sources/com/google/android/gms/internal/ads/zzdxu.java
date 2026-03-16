package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdxu extends zzecd<zzdxu, zza> implements zzedq {
    private static volatile zzedx<zzdxu> zzea;
    private static final zzdxu zzhpk;
    private String zzhpj = "";

    private zzdxu() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdxu, zza> implements zzedq {
        private zza() {
            super(zzdxu.zzhpk);
        }

        /* synthetic */ zza(zzdxv zzdxvVar) {
            this();
        }
    }

    public final String zzbbf() {
        return this.zzhpj;
    }

    public static zzdxu zzt(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdxu) zzecd.zza(zzhpk, zzeaqVar, zzebqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxv.zzdk[i - 1]) {
            case 1:
                return new zzdxu();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhpk, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzhpj"});
            case 4:
                return zzhpk;
            case 5:
                zzedx<zzdxu> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdxu.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhpk);
                            zzea = zzedxVar;
                        }
                    }
                }
                return zzedxVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static zzdxu zzbbg() {
        return zzhpk;
    }

    static {
        zzdxu zzdxuVar = new zzdxu();
        zzhpk = zzdxuVar;
        zzecd.zza(zzdxu.class, zzdxuVar);
    }
}
