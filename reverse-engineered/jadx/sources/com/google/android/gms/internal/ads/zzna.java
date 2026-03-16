package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzna {
    public static final zzna zzbee = new zzna(new zzmx[0]);
    public final int length;
    private int zzahb;
    private final zzmx[] zzbef;

    public zzna(zzmx... zzmxVarArr) {
        this.zzbef = zzmxVarArr;
        this.length = zzmxVarArr.length;
    }

    public final zzmx zzay(int i) {
        return this.zzbef[i];
    }

    public final int zza(zzmx zzmxVar) {
        for (int i = 0; i < this.length; i++) {
            if (this.zzbef[i] == zzmxVar) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.zzahb == 0) {
            this.zzahb = Arrays.hashCode(this.zzbef);
        }
        return this.zzahb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzna zznaVar = (zzna) obj;
            if (this.length == zznaVar.length && Arrays.equals(this.zzbef, zznaVar.zzbef)) {
                return true;
            }
        }
        return false;
    }
}
