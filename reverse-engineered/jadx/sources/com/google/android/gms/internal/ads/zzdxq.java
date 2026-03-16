package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdxq extends zzecd<zzdxq, zza> implements zzedq {
    private static volatile zzedx<zzdxq> zzea;
    private static final zzdxq zzhpf;
    private int zzhox;
    private zzecl<zzb> zzhpe = zzbfa();

    private zzdxq() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzecd<zzb, zza> implements zzedq {
        private static volatile zzedx<zzb> zzea;
        private static final zzb zzhpg;
        private String zzhnz = "";
        private int zzhoq;
        private int zzhpb;
        private int zzhpc;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzecd.zza<zzb, zza> implements zzedq {
            private zza() {
                super(zzb.zzhpg);
            }

            public final zza zzhn(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zzhl(str);
                return this;
            }

            public final zza zza(zzdxj zzdxjVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zzb(zzdxjVar);
                return this;
            }

            public final zza zzfc(int i) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zzfd(i);
                return this;
            }

            public final zza zza(zzdyb zzdybVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zzb(zzdybVar);
                return this;
            }

            /* synthetic */ zza(zzdxr zzdxrVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzhl(String str) {
            str.getClass();
            this.zzhnz = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzdxj zzdxjVar) {
            this.zzhpb = zzdxjVar.zzw();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzfd(int i) {
            this.zzhpc = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzdyb zzdybVar) {
            this.zzhoq = zzdybVar.zzw();
        }

        public static zza zzbba() {
            return zzhpg.zzbev();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzdxr.zzdk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzhpg, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhnz", "zzhpb", "zzhpc", "zzhoq"});
                case 4:
                    return zzhpg;
                case 5:
                    zzedx<zzb> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zzb.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zzhpg);
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
            zzb zzbVar = new zzb();
            zzhpg = zzbVar;
            zzecd.zza(zzb.class, zzbVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd.zza<zzdxq, zza> implements zzedq {
        private zza() {
            super(zzdxq.zzhpf);
        }

        public final zza zzfb(int i) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxq) this.zzhxt).zzfa(i);
            return this;
        }

        public final zza zzb(zzb zzbVar) {
            if (this.zzhxu) {
                zzbep();
                this.zzhxu = false;
            }
            ((zzdxq) this.zzhxt).zza(zzbVar);
            return this;
        }

        /* synthetic */ zza(zzdxr zzdxrVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzfa(int i) {
        this.zzhox = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        zzbVar.getClass();
        if (!this.zzhpe.zzbci()) {
            this.zzhpe = zzecd.zza(this.zzhpe);
        }
        this.zzhpe.add(zzbVar);
    }

    public static zza zzbay() {
        return zzhpf.zzbev();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzecd
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdxr.zzdk[i - 1]) {
            case 1:
                return new zzdxq();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhpf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzhox", "zzhpe", zzb.class});
            case 4:
                return zzhpf;
            case 5:
                zzedx<zzdxq> zzedxVar = zzea;
                if (zzedxVar == null) {
                    synchronized (zzdxq.class) {
                        zzedxVar = zzea;
                        if (zzedxVar == null) {
                            zzedxVar = new zzecd.zzc<>(zzhpf);
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
        zzdxq zzdxqVar = new zzdxq();
        zzhpf = zzdxqVar;
        zzecd.zza(zzdxq.class, zzdxqVar);
    }
}
