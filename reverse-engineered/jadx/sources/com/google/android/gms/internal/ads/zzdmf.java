package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdmf extends zzecd<zzdmf, zzb> implements zzedq {
    private static volatile zzedx<zzdmf> zzea;
    private static final zzecj<Integer, zza> zzhbw = new zzdmi();
    private static final zzdmf zzhca;
    private int zzdl;
    private zzeck zzhbv = zzbey();
    private String zzhbx = "";
    private String zzhby = "";
    private String zzhbz = "";

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public enum zza implements zzecf {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);
        
        private static final zzeci<zza> zzeh = new zzdmj();
        private final int value;

        @Override // com.google.android.gms.internal.ads.zzecf
        public final int zzw() {
            return this.value;
        }

        public static zza zzdz(int i) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BLOCKED_REASON_BACKGROUND;
            }
            return BLOCKED_REASON_UNKNOWN;
        }

        public static zzech zzx() {
            return zzdmk.zzej;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        zza(int i) {
            this.value = i;
        }
    }

    private zzdmf() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzecd.zza<zzdmf, zzb> implements zzedq {
        private zzb() {
            super(zzdmf.zzhca);
        }

        public final zzb zzb(zza zzaVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdmf) this.zzhxt).zza(zzaVar);
            return this;
        }

        public final zzb zzhb(String str) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdmf) this.zzhxt).zzha(str);
            return this;
        }

        /* synthetic */ zzb(zzdmi zzdmiVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        zzaVar.getClass();
        if (!this.zzhbv.zzbci()) {
            this.zzhbv = zzecd.zza(this.zzhbv);
        }
        this.zzhbv.zzgw(zzaVar.zzw());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzha(String str) {
        str.getClass();
        this.zzdl |= 1;
        this.zzhbx = str;
    }

    public static zzb zzauq() {
        return zzhca.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdmh.zzdk[i - 1]) {
            case 1:
                return new zzdmf();
            case 2:
                return new zzb(null);
            case 3:
                return zza(zzhca, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002\b\u0000\u0003\b\u0001\u0004\b\u0002", new Object[]{"zzdl", "zzhbv", zza.zzx(), "zzhbx", "zzhby", "zzhbz"});
            case 4:
                return zzhca;
            case 5:
                zzedx<zzdmf> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdmf.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhca);
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
        zzdmf zzdmfVar = new zzdmf();
        zzhca = zzdmfVar;
        zzecd.zza(zzdmf.class, zzdmfVar);
    }
}
