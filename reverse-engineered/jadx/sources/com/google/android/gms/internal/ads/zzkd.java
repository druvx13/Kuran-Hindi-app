package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzkd {
    public int height;
    public int number;
    public int type;
    public int width;
    public zzja zzagl;
    public int zzagp;
    public byte[] zzagq;
    public int zzags;
    public int zzagt;
    private String zzagz;
    public String zzaqo;
    public int zzaqp;
    public boolean zzaqq;
    public byte[] zzaqr;
    public zzjw zzaqs;
    public byte[] zzaqt;
    public int zzaqu;
    public int zzaqv;
    public int zzaqw;
    public boolean zzaqx;
    public int zzaqy;
    public int zzaqz;
    public int zzara;
    public int zzarb;
    public int zzarc;
    public float zzard;
    public float zzare;
    public float zzarf;
    public float zzarg;
    public float zzarh;
    public float zzari;
    public float zzarj;
    public float zzark;
    public float zzarl;
    public float zzarm;
    public int zzarn;
    public long zzaro;
    public long zzarp;
    public boolean zzarq;
    public boolean zzarr;
    public zzjt zzars;
    public int zzart;

    private zzkd() {
        this.width = -1;
        this.height = -1;
        this.zzaqu = -1;
        this.zzaqv = -1;
        this.zzaqw = 0;
        this.zzagq = null;
        this.zzagp = -1;
        this.zzaqx = false;
        this.zzaqy = -1;
        this.zzaqz = -1;
        this.zzara = -1;
        this.zzarb = 1000;
        this.zzarc = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
        this.zzard = -1.0f;
        this.zzare = -1.0f;
        this.zzarf = -1.0f;
        this.zzarg = -1.0f;
        this.zzarh = -1.0f;
        this.zzari = -1.0f;
        this.zzarj = -1.0f;
        this.zzark = -1.0f;
        this.zzarl = -1.0f;
        this.zzarm = -1.0f;
        this.zzags = 1;
        this.zzarn = -1;
        this.zzagt = 8000;
        this.zzaro = 0L;
        this.zzarp = 0L;
        this.zzarr = true;
        this.zzagz = "eng";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:364:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x034f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzjo r43, int r44) throws com.google.android.gms.internal.ads.zzhi {
        /*
            Method dump skipped, instructions count: 1422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkd.zza(com.google.android.gms.internal.ads.zzjo, int):void");
    }

    private static List<byte[]> zza(zzos zzosVar) throws zzhi {
        try {
            zzosVar.zzbj(16);
            if (zzosVar.zzjc() != 826496599) {
                return null;
            }
            byte[] bArr = zzosVar.data;
            for (int position = zzosVar.getPosition() + 20; position < bArr.length - 4; position++) {
                if (bArr[position] == 0 && bArr[position + 1] == 0 && bArr[position + 2] == 1 && bArr[position + 3] == 15) {
                    return Collections.singletonList(Arrays.copyOfRange(bArr, position, bArr.length));
                }
            }
            throw new zzhi("Failed to find FourCC VC1 initialization data");
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhi("Error parsing FourCC VC1 codec private");
        }
    }

    private static List<byte[]> zzd(byte[] bArr) throws zzhi {
        try {
            if (bArr[0] != 2) {
                throw new zzhi("Error parsing vorbis codec private");
            }
            int i = 1;
            int i2 = 0;
            while (bArr[i] == -1) {
                i2 += 255;
                i++;
            }
            int i3 = i + 1;
            int i4 = i2 + bArr[i];
            int i5 = 0;
            while (bArr[i3] == -1) {
                i5 += 255;
                i3++;
            }
            int i6 = i3 + 1;
            int i7 = i5 + bArr[i3];
            if (bArr[i6] != 1) {
                throw new zzhi("Error parsing vorbis codec private");
            }
            byte[] bArr2 = new byte[i4];
            System.arraycopy(bArr, i6, bArr2, 0, i4);
            int i8 = i6 + i4;
            if (bArr[i8] != 3) {
                throw new zzhi("Error parsing vorbis codec private");
            }
            int i9 = i8 + i7;
            if (bArr[i9] != 5) {
                throw new zzhi("Error parsing vorbis codec private");
            }
            byte[] bArr3 = new byte[bArr.length - i9];
            System.arraycopy(bArr, i9, bArr3, 0, bArr.length - i9);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhi("Error parsing vorbis codec private");
        }
    }

    private static boolean zzb(zzos zzosVar) throws zzhi {
        UUID uuid;
        UUID uuid2;
        try {
            int zzja = zzosVar.zzja();
            if (zzja == 1) {
                return true;
            }
            if (zzja == 65534) {
                zzosVar.zzbi(24);
                long readLong = zzosVar.readLong();
                uuid = zzkc.zzaoq;
                if (readLong == uuid.getMostSignificantBits()) {
                    long readLong2 = zzosVar.readLong();
                    uuid2 = zzkc.zzaoq;
                    if (readLong2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new zzhi("Error parsing MS/ACM codec private");
        }
    }

    public /* synthetic */ zzkd(zzkb zzkbVar) {
        this();
    }

    public static /* synthetic */ String zza(zzkd zzkdVar, String str) {
        zzkdVar.zzagz = str;
        return str;
    }
}
