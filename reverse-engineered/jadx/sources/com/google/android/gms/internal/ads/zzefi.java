package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzefi {
    private static final boolean zzhui;
    private static final zzc zzicr;
    private static final boolean zzics;
    private static final long zzict;
    private static final long zzicu;
    private static final long zzicv;
    private static final long zzicw;
    private static final long zzicx;
    private static final long zzicy;
    private static final long zzicz;
    private static final long zzida;
    private static final long zzidb;
    private static final long zzidc;
    private static final long zzidd;
    private static final long zzide;
    private static final long zzidf;
    private static final long zzidg;
    private static final int zzidh;
    static final boolean zzidi;
    private static final Logger logger = Logger.getLogger(zzefi.class.getName());
    private static final Unsafe zzhgt = zzbhj();
    private static final Class<?> zzhsx = zzean.zzbcm();
    private static final boolean zzicp = zzm(Long.TYPE);
    private static final boolean zzicq = zzm(Integer.TYPE);

    private zzefi() {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    static final class zza extends zzc {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final byte zzy(Object obj, long j) {
            if (zzefi.zzidi) {
                return zzefi.zzq(obj, j);
            }
            return zzefi.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final void zze(Object obj, long j, byte b) {
            if (zzefi.zzidi) {
                zzefi.zza(obj, j, b);
            } else {
                zzefi.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final boolean zzm(Object obj, long j) {
            if (zzefi.zzidi) {
                return zzefi.zzs(obj, j);
            }
            return zzefi.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final void zza(Object obj, long j, boolean z) {
            if (zzefi.zzidi) {
                zzefi.zzb(obj, j, z);
            } else {
                zzefi.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    static final class zzb extends zzc {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final byte zzy(Object obj, long j) {
            if (zzefi.zzidi) {
                return zzefi.zzq(obj, j);
            }
            return zzefi.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final void zze(Object obj, long j, byte b) {
            if (zzefi.zzidi) {
                zzefi.zza(obj, j, b);
            } else {
                zzefi.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final boolean zzm(Object obj, long j) {
            if (zzefi.zzidi) {
                return zzefi.zzs(obj, j);
            }
            return zzefi.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final void zza(Object obj, long j, boolean z) {
            if (zzefi.zzidi) {
                zzefi.zzb(obj, j, z);
            } else {
                zzefi.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    static final class zzd extends zzc {
        zzd(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final byte zzy(Object obj, long j) {
            return this.zzidj.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final void zze(Object obj, long j, byte b) {
            this.zzidj.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final boolean zzm(Object obj, long j) {
            return this.zzidj.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final void zza(Object obj, long j, boolean z) {
            this.zzidj.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final float zzn(Object obj, long j) {
            return this.zzidj.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final void zza(Object obj, long j, float f) {
            this.zzidj.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final double zzo(Object obj, long j) {
            return this.zzidj.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzefi.zzc
        public final void zza(Object obj, long j, double d) {
            this.zzidj.putDouble(obj, j, d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzbhh() {
        return zzhui;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public static abstract class zzc {
        Unsafe zzidj;

        zzc(Unsafe unsafe) {
            this.zzidj = unsafe;
        }

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zze(Object obj, long j, byte b);

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final int zzk(Object obj, long j) {
            return this.zzidj.getInt(obj, j);
        }

        public final void zzb(Object obj, long j, int i) {
            this.zzidj.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zzidj.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzidj.putLong(obj, j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzbhi() {
        return zzics;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zzj(Class<T> cls) {
        try {
            return (T) zzhgt.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzk(Class<?> cls) {
        if (zzhui) {
            return zzicr.zzidj.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzl(Class<?> cls) {
        if (zzhui) {
            return zzicr.zzidj.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(Object obj, long j) {
        return zzicr.zzk(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(Object obj, long j, int i) {
        zzicr.zzb(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzl(Object obj, long j) {
        return zzicr.zzl(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, long j2) {
        zzicr.zza(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzm(Object obj, long j) {
        return zzicr.zzm(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, boolean z) {
        zzicr.zza(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzn(Object obj, long j) {
        return zzicr.zzn(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, float f) {
        zzicr.zza(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzo(Object obj, long j) {
        return zzicr.zzo(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, double d) {
        zzicr.zza(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzp(Object obj, long j) {
        return zzicr.zzidj.getObject(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, Object obj2) {
        zzicr.zzidj.putObject(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte zza(byte[] bArr, long j) {
        return zzicr.zzy(bArr, zzict + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(byte[] bArr, long j, byte b) {
        zzicr.zze(bArr, zzict + j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzbhj() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzefh());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzbhk() {
        Unsafe unsafe = zzhgt;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (zzean.zzbcl()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzbhl() {
        Unsafe unsafe = zzhgt;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (zzbhm() == null) {
                return false;
            }
            if (zzean.zzbcl()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzm(Class<?> cls) {
        if (zzean.zzbcl()) {
            try {
                Class<?> cls2 = zzhsx;
                cls2.getMethod("peekLong", cls, Boolean.TYPE);
                cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
                cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
                cls2.getMethod("peekInt", cls, Boolean.TYPE);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
                cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    private static Field zzbhm() {
        Field zzb2;
        if (!zzean.zzbcl() || (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) == null) {
            Field zzb3 = zzb(Buffer.class, "address");
            if (zzb3 == null || zzb3.getType() != Long.TYPE) {
                return null;
            }
            return zzb3;
        }
        return zzb2;
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        return (byte) (zzk(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzr(Object obj, long j) {
        return (byte) (zzk(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static {
        zzc zzcVar;
        zzc zzcVar2 = null;
        if (zzhgt != null) {
            if (zzean.zzbcl()) {
                if (zzicp) {
                    zzcVar2 = new zza(zzhgt);
                } else if (zzicq) {
                    zzcVar2 = new zzb(zzhgt);
                }
            } else {
                zzcVar2 = new zzd(zzhgt);
            }
        }
        zzicr = zzcVar2;
        zzics = zzbhl();
        zzhui = zzbhk();
        zzict = zzk(byte[].class);
        zzicu = zzk(boolean[].class);
        zzicv = zzl(boolean[].class);
        zzicw = zzk(int[].class);
        zzicx = zzl(int[].class);
        zzicy = zzk(long[].class);
        zzicz = zzl(long[].class);
        zzida = zzk(float[].class);
        zzidb = zzl(float[].class);
        zzidc = zzk(double[].class);
        zzidd = zzl(double[].class);
        zzide = zzk(Object[].class);
        zzidf = zzl(Object[].class);
        Field zzbhm = zzbhm();
        zzidg = (zzbhm == null || (zzcVar = zzicr) == null) ? -1L : zzcVar.zzidj.objectFieldOffset(zzbhm);
        zzidh = (int) (zzict & 7);
        zzidi = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }
}
