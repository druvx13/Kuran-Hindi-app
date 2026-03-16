package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public class zznc implements zznj {
    private final int length;
    private int zzahb;
    private final zzhf[] zzbda;
    private final zzmx zzbeg;
    private final int[] zzbeh;
    private final long[] zzbei;

    public zznc(zzmx zzmxVar, int... iArr) {
        int i = 0;
        zzoh.checkState(iArr.length > 0);
        this.zzbeg = (zzmx) zzoh.checkNotNull(zzmxVar);
        int length = iArr.length;
        this.length = length;
        this.zzbda = new zzhf[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzbda[i2] = zzmxVar.zzax(iArr[i2]);
        }
        Arrays.sort(this.zzbda, new zzne());
        this.zzbeh = new int[this.length];
        while (true) {
            int i3 = this.length;
            if (i < i3) {
                this.zzbeh[i] = zzmxVar.zzh(this.zzbda[i]);
                i++;
            } else {
                this.zzbei = new long[i3];
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final zzmx zzik() {
        return this.zzbeg;
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final int length() {
        return this.zzbeh.length;
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final zzhf zzax(int i) {
        return this.zzbda[i];
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final int zzaz(int i) {
        return this.zzbeh[0];
    }

    public int hashCode() {
        if (this.zzahb == 0) {
            this.zzahb = (System.identityHashCode(this.zzbeg) * 31) + Arrays.hashCode(this.zzbeh);
        }
        return this.zzahb;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zznc zzncVar = (zznc) obj;
            if (this.zzbeg == zzncVar.zzbeg && Arrays.equals(this.zzbeh, zzncVar.zzbeh)) {
                return true;
            }
        }
        return false;
    }
}
