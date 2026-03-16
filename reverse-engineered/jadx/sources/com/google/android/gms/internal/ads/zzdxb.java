package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdxb extends zzecd<zzdxb, zza> implements zzedq {
    private static volatile zzedx<zzdxb> zzea;
    private static final zzdxb zzhnw;
    private int zzhlh;
    private int zzhlm;
    private zzdxe zzhnu;

    private zzdxb() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdxb, zza> implements zzedq {
        private zza() {
            super(zzdxb.zzhnw);
        }

        /* synthetic */ zza(zzdxc zzdxcVar) {
            this();
        }
    }

    public final zzdxe zzazu() {
        zzdxe zzdxeVar = this.zzhnu;
        return zzdxeVar == null ? zzdxe.zzbab() : zzdxeVar;
    }

    public final int getKeySize() {
        return this.zzhlm;
    }

    public static zzdxb zzr(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdxb) zzecd.zza(zzhnw, zzeaqVar, zzebqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxc.zzdk[i - 1]) {
            case 1:
                return new zzdxb();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhnw, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzhnu", "zzhlm", "zzhlh"});
            case 4:
                return zzhnw;
            case 5:
                zzedx<zzdxb> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdxb.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhnw);
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

    public static zzdxb zzazy() {
        return zzhnw;
    }

    static {
        zzdxb zzdxbVar = new zzdxb();
        zzhnw = zzdxbVar;
        zzecd.zza(zzdxb.class, zzdxbVar);
    }
}
