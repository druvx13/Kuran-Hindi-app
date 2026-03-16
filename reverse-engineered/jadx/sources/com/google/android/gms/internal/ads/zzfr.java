package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfr extends zzfz {
    private final StackTraceElement[] zzaar;

    public zzfr(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzeoVar, str, str2, c0010zza, i, 45);
        this.zzaar = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        zzcd zzcdVar;
        if (this.zzaar != null) {
            zzek zzekVar = new zzek((String) this.zzaaw.invoke(null, this.zzaar));
            synchronized (this.zzaam) {
                this.zzaam.zzab(zzekVar.zzyb.longValue());
                if (zzekVar.zzyc.booleanValue()) {
                    zzbv.zza.C0010zza c0010zza = this.zzaam;
                    if (zzekVar.zzyd.booleanValue()) {
                        zzcdVar = zzcd.ENUM_FALSE;
                    } else {
                        zzcdVar = zzcd.ENUM_TRUE;
                    }
                    c0010zza.zzc(zzcdVar);
                } else {
                    this.zzaam.zzc(zzcd.ENUM_FAILURE);
                }
            }
        }
    }
}
