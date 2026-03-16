package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdmf;
import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdmm extends zzecd<zzdmm, zzb> implements zzedq {
    private static volatile zzedx<zzdmm> zzea;
    private static final zzdmm zzhch;
    private int zzdl;
    private int zzhce;
    private zzdmf zzhcg;
    private String zzdm = "";
    private String zzhcf = "";

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public enum zza implements zzecf {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);
        
        private static final zzeci<zza> zzeh = new zzdmo();
        private final int value;

        @Override // com.google.android.gms.internal.ads.zzecf
        public final int zzw() {
            return this.value;
        }

        public static zza zzea(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return BLOCKED_IMPRESSION;
            }
            return EVENT_TYPE_UNKNOWN;
        }

        public static zzech zzx() {
            return zzdmn.zzej;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        zza(int i) {
            this.value = i;
        }
    }

    private zzdmm() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzecd.zza<zzdmm, zzb> implements zzedq {
        private zzb() {
            super(zzdmm.zzhch);
        }

        public final zzb zzb(zza zzaVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdmm) this.zzhxt).zza(zzaVar);
            return this;
        }

        public final zzb zzhc(String str) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdmm) this.zzhxt).zzn(str);
            return this;
        }

        public final zzb zza(zzdmf.zzb zzbVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdmm) this.zzhxt).zza((zzdmf) ((zzecd) zzbVar.zzbet()));
            return this;
        }

        /* synthetic */ zzb(zzdml zzdmlVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        this.zzhce = zzaVar.zzw();
        this.zzdl |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn(String str) {
        str.getClass();
        this.zzdl |= 2;
        this.zzdm = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdmf zzdmfVar) {
        zzdmfVar.getClass();
        this.zzhcg = zzdmfVar;
        this.zzdl |= 8;
    }

    public static zzb zzaus() {
        return zzhch.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdml.zzdk[i - 1]) {
            case 1:
                return new zzdmm();
            case 2:
                return new zzb(null);
            case 3:
                return zza(zzhch, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003", new Object[]{"zzdl", "zzhce", zza.zzx(), "zzdm", "zzhcf", "zzhcg"});
            case 4:
                return zzhch;
            case 5:
                zzedx<zzdmm> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdmm.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhch);
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
        zzdmm zzdmmVar = new zzdmm();
        zzhch = zzdmmVar;
        zzecd.zza(zzdmm.class, zzdmmVar);
    }
}
