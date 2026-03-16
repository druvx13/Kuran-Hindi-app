package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdwt extends zzecd<zzdwt, zza> implements zzedq {
    private static volatile zzedx<zzdwt> zzea;
    private static final zzdwt zzhnf;
    private int zzhnc;
    private int zzhnd;
    private zzeaq zzhne = zzeaq.zzhtf;

    private zzdwt() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdwt, zza> implements zzedq {
        private zza() {
            super(zzdwt.zzhnf);
        }

        /* synthetic */ zza(zzdwu zzdwuVar) {
            this();
        }
    }

    public final zzdww zzazp() {
        zzdww zzev = zzdww.zzev(this.zzhnc);
        return zzev == null ? zzdww.UNRECOGNIZED : zzev;
    }

    public final zzdwy zzazq() {
        zzdwy zzew = zzdwy.zzew(this.zzhnd);
        return zzew == null ? zzdwy.UNRECOGNIZED : zzew;
    }

    public final zzeaq zzazr() {
        return this.zzhne;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwu.zzdk[i - 1]) {
            case 1:
                return new zzdwt();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhnf, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzhnc", "zzhnd", "zzhne"});
            case 4:
                return zzhnf;
            case 5:
                zzedx<zzdwt> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdwt.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhnf);
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

    public static zzdwt zzazs() {
        return zzhnf;
    }

    static {
        zzdwt zzdwtVar = new zzdwt();
        zzhnf = zzdwtVar;
        zzecd.zza(zzdwt.class, zzdwtVar);
    }
}
