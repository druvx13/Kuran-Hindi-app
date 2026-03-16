package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdvp extends zzecd<zzdvp, zza> implements zzedq {
    private static volatile zzedx<zzdvp> zzea;
    private static final zzdvp zzhly;
    private int zzhlm;
    private zzdvs zzhlw;

    private zzdvp() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdvp, zza> implements zzedq {
        private zza() {
            super(zzdvp.zzhly);
        }

        /* synthetic */ zza(zzdvq zzdvqVar) {
            this();
        }
    }

    public final zzdvs zzayc() {
        zzdvs zzdvsVar = this.zzhlw;
        return zzdvsVar == null ? zzdvs.zzayj() : zzdvsVar;
    }

    public final int getKeySize() {
        return this.zzhlm;
    }

    public static zzdvp zzg(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdvp) zzecd.zza(zzhly, zzeaqVar, zzebqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvq.zzdk[i - 1]) {
            case 1:
                return new zzdvp();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhly, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhlw", "zzhlm"});
            case 4:
                return zzhly;
            case 5:
                zzedx<zzdvp> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdvp.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhly);
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

    public static zzdvp zzayg() {
        return zzhly;
    }

    static {
        zzdvp zzdvpVar = new zzdvp();
        zzhly = zzdvpVar;
        zzecd.zza(zzdvp.class, zzdvpVar);
    }
}
