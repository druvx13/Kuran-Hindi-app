package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfg extends zzfz {
    private static volatile Long zzaak;
    private static final Object zzaal = new Object();

    public zzfg(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2) {
        super(zzeoVar, str, str2, c0010zza, i, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        if (zzaak == null) {
            synchronized (zzaal) {
                if (zzaak == null) {
                    zzaak = (Long) this.zzaaw.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzaam) {
            this.zzaam.zzaa(zzaak.longValue());
        }
    }
}
