package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdvl extends zzecd<zzdvl, zza> implements zzedq {
    private static volatile zzedx<zzdvl> zzea;
    private static final zzdvl zzhlv;
    private zzdvp zzhlt;
    private zzdxb zzhlu;

    private zzdvl() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdvl, zza> implements zzedq {
        private zza() {
            super(zzdvl.zzhlv);
        }

        /* synthetic */ zza(zzdvm zzdvmVar) {
            this();
        }
    }

    public final zzdvp zzaxz() {
        zzdvp zzdvpVar = this.zzhlt;
        return zzdvpVar == null ? zzdvp.zzayg() : zzdvpVar;
    }

    public final zzdxb zzaya() {
        zzdxb zzdxbVar = this.zzhlu;
        return zzdxbVar == null ? zzdxb.zzazy() : zzdxbVar;
    }

    public static zzdvl zze(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdvl) zzecd.zza(zzhlv, zzeaqVar, zzebqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvm.zzdk[i - 1]) {
            case 1:
                return new zzdvl();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhlv, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzhlt", "zzhlu"});
            case 4:
                return zzhlv;
            case 5:
                zzedx<zzdvl> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdvl.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhlv);
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
        zzdvl zzdvlVar = new zzdvl();
        zzhlv = zzdvlVar;
        zzecd.zza(zzdvl.class, zzdvlVar);
    }
}
