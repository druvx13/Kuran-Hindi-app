package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzox {
    private final int height;
    private final int width;
    public final List<byte[]> zzagk;
    public final int zzart;
    public final float zzbhm;

    public static zzox zzf(zzos zzosVar) throws zzhi {
        int i;
        int i2;
        float f;
        try {
            zzosVar.zzbj(4);
            int readUnsignedByte = (zzosVar.readUnsignedByte() & 3) + 1;
            if (readUnsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int readUnsignedByte2 = zzosVar.readUnsignedByte() & 31;
            for (int i3 = 0; i3 < readUnsignedByte2; i3++) {
                arrayList.add(zzg(zzosVar));
            }
            int readUnsignedByte3 = zzosVar.readUnsignedByte();
            for (int i4 = 0; i4 < readUnsignedByte3; i4++) {
                arrayList.add(zzg(zzosVar));
            }
            if (readUnsignedByte2 > 0) {
                zzoq zzd = zzon.zzd((byte[]) arrayList.get(0), readUnsignedByte, ((byte[]) arrayList.get(0)).length);
                int i5 = zzd.width;
                int i6 = zzd.height;
                f = zzd.zzbhm;
                i = i5;
                i2 = i6;
            } else {
                i = -1;
                i2 = -1;
                f = 1.0f;
            }
            return new zzox(arrayList, readUnsignedByte, i, i2, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzhi("Error parsing AVC config", e);
        }
    }

    private zzox(List<byte[]> list, int i, int i2, int i3, float f) {
        this.zzagk = list;
        this.zzart = i;
        this.width = i2;
        this.height = i3;
        this.zzbhm = f;
    }

    private static byte[] zzg(zzos zzosVar) {
        int readUnsignedShort = zzosVar.readUnsignedShort();
        int position = zzosVar.getPosition();
        zzosVar.zzbj(readUnsignedShort);
        return zzok.zzc(zzosVar.data, position, readUnsignedShort);
    }
}
