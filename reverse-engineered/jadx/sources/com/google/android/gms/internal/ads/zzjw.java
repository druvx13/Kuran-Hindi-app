package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzjw {
    public final int zzaok = 1;
    public final byte[] zzaol;

    public zzjw(int i, byte[] bArr) {
        this.zzaol = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzjw zzjwVar = (zzjw) obj;
            if (this.zzaok == zzjwVar.zzaok && Arrays.equals(this.zzaol, zzjwVar.zzaol)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zzaok * 31) + Arrays.hashCode(this.zzaol);
    }
}
