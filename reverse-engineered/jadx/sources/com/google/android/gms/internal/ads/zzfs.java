package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfs extends zzfz {
    private final boolean zzaas;

    public zzfs(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2) {
        super(zzeoVar, str, str2, c0010zza, i, 61);
        this.zzaas = zzeoVar.zzcg();
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzaaw.invoke(null, this.zzvp.getContext(), Boolean.valueOf(this.zzaas))).longValue();
        synchronized (this.zzaam) {
            this.zzaam.zzah(longValue);
        }
    }
}
