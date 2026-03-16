package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfp extends zzfz {
    private List<Long> zzaaq;

    public zzfp(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2) {
        super(zzeoVar, str, str2, c0010zza, i, 31);
        this.zzaaq = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        this.zzaam.zzq(-1L);
        this.zzaam.zzr(-1L);
        if (this.zzaaq == null) {
            this.zzaaq = (List) this.zzaaw.invoke(null, this.zzvp.getContext());
        }
        List<Long> list = this.zzaaq;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zzaam) {
            this.zzaam.zzq(this.zzaaq.get(0).longValue());
            this.zzaam.zzr(this.zzaaq.get(1).longValue());
        }
    }
}
