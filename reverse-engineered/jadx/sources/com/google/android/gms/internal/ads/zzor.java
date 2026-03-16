package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzor {
    private byte[] data;
    private int zzbhi;
    private int zzbhj = 0;
    private int zzbhk;

    public zzor(byte[] bArr, int i, int i2) {
        this.data = bArr;
        this.zzbhi = i;
        this.zzbhk = i2;
        zziy();
    }

    public final void zzbf(int i) {
        int i2 = this.zzbhi;
        int i3 = (i / 8) + i2;
        this.zzbhi = i3;
        int i4 = this.zzbhj + (i % 8);
        this.zzbhj = i4;
        if (i4 > 7) {
            this.zzbhi = i3 + 1;
            this.zzbhj = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.zzbhi) {
                if (zzbg(i2)) {
                    this.zzbhi++;
                    i2 += 2;
                }
            } else {
                zziy();
                return;
            }
        }
    }

    public final boolean zziu() {
        return zzbe(1) == 1;
    }

    public final int zzbe(int i) {
        int i2;
        int i3;
        if (i == 0) {
            return 0;
        }
        int i4 = i / 8;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = zzbg(this.zzbhi + 1) ? this.zzbhi + 2 : this.zzbhi + 1;
            int i8 = this.zzbhj;
            if (i8 != 0) {
                byte[] bArr = this.data;
                i3 = ((bArr[i7] & 255) >>> (8 - i8)) | ((bArr[this.zzbhi] & 255) << i8);
            } else {
                i3 = this.data[this.zzbhi];
            }
            i -= 8;
            i5 |= (255 & i3) << i;
            this.zzbhi = i7;
        }
        if (i > 0) {
            int i9 = this.zzbhj + i;
            byte b = (byte) (255 >> (8 - i));
            int i10 = zzbg(this.zzbhi + 1) ? this.zzbhi + 2 : this.zzbhi + 1;
            if (i9 > 8) {
                byte[] bArr2 = this.data;
                i2 = (b & (((255 & bArr2[i10]) >> (16 - i9)) | ((bArr2[this.zzbhi] & 255) << (i9 - 8)))) | i5;
                this.zzbhi = i10;
            } else {
                i2 = (b & ((255 & this.data[this.zzbhi]) >> (8 - i9))) | i5;
                if (i9 == 8) {
                    this.zzbhi = i10;
                }
            }
            i5 = i2;
            this.zzbhj = i9 % 8;
        }
        zziy();
        return i5;
    }

    public final int zziv() {
        return zzix();
    }

    public final int zziw() {
        int zzix = zzix();
        return (zzix % 2 == 0 ? -1 : 1) * ((zzix + 1) / 2);
    }

    private final int zzix() {
        int i = 0;
        while (!zziu()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? zzbe(i) : 0);
    }

    private final boolean zzbg(int i) {
        if (2 > i || i >= this.zzbhk) {
            return false;
        }
        byte[] bArr = this.data;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    private final void zziy() {
        int i;
        int i2;
        int i3 = this.zzbhi;
        zzoh.checkState(i3 >= 0 && (i = this.zzbhj) >= 0 && i < 8 && (i3 < (i2 = this.zzbhk) || (i3 == i2 && i == 0)));
    }
}
