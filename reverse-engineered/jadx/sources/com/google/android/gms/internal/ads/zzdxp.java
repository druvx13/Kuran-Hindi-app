package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdxp extends zzecd<zzdxp, zzb> implements zzedq {
    private static volatile zzedx<zzdxp> zzea;
    private static final zzdxp zzhoz;
    private int zzhox;
    private zzecl<zza> zzhoy = zzbfa();

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd<zza, C0013zza> implements zzedq {
        private static volatile zzedx<zza> zzea;
        private static final zza zzhpd;
        private int zzhoq;
        private zzdxf zzhpa;
        private int zzhpb;
        private int zzhpc;

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzdxp$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0013zza extends zzecd.zza<zza, C0013zza> implements zzedq {
            private C0013zza() {
                super(zza.zzhpd);
            }

            /* synthetic */ C0013zza(zzdxo zzdxoVar) {
                this();
            }
        }

        public final boolean zzbau() {
            return this.zzhpa != null;
        }

        public final zzdxf zzbav() {
            zzdxf zzdxfVar = this.zzhpa;
            return zzdxfVar == null ? zzdxf.zzbah() : zzdxfVar;
        }

        public final zzdxj zzaxe() {
            zzdxj zzez = zzdxj.zzez(this.zzhpb);
            return zzez == null ? zzdxj.UNRECOGNIZED : zzez;
        }

        public final int zzbaw() {
            return this.zzhpc;
        }

        public final zzdyb zzaxf() {
            zzdyb zzfg = zzdyb.zzfg(this.zzhoq);
            return zzfg == null ? zzdyb.UNRECOGNIZED : zzfg;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzdxo.zzdk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0013zza(null);
                case 3:
                    return zza(zzhpd, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhpa", "zzhpb", "zzhpc", "zzhoq"});
                case 4:
                    return zzhpd;
                case 5:
                    zzedx<zza> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zza.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zzhpd);
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
            zza zzaVar = new zza();
            zzhpd = zzaVar;
            zzecd.zza(zza.class, zzaVar);
        }
    }

    private zzdxp() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzecd.zza<zzdxp, zzb> implements zzedq {
        private zzb() {
            super(zzdxp.zzhoz);
        }

        /* synthetic */ zzb(zzdxo zzdxoVar) {
            this();
        }
    }

    public final int zzbaq() {
        return this.zzhox;
    }

    public final List<zza> zzbar() {
        return this.zzhoy;
    }

    public final int zzbas() {
        return this.zzhoy.size();
    }

    public static zzdxp zzc(byte[] bArr, zzebq zzebqVar) throws zzeco {
        return (zzdxp) zzecd.zza(zzhoz, bArr, zzebqVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxo.zzdk[i - 1]) {
            case 1:
                return new zzdxp();
            case 2:
                return new zzb(null);
            case 3:
                return zza(zzhoz, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzhox", "zzhoy", zza.class});
            case 4:
                return zzhoz;
            case 5:
                zzedx<zzdxp> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdxp.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhoz);
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
        zzdxp zzdxpVar = new zzdxp();
        zzhoz = zzdxpVar;
        zzecd.zza(zzdxp.class, zzdxpVar);
    }
}
