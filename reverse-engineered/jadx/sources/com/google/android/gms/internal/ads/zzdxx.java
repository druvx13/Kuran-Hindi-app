package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdxx extends zzecd<zzdxx, zza> implements zzedq {
    private static volatile zzedx<zzdxx> zzea;
    private static final zzdxx zzhpm;
    private int zzhlh;
    private zzdxy zzhpl;

    private zzdxx() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdxx, zza> implements zzedq {
        private zza() {
            super(zzdxx.zzhpm);
        }

        public final zza zzff(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxx) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzb(zzdxy zzdxyVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxx) this.zzhxt).zza(zzdxyVar);
            return this;
        }

        /* synthetic */ zza(zzdxw zzdxwVar) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzhlh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzhlh = i;
    }

    public final zzdxy zzbbi() {
        zzdxy zzdxyVar = this.zzhpl;
        return zzdxyVar == null ? zzdxy.zzbbn() : zzdxyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdxy zzdxyVar) {
        zzdxyVar.getClass();
        this.zzhpl = zzdxyVar;
    }

    public static zzdxx zzu(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdxx) zzecd.zza(zzhpm, zzeaqVar, zzebqVar);
    }

    public static zza zzbbj() {
        return zzhpm.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxw.zzdk[i - 1]) {
            case 1:
                return new zzdxx();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhpm, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhlh", "zzhpl"});
            case 4:
                return zzhpm;
            case 5:
                zzedx<zzdxx> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdxx.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhpm);
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
        zzdxx zzdxxVar = new zzdxx();
        zzhpm = zzdxxVar;
        zzecd.zza(zzdxx.class, zzdxxVar);
    }
}
