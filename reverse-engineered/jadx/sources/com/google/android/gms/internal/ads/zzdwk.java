package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdwk extends zzecd<zzdwk, zza> implements zzedq {
    private static volatile zzedx<zzdwk> zzea;
    private static final zzdwk zzhmq;
    private zzdxl zzhmp;

    private zzdwk() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdwk, zza> implements zzedq {
        private zza() {
            super(zzdwk.zzhmq);
        }

        /* synthetic */ zza(zzdwj zzdwjVar) {
            this();
        }
    }

    public final zzdxl zzayx() {
        zzdxl zzdxlVar = this.zzhmp;
        return zzdxlVar == null ? zzdxl.zzbaj() : zzdxlVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwj.zzdk[i - 1]) {
            case 1:
                return new zzdwk();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhmq, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzhmp"});
            case 4:
                return zzhmq;
            case 5:
                zzedx<zzdwk> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdwk.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhmq);
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

    public static zzdwk zzayy() {
        return zzhmq;
    }

    static {
        zzdwk zzdwkVar = new zzdwk();
        zzhmq = zzdwkVar;
        zzecd.zza(zzdwk.class, zzdwkVar);
    }
}
