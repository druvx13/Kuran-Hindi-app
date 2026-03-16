package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdvo extends zzecd<zzdvo, zza> implements zzedq {
    private static volatile zzedx<zzdvo> zzea;
    private static final zzdvo zzhlx;
    private int zzhlh;
    private zzeaq zzhli = zzeaq.zzhtf;
    private zzdvs zzhlw;

    private zzdvo() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdvo, zza> implements zzedq {
        private zza() {
            super(zzdvo.zzhlx);
        }

        public final zza zzeo(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvo) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzc(zzdvs zzdvsVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvo) this.zzhxt).zzb(zzdvsVar);
            return this;
        }

        public final zza zzu(zzeaq zzeaqVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvo) this.zzhxt).zzs(zzeaqVar);
            return this;
        }

        /* synthetic */ zza(zzdvn zzdvnVar) {
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

    public final zzdvs zzayc() {
        zzdvs zzdvsVar = this.zzhlw;
        return zzdvsVar == null ? zzdvs.zzayj() : zzdvsVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzdvs zzdvsVar) {
        zzdvsVar.getClass();
        this.zzhlw = zzdvsVar;
    }

    public final zzeaq zzaxn() {
        return this.zzhli;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzeaq zzeaqVar) {
        zzeaqVar.getClass();
        this.zzhli = zzeaqVar;
    }

    public static zzdvo zzf(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdvo) zzecd.zza(zzhlx, zzeaqVar, zzebqVar);
    }

    public static zza zzayd() {
        return zzhlx.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdvn.zzdk[i - 1]) {
            case 1:
                return new zzdvo();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhlx, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhlh", "zzhlw", "zzhli"});
            case 4:
                return zzhlx;
            case 5:
                zzedx<zzdvo> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdvo.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhlx);
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

    public static zzdvo zzaye() {
        return zzhlx;
    }

    static {
        zzdvo zzdvoVar = new zzdvo();
        zzhlx = zzdvoVar;
        zzecd.zza(zzdvo.class, zzdvoVar);
    }
}
