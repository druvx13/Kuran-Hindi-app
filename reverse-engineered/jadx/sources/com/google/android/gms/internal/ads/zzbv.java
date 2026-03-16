package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbv {

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd<zza, C0010zza> implements zzedq {
        private static volatile zzedx<zza> zzea;
        private static final zza zzhz;
        private int zzdl;
        private int zzfc;
        private int zzfd;
        private long zzff;
        private long zzfg;
        private long zzfh;
        private long zzfi;
        private long zzfj;
        private long zzfk;
        private long zzfl;
        private long zzfm;
        private long zzfn;
        private long zzfo;
        private long zzfq;
        private long zzfr;
        private long zzfs;
        private long zzft;
        private long zzfu;
        private long zzfv;
        private long zzfw;
        private long zzfx;
        private long zzfy;
        private long zzgb;
        private long zzgc;
        private long zzgd;
        private long zzge;
        private zzb zzgh;
        private zze zzgx;
        private zzf zzgz;
        private int zzhk;
        private int zzhl;
        private int zzhm;
        private zze zzhn;
        private long zzhs;
        private boolean zzhv;
        private long zzhx;
        private zzd zzhy;
        private String zzfe = "";
        private String zzdv = "";
        private String zzfp = "";
        private String zzev = "";
        private String zzfz = "D";
        private String zzga = "";
        private String zzex = "";
        private long zzgf = -1;
        private long zzgg = -1;
        private long zzgi = -1;
        private long zzgj = -1;
        private long zzgk = -1;
        private long zzgl = -1;
        private long zzgm = -1;
        private long zzgn = -1;
        private String zzey = "D";
        private String zzez = "D";
        private long zzgo = -1;
        private int zzgp = 1000;
        private int zzgq = 1000;
        private long zzgr = -1;
        private long zzgs = -1;
        private long zzgt = -1;
        private long zzgu = -1;
        private long zzgv = -1;
        private int zzgw = 1000;
        private zzecl<zze> zzgy = zzbfa();
        private long zzha = -1;
        private long zzhb = -1;
        private long zzhc = -1;
        private long zzhd = -1;
        private long zzhe = -1;
        private long zzhf = -1;
        private long zzhg = -1;
        private long zzhh = -1;
        private String zzhi = "D";
        private long zzhj = -1;
        private long zzho = -1;
        private int zzhp = 1000;
        private int zzhq = 1000;
        private String zzhr = "D";
        private String zzht = "";
        private int zzhu = 2;
        private String zzhw = "";

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public enum zzb implements zzecf {
            DEBUGGER_STATE_UNSPECIFIED(0),
            DEBUGGER_STATE_NOT_INSTALLED(1),
            DEBUGGER_STATE_INSTALLED(2),
            DEBUGGER_STATE_ACTIVE(3),
            DEBUGGER_STATE_ENVVAR(4),
            DEBUGGER_STATE_MACHPORT(5),
            DEBUGGER_STATE_ENVVAR_MACHPORT(6);
            
            private static final zzeci<zzb> zzeh = new zzbw();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzecf
            public final int zzw() {
                return this.value;
            }

            public static zzb zzh(int i) {
                switch (i) {
                    case 0:
                        return DEBUGGER_STATE_UNSPECIFIED;
                    case 1:
                        return DEBUGGER_STATE_NOT_INSTALLED;
                    case 2:
                        return DEBUGGER_STATE_INSTALLED;
                    case 3:
                        return DEBUGGER_STATE_ACTIVE;
                    case 4:
                        return DEBUGGER_STATE_ENVVAR;
                    case 5:
                        return DEBUGGER_STATE_MACHPORT;
                    case 6:
                        return DEBUGGER_STATE_ENVVAR_MACHPORT;
                    default:
                        return null;
                }
            }

            public static zzech zzx() {
                return zzbx.zzej;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzb(int i) {
                this.value = i;
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public enum zzc implements zzecf {
            DEVICE_IDENTIFIER_NO_ID(0),
            DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
            DEVICE_IDENTIFIER_GLOBAL_ID(2),
            DEVICE_IDENTIFIER_ADVERTISER_ID(3),
            DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
            DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
            DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6);
            
            private static final zzeci<zzc> zzeh = new zzbz();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzecf
            public final int zzw() {
                return this.value;
            }

            public static zzc zzi(int i) {
                switch (i) {
                    case 0:
                        return DEVICE_IDENTIFIER_NO_ID;
                    case 1:
                        return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
                    case 2:
                        return DEVICE_IDENTIFIER_GLOBAL_ID;
                    case 3:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID;
                    case 4:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
                    case 5:
                        return DEVICE_IDENTIFIER_ANDROID_AD_ID;
                    case 6:
                        return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
                    default:
                        return null;
                }
            }

            public static zzech zzx() {
                return zzby.zzej;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzc(int i) {
                this.value = i;
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public enum zzd implements zzecf {
            ERROR_ENCODE_SIZE_FAIL(1),
            ERROR_UNKNOWN(3),
            ERROR_NO_SIGNALS(5),
            ERROR_ENCRYPTION(7),
            ERROR_MEMORY(9),
            ERROR_SIMULATOR(11),
            ERROR_SERVICE(13),
            ERROR_THREAD(15),
            PSN_WEB64_FAIL(2),
            PSN_DECRYPT_SIZE_FAIL(4),
            PSN_MD5_CHECK_FAIL(8),
            PSN_MD5_SIZE_FAIL(16),
            PSN_MD5_FAIL(32),
            PSN_DECODE_FAIL(64),
            PSN_SALT_FAIL(128),
            PSN_BITSLICER_FAIL(256),
            PSN_REQUEST_TYPE_FAIL(512),
            PSN_INVALID_ERROR_CODE(1024),
            PSN_TIMESTAMP_EXPIRED(2048),
            PSN_ENCODE_SIZE_FAIL(4096),
            PSN_BLANK_VALUE(8192),
            PSN_INITIALIZATION_FAIL(16384),
            PSN_GASS_CLIENT_FAIL(32768),
            PSN_SIGNALS_TIMEOUT(65536),
            PSN_TINK_FAIL(131072);
            
            private static final zzeci<zzd> zzeh = new zzca();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzecf
            public final int zzw() {
                return this.value;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzd(int i) {
                this.value = i;
            }
        }

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zze extends zzecd<zze, C0011zza> implements zzedq {
            private static volatile zzedx<zze> zzea;
            private static final zze zzkj;
            private int zzdl;
            private long zzkd;
            private long zzke;
            private long zzfq = -1;
            private long zzfr = -1;
            private long zzjq = -1;
            private long zzjr = -1;
            private long zzjs = -1;
            private long zzjt = -1;
            private int zzju = 1000;
            private long zzjv = -1;
            private long zzjw = -1;
            private long zzjx = -1;
            private int zzjy = 1000;
            private long zzjz = -1;
            private long zzka = -1;
            private long zzkb = -1;
            private long zzkc = -1;
            private long zzkf = -1;
            private long zzkg = -1;
            private long zzkh = -1;
            private long zzki = -1;

            private zze() {
            }

            /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbv$zza$zze$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0011zza extends zzecd.zza<zze, C0011zza> implements zzedq {
                private C0011zza() {
                    super(zze.zzkj);
                }

                public final C0011zza zzbs(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzaq(j);
                    return this;
                }

                public final C0011zza zzbt(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzar(j);
                    return this;
                }

                public final C0011zza zzbu(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzcj(j);
                    return this;
                }

                public final C0011zza zzbv(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzck(j);
                    return this;
                }

                public final C0011zza zzau() {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzav();
                    return this;
                }

                public final C0011zza zzbw(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzcl(j);
                    return this;
                }

                public final C0011zza zzbx(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzcm(j);
                    return this;
                }

                public final C0011zza zzk(zzcd zzcdVar) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzm(zzcdVar);
                    return this;
                }

                public final C0011zza zzby(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzcn(j);
                    return this;
                }

                public final C0011zza zzbz(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzco(j);
                    return this;
                }

                public final C0011zza zzca(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzcp(j);
                    return this;
                }

                public final C0011zza zzl(zzcd zzcdVar) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzn(zzcdVar);
                    return this;
                }

                public final C0011zza zzcb(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzcq(j);
                    return this;
                }

                public final C0011zza zzcc(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzcr(j);
                    return this;
                }

                public final C0011zza zzcd(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzcs(j);
                    return this;
                }

                public final C0011zza zzce(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzct(j);
                    return this;
                }

                public final C0011zza zzcf(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzcu(j);
                    return this;
                }

                public final C0011zza zzcg(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzcv(j);
                    return this;
                }

                public final C0011zza zzch(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzcw(j);
                    return this;
                }

                public final C0011zza zzci(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zze) this.zzhxt).zzcx(j);
                    return this;
                }

                /* synthetic */ C0011zza(zzbu zzbuVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzaq(long j) {
                this.zzdl |= 1;
                this.zzfq = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzar(long j) {
                this.zzdl |= 2;
                this.zzfr = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcj(long j) {
                this.zzdl |= 4;
                this.zzjq = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzck(long j) {
                this.zzdl |= 8;
                this.zzjr = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzav() {
                this.zzdl &= -9;
                this.zzjr = -1L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcl(long j) {
                this.zzdl |= 16;
                this.zzjs = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcm(long j) {
                this.zzdl |= 32;
                this.zzjt = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzm(zzcd zzcdVar) {
                this.zzju = zzcdVar.zzw();
                this.zzdl |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcn(long j) {
                this.zzdl |= 128;
                this.zzjv = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzco(long j) {
                this.zzdl |= 256;
                this.zzjw = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcp(long j) {
                this.zzdl |= 512;
                this.zzjx = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzn(zzcd zzcdVar) {
                this.zzjy = zzcdVar.zzw();
                this.zzdl |= 1024;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcq(long j) {
                this.zzdl |= 2048;
                this.zzjz = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcr(long j) {
                this.zzdl |= 4096;
                this.zzka = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcs(long j) {
                this.zzdl |= 8192;
                this.zzkb = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzct(long j) {
                this.zzdl |= 16384;
                this.zzkc = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcu(long j) {
                this.zzdl |= 32768;
                this.zzkd = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcv(long j) {
                this.zzdl |= 65536;
                this.zzke = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcw(long j) {
                this.zzdl |= 131072;
                this.zzkf = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcx(long j) {
                this.zzdl |= 262144;
                this.zzkg = j;
            }

            public static C0011zza zzaw() {
                return zzkj.zzbev();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzecd
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzbu.zzdk[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new C0011zza(null);
                    case 3:
                        return zza(zzkj, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\f\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\f\n\f\u0002\u000b\r\u0002\f\u000e\u0002\r\u000f\u0002\u000e\u0010\u0002\u000f\u0011\u0002\u0010\u0012\u0002\u0011\u0013\u0002\u0012\u0014\u0002\u0013\u0015\u0002\u0014", new Object[]{"zzdl", "zzfq", "zzfr", "zzjq", "zzjr", "zzjs", "zzjt", "zzju", zzcd.zzx(), "zzjv", "zzjw", "zzjx", "zzjy", zzcd.zzx(), "zzjz", "zzka", "zzkb", "zzkc", "zzkd", "zzke", "zzkf", "zzkg", "zzkh", "zzki"});
                    case 4:
                        return zzkj;
                    case 5:
                        zzedx<zze> zzedxVar = zzea;
                        if (zzedxVar == null) {
                            synchronized (zze.class) {
                                zzedxVar = zzea;
                                if (zzedxVar == null) {
                                    zzedxVar = new zzecd.zzc<>(zzkj);
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
                zze zzeVar = new zze();
                zzkj = zzeVar;
                zzecd.zza(zze.class, zzeVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zzf extends zzecd<zzf, C0012zza> implements zzedq {
            private static volatile zzedx<zzf> zzea;
            private static final zzf zzko;
            private int zzdl;
            private long zzgu = -1;
            private long zzgv = -1;
            private long zzkk = -1;
            private long zzkl = -1;
            private long zzkm = -1;
            private long zzkn = -1;

            private zzf() {
            }

            /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbv$zza$zzf$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0012zza extends zzecd.zza<zzf, C0012zza> implements zzedq {
                private C0012zza() {
                    super(zzf.zzko);
                }

                public final C0012zza zzcy(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzf) this.zzhxt).zzdc(j);
                    return this;
                }

                public final C0012zza zzcz(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzf) this.zzhxt).zzdd(j);
                    return this;
                }

                public final C0012zza zzda(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzf) this.zzhxt).zzde(j);
                    return this;
                }

                public final C0012zza zzdb(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzf) this.zzhxt).zzdf(j);
                    return this;
                }

                /* synthetic */ C0012zza(zzbu zzbuVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzdc(long j) {
                this.zzdl |= 4;
                this.zzkk = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzdd(long j) {
                this.zzdl |= 8;
                this.zzkl = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzde(long j) {
                this.zzdl |= 16;
                this.zzkm = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzdf(long j) {
                this.zzdl |= 32;
                this.zzkn = j;
            }

            public static C0012zza zzay() {
                return zzko.zzbev();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzecd
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzbu.zzdk[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0012zza(null);
                    case 3:
                        return zza(zzko, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005", new Object[]{"zzdl", "zzgu", "zzgv", "zzkk", "zzkl", "zzkm", "zzkn"});
                    case 4:
                        return zzko;
                    case 5:
                        zzedx<zzf> zzedxVar = zzea;
                        if (zzedxVar == null) {
                            synchronized (zzf.class) {
                                zzedxVar = zzea;
                                if (zzedxVar == null) {
                                    zzedxVar = new zzecd.zzc<>(zzko);
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
                zzf zzfVar = new zzf();
                zzko = zzfVar;
                zzecd.zza(zzf.class, zzfVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzbv$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0010zza extends zzecd.zza<zza, C0010zza> implements zzedq {
            private C0010zza() {
                super(zza.zzhz);
            }

            public final C0010zza zzs(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzab(str);
                return this;
            }

            public final C0010zza zzt(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzac(str);
                return this;
            }

            public final C0010zza zze(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzal(j);
                return this;
            }

            public final C0010zza zzf(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzam(j);
                return this;
            }

            public final C0010zza zzg(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzan(j);
                return this;
            }

            public final C0010zza zzh(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzao(j);
                return this;
            }

            public final C0010zza zzi(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzap(j);
                return this;
            }

            public final C0010zza zzj(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzaq(j);
                return this;
            }

            public final C0010zza zzk(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzar(j);
                return this;
            }

            public final C0010zza zzl(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzas(j);
                return this;
            }

            public final C0010zza zzm(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzat(j);
                return this;
            }

            public final C0010zza zzn(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzau(j);
                return this;
            }

            public final C0010zza zzo(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzav(j);
                return this;
            }

            public final C0010zza zzp(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzaw(j);
                return this;
            }

            public final C0010zza zzu(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzad(str);
                return this;
            }

            public final C0010zza zzv(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzae(str);
                return this;
            }

            public final C0010zza zzq(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzax(j);
                return this;
            }

            public final C0010zza zzr(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzay(j);
                return this;
            }

            public final C0010zza zzs(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzaz(j);
                return this;
            }

            public final C0010zza zzw(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzaf(str);
                return this;
            }

            public final C0010zza zzt(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzba(j);
                return this;
            }

            @Deprecated
            public final C0010zza zzu(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbb(j);
                return this;
            }

            public final C0010zza zzv(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbc(j);
                return this;
            }

            public final C0010zza zzw(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbd(j);
                return this;
            }

            public final C0010zza zzx(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbe(j);
                return this;
            }

            public final C0010zza zzy(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbf(j);
                return this;
            }

            public final C0010zza zzz(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbg(j);
                return this;
            }

            public final C0010zza zzaa(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbh(j);
                return this;
            }

            public final C0010zza zzab(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbi(j);
                return this;
            }

            public final C0010zza zzx(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzag(str);
                return this;
            }

            public final C0010zza zzy(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzah(str);
                return this;
            }

            public final C0010zza zza(zzcd zzcdVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzf(zzcdVar);
                return this;
            }

            public final C0010zza zzb(zzcd zzcdVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzg(zzcdVar);
                return this;
            }

            public final C0010zza zzac(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbj(j);
                return this;
            }

            public final C0010zza zzad(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbk(j);
                return this;
            }

            public final C0010zza zzae(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbl(j);
                return this;
            }

            public final C0010zza zzc(zzcd zzcdVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzh(zzcdVar);
                return this;
            }

            public final C0010zza zza(zze zzeVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzc(zzeVar);
                return this;
            }

            public final C0010zza zzb(zze zzeVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzd(zzeVar);
                return this;
            }

            public final C0010zza zzaj() {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzal();
                return this;
            }

            public final C0010zza zza(zzf zzfVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzb(zzfVar);
                return this;
            }

            public final C0010zza zzaf(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbm(j);
                return this;
            }

            public final C0010zza zzag(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbn(j);
                return this;
            }

            public final C0010zza zzah(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbo(j);
                return this;
            }

            public final C0010zza zzai(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbp(j);
                return this;
            }

            public final C0010zza zzaj(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbq(j);
                return this;
            }

            public final C0010zza zzz(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzai(str);
                return this;
            }

            public final C0010zza zzd(zzcd zzcdVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzi(zzcdVar);
                return this;
            }

            public final C0010zza zze(zzcd zzcdVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzj(zzcdVar);
                return this;
            }

            public final C0010zza zzaa(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzaj(str);
                return this;
            }

            public final C0010zza zza(zzc zzcVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzb(zzcVar);
                return this;
            }

            public final C0010zza zza(boolean z) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzb(z);
                return this;
            }

            public final C0010zza zzak(long j) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zza) this.zzhxt).zzbr(j);
                return this;
            }

            /* synthetic */ C0010zza(zzbu zzbuVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzab(String str) {
            str.getClass();
            this.zzdl |= 1;
            this.zzfe = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzac(String str) {
            str.getClass();
            this.zzdl |= 2;
            this.zzdv = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzal(long j) {
            this.zzdl |= 4;
            this.zzff = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzam(long j) {
            this.zzdl |= 16;
            this.zzfh = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzan(long j) {
            this.zzdl |= 32;
            this.zzfi = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzao(long j) {
            this.zzdl |= 1024;
            this.zzfn = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzap(long j) {
            this.zzdl |= 2048;
            this.zzfo = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaq(long j) {
            this.zzdl |= 8192;
            this.zzfq = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzar(long j) {
            this.zzdl |= 16384;
            this.zzfr = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzas(long j) {
            this.zzdl |= 32768;
            this.zzfs = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzat(long j) {
            this.zzdl |= 65536;
            this.zzft = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzau(long j) {
            this.zzdl |= 524288;
            this.zzfw = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzav(long j) {
            this.zzdl |= 1048576;
            this.zzfx = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaw(long j) {
            this.zzdl |= 2097152;
            this.zzfy = j;
        }

        public final boolean zzak() {
            return (this.zzdl & 4194304) != 0;
        }

        public final String zzag() {
            return this.zzev;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzad(String str) {
            str.getClass();
            this.zzdl |= 4194304;
            this.zzev = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzae(String str) {
            str.getClass();
            this.zzdl |= 16777216;
            this.zzga = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzax(long j) {
            this.zzdl |= 33554432;
            this.zzgb = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzay(long j) {
            this.zzdl |= 67108864;
            this.zzgc = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaz(long j) {
            this.zzdl |= 134217728;
            this.zzgd = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaf(String str) {
            str.getClass();
            this.zzdl |= 268435456;
            this.zzex = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzba(long j) {
            this.zzdl |= 536870912;
            this.zzge = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbb(long j) {
            this.zzdl |= 1073741824;
            this.zzgf = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbc(long j) {
            this.zzdl |= Integer.MIN_VALUE;
            this.zzgg = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbd(long j) {
            this.zzfc |= 2;
            this.zzgi = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbe(long j) {
            this.zzfc |= 4;
            this.zzgj = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbf(long j) {
            this.zzfc |= 8;
            this.zzgk = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbg(long j) {
            this.zzfc |= 16;
            this.zzgl = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbh(long j) {
            this.zzfc |= 32;
            this.zzgm = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbi(long j) {
            this.zzfc |= 64;
            this.zzgn = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzag(String str) {
            str.getClass();
            this.zzfc |= 128;
            this.zzey = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzah(String str) {
            str.getClass();
            this.zzfc |= 256;
            this.zzez = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(zzcd zzcdVar) {
            this.zzgp = zzcdVar.zzw();
            this.zzfc |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzg(zzcd zzcdVar) {
            this.zzgq = zzcdVar.zzw();
            this.zzfc |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbj(long j) {
            this.zzfc |= 4096;
            this.zzgr = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbk(long j) {
            this.zzfc |= 8192;
            this.zzgs = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbl(long j) {
            this.zzfc |= 16384;
            this.zzgt = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzh(zzcd zzcdVar) {
            this.zzgw = zzcdVar.zzw();
            this.zzfc |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzc(zze zzeVar) {
            zzeVar.getClass();
            this.zzgx = zzeVar;
            this.zzfc |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(zze zzeVar) {
            zzeVar.getClass();
            if (!this.zzgy.zzbci()) {
                this.zzgy = zzecd.zza(this.zzgy);
            }
            this.zzgy.add(zzeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzal() {
            this.zzgy = zzbfa();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzf zzfVar) {
            zzfVar.getClass();
            this.zzgz = zzfVar;
            this.zzfc |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbm(long j) {
            this.zzfc |= 2097152;
            this.zzhb = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbn(long j) {
            this.zzfc |= 4194304;
            this.zzhc = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbo(long j) {
            this.zzfc |= 8388608;
            this.zzhd = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbp(long j) {
            this.zzfc |= 67108864;
            this.zzhg = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbq(long j) {
            this.zzfc |= 134217728;
            this.zzhh = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzai(String str) {
            str.getClass();
            this.zzfc |= 268435456;
            this.zzhi = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzi(zzcd zzcdVar) {
            this.zzhp = zzcdVar.zzw();
            this.zzfd |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzj(zzcd zzcdVar) {
            this.zzhq = zzcdVar.zzw();
            this.zzfd |= 16;
        }

        public final String zzam() {
            return this.zzht;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaj(String str) {
            str.getClass();
            this.zzfd |= 128;
            this.zzht = str;
        }

        public final zzc zzan() {
            zzc zzi = zzc.zzi(this.zzhu);
            return zzi == null ? zzc.DEVICE_IDENTIFIER_GLOBAL_ID : zzi;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzc zzcVar) {
            this.zzhu = zzcVar.zzw();
            this.zzfd |= 256;
        }

        public final boolean zzao() {
            return this.zzhv;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(boolean z) {
            this.zzfd |= 512;
            this.zzhv = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbr(long j) {
            this.zzfd |= 2048;
            this.zzhx = j;
        }

        public final boolean zzap() {
            return (this.zzfd & 4096) != 0;
        }

        public final zzd zzaq() {
            zzd zzdVar = this.zzhy;
            return zzdVar == null ? zzd.zzbj() : zzdVar;
        }

        public static zza zza(byte[] bArr, zzebq zzebqVar) throws zzeco {
            return (zza) zzecd.zza(zzhz, bArr, zzebqVar);
        }

        public static C0010zza zzar() {
            return zzhz.zzbev();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbu.zzdk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0010zza(null);
                case 3:
                    return zza(zzhz, "\u0001N\u0000\u0003\u0001ÉN\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\u0002\n\f\u0002\u000b\r\b\f\u000e\u0002\r\u000f\u0002\u000e\u0010\u0002\u000f\u0011\u0002\u0010\u0012\u0002\u0011\u0013\u0002\u0012\u0014\u0002\u0013\u0015\u0002F\u0016\u0002\u0014\u0017\u0002\u0015\u0018\bG\u0019\u0002K\u001a\fH\u001b\b\u0016\u001c\u0007I\u001d\b\u0018\u001e\bJ\u001f\u0002\u0019 \u0002\u001a!\u0002\u001b\"\b\u001c#\u0002\u001d$\u0002\u001e%\u0002\u001f&\t '\u0002!(\u0002\")\u0002#*\u0002$+\u001b,\u0002%-\u0002&.\b'/\b(0\f*1\f+2\t23\u0002,4\u0002-5\u0002.6\u0002/7\u000208\f19\t3:\u00024;\u00025<\u00026=\u00027>\u0002:?\u0002;@\u0002=A\f>B\f?C\b<D\f@E\tAF\u0002BG\u00028H\u00029I\fCJ\u0002)K\b\u0017L\fDM\bEÉ\tL", new Object[]{"zzdl", "zzfc", "zzfd", "zzfe", "zzdv", "zzff", "zzfg", "zzfh", "zzfi", "zzfj", "zzfk", "zzfl", "zzfm", "zzfn", "zzfo", "zzfp", "zzfq", "zzfr", "zzfs", "zzft", "zzfu", "zzfv", "zzfw", "zzhs", "zzfx", "zzfy", "zzht", "zzhx", "zzhu", zzc.zzx(), "zzev", "zzhv", "zzga", "zzhw", "zzgb", "zzgc", "zzgd", "zzex", "zzge", "zzgf", "zzgg", "zzgh", "zzgi", "zzgj", "zzgk", "zzgl", "zzgy", zze.class, "zzgm", "zzgn", "zzey", "zzez", "zzgp", zzcd.zzx(), "zzgq", zzcd.zzx(), "zzgx", "zzgr", "zzgs", "zzgt", "zzgu", "zzgv", "zzgw", zzcd.zzx(), "zzgz", "zzha", "zzhb", "zzhc", "zzhd", "zzhg", "zzhh", "zzhj", "zzhk", zzcc.zzx(), "zzhl", zzci.zzx(), "zzhi", "zzhm", zzb.zzx(), "zzhn", "zzho", "zzhe", "zzhf", "zzhp", zzcd.zzx(), "zzgo", "zzfz", "zzhq", zzcd.zzx(), "zzhr", "zzhy"});
                case 4:
                    return zzhz;
                case 5:
                    zzedx<zza> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zza.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zzhz);
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

        public static zza zzas() {
            return zzhz;
        }

        static {
            zza zzaVar = new zza();
            zzhz = zzaVar;
            zzecd.zza(zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzecd<zzb, zza> implements zzedq {
        private static volatile zzedx<zzb> zzea;
        private static final zzb zzku;
        private int zzdl;
        private long zzkp;
        private int zzkq;
        private boolean zzkr;
        private zzeck zzks = zzbey();
        private long zzkt;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzecd.zza<zzb, zza> implements zzedq {
            private zza() {
                super(zzb.zzku);
            }

            /* synthetic */ zza(zzbu zzbuVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbu.zzdk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzku, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u0004\u0001\u0003\u0007\u0002\u0004\u0016\u0005\u0003\u0003", new Object[]{"zzdl", "zzkp", "zzkq", "zzkr", "zzks", "zzkt"});
                case 4:
                    return zzku;
                case 5:
                    zzedx<zzb> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zzb.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zzku);
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
            zzku = zzbVar;
            zzecd.zza(zzb.class, zzbVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzd extends zzecd<zzd, zza> implements zzedq {
        private static volatile zzedx<zzd> zzea;
        private static final zzd zzls;
        private int zzdl;
        private long zzkp;
        private String zzlq = "";
        private zzeaq zzlr = zzeaq.zzhtf;

        private zzd() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzecd.zza<zzd, zza> implements zzedq {
            private zza() {
                super(zzd.zzls);
            }

            /* synthetic */ zza(zzbu zzbuVar) {
                this();
            }
        }

        public final boolean zzbh() {
            return (this.zzdl & 1) != 0;
        }

        public final long zzbi() {
            return this.zzkp;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbu.zzdk[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzls, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0003\b\u0001\u0004\n\u0002", new Object[]{"zzdl", "zzkp", "zzlq", "zzlr"});
                case 4:
                    return zzls;
                case 5:
                    zzedx<zzd> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zzd.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zzls);
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

        public static zzd zzbj() {
            return zzls;
        }

        static {
            zzd zzdVar = new zzd();
            zzls = zzdVar;
            zzecd.zza(zzd.class, zzdVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zze extends zzecd<zze, zza> implements zzedq {
        private static volatile zzedx<zze> zzea;
        private static final zze zzlt;
        private int zzdl;
        private String zzfa = "";

        private zze() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzecd.zza<zze, zza> implements zzedq {
            private zza() {
                super(zze.zzlt);
            }

            /* synthetic */ zza(zzbu zzbuVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbu.zzdk[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzlt, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"zzdl", "zzfa"});
                case 4:
                    return zzlt;
                case 5:
                    zzedx<zze> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zze.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zzlt);
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
            zze zzeVar = new zze();
            zzlt = zzeVar;
            zzecd.zza(zze.class, zzeVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzc extends zzecd<zzc, zza> implements zzedq {
        private static volatile zzedx<zzc> zzea;
        private static final zzc zzkz;
        private int zzdl;
        private zzeaq zzkv = zzeaq.zzhtf;
        private zzeaq zzkw = zzeaq.zzhtf;
        private zzeaq zzkx = zzeaq.zzhtf;
        private zzeaq zzky = zzeaq.zzhtf;

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzecd.zza<zzc, zza> implements zzedq {
            private zza() {
                super(zzc.zzkz);
            }

            public final zza zza(zzeaq zzeaqVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzc) this.zzhxt).zze(zzeaqVar);
                return this;
            }

            public final zza zzb(zzeaq zzeaqVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzc) this.zzhxt).zzf(zzeaqVar);
                return this;
            }

            public final zza zzc(zzeaq zzeaqVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzc) this.zzhxt).zzg(zzeaqVar);
                return this;
            }

            public final zza zzd(zzeaq zzeaqVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzc) this.zzhxt).zzh(zzeaqVar);
                return this;
            }

            /* synthetic */ zza(zzbu zzbuVar) {
                this();
            }
        }

        public final zzeaq zzbb() {
            return this.zzkv;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zze(zzeaq zzeaqVar) {
            zzeaqVar.getClass();
            this.zzdl |= 1;
            this.zzkv = zzeaqVar;
        }

        public final zzeaq zzbc() {
            return this.zzkw;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(zzeaq zzeaqVar) {
            zzeaqVar.getClass();
            this.zzdl |= 2;
            this.zzkw = zzeaqVar;
        }

        public final zzeaq zzbd() {
            return this.zzkx;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzg(zzeaq zzeaqVar) {
            zzeaqVar.getClass();
            this.zzdl |= 4;
            this.zzkx = zzeaqVar;
        }

        public final zzeaq zzbe() {
            return this.zzky;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzh(zzeaq zzeaqVar) {
            zzeaqVar.getClass();
            this.zzdl |= 8;
            this.zzky = zzeaqVar;
        }

        public static zzc zzb(byte[] bArr, zzebq zzebqVar) throws zzeco {
            return (zzc) zzecd.zza(zzkz, bArr, zzebqVar);
        }

        public static zza zzbf() {
            return zzkz.zzbev();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbu.zzdk[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzkz, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002\u0004\n\u0003", new Object[]{"zzdl", "zzkv", "zzkw", "zzkx", "zzky"});
                case 4:
                    return zzkz;
                case 5:
                    zzedx<zzc> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zzc.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zzkz);
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
            zzc zzcVar = new zzc();
            zzkz = zzcVar;
            zzecd.zza(zzc.class, zzcVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzf extends zzecd<zzf, zza> implements zzedq {
        private static volatile zzedx<zzf> zzea;
        private static final zzf zzlv;
        private int zzdl;
        private zzecl<zzeaq> zzlu = zzbfa();
        private zzeaq zzkw = zzeaq.zzhtf;
        private int zzhl = 1;
        private int zzhk = 1;

        private zzf() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzecd.zza<zzf, zza> implements zzedq {
            private zza() {
                super(zzf.zzlv);
            }

            public final zza zzj(zzeaq zzeaqVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzf) this.zzhxt).zzi(zzeaqVar);
                return this;
            }

            public final zza zzk(zzeaq zzeaqVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzf) this.zzhxt).zzf(zzeaqVar);
                return this;
            }

            public final zza zzb(zzcc zzccVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzf) this.zzhxt).zza(zzccVar);
                return this;
            }

            /* synthetic */ zza(zzbu zzbuVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzi(zzeaq zzeaqVar) {
            zzeaqVar.getClass();
            if (!this.zzlu.zzbci()) {
                this.zzlu = zzecd.zza(this.zzlu);
            }
            this.zzlu.add(zzeaqVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(zzeaq zzeaqVar) {
            zzeaqVar.getClass();
            this.zzdl |= 1;
            this.zzkw = zzeaqVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzcc zzccVar) {
            this.zzhk = zzccVar.zzw();
            this.zzdl |= 4;
        }

        public static zza zzbm() {
            return zzlv.zzbev();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbu.zzdk[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzlv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002\n\u0000\u0003\f\u0001\u0004\f\u0002", new Object[]{"zzdl", "zzlu", "zzkw", "zzhl", zzci.zzx(), "zzhk", zzcc.zzx()});
                case 4:
                    return zzlv;
                case 5:
                    zzedx<zzf> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zzf.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zzlv);
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
            zzf zzfVar = new zzf();
            zzlv = zzfVar;
            zzecd.zza(zzf.class, zzfVar);
        }
    }
}
