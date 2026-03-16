package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdvt extends zzecd<zzdvt, zza> implements zzedq {
    private static volatile zzedx<zzdvt> zzea;
    private static final zzdvt zzhmc;
    private int zzhlh;
    private zzeaq zzhli = zzeaq.zzhtf;
    private zzdvx zzhmb;

    private zzdvt() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdvt, zza> implements zzedq {
        private zza() {
            super(zzdvt.zzhmc);
        }

        public final zza zzep(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvt) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzb(zzdvx zzdvxVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvt) this.zzhxt).zza(zzdvxVar);
            return this;
        }

        public final zza zzv(zzeaq zzeaqVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvt) this.zzhxt).zzs(zzeaqVar);
            return this;
        }

        /* synthetic */ zza(zzdvu zzdvuVar) {
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

    public final zzdvx zzayl() {
        zzdvx zzdvxVar = this.zzhmb;
        return zzdvxVar == null ? zzdvx.zzayp() : zzdvxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdvx zzdvxVar) {
        zzdvxVar.getClass();
        this.zzhmb = zzdvxVar;
    }

    public final zzeaq zzaxn() {
        return this.zzhli;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzeaq zzeaqVar) {
        zzeaqVar.getClass();
        this.zzhli = zzeaqVar;
    }

    public static zzdvt zzh(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdvt) zzecd.zza(zzhmc, zzeaqVar, zzebqVar);
    }

    public static zza zzaym() {
        return zzhmc.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvu.zzdk[i - 1]) {
            case 1:
                return new zzdvt();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhmc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhlh", "zzhmb", "zzhli"});
            case 4:
                return zzhmc;
            case 5:
                zzedx<zzdvt> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdvt.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhmc);
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
        zzdvt zzdvtVar = new zzdvt();
        zzhmc = zzdvtVar;
        zzecd.zza(zzdvt.class, zzdvtVar);
    }
}
