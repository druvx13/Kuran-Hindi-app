package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdwp extends zzecd<zzdwp, zza> implements zzedq {
    private static volatile zzedx<zzdwp> zzea;
    private static final zzdwp zzhmy;
    private int zzhlh;
    private zzeaq zzhli = zzeaq.zzhtf;
    private zzdws zzhmx;

    private zzdwp() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdwp, zza> implements zzedq {
        private zza() {
            super(zzdwp.zzhmy);
        }

        public final zza zzet(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdwp) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzb(zzdws zzdwsVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdwp) this.zzhxt).zza(zzdwsVar);
            return this;
        }

        public final zza zzy(zzeaq zzeaqVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdwp) this.zzhxt).zzs(zzeaqVar);
            return this;
        }

        /* synthetic */ zza(zzdwq zzdwqVar) {
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

    public final zzdws zzazh() {
        zzdws zzdwsVar = this.zzhmx;
        return zzdwsVar == null ? zzdws.zzazn() : zzdwsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdws zzdwsVar) {
        zzdwsVar.getClass();
        this.zzhmx = zzdwsVar;
    }

    public final zzeaq zzaxn() {
        return this.zzhli;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzeaq zzeaqVar) {
        zzeaqVar.getClass();
        this.zzhli = zzeaqVar;
    }

    public static zzdwp zzo(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdwp) zzecd.zza(zzhmy, zzeaqVar, zzebqVar);
    }

    public static zza zzazi() {
        return zzhmy.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwq.zzdk[i - 1]) {
            case 1:
                return new zzdwp();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhmy, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhlh", "zzhmx", "zzhli"});
            case 4:
                return zzhmy;
            case 5:
                zzedx<zzdwp> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdwp.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhmy);
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
        zzdwp zzdwpVar = new zzdwp();
        zzhmy = zzdwpVar;
        zzecd.zza(zzdwp.class, zzdwpVar);
    }
}
