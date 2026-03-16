package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzecg {
    public static final byte[] zzhtn;
    private static final ByteBuffer zzhyp;
    private static final zzebf zzhyq;
    static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    public static int zzbu(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzfr(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zza(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean zzy(byte[] bArr) {
        return zzefk.zzy(bArr);
    }

    public static String zzz(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int zza = zza(length, bArr, 0, length);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzk(zzedo zzedoVar) {
        if (zzedoVar instanceof zzeai) {
            zzeai zzeaiVar = (zzeai) zzedoVar;
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzd(Object obj, Object obj2) {
        return ((zzedo) obj).zzbfb().zzf((zzedo) obj2).zzbes();
    }

    static {
        byte[] bArr = new byte[0];
        zzhtn = bArr;
        zzhyp = ByteBuffer.wrap(bArr);
        byte[] bArr2 = zzhtn;
        zzhyq = zzebf.zzb(bArr2, 0, bArr2.length, false);
    }
}
