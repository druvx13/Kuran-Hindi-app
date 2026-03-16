package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzpd {
    public final List<byte[]> zzagk;
    public final int zzart;

    public static zzpd zzh(zzos zzosVar) throws zzhi {
        try {
            zzosVar.zzbj(21);
            int readUnsignedByte = zzosVar.readUnsignedByte() & 3;
            int readUnsignedByte2 = zzosVar.readUnsignedByte();
            int position = zzosVar.getPosition();
            int i = 0;
            for (int i2 = 0; i2 < readUnsignedByte2; i2++) {
                zzosVar.zzbj(1);
                int readUnsignedShort = zzosVar.readUnsignedShort();
                for (int i3 = 0; i3 < readUnsignedShort; i3++) {
                    int readUnsignedShort2 = zzosVar.readUnsignedShort();
                    i += readUnsignedShort2 + 4;
                    zzosVar.zzbj(readUnsignedShort2);
                }
            }
            zzosVar.zzbi(position);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < readUnsignedByte2; i5++) {
                zzosVar.zzbj(1);
                int readUnsignedShort3 = zzosVar.readUnsignedShort();
                for (int i6 = 0; i6 < readUnsignedShort3; i6++) {
                    int readUnsignedShort4 = zzosVar.readUnsignedShort();
                    System.arraycopy(zzon.zzbhb, 0, bArr, i4, zzon.zzbhb.length);
                    int length = i4 + zzon.zzbhb.length;
                    System.arraycopy(zzosVar.data, zzosVar.getPosition(), bArr, length, readUnsignedShort4);
                    i4 = length + readUnsignedShort4;
                    zzosVar.zzbj(readUnsignedShort4);
                }
            }
            return new zzpd(i == 0 ? null : Collections.singletonList(bArr), readUnsignedByte + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzhi("Error parsing HEVC config", e);
        }
    }

    private zzpd(List<byte[]> list, int i) {
        this.zzagk = list;
        this.zzart = i;
    }
}
