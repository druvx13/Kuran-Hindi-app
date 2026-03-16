package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecd;
import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzefb {
    private static final zzefb zzicj = new zzefb(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzhsu;
    private int zzhxw;
    private Object[] zziae;
    private int[] zzick;

    public static zzefb zzbhd() {
        return zzicj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzefb zzbhe() {
        return new zzefb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzefb zza(zzefb zzefbVar, zzefb zzefbVar2) {
        int i = zzefbVar.count + zzefbVar2.count;
        int[] copyOf = Arrays.copyOf(zzefbVar.zzick, i);
        System.arraycopy(zzefbVar2.zzick, 0, copyOf, zzefbVar.count, zzefbVar2.count);
        Object[] copyOf2 = Arrays.copyOf(zzefbVar.zziae, i);
        System.arraycopy(zzefbVar2.zziae, 0, copyOf2, zzefbVar.count, zzefbVar2.count);
        return new zzefb(i, copyOf, copyOf2, true);
    }

    private zzefb() {
        this(0, new int[8], new Object[8], true);
    }

    private zzefb(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzhxw = -1;
        this.count = i;
        this.zzick = iArr;
        this.zziae = objArr;
        this.zzhsu = z;
    }

    public final void zzbcj() {
        this.zzhsu = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzefv zzefvVar) throws IOException {
        if (zzefvVar.zzbeb() == zzecd.zzf.zzhyn) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzefvVar.zzc(this.zzick[i] >>> 3, this.zziae[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzefvVar.zzc(this.zzick[i2] >>> 3, this.zziae[i2]);
        }
    }

    public final void zzb(zzefv zzefvVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (zzefvVar.zzbeb() == zzecd.zzf.zzhym) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzick[i], this.zziae[i], zzefvVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzick[i2], this.zziae[i2], zzefvVar);
        }
    }

    private static void zzb(int i, Object obj, zzefv zzefvVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzefvVar.zzp(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzefvVar.zzj(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzefvVar.zza(i2, (zzeaq) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzefvVar.zzae(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzeco.zzbfl());
        } else if (zzefvVar.zzbeb() == zzecd.zzf.zzhym) {
            zzefvVar.zzgt(i2);
            ((zzefb) obj).zzb(zzefvVar);
            zzefvVar.zzgu(i2);
        } else {
            zzefvVar.zzgu(i2);
            ((zzefb) obj).zzb(zzefvVar);
            zzefvVar.zzgt(i2);
        }
    }

    public final int zzbhf() {
        int i = this.zzhxw;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zzebk.zzd(this.zzick[i3] >>> 3, (zzeaq) this.zziae[i3]);
        }
        this.zzhxw = i2;
        return i2;
    }

    public final int zzbex() {
        int zzl;
        int i = this.zzhxw;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzick[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zzl = zzebk.zzl(i5, ((Long) this.zziae[i3]).longValue());
            } else if (i6 == 1) {
                zzl = zzebk.zzn(i5, ((Long) this.zziae[i3]).longValue());
            } else if (i6 == 2) {
                zzl = zzebk.zzc(i5, (zzeaq) this.zziae[i3]);
            } else if (i6 == 3) {
                zzl = (zzebk.zzgk(i5) << 1) + ((zzefb) this.zziae[i3]).zzbex();
            } else if (i6 == 5) {
                zzl = zzebk.zzai(i5, ((Integer) this.zziae[i3]).intValue());
            } else {
                throw new IllegalStateException(zzeco.zzbfl());
            }
            i2 += zzl;
        }
        this.zzhxw = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzefb)) {
            zzefb zzefbVar = (zzefb) obj;
            int i = this.count;
            if (i == zzefbVar.count) {
                int[] iArr = this.zzick;
                int[] iArr2 = zzefbVar.zzick;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    } else if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    Object[] objArr = this.zziae;
                    Object[] objArr2 = zzefbVar.zziae;
                    int i3 = this.count;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z2 = true;
                            break;
                        } else if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.count;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzick;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zziae;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzedp.zza(sb, i, String.valueOf(this.zzick[i2] >>> 3), this.zziae[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i, Object obj) {
        if (!this.zzhsu) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.count;
        if (i2 == this.zzick.length) {
            int i3 = this.count + (i2 < 4 ? 8 : i2 >> 1);
            this.zzick = Arrays.copyOf(this.zzick, i3);
            this.zziae = Arrays.copyOf(this.zziae, i3);
        }
        int[] iArr = this.zzick;
        int i4 = this.count;
        iArr[i4] = i;
        this.zziae[i4] = obj;
        this.count = i4 + 1;
    }
}
