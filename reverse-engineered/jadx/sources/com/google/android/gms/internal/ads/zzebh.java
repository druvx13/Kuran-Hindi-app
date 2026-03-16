package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzebh extends zzebf {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private int zzhty;
    private int zzhtz;
    private int zzhub;
    private final boolean zzhud;
    private int zzhue;

    private zzebh(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzhub = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzhue = i;
        this.zzhud = z;
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
            if (this.limit - this.pos >= 10) {
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
        if (zzbdq > 0 && zzbdq <= this.limit - this.pos) {
            String str = new String(this.buffer, this.pos, zzbdq, zzecg.UTF_8);
            this.pos += zzbdq;
            return str;
        } else if (zzbdq == 0) {
            return "";
        } else {
            if (zzbdq < 0) {
                throw zzeco.zzbfh();
            }
            throw zzeco.zzbfg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final String zzbdf() throws IOException {
        int zzbdq = zzbdq();
        if (zzbdq > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzbdq <= i - i2) {
                String zzo = zzefk.zzo(this.buffer, i2, zzbdq);
                this.pos += zzbdq;
                return zzo;
            }
        }
        if (zzbdq == 0) {
            return "";
        }
        if (zzbdq <= 0) {
            throw zzeco.zzbfh();
        }
        throw zzeco.zzbfg();
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final zzeaq zzbdg() throws IOException {
        byte[] bArr;
        int zzbdq = zzbdq();
        if (zzbdq > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzbdq <= i - i2) {
                zzeaq zzh = zzeaq.zzh(this.buffer, i2, zzbdq);
                this.pos += zzbdq;
                return zzh;
            }
        }
        if (zzbdq == 0) {
            return zzeaq.zzhtf;
        }
        if (zzbdq > 0) {
            int i3 = this.limit;
            int i4 = this.pos;
            if (zzbdq <= i3 - i4) {
                int i5 = zzbdq + i4;
                this.pos = i5;
                bArr = Arrays.copyOfRange(this.buffer, i4, i5);
                return zzeaq.zzv(bArr);
            }
        }
        if (zzbdq <= 0) {
            if (zzbdq == 0) {
                bArr = zzecg.zzhtn;
                return zzeaq.zzv(bArr);
            }
            throw zzeco.zzbfh();
        }
        throw zzeco.zzbfg();
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
            int r1 = r5.limit
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebh.zzbdq():int");
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebh.zzbdr():long");
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
        if (this.limit - i < 4) {
            throw zzeco.zzbfg();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzbdt() throws IOException {
        int i = this.pos;
        if (this.limit - i < 8) {
            throw zzeco.zzbfg();
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
        int zzbdp = i + zzbdp();
        int i2 = this.zzhub;
        if (zzbdp > i2) {
            throw zzeco.zzbfg();
        }
        this.zzhub = zzbdp;
        zzbdu();
        return i2;
    }

    private final void zzbdu() {
        int i = this.limit + this.zzhty;
        this.limit = i;
        int i2 = i - this.zzhue;
        int i3 = this.zzhub;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzhty = i4;
            this.limit = i - i4;
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
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.ads.zzebf
    public final int zzbdp() {
        return this.pos - this.zzhue;
    }

    private final byte zzbdv() throws IOException {
        int i = this.pos;
        if (i == this.limit) {
            throw zzeco.zzbfg();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 1;
        return bArr[i];
    }

    private final void zzgb(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzeco.zzbfh();
        }
        throw zzeco.zzbfg();
    }
}
