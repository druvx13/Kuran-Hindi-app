package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
public class zzeba extends zzebb {
    protected final byte[] zzhtm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeba(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.zzhtm = bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int zzbcv() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public byte zzfo(int i) {
        return this.zzhtm[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeaq
    public byte zzfp(int i) {
        return this.zzhtm[i];
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public int size() {
        return this.zzhtm.length;
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final zzeaq zzz(int i, int i2) {
        int zzi = zzi(i, i2, size());
        if (zzi == 0) {
            return zzeaq.zzhtf;
        }
        return new zzeax(this.zzhtm, zzbcv() + i, zzi);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeaq
    public void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzhtm, i, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeaq
    public final void zza(zzear zzearVar) throws IOException {
        zzearVar.zzi(this.zzhtm, zzbcv(), size());
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    protected final String zza(Charset charset) {
        return new String(this.zzhtm, zzbcv(), size(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final boolean zzbcp() {
        int zzbcv = zzbcv();
        return zzefk.zzm(this.zzhtm, zzbcv, size() + zzbcv);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeaq
    public final int zzg(int i, int i2, int i3) {
        int zzbcv = zzbcv() + i2;
        return zzefk.zzb(i, this.zzhtm, zzbcv, i3 + zzbcv);
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzeaq) && size() == ((zzeaq) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (obj instanceof zzeba) {
                zzeba zzebaVar = (zzeba) obj;
                int zzbcu = zzbcu();
                int zzbcu2 = zzebaVar.zzbcu();
                if (zzbcu == 0 || zzbcu2 == 0 || zzbcu == zzbcu2) {
                    return zza(zzebaVar, 0, size());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzebb
    final boolean zza(zzeaq zzeaqVar, int i, int i2) {
        if (i2 > zzeaqVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 > zzeaqVar.size()) {
            int size2 = zzeaqVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzeaqVar instanceof zzeba) {
            zzeba zzebaVar = (zzeba) zzeaqVar;
            byte[] bArr = this.zzhtm;
            byte[] bArr2 = zzebaVar.zzhtm;
            int zzbcv = zzbcv() + i2;
            int zzbcv2 = zzbcv();
            int zzbcv3 = zzebaVar.zzbcv() + i;
            while (zzbcv2 < zzbcv) {
                if (bArr[zzbcv2] != bArr2[zzbcv3]) {
                    return false;
                }
                zzbcv2++;
                zzbcv3++;
            }
            return true;
        } else {
            return zzeaqVar.zzz(i, i3).equals(zzz(0, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeaq
    public final int zzh(int i, int i2, int i3) {
        return zzecg.zza(i, this.zzhtm, zzbcv() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzeaq
    public final zzebf zzbcq() {
        return zzebf.zzb(this.zzhtm, zzbcv(), size(), true);
    }
}
