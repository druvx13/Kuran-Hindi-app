package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfw extends zzfz {
    private static final Object zzaal = new Object();
    private static volatile Long zzaat;

    public zzfw(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2) {
        super(zzeoVar, str, str2, c0010zza, i, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        if (zzaat == null) {
            synchronized (zzaal) {
                if (zzaat == null) {
                    zzaat = (Long) this.zzaaw.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzaam) {
            this.zzaam.zzs(zzaat.longValue());
        }
    }
}
