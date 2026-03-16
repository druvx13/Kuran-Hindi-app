package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdxt extends zzecd<zzdxt, zza> implements zzedq {
    private static volatile zzedx<zzdxt> zzea;
    private static final zzdxt zzhpi;
    private int zzhlh;
    private zzdxu zzhph;

    private zzdxt() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdxt, zza> implements zzedq {
        private zza() {
            super(zzdxt.zzhpi);
        }

        public final zza zzfe(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxt) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzb(zzdxu zzdxuVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxt) this.zzhxt).zza(zzdxuVar);
            return this;
        }

        /* synthetic */ zza(zzdxs zzdxsVar) {
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

    public final zzdxu zzbbc() {
        zzdxu zzdxuVar = this.zzhph;
        return zzdxuVar == null ? zzdxu.zzbbg() : zzdxuVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdxu zzdxuVar) {
        zzdxuVar.getClass();
        this.zzhph = zzdxuVar;
    }

    public static zzdxt zzs(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdxt) zzecd.zza(zzhpi, zzeaqVar, zzebqVar);
    }

    public static zza zzbbd() {
        return zzhpi.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxs.zzdk[i - 1]) {
            case 1:
                return new zzdxt();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhpi, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhlh", "zzhph"});
            case 4:
                return zzhpi;
            case 5:
                zzedx<zzdxt> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdxt.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhpi);
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
        zzdxt zzdxtVar = new zzdxt();
        zzhpi = zzdxtVar;
        zzecd.zza(zzdxt.class, zzdxtVar);
    }
}
