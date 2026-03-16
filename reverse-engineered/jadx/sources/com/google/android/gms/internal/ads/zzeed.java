package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public final class zzeed extends zzeaq {
    static final int[] zziba = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzibb;
    private final zzeaq zzibc;
    private final zzeaq zzibd;
    private final int zzibe;
    private final int zzibf;

    private zzeed(zzeaq zzeaqVar, zzeaq zzeaqVar2) {
        this.zzibc = zzeaqVar;
        this.zzibd = zzeaqVar2;
        int size = zzeaqVar.size();
        this.zzibe = size;
        this.zzibb = size + zzeaqVar2.size();
        this.zzibf = Math.max(zzeaqVar.zzbcs(), zzeaqVar2.zzbcs()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeaq zza(zzeaq zzeaqVar, zzeaq zzeaqVar2) {
        if (zzeaqVar2.size() == 0) {
            return zzeaqVar;
        }
        if (zzeaqVar.size() == 0) {
            return zzeaqVar2;
        }
        int size = zzeaqVar.size() + zzeaqVar2.size();
        if (size < 128) {
            return zzb(zzeaqVar, zzeaqVar2);
        }
        if (zzeaqVar instanceof zzeed) {
            zzeed zzeedVar = (zzeed) zzeaqVar;
            if (zzeedVar.zzibd.size() + zzeaqVar2.size() < 128) {
                return new zzeed(zzeedVar.zzibc, zzb(zzeedVar.zzibd, zzeaqVar2));
            } else if (zzeedVar.zzibc.zzbcs() > zzeedVar.zzibd.zzbcs() && zzeedVar.zzbcs() > zzeaqVar2.zzbcs()) {
                return new zzeed(zzeedVar.zzibc, new zzeed(zzeedVar.zzibd, zzeaqVar2));
            }
        }
        if (size >= zzhg(Math.max(zzeaqVar.zzbcs(), zzeaqVar2.zzbcs()) + 1)) {
            return new zzeed(zzeaqVar, zzeaqVar2);
        }
        return zzeef.zza(new zzeef(null), zzeaqVar, zzeaqVar2);
    }

    private static zzeaq zzb(zzeaq zzeaqVar, zzeaq zzeaqVar2) {
        int size = zzeaqVar.size();
        int size2 = zzeaqVar2.size();
        byte[] bArr = new byte[size + size2];
        zzeaqVar.zza(bArr, 0, 0, size);
        zzeaqVar2.zza(bArr, 0, size, size2);
        return zzeaq.zzv(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzhg(int i) {
        int[] iArr = zziba;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final byte zzfo(int i) {
        zzaa(i, this.zzibb);
        return zzfp(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeaq
    public final byte zzfp(int i) {
        int i2 = this.zzibe;
        if (i < i2) {
            return this.zzibc.zzfp(i);
        }
        return this.zzibd.zzfp(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final int size() {
        return this.zzibb;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final zzeaz zzbcn() {
        return new zzeeg(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeaq
    public final int zzbcs() {
        return this.zzibf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeaq
    public final boolean zzbct() {
        return this.zzibb >= zzhg(this.zzibf);
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final zzeaq zzz(int i, int i2) {
        int zzi = zzi(i, i2, this.zzibb);
        if (zzi == 0) {
            return zzeaq.zzhtf;
        }
        if (zzi == this.zzibb) {
            return this;
        }
        int i3 = this.zzibe;
        if (i2 <= i3) {
            return this.zzibc.zzz(i, i2);
        }
        if (i >= i3) {
            return this.zzibd.zzz(i - i3, i2 - i3);
        }
        zzeaq zzeaqVar = this.zzibc;
        return new zzeed(zzeaqVar.zzz(i, zzeaqVar.size()), this.zzibd.zzz(0, i2 - this.zzibe));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeaq
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzibe;
        if (i4 <= i5) {
            this.zzibc.zzb(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.zzibd.zzb(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.zzibc.zzb(bArr, i, i2, i6);
            this.zzibd.zzb(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeaq
    public final void zza(zzear zzearVar) throws IOException {
        this.zzibc.zza(zzearVar);
        this.zzibd.zza(zzearVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    protected final String zza(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final boolean zzbcp() {
        int zzg = this.zzibc.zzg(0, 0, this.zzibe);
        zzeaq zzeaqVar = this.zzibd;
        return zzeaqVar.zzg(zzg, 0, zzeaqVar.size()) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeaq
    public final int zzg(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzibe;
        if (i4 <= i5) {
            return this.zzibc.zzg(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zzibd.zzg(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zzibd.zzg(this.zzibc.zzg(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final boolean equals(Object obj) {
        boolean zza;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzeaq)) {
            return false;
        }
        zzeaq zzeaqVar = (zzeaq) obj;
        if (this.zzibb != zzeaqVar.size()) {
            return false;
        }
        if (this.zzibb == 0) {
            return true;
        }
        int zzbcu = zzbcu();
        int zzbcu2 = zzeaqVar.zzbcu();
        if (zzbcu != 0 && zzbcu2 != 0 && zzbcu != zzbcu2) {
            return false;
        }
        zzeei zzeeiVar = new zzeei(this, null);
        zzebb next = zzeeiVar.next();
        zzeei zzeeiVar2 = new zzeei(zzeaqVar, null);
        zzebb next2 = zzeeiVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                zza = next.zza(next2, i2, min);
            } else {
                zza = next2.zza(next, i, min);
            }
            if (!zza) {
                return false;
            }
            i3 += min;
            int i4 = this.zzibb;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                next = zzeeiVar.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == size2) {
                next2 = zzeeiVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeaq
    public final int zzh(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzibe;
        if (i4 <= i5) {
            return this.zzibc.zzh(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zzibd.zzh(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zzibd.zzh(this.zzibc.zzh(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final zzebf zzbcq() {
        return new zzebg(new zzeeh(this));
    }

    @Override // com.google.android.gms.internal.ads.zzeaq, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeed(zzeaq zzeaqVar, zzeaq zzeaqVar2, zzeeg zzeegVar) {
        this(zzeaqVar, zzeaqVar2);
    }
}
