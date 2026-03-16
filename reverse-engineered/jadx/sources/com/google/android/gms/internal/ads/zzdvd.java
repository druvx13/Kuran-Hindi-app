package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdvd extends zzecd<zzdvd, zza> implements zzedq {
    private static volatile zzedx<zzdvd> zzea;
    private static final zzdvd zzhlk;
    private int zzhlh;
    private zzeaq zzhli = zzeaq.zzhtf;
    private zzdvh zzhlj;

    private zzdvd() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdvd, zza> implements zzedq {
        private zza() {
            super(zzdvd.zzhlk);
        }

        public final zza zzem(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvd) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzt(zzeaq zzeaqVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvd) this.zzhxt).zzs(zzeaqVar);
            return this;
        }

        public final zza zzd(zzdvh zzdvhVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdvd) this.zzhxt).zzc(zzdvhVar);
            return this;
        }

        /* synthetic */ zza(zzdve zzdveVar) {
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

    public final zzeaq zzaxn() {
        return this.zzhli;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzeaq zzeaqVar) {
        zzeaqVar.getClass();
        this.zzhli = zzeaqVar;
    }

    public final zzdvh zzaxo() {
        zzdvh zzdvhVar = this.zzhlj;
        return zzdvhVar == null ? zzdvh.zzaxt() : zzdvhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(zzdvh zzdvhVar) {
        zzdvhVar.getClass();
        this.zzhlj = zzdvhVar;
    }

    public static zzdvd zzb(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdvd) zzecd.zza(zzhlk, zzeaqVar, zzebqVar);
    }

    public static zza zzaxp() {
        return zzhlk.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdve.zzdk[i - 1]) {
            case 1:
                return new zzdvd();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhlk, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzhlh", "zzhli", "zzhlj"});
            case 4:
                return zzhlk;
            case 5:
                zzedx<zzdvd> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdvd.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhlk);
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
        zzdvd zzdvdVar = new zzdvd();
        zzhlk = zzdvdVar;
        zzecd.zza(zzdvd.class, zzdvdVar);
    }
}
