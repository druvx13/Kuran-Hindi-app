package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdwl extends zzecd<zzdwl, zza> implements zzedq {
    private static volatile zzedx<zzdwl> zzea;
    private static final zzdwl zzhms;
    private zzdwo zzhmr;

    private zzdwl() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdwl, zza> implements zzedq {
        private zza() {
            super(zzdwl.zzhms);
        }

        /* synthetic */ zza(zzdwm zzdwmVar) {
            this();
        }
    }

    public final zzdwo zzaza() {
        zzdwo zzdwoVar = this.zzhmr;
        return zzdwoVar == null ? zzdwo.zzazf() : zzdwoVar;
    }

    public static zzdwl zzn(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdwl) zzecd.zza(zzhms, zzeaqVar, zzebqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwm.zzdk[i - 1]) {
            case 1:
                return new zzdwl();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhms, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzhmr"});
            case 4:
                return zzhms;
            case 5:
                zzedx<zzdwl> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdwl.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhms);
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
        zzdwl zzdwlVar = new zzdwl();
        zzhms = zzdwlVar;
        zzecd.zza(zzdwl.class, zzdwlVar);
    }
}
