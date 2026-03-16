package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdwf extends zzecd<zzdwf, zza> implements zzedq {
    private static volatile zzedx<zzdwf> zzea;
    private static final zzdwf zzhmi;

    private zzdwf() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdwf, zza> implements zzedq {
        private zza() {
            super(zzdwf.zzhmi);
        }

        /* synthetic */ zza(zzdwg zzdwgVar) {
            this();
        }
    }

    public static zzdwf zzm(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdwf) zzecd.zza(zzhmi, zzeaqVar, zzebqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwg.zzdk[i - 1]) {
            case 1:
                return new zzdwf();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhmi, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzhmi;
            case 5:
                zzedx<zzdwf> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdwf.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhmi);
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

    static {
        zzdwf zzdwfVar = new zzdwf();
        zzhmi = zzdwfVar;
        zzecd.zza(zzdwf.class, zzdwfVar);
    }
}
