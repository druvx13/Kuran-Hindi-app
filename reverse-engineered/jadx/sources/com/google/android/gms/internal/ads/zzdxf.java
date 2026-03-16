package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdxf extends zzecd<zzdxf, zza> implements zzedq {
    private static volatile zzedx<zzdxf> zzea;
    private static final zzdxf zzhoc;
    private String zzhnz = "";
    private zzeaq zzhoa = zzeaq.zzhtf;
    private int zzhob;

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public enum zzb implements zzecf {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final zzeci<zzb> zzeh = new zzdxh();
        private final int value;

        @Override // com.google.android.gms.internal.ads.zzecf
        public final int zzw() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static zzb zzey(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return REMOTE;
                        }
                        return ASYMMETRIC_PUBLIC;
                    }
                    return ASYMMETRIC_PRIVATE;
                }
                return SYMMETRIC;
            }
            return UNKNOWN_KEYMATERIAL;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(getClass().getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zzw());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        zzb(int i) {
            this.value = i;
        }
    }

    private zzdxf() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdxf, zza> implements zzedq {
        private zza() {
            super(zzdxf.zzhoc);
        }

        public final zza zzhm(String str) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxf) this.zzhxt).zzhl(str);
            return this;
        }

        public final zza zzaf(zzeaq zzeaqVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxf) this.zzhxt).zzae(zzeaqVar);
            return this;
        }

        public final zza zzb(zzb zzbVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxf) this.zzhxt).zza(zzbVar);
            return this;
        }

        /* synthetic */ zza(zzdxg zzdxgVar) {
            this();
        }
    }

    public final String zzbad() {
        return this.zzhnz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzhl(String str) {
        str.getClass();
        this.zzhnz = str;
    }

    public final zzeaq zzbae() {
        return this.zzhoa;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzae(zzeaq zzeaqVar) {
        zzeaqVar.getClass();
        this.zzhoa = zzeaqVar;
    }

    public final zzb zzbaf() {
        zzb zzey = zzb.zzey(this.zzhob);
        return zzey == null ? zzb.UNRECOGNIZED : zzey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        this.zzhob = zzbVar.zzw();
    }

    public static zza zzbag() {
        return zzhoc.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxg.zzdk[i - 1]) {
            case 1:
                return new zzdxf();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhoc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhnz", "zzhoa", "zzhob"});
            case 4:
                return zzhoc;
            case 5:
                zzedx<zzdxf> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdxf.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhoc);
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

    public static zzdxf zzbah() {
        return zzhoc;
    }

    static {
        zzdxf zzdxfVar = new zzdxf();
        zzhoc = zzdxfVar;
        zzecd.zza(zzdxf.class, zzdxfVar);
    }
}
