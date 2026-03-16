package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdxy extends zzecd<zzdxy, zza> implements zzedq {
    private static volatile zzedx<zzdxy> zzea;
    private static final zzdxy zzhpp;
    private String zzhpn = "";
    private zzdxl zzhpo;

    private zzdxy() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdxy, zza> implements zzedq {
        private zza() {
            super(zzdxy.zzhpp);
        }

        /* synthetic */ zza(zzdxz zzdxzVar) {
            this();
        }
    }

    public final String zzbbl() {
        return this.zzhpn;
    }

    public final zzdxl zzbbm() {
        zzdxl zzdxlVar = this.zzhpo;
        return zzdxlVar == null ? zzdxl.zzbaj() : zzdxlVar;
    }

    public static zzdxy zzv(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdxy) zzecd.zza(zzhpp, zzeaqVar, zzebqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxz.zzdk[i - 1]) {
            case 1:
                return new zzdxy();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhpp, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzhpn", "zzhpo"});
            case 4:
                return zzhpp;
            case 5:
                zzedx<zzdxy> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdxy.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhpp);
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

    public static zzdxy zzbbn() {
        return zzhpp;
    }

    static {
        zzdxy zzdxyVar = new zzdxy();
        zzhpp = zzdxyVar;
        zzecd.zza(zzdxy.class, zzdxyVar);
    }
}
