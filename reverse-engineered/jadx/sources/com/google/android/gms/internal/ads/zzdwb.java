package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdwb extends zzecd<zzdwb, zza> implements zzedq {
    private static volatile zzedx<zzdwb> zzea;
    private static final zzdwb zzhmg;
    private int zzhlh;
    private int zzhlm;

    private zzdwb() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdwb, zza> implements zzedq {
        private zza() {
            super(zzdwb.zzhmg);
        }

        /* synthetic */ zza(zzdwc zzdwcVar) {
            this();
        }
    }

    public final int getKeySize() {
        return this.zzhlm;
    }

    public static zzdwb zzk(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdwb) zzecd.zza(zzhmg, zzeaqVar, zzebqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwc.zzdk[i - 1]) {
            case 1:
                return new zzdwb();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhmg, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzhlm", "zzhlh"});
            case 4:
                return zzhmg;
            case 5:
                zzedx<zzdwb> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdwb.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhmg);
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
        zzdwb zzdwbVar = new zzdwb();
        zzhmg = zzdwbVar;
        zzecd.zza(zzdwb.class, zzdwbVar);
    }
}
