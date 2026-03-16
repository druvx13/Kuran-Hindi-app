package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdxe extends zzecd<zzdxe, zza> implements zzedq {
    private static volatile zzedx<zzdxe> zzea;
    private static final zzdxe zzhny;
    private int zzhlo;
    private int zzhnx;

    private zzdxe() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdxe, zza> implements zzedq {
        private zza() {
            super(zzdxe.zzhny);
        }

        /* synthetic */ zza(zzdxd zzdxdVar) {
            this();
        }
    }

    public final zzdwy zzbaa() {
        zzdwy zzew = zzdwy.zzew(this.zzhnx);
        return zzew == null ? zzdwy.UNRECOGNIZED : zzew;
    }

    public final int zzaxs() {
        return this.zzhlo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxd.zzdk[i - 1]) {
            case 1:
                return new zzdxe();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhny, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzhnx", "zzhlo"});
            case 4:
                return zzhny;
            case 5:
                zzedx<zzdxe> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdxe.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhny);
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

    public static zzdxe zzbab() {
        return zzhny;
    }

    static {
        zzdxe zzdxeVar = new zzdxe();
        zzhny = zzdxeVar;
        zzecd.zza(zzdxe.class, zzdxeVar);
    }
}
