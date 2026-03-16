package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdvh extends zzecd<zzdvh, zza> implements zzedq {
    private static volatile zzedx<zzdvh> zzea;
    private static final zzdvh zzhlp;
    private int zzhlo;

    private zzdvh() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdvh, zza> implements zzedq {
        private zza() {
            super(zzdvh.zzhlp);
        }

        /* synthetic */ zza(zzdvi zzdviVar) {
            this();
        }
    }

    public final int zzaxs() {
        return this.zzhlo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvi.zzdk[i - 1]) {
            case 1:
                return new zzdvh();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhlp, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhlo"});
            case 4:
                return zzhlp;
            case 5:
                zzedx<zzdvh> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdvh.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhlp);
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

    public static zzdvh zzaxt() {
        return zzhlp;
    }

    static {
        zzdvh zzdvhVar = new zzdvh();
        zzhlp = zzdvhVar;
        zzecd.zza(zzdvh.class, zzdvhVar);
    }
}
