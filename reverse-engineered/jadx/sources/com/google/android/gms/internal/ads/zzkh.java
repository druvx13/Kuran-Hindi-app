package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzkh extends zzki {
    public final long zzarx;
    public final List<zzkk> zzary;
    public final List<zzkh> zzarz;

    public zzkh(int i, long j) {
        super(i);
        this.zzarx = j;
        this.zzary = new ArrayList();
        this.zzarz = new ArrayList();
    }

    public final zzkk zzan(int i) {
        int size = this.zzary.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzkk zzkkVar = this.zzary.get(i2);
            if (zzkkVar.type == i) {
                return zzkkVar;
            }
        }
        return null;
    }

    public final zzkh zzao(int i) {
        int size = this.zzarz.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzkh zzkhVar = this.zzarz.get(i2);
            if (zzkhVar.type == i) {
                return zzkhVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final String toString() {
        String zzar = zzar(this.type);
        String arrays = Arrays.toString(this.zzary.toArray());
        String arrays2 = Arrays.toString(this.zzarz.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(zzar).length() + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(zzar);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
