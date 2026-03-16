package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbm {

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd<zza, C0007zza> implements zzedq {
        private static final zza zzdz;
        private static volatile zzedx<zza> zzea;
        private int zzdl;
        private long zzdn;
        private long zzdr;
        private long zzds;
        private long zzdu;
        private int zzdy;
        private String zzdm = "";
        private String zzdo = "";
        private String zzdp = "";
        private String zzdq = "";
        private String zzdt = "";
        private String zzdv = "";
        private String zzdw = "";
        private zzecl<zzb> zzdx = zzbfa();

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zzb extends zzecd<zzb, C0008zza> implements zzedq {
            private static volatile zzedx<zzb> zzea;
            private static final zzb zzed;
            private int zzdl;
            private String zzeb = "";
            private String zzec = "";

            private zzb() {
            }

            /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbm$zza$zzb$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0008zza extends zzecd.zza<zzb, C0008zza> implements zzedq {
                private C0008zza() {
                    super(zzb.zzed);
                }

                /* synthetic */ C0008zza(zzbl zzblVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzecd
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzbl.zzdk[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C0008zza(null);
                    case 3:
                        return zza(zzed, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001", new Object[]{"zzdl", "zzeb", "zzec"});
                    case 4:
                        return zzed;
                    case 5:
                        zzedx<zzb> zzedxVar = zzea;
                        if (zzedxVar == null) {
                            synchronized (zzb.class) {
                                zzedxVar = zzea;
                                if (zzedxVar == null) {
                                    zzedxVar = new zzecd.zzc<>(zzed);
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
                zzed = zzbVar;
                zzecd.zza(zzb.class, zzbVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public enum zzc implements zzecf {
            UNKNOWN(0),
            ENABLED(1),
            DISABLED(2);
            
            private static final zzeci<zzc> zzeh = new zzbn();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzecf
            public final int zzw() {
                return this.value;
            }

            public static zzc zze(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return DISABLED;
                    }
                    return ENABLED;
                }
                return UNKNOWN;
            }

            public static zzech zzx() {
                return zzbp.zzej;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzc(int i) {
                this.value = i;
            }
        }

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzbm$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0007zza extends zzecd.zza<zza, C0007zza> implements zzedq {
            private C0007zza() {
                super(zza.zzdz);
            }

            public final C0007zza zzi(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzn(str);
                return this;
            }

            public final C0007zza zzc(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzd(j);
                return this;
            }

            public final C0007zza zzj(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzo(str);
                return this;
            }

            public final C0007zza zzk(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzp(str);
                return this;
            }

            public final C0007zza zzl(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzq(str);
                return this;
            }

            public final C0007zza zzm(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzr(str);
                return this;
            }

            public final C0007zza zza(zzc zzcVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzb(zzcVar);
                return this;
            }

            /* synthetic */ C0007zza(zzbl zzblVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzn(String str) {
            str.getClass();
            this.zzdl |= 1;
            this.zzdm = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(long j) {
            this.zzdl |= 2;
            this.zzdn = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzo(String str) {
            str.getClass();
            this.zzdl |= 4;
            this.zzdo = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzp(String str) {
            str.getClass();
            this.zzdl |= 8;
            this.zzdp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzq(String str) {
            str.getClass();
            this.zzdl |= 16;
            this.zzdq = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzr(String str) {
            str.getClass();
            this.zzdl |= 1024;
            this.zzdw = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzc zzcVar) {
            this.zzdy = zzcVar.zzw();
            this.zzdl |= 2048;
        }

        public static C0007zza zzt() {
            return zzdz.zzbev();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbl.zzdk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0007zza(null);
                case 3:
                    return zza(zzdz, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\b\u0007\t\u0002\b\n\b\t\u000b\b\n\f\u001b\r\f\u000b", new Object[]{"zzdl", "zzdm", "zzdn", "zzdo", "zzdp", "zzdq", "zzdr", "zzds", "zzdt", "zzdu", "zzdv", "zzdw", "zzdx", zzb.class, "zzdy", zzc.zzx()});
                case 4:
                    return zzdz;
                case 5:
                    zzedx<zza> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zza.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zzdz);
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
            zzdz = zzaVar;
            zzecd.zza(zza.class, zzaVar);
        }
    }
}
