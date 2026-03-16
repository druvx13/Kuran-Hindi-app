package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzmx {
    public final int length;
    private int zzahb;
    private final zzhf[] zzbda;

    public zzmx(zzhf... zzhfVarArr) {
        zzoh.checkState(zzhfVarArr.length > 0);
        this.zzbda = zzhfVarArr;
        this.length = zzhfVarArr.length;
    }

    public final zzhf zzax(int i) {
        return this.zzbda[i];
    }

    public final int zzh(zzhf zzhfVar) {
        int i = 0;
        while (true) {
            zzhf[] zzhfVarArr = this.zzbda;
            if (i >= zzhfVarArr.length) {
                return -1;
            }
            if (zzhfVar == zzhfVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.zzahb == 0) {
            this.zzahb = Arrays.hashCode(this.zzbda) + 527;
        }
        return this.zzahb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmx zzmxVar = (zzmx) obj;
            if (this.length == zzmxVar.length && Arrays.equals(this.zzbda, zzmxVar.zzbda)) {
                return true;
            }
        }
        return false;
    }
}
