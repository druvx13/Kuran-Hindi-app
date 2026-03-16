package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfv extends zzfz {
    public zzfv(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2) {
        super(zzeoVar, str, str2, c0010zza, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        this.zzaam.zza(zzcd.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.zzaaw.invoke(null, this.zzvp.getContext())).booleanValue();
        synchronized (this.zzaam) {
            if (booleanValue) {
                this.zzaam.zza(zzcd.ENUM_TRUE);
            } else {
                this.zzaam.zza(zzcd.ENUM_FALSE);
            }
        }
    }
}
