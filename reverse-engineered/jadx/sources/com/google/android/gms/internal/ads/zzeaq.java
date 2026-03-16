package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzeaq implements Serializable, Iterable<Byte> {
    public static final zzeaq zzhtf = new zzeba(zzecg.zzhtn);
    private static final zzeaw zzhtg;
    private static final Comparator<zzeaq> zzhth;
    private int zzhsp = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzb(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract int size();

    protected abstract String zza(Charset charset);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(zzear zzearVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zzb(byte[] bArr, int i, int i2, int i3);

    public abstract boolean zzbcp();

    public abstract zzebf zzbcq();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzbcs();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean zzbct();

    public abstract byte zzfo(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte zzfp(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzg(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int zzh(int i, int i2, int i3);

    public abstract zzeaq zzz(int i, int i2);

    @Override // java.lang.Iterable
    /* renamed from: zzbcn */
    public zzeaz iterator() {
        return new zzeat(this);
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public static zzeaq zzh(byte[] bArr, int i, int i2) {
        zzi(i, i + i2, bArr.length);
        return new zzeba(zzhtg.zzj(bArr, i, i2));
    }

    public static zzeaq zzu(byte[] bArr) {
        return zzh(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeaq zzv(byte[] bArr) {
        return new zzeba(bArr);
    }

    public static zzeaq zzhq(String str) {
        return new zzeba(str.getBytes(zzecg.UTF_8));
    }

    public static zzeaq zzf(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            zzeaq zzh = i2 == 0 ? null : zzh(bArr, 0, i2);
            if (zzh != null) {
                arrayList.add(zzh);
                i = Math.min(i << 1, 8192);
            } else {
                return zzl(arrayList);
            }
        }
    }

    public static zzeaq zzl(Iterable<zzeaq> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            size = 0;
            Iterator<zzeaq> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = ((Collection) iterable).size();
        }
        if (size == 0) {
            return zzhtf;
        }
        return zza(iterable.iterator(), size);
    }

    private static zzeaq zza(Iterator<zzeaq> it, int i) {
        if (i > 0) {
            if (i == 1) {
                return it.next();
            }
            int i2 = i >>> 1;
            zzeaq zza = zza(it, i2);
            zzeaq zza2 = zza(it, i - i2);
            if (Integer.MAX_VALUE - zza.size() < zza2.size()) {
                int size = zza.size();
                int size2 = zza2.size();
                StringBuilder sb = new StringBuilder(53);
                sb.append("ByteString would be too long: ");
                sb.append(size);
                sb.append("+");
                sb.append(size2);
                throw new IllegalArgumentException(sb.toString());
            }
            return zzeed.zza(zza, zza2);
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    @Deprecated
    public final void zza(byte[] bArr, int i, int i2, int i3) {
        zzi(i, i + i3, size());
        zzi(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zzb(bArr, i, i2, i3);
        }
    }

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return zzecg.zzhtn;
        }
        byte[] bArr = new byte[size];
        zzb(bArr, 0, 0, size);
        return bArr;
    }

    public final String zzbco() {
        return size() == 0 ? "" : zza(zzecg.UTF_8);
    }

    public final int hashCode() {
        int i = this.zzhsp;
        if (i == 0) {
            int size = size();
            i = zzh(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzhsp = i;
        }
        return i;
    }

    public static zzebd zzbcr() {
        return new zzebd(128);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeay zzfq(int i) {
        return new zzeay(i, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzbcu() {
        return this.zzhsp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzaa(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(22);
                sb.append("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Beginning index: ");
                sb.append(i);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 < i) {
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("Beginning index larger than ending index: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("End index: ");
                sb3.append(i2);
                sb3.append(" >= ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        }
        return i4;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? zzeey.zzam(this) : String.valueOf(zzeey.zzam(zzz(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    static {
        zzhtg = zzean.zzbcl() ? new zzebc(null) : new zzeau(null);
        zzhth = new zzeas();
    }
}
