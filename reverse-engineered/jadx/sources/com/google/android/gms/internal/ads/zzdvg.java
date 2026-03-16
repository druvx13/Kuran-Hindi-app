package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdvg extends zzecd<zzdvg, zza> implements zzedq {
    private static volatile zzedx<zzdvg> zzea;
    private static final zzdvg zzhln;
    private zzdvh zzhlj;
    private int zzhlm;

    private zzdvg() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdvg, zza> implements zzedq {
        private zza() {
            super(zzdvg.zzhln);
        }

        /* synthetic */ zza(zzdvf zzdvfVar) {
            this();
        }
    }

    public final int getKeySize() {
        return this.zzhlm;
    }

    public final zzdvh zzaxo() {
        zzdvh zzdvhVar = this.zzhlj;
        return zzdvhVar == null ? zzdvh.zzaxt() : zzdvhVar;
    }

    public static zzdvg zzc(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdvg) zzecd.zza(zzhln, zzeaqVar, zzebqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvf.zzdk[i - 1]) {
            case 1:
                return new zzdvg();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhln, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhlm", "zzhlj"});
            case 4:
                return zzhln;
            case 5:
                zzedx<zzdvg> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdvg.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhln);
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
        zzdvg zzdvgVar = new zzdvg();
        zzhln = zzdvgVar;
        zzecd.zza(zzdvg.class, zzdvgVar);
    }
}
