package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzgh extends zzecd<zzgh, zza> implements zzedq {
    private static final zzgh zzabs;
    private static volatile zzedx<zzgh> zzea;
    private String zzabn = "";
    private String zzabo = "";
    private long zzabp;
    private long zzabq;
    private long zzabr;
    private int zzdl;

    private zzgh() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzgh, zza> implements zzedq {
        private zza() {
            super(zzgh.zzabs);
        }

        public final zza zzau(String str) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzgh) this.zzhxt).zzas(str);
            return this;
        }

        public final zza zzav(String str) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzgh) this.zzhxt).zzat(str);
            return this;
        }

        public final zza zzdj(long j) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzgh) this.zzhxt).zzdg(j);
            return this;
        }

        public final zza zzdk(long j) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzgh) this.zzhxt).zzdh(j);
            return this;
        }

        public final zza zzdl(long j) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzgh) this.zzhxt).zzdi(j);
            return this;
        }

        /* synthetic */ zza(zzgg zzggVar) {
            this();
        }
    }

    public final String zzdh() {
        return this.zzabn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzas(String str) {
        str.getClass();
        this.zzdl |= 1;
        this.zzabn = str;
    }

    public final String zzdi() {
        return this.zzabo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzat(String str) {
        str.getClass();
        this.zzdl |= 2;
        this.zzabo = str;
    }

    public final long zzdj() {
        return this.zzabp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdg(long j) {
        this.zzdl |= 4;
        this.zzabp = j;
    }

    public final long zzdk() {
        return this.zzabq;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdh(long j) {
        this.zzdl |= 8;
        this.zzabq = j;
    }

    public final long zzdl() {
        return this.zzabr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdi(long j) {
        this.zzdl |= 16;
        this.zzabr = j;
    }

    public static zzgh zzl(zzeaq zzeaqVar) throws zzeco {
        return (zzgh) zzecd.zza(zzabs, zzeaqVar);
    }

    public static zza zzdm() {
        return zzabs.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzgg.zzdk[i - 1]) {
            case 1:
                return new zzgh();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzabs, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0003\u0002\u0004\u0003\u0003\u0005\u0003\u0004", new Object[]{"zzdl", "zzabn", "zzabo", "zzabp", "zzabq", "zzabr"});
            case 4:
                return zzabs;
            case 5:
                zzedx<zzgh> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzgh.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzabs);
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

    public static zzgh zzdn() {
        return zzabs;
    }

    static {
        zzgh zzghVar = new zzgh();
        zzabs = zzghVar;
        zzecd.zza(zzgh.class, zzghVar);
    }
}
