package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzlv implements zzmw {
    private final zzmw[] zzbat;

    public zzlv(zzmw[] zzmwVarArr) {
        this.zzbat = zzmwVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    public final long zzhm() {
        long j = Long.MAX_VALUE;
        for (zzmw zzmwVar : this.zzbat) {
            long zzhm = zzmwVar.zzhm();
            if (zzhm != Long.MIN_VALUE) {
                j = Math.min(j, zzhm);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    public final boolean zzee(long j) {
        zzmw[] zzmwVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zzhm = zzhm();
            if (zzhm == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzmw zzmwVar : this.zzbat) {
                if (zzmwVar.zzhm() == zzhm) {
                    z |= zzmwVar.zzee(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
