package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
/* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbo {

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzecd<zza, C0009zza> implements zzedq {
        private static volatile zzedx<zza> zzea;
        private static final zza zzem;
        private int zzdl;
        private zzb zzek;
        private zzc zzel;

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzbo$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0009zza extends zzecd.zza<zza, C0009zza> implements zzedq {
            private C0009zza() {
                super(zza.zzem);
            }

            /* synthetic */ C0009zza(zzbq zzbqVar) {
                this();
            }
        }

        public final boolean zzy() {
            return (this.zzdl & 1) != 0;
        }

        public final zzb zzz() {
            zzb zzbVar = this.zzek;
            return zzbVar == null ? zzb.zzae() : zzbVar;
        }

        public final boolean zzaa() {
            return (this.zzdl & 2) != 0;
        }

        public final zzc zzab() {
            zzc zzcVar = this.zzel;
            return zzcVar == null ? zzc.zzah() : zzcVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbq.zzdk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0009zza(null);
                case 3:
                    return zza(zzem, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"zzdl", "zzek", "zzel"});
                case 4:
                    return zzem;
                case 5:
                    zzedx<zza> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zza.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zzem);
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
            zzem = zzaVar;
            zzecd.zza(zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzecd<zzb, zza> implements zzedq {
        private static volatile zzedx<zzb> zzea;
        private static final zzb zzeo;
        private int zzdl;
        private int zzen = 2;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzecd.zza<zzb, zza> implements zzedq {
            private zza() {
                super(zzb.zzeo);
            }

            /* synthetic */ zza(zzbq zzbqVar) {
                this();
            }
        }

        public final zzbr zzad() {
            zzbr zzg = zzbr.zzg(this.zzen);
            return zzg == null ? zzbr.ENUM_SIGNAL_SOURCE_ADSHIELD : zzg;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbq.zzdk[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzeo, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b\f\u0000", new Object[]{"zzdl", "zzen", zzbr.zzx()});
                case 4:
                    return zzeo;
                case 5:
                    zzedx<zzb> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zzb.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zzeo);
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

        public static zzb zzae() {
            return zzeo;
        }

        static {
            zzb zzbVar = new zzb();
            zzeo = zzbVar;
            zzecd.zza(zzb.class, zzbVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
    /* loaded from: classes.dex */
    public static final class zzc extends zzecd<zzc, zza> implements zzedq {
        private static volatile zzedx<zzc> zzea;
        private static final zzc zzfb;
        private int zzdl;
        private String zzev = "";
        private String zzew = "";
        private String zzex = "";
        private String zzey = "";
        private String zzez = "";
        private String zzfa = "";

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.1.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzecd.zza<zzc, zza> implements zzedq {
            private zza() {
                super(zzc.zzfb);
            }

            /* synthetic */ zza(zzbq zzbqVar) {
                this();
            }
        }

        public final String zzag() {
            return this.zzev;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzecd
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbq.zzdk[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzfb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005", new Object[]{"zzdl", "zzev", "zzew", "zzex", "zzey", "zzez", "zzfa"});
                case 4:
                    return zzfb;
                case 5:
                    zzedx<zzc> zzedxVar = zzea;
                    if (zzedxVar == null) {
                        synchronized (zzc.class) {
                            zzedxVar = zzea;
                            if (zzedxVar == null) {
                                zzedxVar = new zzecd.zzc<>(zzfb);
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

        public static zzc zzah() {
            return zzfb;
        }

        static {
            zzc zzcVar = new zzc();
            zzfb = zzcVar;
            zzecd.zza(zzc.class, zzcVar);
        }
    }
}
