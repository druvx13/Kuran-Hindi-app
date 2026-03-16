package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdws extends zzecd<zzdws, zza> implements zzedq {
    private static volatile zzedx<zzdws> zzea;
    private static final zzdws zzhnb;
    private int zzhlh;
    private zzdwo zzhmr;
    private zzeaq zzhmz = zzeaq.zzhtf;
    private zzeaq zzhna = zzeaq.zzhtf;

    private zzdws() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdws, zza> implements zzedq {
        private zza() {
            super(zzdws.zzhnb);
        }

        public final zza zzeu(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdws) this.zzhxt).setVersion(0);
            return this;
        }

        public final zza zzc(zzdwo zzdwoVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdws) this.zzhxt).zzb(zzdwoVar);
            return this;
        }

        public final zza zzab(zzeaq zzeaqVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdws) this.zzhxt).zzz(zzeaqVar);
            return this;
        }

        public final zza zzac(zzeaq zzeaqVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdws) this.zzhxt).zzaa(zzeaqVar);
            return this;
        }

        /* synthetic */ zza(zzdwr zzdwrVar) {
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

    public final zzdwo zzaza() {
        zzdwo zzdwoVar = this.zzhmr;
        return zzdwoVar == null ? zzdwo.zzazf() : zzdwoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzdwo zzdwoVar) {
        zzdwoVar.getClass();
        this.zzhmr = zzdwoVar;
    }

    public final zzeaq zzazk() {
        return this.zzhmz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzz(zzeaq zzeaqVar) {
        zzeaqVar.getClass();
        this.zzhmz = zzeaqVar;
    }

    public final zzeaq zzazl() {
        return this.zzhna;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(zzeaq zzeaqVar) {
        zzeaqVar.getClass();
        this.zzhna = zzeaqVar;
    }

    public static zzdws zzp(zzeaq zzeaqVar, zzebq zzebqVar) throws zzeco {
        return (zzdws) zzecd.zza(zzhnb, zzeaqVar, zzebqVar);
    }

    public static zza zzazm() {
        return zzhnb.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdwr.zzdk[i - 1]) {
            case 1:
                return new zzdws();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhnb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzhlh", "zzhmr", "zzhmz", "zzhna"});
            case 4:
                return zzhnb;
            case 5:
                zzedx<zzdws> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdws.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhnb);
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

    public static zzdws zzazn() {
        return zzhnb;
    }

    static {
        zzdws zzdwsVar = new zzdws();
        zzhnb = zzdwsVar;
        zzecd.zza(zzdws.class, zzdwsVar);
    }
}
