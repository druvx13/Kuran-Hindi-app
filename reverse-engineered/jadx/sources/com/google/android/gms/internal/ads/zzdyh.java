package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdyh extends zzecd<zzdyh, zza> implements zzedq {
    private static volatile zzedx<zzdyh> zzea;
    private static final zzdyh zzhqb;

    private zzdyh() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdyh, zza> implements zzedq {
        private zza() {
            super(zzdyh.zzhqb);
        }

        /* synthetic */ zza(zzdyg zzdygVar) {
            this();
        }
    }

    public static zzdyh zzx(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdyh) zzecd.zza(zzhqb, zzeaqVar, zzebqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdyg.zzdk[i - 1]) {
            case 1:
                return new zzdyh();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhqb, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzhqb;
            case 5:
                zzedx<zzdyh> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdyh.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhqb);
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
        zzdyh zzdyhVar = new zzdyh();
        zzhqb = zzdyhVar;
        zzecd.zza(zzdyh.class, zzdyhVar);
    }
}
