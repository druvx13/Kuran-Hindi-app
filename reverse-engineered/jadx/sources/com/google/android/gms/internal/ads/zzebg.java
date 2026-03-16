package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzebg extends zzebf {
    private final byte[] buffer;
    private int pos;
    private int zzajl;
    private final InputStream zzhtx;
    private int zzhty;
    private int zzhtz;
    private int zzhua;
    private int zzhub;
    private zzebj zzhuc;

    private zzebg(InputStream inputStream, int i) {
        super();
        this.zzhub = Integer.MAX_VALUE;
        this.zzhuc = null;
        zzecg.zza(inputStream, "input");
        this.zzhtx = inputStream;
        this.buffer = new byte[i];
        this.zzajl = 0;
        this.pos = 0;
        this.zzhua = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final int zzbcy() throws IOException {
        if (zzbdo()) {
            this.zzhtz = 0;
            return 0;
        }
        int zzbdq = zzbdq();
        this.zzhtz = zzbdq;
        if ((zzbdq >>> 3) != 0) {
            return zzbdq;
        }
        throw zzeco.zzbfj();
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final void zzfs(int i) throws zzeco {
        if (this.zzhtz != i) {
            throw zzeco.zzbfk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final boolean zzft(int i) throws IOException {
        int zzbcy;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzajl - this.pos >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.buffer;
                    int i4 = this.pos;
                    this.pos = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzeco.zzbfi();
            }
            while (i3 < 10) {
                if (zzbdv() < 0) {
                    i3++;
                }
            }
            throw zzeco.zzbfi();
            return true;
        } else if (i2 == 1) {
            zzgb(8);
            return true;
        } else if (i2 == 2) {
            zzgb(zzbdq());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzgb(4);
                    return true;
                }
                throw zzeco.zzbfl();
            }
            return false;
        } else {
            do {
                zzbcy = zzbcy();
                if (zzbcy == 0) {
                    break;
                }
            } while (zzft(zzbcy));
            zzfs(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzbdt());
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzbds());
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final long zzbcz() throws IOException {
        return zzbdr();
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final long zzbda() throws IOException {
        return zzbdr();
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final int zzbdb() throws IOException {
        return zzbdq();
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final long zzbdc() throws IOException {
        return zzbdt();
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final int zzbdd() throws IOException {
        return zzbds();
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final boolean zzbde() throws IOException {
        return zzbdr() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final String readString() throws IOException {
        int zzbdq = zzbdq();
        if (zzbdq > 0 && zzbdq <= this.zzajl - this.pos) {
            String str = new String(this.buffer, this.pos, zzbdq, zzecg.UTF_8);
            this.pos += zzbdq;
            return str;
        } else if (zzbdq == 0) {
            return "";
        } else {
            if (zzbdq <= this.zzajl) {
                zzfx(zzbdq);
                String str2 = new String(this.buffer, this.pos, zzbdq, zzecg.UTF_8);
                this.pos += zzbdq;
                return str2;
            }
            return new String(zzg(zzbdq, false), zzecg.UTF_8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final String zzbdf() throws IOException {
        byte[] zzg;
        int zzbdq = zzbdq();
        int i = this.pos;
        if (zzbdq <= this.zzajl - i && zzbdq > 0) {
            zzg = this.buffer;
            this.pos = i + zzbdq;
        } else if (zzbdq == 0) {
            return "";
        } else {
            if (zzbdq <= this.zzajl) {
                zzfx(zzbdq);
                zzg = this.buffer;
                this.pos = zzbdq;
            } else {
                zzg = zzg(zzbdq, false);
            }
            i = 0;
        }
        return zzefk.zzo(zzg, i, zzbdq);
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final zzeaq zzbdg() throws IOException {
        int zzbdq = zzbdq();
        int i = this.zzajl;
        int i2 = this.pos;
        if (zzbdq <= i - i2 && zzbdq > 0) {
            zzeaq zzh = zzeaq.zzh(this.buffer, i2, zzbdq);
            this.pos += zzbdq;
            return zzh;
        } else if (zzbdq == 0) {
            return zzeaq.zzhtf;
        } else {
            byte[] zzfz = zzfz(zzbdq);
            if (zzfz != null) {
                return zzeaq.zzu(zzfz);
            }
            int i3 = this.pos;
            int i4 = this.zzajl;
            int i5 = i4 - i3;
            this.zzhua += i4;
            this.pos = 0;
            this.zzajl = 0;
            List<byte[]> zzga = zzga(zzbdq - i5);
            byte[] bArr = new byte[zzbdq];
            System.arraycopy(this.buffer, i3, bArr, 0, i5);
            for (byte[] bArr2 : zzga) {
                System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                i5 += bArr2.length;
            }
            return zzeaq.zzv(bArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final int zzbdh() throws IOException {
        return zzbdq();
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final int zzbdi() throws IOException {
        return zzbdq();
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final int zzbdj() throws IOException {
        return zzbds();
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final long zzbdk() throws IOException {
        return zzbdt();
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final int zzbdl() throws IOException {
        return zzfw(zzbdq());
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final long zzbdm() throws IOException {
        return zzfh(zzbdr());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzbdq() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.pos
            int r1 = r5.zzajl
            if (r1 == r0) goto L6b
            byte[] r2 = r5.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.pos = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.pos = r1
            return r0
        L6b:
            long r0 = r5.zzbdn()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebg.zzbdq():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r2[r0] >= 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzbdr() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebg.zzbdr():long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzebf
    public final long zzbdn() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzbdv = zzbdv();
            j |= (zzbdv & Byte.MAX_VALUE) << i;
            if ((zzbdv & 128) == 0) {
                return j;
            }
        }
        throw zzeco.zzbfi();
    }

    private final int zzbds() throws IOException {
        int i = this.pos;
        if (this.zzajl - i < 4) {
            zzfx(4);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzbdt() throws IOException {
        int i = this.pos;
        if (this.zzajl - i < 8) {
            zzfx(8);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final int zzfu(int i) throws zzeco {
        if (i < 0) {
            throw zzeco.zzbfh();
        }
        int i2 = i + this.zzhua + this.pos;
        int i3 = this.zzhub;
        if (i2 > i3) {
            throw zzeco.zzbfg();
        }
        this.zzhub = i2;
        zzbdu();
        return i3;
    }

    private final void zzbdu() {
        int i = this.zzajl + this.zzhty;
        this.zzajl = i;
        int i2 = this.zzhua + i;
        int i3 = this.zzhub;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzhty = i4;
            this.zzajl = i - i4;
            return;
        }
        this.zzhty = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final void zzfv(int i) {
        this.zzhub = i;
        zzbdu();
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final boolean zzbdo() throws IOException {
        return this.pos == this.zzajl && !zzfy(1);
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final int zzbdp() {
        return this.zzhua + this.pos;
    }

    private final void zzfx(int i) throws IOException {
        if (zzfy(i)) {
            return;
        }
        if (i > (this.zzhtu - this.zzhua) - this.pos) {
            throw zzeco.zzbfm();
        }
        throw zzeco.zzbfg();
    }

    private final boolean zzfy(int i) throws IOException {
        while (this.pos + i > this.zzajl) {
            int i2 = this.zzhtu;
            int i3 = this.zzhua;
            int i4 = this.pos;
            if (i > (i2 - i3) - i4 || i3 + i4 + i > this.zzhub) {
                return false;
            }
            if (i4 > 0) {
                int i5 = this.zzajl;
                if (i5 > i4) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.zzhua += i4;
                this.zzajl -= i4;
                this.pos = 0;
            }
            InputStream inputStream = this.zzhtx;
            byte[] bArr2 = this.buffer;
            int i6 = this.zzajl;
            int read = inputStream.read(bArr2, i6, Math.min(bArr2.length - i6, (this.zzhtu - this.zzhua) - this.zzajl));
            if (read == 0 || read < -1 || read > this.buffer.length) {
                String valueOf = String.valueOf(this.zzhtx.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                sb.append(valueOf);
                sb.append("#read(byte[]) returned invalid result: ");
                sb.append(read);
                sb.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb.toString());
            } else if (read <= 0) {
                return false;
            } else {
                this.zzajl += read;
                zzbdu();
                if (this.zzajl >= i) {
                    return true;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    private final byte zzbdv() throws IOException {
        if (this.pos == this.zzajl) {
            zzfx(1);
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i];
    }

    private final byte[] zzg(int i, boolean z) throws IOException {
        byte[] zzfz = zzfz(i);
        if (zzfz != null) {
            return zzfz;
        }
        int i2 = this.pos;
        int i3 = this.zzajl;
        int i4 = i3 - i2;
        this.zzhua += i3;
        this.pos = 0;
        this.zzajl = 0;
        List<byte[]> zzga = zzga(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, i2, bArr, 0, i4);
        for (byte[] bArr2 : zzga) {
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    private final byte[] zzfz(int i) throws IOException {
        if (i == 0) {
            return zzecg.zzhtn;
        }
        if (i < 0) {
            throw zzeco.zzbfh();
        }
        int i2 = this.zzhua + this.pos + i;
        if (i2 - this.zzhtu > 0) {
            throw zzeco.zzbfm();
        }
        int i3 = this.zzhub;
        if (i2 > i3) {
            zzgb((i3 - this.zzhua) - this.pos);
            throw zzeco.zzbfg();
        }
        int i4 = this.zzajl - this.pos;
        int i5 = i - i4;
        if (i5 < 4096 || i5 <= this.zzhtx.available()) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.buffer, this.pos, bArr, 0, i4);
            this.zzhua += this.zzajl;
            this.pos = 0;
            this.zzajl = 0;
            while (i4 < i) {
                int read = this.zzhtx.read(bArr, i4, i - i4);
                if (read == -1) {
                    throw zzeco.zzbfg();
                }
                this.zzhua += read;
                i4 += read;
            }
            return bArr;
        }
        return null;
    }

    private final List<byte[]> zzga(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.zzhtx.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw zzeco.zzbfg();
                }
                this.zzhua += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzgb(int i) throws IOException {
        int i2 = this.zzajl;
        int i3 = this.pos;
        if (i <= i2 - i3 && i >= 0) {
            this.pos = i3 + i;
        } else if (i < 0) {
            throw zzeco.zzbfh();
        } else {
            int i4 = this.zzhua;
            int i5 = this.pos;
            int i6 = i4 + i5 + i;
            int i7 = this.zzhub;
            if (i6 > i7) {
                zzgb((i7 - i4) - i5);
                throw zzeco.zzbfg();
            }
            this.zzhua = i4 + i5;
            int i8 = this.zzajl - i5;
            this.zzajl = 0;
            this.pos = 0;
            while (i8 < i) {
                try {
                    long j = i - i8;
                    long skip = this.zzhtx.skip(j);
                    if (skip >= 0 && skip <= j) {
                        if (skip == 0) {
                            break;
                        }
                        i8 += (int) skip;
                    } else {
                        String valueOf = String.valueOf(this.zzhtx.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                        sb.append(valueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(skip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                } finally {
                    this.zzhua += i8;
                    zzbdu();
                }
            }
            if (i8 >= i) {
                return;
            }
            int i9 = this.zzajl;
            int i10 = i9 - this.pos;
            this.pos = i9;
            zzfx(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.zzajl;
                if (i11 > i12) {
                    i10 += i12;
                    this.pos = i12;
                    zzfx(1);
                } else {
                    this.pos = i11;
                    return;
                }
            }
        }
    }
}
