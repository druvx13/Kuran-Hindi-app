package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfd extends zzfz {
    public zzfd(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2) {
        super(zzeoVar, str, str2, c0010zza, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        this.zzaam.zzf(-1L);
        this.zzaam.zzg(-1L);
        int[] iArr = (int[]) this.zzaaw.invoke(null, this.zzvp.getContext());
        synchronized (this.zzaam) {
            this.zzaam.zzf(iArr[0]);
            this.zzaam.zzg(iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.zzaam.zzaf(iArr[2]);
            }
        }
    }
}
