package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public abstract class zzebk extends zzear {
    private static final Logger logger = Logger.getLogger(zzebk.class.getName());
    private static final boolean zzhui = zzefi.zzbhh();
    zzebn zzhuj;

    public static int zzbt(boolean z) {
        return 1;
    }

    public static int zzc(double d) {
        return 8;
    }

    public static int zzfm(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzfo(long j) {
        return 8;
    }

    public static int zzfp(long j) {
        return 8;
    }

    private static long zzfq(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzg(float f) {
        return 4;
    }

    public static int zzgm(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzgo(int i) {
        return 4;
    }

    public static int zzgp(int i) {
        return 4;
    }

    private static int zzgr(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static zzebk zzw(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public abstract void writeTag(int i, int i2) throws IOException;

    public abstract void zza(int i, zzeaq zzeaqVar) throws IOException;

    public abstract void zza(int i, zzedo zzedoVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(int i, zzedo zzedoVar, zzeek zzeekVar) throws IOException;

    public abstract void zzab(int i, int i2) throws IOException;

    public abstract void zzac(int i, int i2) throws IOException;

    public abstract void zzae(int i, int i2) throws IOException;

    public abstract void zzah(zzeaq zzeaqVar) throws IOException;

    public abstract void zzb(int i, zzeaq zzeaqVar) throws IOException;

    public abstract int zzbdy();

    public abstract void zzd(byte b) throws IOException;

    public abstract void zzfi(long j) throws IOException;

    public abstract void zzfk(long j) throws IOException;

    public abstract void zzg(zzedo zzedoVar) throws IOException;

    public abstract void zzgg(int i) throws IOException;

    public abstract void zzgh(int i) throws IOException;

    public abstract void zzgj(int i) throws IOException;

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzh(int i, boolean z) throws IOException;

    public abstract void zzhr(String str) throws IOException;

    public abstract void zzj(int i, long j) throws IOException;

    public abstract void zzk(int i, String str) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzk(byte[] bArr, int i, int i2) throws IOException;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        zzb(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebk.zzb.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zzebk() {
    }

    public final void zzad(int i, int i2) throws IOException {
        zzac(i, zzgr(i2));
    }

    public final void zzi(int i, long j) throws IOException {
        zzh(i, zzfq(j));
    }

    public final void zza(int i, float f) throws IOException {
        zzae(i, Float.floatToRawIntBits(f));
    }

    public final void zzb(int i, double d) throws IOException {
        zzj(i, Double.doubleToRawLongBits(d));
    }

    public final void zzgi(int i) throws IOException {
        zzgh(zzgr(i));
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
    /* loaded from: classes.dex */
    static class zza extends zzebk {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        zza(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i2 + 0;
            if ((i2 | 0 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.buffer = bArr;
            this.offset = 0;
            this.position = 0;
            this.limit = i3;
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void writeTag(int i, int i2) throws IOException {
            zzgh((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzab(int i, int i2) throws IOException {
            writeTag(i, 0);
            zzgg(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzac(int i, int i2) throws IOException {
            writeTag(i, 0);
            zzgh(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzae(int i, int i2) throws IOException {
            writeTag(i, 5);
            zzgj(i2);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzh(int i, long j) throws IOException {
            writeTag(i, 0);
            zzfi(j);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzj(int i, long j) throws IOException {
            writeTag(i, 1);
            zzfk(j);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzh(int i, boolean z) throws IOException {
            writeTag(i, 0);
            zzd(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzk(int i, String str) throws IOException {
            writeTag(i, 2);
            zzhr(str);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zza(int i, zzeaq zzeaqVar) throws IOException {
            writeTag(i, 2);
            zzah(zzeaqVar);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzah(zzeaq zzeaqVar) throws IOException {
            zzgh(zzeaqVar.size());
            zzeaqVar.zza(this);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzk(byte[] bArr, int i, int i2) throws IOException {
            zzgh(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        final void zza(int i, zzedo zzedoVar, zzeek zzeekVar) throws IOException {
            writeTag(i, 2);
            zzeag zzeagVar = (zzeag) zzedoVar;
            int zzbcf = zzeagVar.zzbcf();
            if (zzbcf == -1) {
                zzbcf = zzeekVar.zzau(zzeagVar);
                zzeagVar.zzfk(zzbcf);
            }
            zzgh(zzbcf);
            zzeekVar.zza(zzedoVar, this.zzhuj);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zza(int i, zzedo zzedoVar) throws IOException {
            writeTag(1, 3);
            zzac(2, i);
            writeTag(3, 2);
            zzg(zzedoVar);
            writeTag(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzb(int i, zzeaq zzeaqVar) throws IOException {
            writeTag(1, 3);
            zzac(2, i);
            zza(3, zzeaqVar);
            writeTag(1, 4);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzg(zzedo zzedoVar) throws IOException {
            zzgh(zzedoVar.zzbex());
            zzedoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzd(byte b) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzgg(int i) throws IOException {
            if (i >= 0) {
                zzgh(i);
            } else {
                zzfi(i);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzgh(int i) throws IOException {
            if (!zzebk.zzhui || zzean.zzbcl() || zzbdy() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.buffer;
                        int i2 = this.position;
                        this.position = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                    }
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr2[i3] = (byte) i;
            } else if ((i & (-128)) == 0) {
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                zzefi.zza(bArr3, i4, (byte) i);
            } else {
                byte[] bArr4 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                zzefi.zza(bArr4, i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & (-128)) == 0) {
                    byte[] bArr5 = this.buffer;
                    int i7 = this.position;
                    this.position = i7 + 1;
                    zzefi.zza(bArr5, i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.buffer;
                int i8 = this.position;
                this.position = i8 + 1;
                zzefi.zza(bArr6, i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & (-128)) == 0) {
                    byte[] bArr7 = this.buffer;
                    int i10 = this.position;
                    this.position = i10 + 1;
                    zzefi.zza(bArr7, i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.buffer;
                int i11 = this.position;
                this.position = i11 + 1;
                zzefi.zza(bArr8, i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & (-128)) == 0) {
                    byte[] bArr9 = this.buffer;
                    int i13 = this.position;
                    this.position = i13 + 1;
                    zzefi.zza(bArr9, i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.buffer;
                int i14 = this.position;
                this.position = i14 + 1;
                zzefi.zza(bArr10, i14, (byte) (i12 | 128));
                byte[] bArr11 = this.buffer;
                int i15 = this.position;
                this.position = i15 + 1;
                zzefi.zza(bArr11, i15, (byte) (i12 >>> 7));
            }
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzgj(int i) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.buffer;
                int i4 = i3 + 1;
                this.position = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.buffer;
                int i5 = i4 + 1;
                this.position = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.buffer;
                this.position = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzfi(long j) throws IOException {
            if (zzebk.zzhui && zzbdy() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    zzefi.zza(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                zzefi.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzfk(long j) throws IOException {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                this.position = i2;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.buffer;
                int i3 = i2 + 1;
                this.position = i3;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.buffer;
                int i4 = i3 + 1;
                this.position = i4;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.buffer;
                int i5 = i4 + 1;
                this.position = i5;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.buffer;
                int i6 = i5 + 1;
                this.position = i6;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.buffer;
                int i7 = i6 + 1;
                this.position = i7;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.buffer;
                int i8 = i7 + 1;
                this.position = i8;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.buffer;
                this.position = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        private final void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzear
        public final void zzi(byte[] bArr, int i, int i2) throws IOException {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final void zzhr(String str) throws IOException {
            int i = this.position;
            try {
                int zzgm = zzgm(str.length() * 3);
                int zzgm2 = zzgm(str.length());
                if (zzgm2 == zzgm) {
                    int i2 = i + zzgm2;
                    this.position = i2;
                    int zza = zzefk.zza(str, this.buffer, i2, zzbdy());
                    this.position = i;
                    zzgh((zza - i) - zzgm2);
                    this.position = zza;
                    return;
                }
                zzgh(zzefk.zza(str));
                this.position = zzefk.zza(str, this.buffer, this.position, zzbdy());
            } catch (zzefo e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzebk
        public final int zzbdy() {
            return this.limit - this.position;
        }
    }

    public final void zzfj(long j) throws IOException {
        zzfi(zzfq(j));
    }

    public final void zzf(float f) throws IOException {
        zzgj(Float.floatToRawIntBits(f));
    }

    public final void zzb(double d) throws IOException {
        zzfk(Double.doubleToRawLongBits(d));
    }

    public final void zzbs(boolean z) throws IOException {
        zzd(z ? (byte) 1 : (byte) 0);
    }

    public static int zzaf(int i, int i2) {
        return zzgk(i) + zzgl(i2);
    }

    public static int zzag(int i, int i2) {
        return zzgk(i) + zzgm(i2);
    }

    public static int zzah(int i, int i2) {
        return zzgk(i) + zzgm(zzgr(i2));
    }

    public static int zzai(int i, int i2) {
        return zzgk(i) + 4;
    }

    public static int zzaj(int i, int i2) {
        return zzgk(i) + 4;
    }

    public static int zzk(int i, long j) {
        return zzgk(i) + zzfm(j);
    }

    public static int zzl(int i, long j) {
        return zzgk(i) + zzfm(j);
    }

    public static int zzm(int i, long j) {
        return zzgk(i) + zzfm(zzfq(j));
    }

    public static int zzn(int i, long j) {
        return zzgk(i) + 8;
    }

    public static int zzo(int i, long j) {
        return zzgk(i) + 8;
    }

    public static int zzb(int i, float f) {
        return zzgk(i) + 4;
    }

    public static int zzc(int i, double d) {
        return zzgk(i) + 8;
    }

    public static int zzi(int i, boolean z) {
        return zzgk(i) + 1;
    }

    public static int zzak(int i, int i2) {
        return zzgk(i) + zzgl(i2);
    }

    public static int zzl(int i, String str) {
        return zzgk(i) + zzhs(str);
    }

    public static int zzc(int i, zzeaq zzeaqVar) {
        int zzgk = zzgk(i);
        int size = zzeaqVar.size();
        return zzgk + zzgm(size) + size;
    }

    public static int zza(int i, zzect zzectVar) {
        int zzgk = zzgk(i);
        int zzbex = zzectVar.zzbex();
        return zzgk + zzgm(zzbex) + zzbex;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(int i, zzedo zzedoVar, zzeek zzeekVar) {
        return zzgk(i) + zza(zzedoVar, zzeekVar);
    }

    public static int zzb(int i, zzedo zzedoVar) {
        return (zzgk(1) << 1) + zzag(2, i) + zzgk(3) + zzh(zzedoVar);
    }

    public static int zzd(int i, zzeaq zzeaqVar) {
        return (zzgk(1) << 1) + zzag(2, i) + zzc(3, zzeaqVar);
    }

    public static int zzb(int i, zzect zzectVar) {
        return (zzgk(1) << 1) + zzag(2, i) + zza(3, zzectVar);
    }

    public static int zzgk(int i) {
        return zzgm(i << 3);
    }

    public static int zzgl(int i) {
        if (i >= 0) {
            return zzgm(i);
        }
        return 10;
    }

    public static int zzgn(int i) {
        return zzgm(zzgr(i));
    }

    public static int zzfl(long j) {
        return zzfm(j);
    }

    public static int zzfn(long j) {
        return zzfm(zzfq(j));
    }

    public static int zzgq(int i) {
        return zzgl(i);
    }

    public static int zzhs(String str) {
        int length;
        try {
            length = zzefk.zza(str);
        } catch (zzefo unused) {
            length = str.getBytes(zzecg.UTF_8).length;
        }
        return zzgm(length) + length;
    }

    public static int zza(zzect zzectVar) {
        int zzbex = zzectVar.zzbex();
        return zzgm(zzbex) + zzbex;
    }

    public static int zzai(zzeaq zzeaqVar) {
        int size = zzeaqVar.size();
        return zzgm(size) + size;
    }

    public static int zzx(byte[] bArr) {
        int length = bArr.length;
        return zzgm(length) + length;
    }

    public static int zzh(zzedo zzedoVar) {
        int zzbex = zzedoVar.zzbex();
        return zzgm(zzbex) + zzbex;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(zzedo zzedoVar, zzeek zzeekVar) {
        zzeag zzeagVar = (zzeag) zzedoVar;
        int zzbcf = zzeagVar.zzbcf();
        if (zzbcf == -1) {
            zzbcf = zzeekVar.zzau(zzeagVar);
            zzeagVar.zzfk(zzbcf);
        }
        return zzgm(zzbcf) + zzbcf;
    }

    public final void zzbdz() {
        if (zzbdy() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void zza(String str, zzefo zzefoVar) throws IOException {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzefoVar);
        byte[] bytes = str.getBytes(zzecg.UTF_8);
        try {
            zzgh(bytes.length);
            zzi(bytes, 0, bytes.length);
        } catch (zzb e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int zzc(int i, zzedo zzedoVar, zzeek zzeekVar) {
        int zzgk = zzgk(i) << 1;
        zzeag zzeagVar = (zzeag) zzedoVar;
        int zzbcf = zzeagVar.zzbcf();
        if (zzbcf == -1) {
            zzbcf = zzeekVar.zzau(zzeagVar);
            zzeagVar.zzfk(zzbcf);
        }
        return zzgk + zzbcf;
    }

    @Deprecated
    public static int zzi(zzedo zzedoVar) {
        return zzedoVar.zzbex();
    }

    @Deprecated
    public static int zzgs(int i) {
        return zzgm(i);
    }
}
