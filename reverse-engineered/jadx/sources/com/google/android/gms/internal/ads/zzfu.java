package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfu extends zzfz {
    public zzfu(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2) {
        super(zzeoVar, str, str2, c0010zza, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zzaam) {
            zzel zzelVar = new zzel((String) this.zzaaw.invoke(null, new Object[0]));
            this.zzaam.zzac(zzelVar.zzye.longValue());
            this.zzaam.zzad(zzelVar.zzyf.longValue());
        }
    }
}
