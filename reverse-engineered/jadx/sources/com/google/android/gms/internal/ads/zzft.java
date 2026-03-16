package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzft extends zzfz {
    private final zzev zzwf;
    private long zzzx;

    public zzft(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2, zzev zzevVar) {
        super(zzeoVar, str, str2, c0010zza, i, 53);
        this.zzwf = zzevVar;
        if (zzevVar != null) {
            this.zzzx = zzevVar.zzcv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        if (this.zzwf != null) {
            this.zzaam.zzae(((Long) this.zzaaw.invoke(null, Long.valueOf(this.zzzx))).longValue());
        }
    }
}
