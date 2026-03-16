package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzff extends zzfz {
    private long startTime;

    public zzff(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, long j, int i, int i2) {
        super(zzeoVar, str, str2, c0010zza, i, 25);
        this.startTime = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzaaw.invoke(null, new Object[0])).longValue();
        synchronized (this.zzaam) {
            this.zzaam.zzak(longValue);
            if (this.startTime != 0) {
                this.zzaam.zzm(longValue - this.startTime);
                this.zzaam.zzp(this.startTime);
            }
        }
    }
}
