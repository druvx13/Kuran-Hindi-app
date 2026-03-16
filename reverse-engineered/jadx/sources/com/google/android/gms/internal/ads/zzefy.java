package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzefy {

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd<zza, C0014zza> implements zzedq {
        private static volatile zzedx<zza> zzea;
        private static final zza zziex;
        private int zzdl;
        private int zzieq;
        private zzb zzier;
        private boolean zzieu;
        private boolean zziev;
        private byte zziew = 2;
        private zzeaq zzies = zzeaq.zzhtf;
        private zzeaq zziet = zzeaq.zzhtf;

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zzb extends zzecd<zzb, C0015zza> implements zzedq {
            private static volatile zzedx<zzb> zzea;
            private static final zzb zzifc;
            private int zzdl;
            private String zziey = "";
            private String zziez = "";
            private String zzifa = "";
            private int zzifb;

            private zzb() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzefy$zza$zzb$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0015zza extends zzecd.zza<zzb, C0015zza> implements zzedq {
                private C0015zza() {
                    super(zzb.zzifc);
                }

                /* synthetic */ C0015zza(zzefx zzefxVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzecd
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzefx.zzdk[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C0015zza(null);
                    case 3:
                        return zza(zzifc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0004\u0003", new Object[]{"zzdl", "zziey", "zziez", "zzifa", "zzifb"});
                    case 4:
                        return zzifc;
                    case 5:
                        zzedx<zzb> zzedxVar = zzea;
                        if (zzedxVar == null) {
                            synchronized (zzb.class) {
                                zzedxVar = zzea;
                                if (zzedxVar == null) {
                                    zzedxVar = new zzecd.zzc<>(zzifc);
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
                zzifc = zzbVar;
                zzecd.zza(zzb.class, zzbVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* loaded from: classes.dex */
        public enum zzc implements zzecf {
            SAFE(0),
            DANGEROUS(1),
            UNKNOWN(2),
            POTENTIALLY_UNWANTED(3),
            DANGEROUS_HOST(4);
            
            private static final zzeci<zzc> zzeh = new zzefz();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzecf
            public final int zzw() {
                return this.value;
            }

            public static zzc zzhn(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return null;
                                }
                                return DANGEROUS_HOST;
                            }
                            return POTENTIALLY_UNWANTED;
                        }
                        return UNKNOWN;
                    }
                    return DANGEROUS;
                }
                return SAFE;
            }

            public static zzech zzx() {
                return zzega.zzej;
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

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzefy$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0014zza extends zzecd.zza<zza, C0014zza> implements zzedq {
            private C0014zza() {
                super(zza.zziex);
            }

            /* synthetic */ C0014zza(zzefx zzefxVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzefx.zzdk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0014zza(null);
                case 3:
                    return zza(zziex, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001Ԍ\u0000\u0002\t\u0001\u0003\n\u0002\u0004\n\u0003\u0005\u0007\u0004\u0006\u0007\u0005", new Object[]{"zzdl", "zzieq", zzc.zzx(), "zzier", "zzies", "zziet", "zzieu", "zziev"});
                case 4:
                    return zziex;
                case 5:
                    zzedx<zza> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zza.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zziex);
                                zzea = zzedxVar;
                            }
                        }
                    }
                    return zzedxVar;
                case 6:
                    return Byte.valueOf(this.zziew);
                case 7:
                    this.zziew = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zza zzaVar = new zza();
            zziex = zzaVar;
            zzecd.zza(zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzecd<zzb, C0017zzb> implements zzedq {
        private static volatile zzedx<zzb> zzea;
        private static final zzb zzify;
        private int zzbxl;
        private int zzdl;
        private int zzifj;
        private zza zzifm;
        private zzf zzifp;
        private boolean zzifq;
        private boolean zzift;
        private boolean zzifu;
        private zzi zzifv;
        private byte zziew = 2;
        private String zziez = "";
        private String zzifk = "";
        private String zzifl = "";
        private zzecl<zzh> zzifn = zzbfa();
        private String zzifo = "";
        private zzecl<String> zzifr = zzecd.zzbfa();
        private String zzifs = "";
        private zzeaq zzies = zzeaq.zzhtf;
        private zzecl<String> zzifw = zzecd.zzbfa();
        private zzecl<String> zzifx = zzecd.zzbfa();

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zze extends zzecd<zze, C0021zzb> implements zzedq {
            private static volatile zzedx<zze> zzea;
            private static final zze zzigp;
            private int zzdl;
            private int zzigh;
            private zza zzign;
            private byte zziew = 2;
            private zzecl<zzc> zzige = zzbfa();
            private zzeaq zzigf = zzeaq.zzhtf;
            private zzeaq zzigg = zzeaq.zzhtf;
            private zzeaq zzigo = zzeaq.zzhtf;

            /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzecd<zza, C0020zza> implements zzedq {
                private static volatile zzedx<zza> zzea;
                private static final zza zzigs;
                private int zzdl;
                private int zzigq;
                private zzeaq zzigr = zzeaq.zzhtf;
                private zzeaq zzigl = zzeaq.zzhtf;

                private zza() {
                }

                /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
                /* renamed from: com.google.android.gms.internal.ads.zzefy$zzb$zze$zza$zza  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0020zza extends zzecd.zza<zza, C0020zza> implements zzedq {
                    private C0020zza() {
                        super(zza.zzigs);
                    }

                    /* synthetic */ C0020zza(zzefx zzefxVar) {
                        this();
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.ads.zzecd
                public final Object zza(int i, Object obj, Object obj2) {
                    switch (zzefx.zzdk[i - 1]) {
                        case 1:
                            return new zza();
                        case 2:
                            return new C0020zza(null);
                        case 3:
                            return zza(zzigs, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdl", "zzigq", "zzigr", "zzigl"});
                        case 4:
                            return zzigs;
                        case 5:
                            zzedx<zza> zzedxVar = zzea;
                            if (zzedxVar == null) {
                                synchronized (zza.class) {
                                    zzedxVar = zzea;
                                    if (zzedxVar == null) {
                                        zzedxVar = new zzecd.zzc<>(zzigs);
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
                    zzigs = zzaVar;
                    zzecd.zza(zza.class, zzaVar);
                }
            }

            private zze() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzefy$zzb$zze$zzb  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0021zzb extends zzecd.zza<zze, C0021zzb> implements zzedq {
                private C0021zzb() {
                    super(zze.zzigp);
                }

                /* synthetic */ C0021zzb(zzefx zzefxVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzecd
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzefx.zzdk[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new C0021zzb(null);
                    case 3:
                        return zza(zzigp, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003\u0006\n\u0004", new Object[]{"zzdl", "zzign", "zzige", zzc.class, "zzigf", "zzigg", "zzigh", "zzigo"});
                    case 4:
                        return zzigp;
                    case 5:
                        zzedx<zze> zzedxVar = zzea;
                        if (zzedxVar == null) {
                            synchronized (zze.class) {
                                zzedxVar = zzea;
                                if (zzedxVar == null) {
                                    zzedxVar = new zzecd.zzc<>(zzigp);
                                    zzea = zzedxVar;
                                }
                            }
                        }
                        return zzedxVar;
                    case 6:
                        return Byte.valueOf(this.zziew);
                    case 7:
                        this.zziew = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zze zzeVar = new zze();
                zzigp = zzeVar;
                zzecd.zza(zze.class, zzeVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* loaded from: classes.dex */
        public enum zzg implements zzecf {
            UNKNOWN(0),
            URL_PHISHING(1),
            URL_MALWARE(2),
            URL_UNWANTED(3),
            CLIENT_SIDE_PHISHING_URL(4),
            CLIENT_SIDE_MALWARE_URL(5),
            DANGEROUS_DOWNLOAD_RECOVERY(6),
            DANGEROUS_DOWNLOAD_WARNING(7),
            OCTAGON_AD(8),
            OCTAGON_AD_SB_MATCH(9);
            
            private static final zzeci<zzg> zzeh = new zzegd();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzecf
            public final int zzw() {
                return this.value;
            }

            public static zzg zzhp(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return URL_PHISHING;
                    case 2:
                        return URL_MALWARE;
                    case 3:
                        return URL_UNWANTED;
                    case 4:
                        return CLIENT_SIDE_PHISHING_URL;
                    case 5:
                        return CLIENT_SIDE_MALWARE_URL;
                    case 6:
                        return DANGEROUS_DOWNLOAD_RECOVERY;
                    case 7:
                        return DANGEROUS_DOWNLOAD_WARNING;
                    case 8:
                        return OCTAGON_AD;
                    case 9:
                        return OCTAGON_AD_SB_MATCH;
                    default:
                        return null;
                }
            }

            public static zzech zzx() {
                return zzege.zzej;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzg(int i) {
                this.value = i;
            }
        }

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzecd<zza, C0016zza> implements zzedq {
            private static volatile zzedx<zza> zzea;
            private static final zza zziga;
            private int zzdl;
            private String zzifz = "";

            private zza() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzefy$zzb$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0016zza extends zzecd.zza<zza, C0016zza> implements zzedq {
                private C0016zza() {
                    super(zza.zziga);
                }

                public final C0016zza zzhz(String str) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zza) this.zzhxt).zzhv(str);
                    return this;
                }

                /* synthetic */ C0016zza(zzefx zzefxVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzhv(String str) {
                str.getClass();
                this.zzdl |= 1;
                this.zzifz = str;
            }

            public static C0016zza zzbhw() {
                return zziga.zzbev();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzecd
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzefx.zzdk[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C0016zza(null);
                    case 3:
                        return zza(zziga, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"zzdl", "zzifz"});
                    case 4:
                        return zziga;
                    case 5:
                        zzedx<zza> zzedxVar = zzea;
                        if (zzedxVar == null) {
                            synchronized (zza.class) {
                                zzedxVar = zzea;
                                if (zzedxVar == null) {
                                    zzedxVar = new zzecd.zzc<>(zziga);
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
                zziga = zzaVar;
                zzecd.zza(zza.class, zzaVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zzc extends zzecd<zzc, zza> implements zzedq {
            private static volatile zzedx<zzc> zzea;
            private static final zzc zzigc;
            private int zzdl;
            private byte zziew = 2;
            private zzeaq zzigb = zzeaq.zzhtf;
            private zzeaq zzhoa = zzeaq.zzhtf;

            private zzc() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzecd.zza<zzc, zza> implements zzedq {
                private zza() {
                    super(zzc.zzigc);
                }

                public final zza zzao(zzeaq zzeaqVar) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzc) this.zzhxt).zzan(zzeaqVar);
                    return this;
                }

                public final zza zzap(zzeaq zzeaqVar) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzc) this.zzhxt).zzae(zzeaqVar);
                    return this;
                }

                /* synthetic */ zza(zzefx zzefxVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzan(zzeaq zzeaqVar) {
                zzeaqVar.getClass();
                this.zzdl |= 1;
                this.zzigb = zzeaqVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzae(zzeaq zzeaqVar) {
                zzeaqVar.getClass();
                this.zzdl |= 2;
                this.zzhoa = zzeaqVar;
            }

            public static zza zzbhz() {
                return zzigc.zzbev();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzecd
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzefx.zzdk[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zzigc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Ԋ\u0000\u0002\n\u0001", new Object[]{"zzdl", "zzigb", "zzhoa"});
                    case 4:
                        return zzigc;
                    case 5:
                        zzedx<zzc> zzedxVar = zzea;
                        if (zzedxVar == null) {
                            synchronized (zzc.class) {
                                zzedxVar = zzea;
                                if (zzedxVar == null) {
                                    zzedxVar = new zzecd.zzc<>(zzigc);
                                    zzea = zzedxVar;
                                }
                            }
                        }
                        return zzedxVar;
                    case 6:
                        return Byte.valueOf(this.zziew);
                    case 7:
                        this.zziew = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzc zzcVar = new zzc();
                zzigc = zzcVar;
                zzecd.zza(zzc.class, zzcVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zzd extends zzecd<zzd, C0019zzb> implements zzedq {
            private static volatile zzedx<zzd> zzea;
            private static final zzd zzigi;
            private int zzdl;
            private zza zzigd;
            private int zzigh;
            private byte zziew = 2;
            private zzecl<zzc> zzige = zzbfa();
            private zzeaq zzigf = zzeaq.zzhtf;
            private zzeaq zzigg = zzeaq.zzhtf;

            /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzecd<zza, C0018zza> implements zzedq {
                private static volatile zzedx<zza> zzea;
                private static final zza zzigm;
                private int zzdl;
                private zzeaq zzigj = zzeaq.zzhtf;
                private zzeaq zzigk = zzeaq.zzhtf;
                private zzeaq zzigl = zzeaq.zzhtf;

                private zza() {
                }

                /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
                /* renamed from: com.google.android.gms.internal.ads.zzefy$zzb$zzd$zza$zza  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0018zza extends zzecd.zza<zza, C0018zza> implements zzedq {
                    private C0018zza() {
                        super(zza.zzigm);
                    }

                    /* synthetic */ C0018zza(zzefx zzefxVar) {
                        this();
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.ads.zzecd
                public final Object zza(int i, Object obj, Object obj2) {
                    switch (zzefx.zzdk[i - 1]) {
                        case 1:
                            return new zza();
                        case 2:
                            return new C0018zza(null);
                        case 3:
                            return zza(zzigm, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002", new Object[]{"zzdl", "zzigj", "zzigk", "zzigl"});
                        case 4:
                            return zzigm;
                        case 5:
                            zzedx<zza> zzedxVar = zzea;
                            if (zzedxVar == null) {
                                synchronized (zza.class) {
                                    zzedxVar = zzea;
                                    if (zzedxVar == null) {
                                        zzedxVar = new zzecd.zzc<>(zzigm);
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
                    zzigm = zzaVar;
                    zzecd.zza(zza.class, zzaVar);
                }
            }

            private zzd() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzefy$zzb$zzd$zzb  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0019zzb extends zzecd.zza<zzd, C0019zzb> implements zzedq {
                private C0019zzb() {
                    super(zzd.zzigi);
                }

                public final C0019zzb zzb(zzc zzcVar) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzd) this.zzhxt).zza(zzcVar);
                    return this;
                }

                /* synthetic */ C0019zzb(zzefx zzefxVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zza(zzc zzcVar) {
                zzcVar.getClass();
                if (!this.zzige.zzbci()) {
                    this.zzige = zzecd.zza(this.zzige);
                }
                this.zzige.add(zzcVar);
            }

            public static C0019zzb zzbib() {
                return zzigi.zzbev();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzecd
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzefx.zzdk[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new C0019zzb(null);
                    case 3:
                        return zza(zzigi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003", new Object[]{"zzdl", "zzigd", "zzige", zzc.class, "zzigf", "zzigg", "zzigh"});
                    case 4:
                        return zzigi;
                    case 5:
                        zzedx<zzd> zzedxVar = zzea;
                        if (zzedxVar == null) {
                            synchronized (zzd.class) {
                                zzedxVar = zzea;
                                if (zzedxVar == null) {
                                    zzedxVar = new zzecd.zzc<>(zzigi);
                                    zzea = zzedxVar;
                                }
                            }
                        }
                        return zzedxVar;
                    case 6:
                        return Byte.valueOf(this.zziew);
                    case 7:
                        this.zziew = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzd zzdVar = new zzd();
                zzigi = zzdVar;
                zzecd.zza(zzd.class, zzdVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zzf extends zzecd<zzf, C0022zzb> implements zzedq {
            private static volatile zzedx<zzf> zzea;
            private static final zzf zzigv;
            private int zzbxl;
            private int zzdl;
            private String zzigt = "";
            private zzeaq zzigu = zzeaq.zzhtf;

            /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
            /* loaded from: classes.dex */
            public enum zza implements zzecf {
                TYPE_UNKNOWN(0),
                TYPE_CREATIVE(1);
                
                private static final zzeci<zza> zzeh = new zzegc();
                private final int value;

                @Override // com.google.android.gms.internal.ads.zzecf
                public final int zzw() {
                    return this.value;
                }

                public static zza zzho(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            return null;
                        }
                        return TYPE_CREATIVE;
                    }
                    return TYPE_UNKNOWN;
                }

                public static zzech zzx() {
                    return zzegb.zzej;
                }

                @Override // java.lang.Enum
                public final String toString() {
                    return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
                }

                zza(int i) {
                    this.value = i;
                }
            }

            private zzf() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzefy$zzb$zzf$zzb  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0022zzb extends zzecd.zza<zzf, C0022zzb> implements zzedq {
                private C0022zzb() {
                    super(zzf.zzigv);
                }

                public final C0022zzb zzb(zza zzaVar) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzf) this.zzhxt).zza(zzaVar);
                    return this;
                }

                public final C0022zzb zzia(String str) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzf) this.zzhxt).setMimeType(str);
                    return this;
                }

                public final C0022zzb zzar(zzeaq zzeaqVar) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzf) this.zzhxt).zzaq(zzeaqVar);
                    return this;
                }

                /* synthetic */ C0022zzb(zzefx zzefxVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zza(zza zzaVar) {
                this.zzbxl = zzaVar.zzw();
                this.zzdl |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void setMimeType(String str) {
                str.getClass();
                this.zzdl |= 2;
                this.zzigt = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzaq(zzeaq zzeaqVar) {
                zzeaqVar.getClass();
                this.zzdl |= 4;
                this.zzigu = zzeaqVar;
            }

            public static C0022zzb zzbig() {
                return zzigv.zzbev();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzecd
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzefx.zzdk[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0022zzb(null);
                    case 3:
                        return zza(zzigv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\n\u0002", new Object[]{"zzdl", "zzbxl", zza.zzx(), "zzigt", "zzigu"});
                    case 4:
                        return zzigv;
                    case 5:
                        zzedx<zzf> zzedxVar = zzea;
                        if (zzedxVar == null) {
                            synchronized (zzf.class) {
                                zzedxVar = zzea;
                                if (zzedxVar == null) {
                                    zzedxVar = new zzecd.zzc<>(zzigv);
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
                zzigv = zzfVar;
                zzecd.zza(zzf.class, zzfVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zzh extends zzecd<zzh, C0023zzb> implements zzedq {
            private static volatile zzedx<zzh> zzea;
            private static final zzh zzihs;
            private int zzdl;
            private int zzihk;
            private zzd zzihl;
            private zze zzihm;
            private int zzihn;
            private int zzihq;
            private byte zziew = 2;
            private String zziez = "";
            private zzeck zziho = zzbey();
            private String zzihp = "";
            private zzecl<String> zzihr = zzecd.zzbfa();

            /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
            /* loaded from: classes.dex */
            public enum zza implements zzecf {
                AD_RESOURCE_UNKNOWN(0),
                AD_RESOURCE_CREATIVE(1),
                AD_RESOURCE_POST_CLICK(2),
                AD_RESOURCE_AUTO_CLICK_DESTINATION(3);
                
                private static final zzeci<zza> zzeh = new zzegf();
                private final int value;

                @Override // com.google.android.gms.internal.ads.zzecf
                public final int zzw() {
                    return this.value;
                }

                public static zza zzhq(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    return null;
                                }
                                return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                            }
                            return AD_RESOURCE_POST_CLICK;
                        }
                        return AD_RESOURCE_CREATIVE;
                    }
                    return AD_RESOURCE_UNKNOWN;
                }

                public static zzech zzx() {
                    return zzegg.zzej;
                }

                @Override // java.lang.Enum
                public final String toString() {
                    return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
                }

                zza(int i) {
                    this.value = i;
                }
            }

            private zzh() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzefy$zzb$zzh$zzb  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0023zzb extends zzecd.zza<zzh, C0023zzb> implements zzedq {
                private C0023zzb() {
                    super(zzh.zzihs);
                }

                public final C0023zzb zzhr(int i) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzh) this.zzhxt).setId(i);
                    return this;
                }

                public final C0023zzb zzic(String str) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzh) this.zzhxt).setUrl(str);
                    return this;
                }

                public final C0023zzb zzb(zzd zzdVar) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzh) this.zzhxt).zza(zzdVar);
                    return this;
                }

                public final C0023zzb zzb(zza zzaVar) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzh) this.zzhxt).zza(zzaVar);
                    return this;
                }

                public final C0023zzb zzid(String str) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzh) this.zzhxt).zzib(str);
                    return this;
                }

                /* synthetic */ C0023zzb(zzefx zzefxVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void setId(int i) {
                this.zzdl |= 1;
                this.zzihk = i;
            }

            public final String getUrl() {
                return this.zziez;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void setUrl(String str) {
                str.getClass();
                this.zzdl |= 2;
                this.zziez = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zza(zzd zzdVar) {
                zzdVar.getClass();
                this.zzihl = zzdVar;
                this.zzdl |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zza(zza zzaVar) {
                this.zzihq = zzaVar.zzw();
                this.zzdl |= 64;
            }

            public final int zzbii() {
                return this.zzihr.size();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzib(String str) {
                str.getClass();
                if (!this.zzihr.zzbci()) {
                    this.zzihr = zzecd.zza(this.zzihr);
                }
                this.zzihr.add(str);
            }

            public static C0023zzb zzbij() {
                return zzihs.zzbev();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzecd
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzefx.zzdk[i - 1]) {
                    case 1:
                        return new zzh();
                    case 2:
                        return new C0023zzb(null);
                    case 3:
                        return zza(zzihs, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001Ԅ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u0004\u0004\u0006\u0016\u0007\b\u0005\b\f\u0006\t\u001a", new Object[]{"zzdl", "zzihk", "zziez", "zzihl", "zzihm", "zzihn", "zziho", "zzihp", "zzihq", zza.zzx(), "zzihr"});
                    case 4:
                        return zzihs;
                    case 5:
                        zzedx<zzh> zzedxVar = zzea;
                        if (zzedxVar == null) {
                            synchronized (zzh.class) {
                                zzedxVar = zzea;
                                if (zzedxVar == null) {
                                    zzedxVar = new zzecd.zzc<>(zzihs);
                                    zzea = zzedxVar;
                                }
                            }
                        }
                        return zzedxVar;
                    case 6:
                        return Byte.valueOf(this.zziew);
                    case 7:
                        this.zziew = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzh zzhVar = new zzh();
                zzihs = zzhVar;
                zzecd.zza(zzh.class, zzhVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zzi extends zzecd<zzi, zza> implements zzedq {
            private static volatile zzedx<zzi> zzea;
            private static final zzi zziib;
            private int zzdl;
            private String zzihy = "";
            private long zzihz;
            private boolean zziia;

            private zzi() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzecd.zza<zzi, zza> implements zzedq {
                private zza() {
                    super(zzi.zziib);
                }

                public final zza zzie(String str) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzi) this.zzhxt).zzif(str);
                    return this;
                }

                public final zza zzft(long j) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzi) this.zzhxt).zzfu(j);
                    return this;
                }

                public final zza zzbw(boolean z) {
                    if (this.zzhxu) {
                        zzbep();
                        this.zzhxu = false;
                    }
                    ((zzi) this.zzhxt).zzbx(z);
                    return this;
                }

                /* synthetic */ zza(zzefx zzefxVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzif(String str) {
                str.getClass();
                this.zzdl |= 1;
                this.zzihy = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzfu(long j) {
                this.zzdl |= 2;
                this.zzihz = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzbx(boolean z) {
                this.zzdl |= 4;
                this.zziia = z;
            }

            public static zza zzbil() {
                return zziib.zzbev();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzecd
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzefx.zzdk[i - 1]) {
                    case 1:
                        return new zzi();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zziib, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0007\u0002", new Object[]{"zzdl", "zzihy", "zzihz", "zziia"});
                    case 4:
                        return zziib;
                    case 5:
                        zzedx<zzi> zzedxVar = zzea;
                        if (zzedxVar == null) {
                            synchronized (zzi.class) {
                                zzedxVar = zzea;
                                if (zzedxVar == null) {
                                    zzedxVar = new zzecd.zzc<>(zziib);
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
                zzi zziVar = new zzi();
                zziib = zziVar;
                zzecd.zza(zzi.class, zziVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzefy$zzb$zzb  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0017zzb extends zzecd.zza<zzb, C0017zzb> implements zzedq {
            private C0017zzb() {
                super(zzb.zzify);
            }

            public final C0017zzb zzb(zzg zzgVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zza(zzgVar);
                return this;
            }

            public final String getUrl() {
                return ((zzb) this.zzhxt).getUrl();
            }

            public final C0017zzb zzhw(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).setUrl(str);
                return this;
            }

            public final C0017zzb zzhx(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zzhu(str);
                return this;
            }

            public final C0017zzb zzb(zza zzaVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zza(zzaVar);
                return this;
            }

            public final List<zzh> zzbhr() {
                return Collections.unmodifiableList(((zzb) this.zzhxt).zzbhr());
            }

            public final C0017zzb zzb(zzh zzhVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zza(zzhVar);
                return this;
            }

            public final String zzbhs() {
                return ((zzb) this.zzhxt).zzbhs();
            }

            public final C0017zzb zzhy(String str) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zzdy(str);
                return this;
            }

            public final C0017zzb zzbhy() {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zzbht();
                return this;
            }

            public final C0017zzb zzb(zzf zzfVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zza(zzfVar);
                return this;
            }

            public final C0017zzb zzb(zzi zziVar) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zza(zziVar);
                return this;
            }

            public final C0017zzb zzo(Iterable<String> iterable) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zzm(iterable);
                return this;
            }

            public final C0017zzb zzp(Iterable<String> iterable) {
                if (this.zzhxu) {
                    zzbep();
                    this.zzhxu = false;
                }
                ((zzb) this.zzhxt).zzn(iterable);
                return this;
            }

            /* synthetic */ C0017zzb(zzefx zzefxVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzg zzgVar) {
            this.zzbxl = zzgVar.zzw();
            this.zzdl |= 1;
        }

        public final String getUrl() {
            return this.zziez;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setUrl(String str) {
            str.getClass();
            this.zzdl |= 4;
            this.zziez = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzhu(String str) {
            str.getClass();
            this.zzdl |= 8;
            this.zzifk = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zza zzaVar) {
            zzaVar.getClass();
            this.zzifm = zzaVar;
            this.zzdl |= 32;
        }

        public final List<zzh> zzbhr() {
            return this.zzifn;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzh zzhVar) {
            zzhVar.getClass();
            if (!this.zzifn.zzbci()) {
                this.zzifn = zzecd.zza(this.zzifn);
            }
            this.zzifn.add(zzhVar);
        }

        public final String zzbhs() {
            return this.zzifo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzdy(String str) {
            str.getClass();
            this.zzdl |= 64;
            this.zzifo = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbht() {
            this.zzdl &= -65;
            this.zzifo = zzify.zzifo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzf zzfVar) {
            zzfVar.getClass();
            this.zzifp = zzfVar;
            this.zzdl |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzi zziVar) {
            zziVar.getClass();
            this.zzifv = zziVar;
            this.zzdl |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzm(Iterable<String> iterable) {
            if (!this.zzifw.zzbci()) {
                this.zzifw = zzecd.zza(this.zzifw);
            }
            zzeag.zza(iterable, this.zzifw);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzn(Iterable<String> iterable) {
            if (!this.zzifx.zzbci()) {
                this.zzifx = zzecd.zza(this.zzifx);
            }
            zzeag.zza(iterable, this.zzifx);
        }

        public static C0017zzb zzbhu() {
            return zzify.zzbev();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzefx.zzdk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new C0017zzb(null);
                case 3:
                    return zza(zzify, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001\b\u0002\u0002\b\u0003\u0003\b\u0004\u0004Л\u0005\u0007\b\u0006\u001a\u0007\b\t\b\u0007\n\t\u0007\u000b\n\f\u0000\u000b\f\u0001\f\t\u0005\r\b\u0006\u000e\t\u0007\u000f\n\f\u0011\t\r\u0014\u001a\u0015\u001a", new Object[]{"zzdl", "zziez", "zzifk", "zzifl", "zzifn", zzh.class, "zzifq", "zzifr", "zzifs", "zzift", "zzifu", "zzbxl", zzg.zzx(), "zzifj", zza.zzc.zzx(), "zzifm", "zzifo", "zzifp", "zzies", "zzifv", "zzifw", "zzifx"});
                case 4:
                    return zzify;
                case 5:
                    zzedx<zzb> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zzb.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zzify);
                                zzea = zzedxVar;
                            }
                        }
                    }
                    return zzedxVar;
                case 6:
                    return Byte.valueOf(this.zziew);
                case 7:
                    this.zziew = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzify = zzbVar;
            zzecd.zza(zzb.class, zzbVar);
        }
    }
}
