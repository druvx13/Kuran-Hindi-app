package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdvx extends zzecd<zzdvx, zza> implements zzedq {
    private static volatile zzedx<zzdvx> zzea;
    private static final zzdvx zzhme;
    private int zzhlz;

    private zzdvx() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdvx, zza> implements zzedq {
        private zza() {
            super(zzdvx.zzhme);
        }

        /* synthetic */ zza(zzdvy zzdvyVar) {
            this();
        }
    }

    public final int zzayi() {
        return this.zzhlz;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvy.zzdk[i - 1]) {
            case 1:
                return new zzdvx();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhme, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhlz"});
            case 4:
                return zzhme;
            case 5:
                zzedx<zzdvx> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdvx.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhme);
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

    public static zzdvx zzayp() {
        return zzhme;
    }

    static {
        zzdvx zzdvxVar = new zzdvx();
        zzhme = zzdvxVar;
        zzecd.zza(zzdvx.class, zzdvxVar);
    }
}
