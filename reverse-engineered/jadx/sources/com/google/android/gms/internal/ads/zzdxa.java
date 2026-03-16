package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdxa extends zzecd<zzdxa, zza> implements zzedq {
    private static volatile zzedx<zzdxa> zzea;
    private static final zzdxa zzhnv;
    private int zzhlh;
    private zzeaq zzhli = zzeaq.zzhtf;
    private zzdxe zzhnu;

    private zzdxa() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdxa, zza> implements zzedq {
        private zza() {
            super(zzdxa.zzhnv);
        }

        public final zza zzex(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxa) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzd(zzdxe zzdxeVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxa) this.zzhxt).zzc(zzdxeVar);
            return this;
        }

        public final zza zzad(zzeaq zzeaqVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxa) this.zzhxt).zzs(zzeaqVar);
            return this;
        }

        /* synthetic */ zza(zzdwz zzdwzVar) {
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

    public final zzdxe zzazu() {
        zzdxe zzdxeVar = this.zzhnu;
        return zzdxeVar == null ? zzdxe.zzbab() : zzdxeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(zzdxe zzdxeVar) {
        zzdxeVar.getClass();
        this.zzhnu = zzdxeVar;
    }

    public final zzeaq zzaxn() {
        return this.zzhli;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzeaq zzeaqVar) {
        zzeaqVar.getClass();
        this.zzhli = zzeaqVar;
    }

    public static zzdxa zzq(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdxa) zzecd.zza(zzhnv, zzeaqVar, zzebqVar);
    }

    public static zza zzazv() {
        return zzhnv.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwz.zzdk[i - 1]) {
            case 1:
                return new zzdxa();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhnv, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhlh", "zzhnu", "zzhli"});
            case 4:
                return zzhnv;
            case 5:
                zzedx<zzdxa> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdxa.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhnv);
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

    public static zzdxa zzazw() {
        return zzhnv;
    }

    static {
        zzdxa zzdxaVar = new zzdxa();
        zzhnv = zzdxaVar;
        zzecd.zza(zzdxa.class, zzdxaVar);
    }
}
