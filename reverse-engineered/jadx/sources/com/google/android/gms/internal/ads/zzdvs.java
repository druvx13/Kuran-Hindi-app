package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdvs extends zzecd<zzdvs, zza> implements zzedq {
    private static volatile zzedx<zzdvs> zzea;
    private static final zzdvs zzhma;
    private int zzhlz;

    private zzdvs() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdvs, zza> implements zzedq {
        private zza() {
            super(zzdvs.zzhma);
        }

        /* synthetic */ zza(zzdvr zzdvrVar) {
            this();
        }
    }

    public final int zzayi() {
        return this.zzhlz;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvr.zzdk[i - 1]) {
            case 1:
                return new zzdvs();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhma, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhlz"});
            case 4:
                return zzhma;
            case 5:
                zzedx<zzdvs> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdvs.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhma);
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

    public static zzdvs zzayj() {
        return zzhma;
    }

    static {
        zzdvs zzdvsVar = new zzdvs();
        zzhma = zzdvsVar;
        zzecd.zza(zzdvs.class, zzdvsVar);
    }
}
