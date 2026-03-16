package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbv;
import java.lang.reflect.InvocationTargetException;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzfn extends zzfz {
    public zzfn(zzeo zzeoVar, String str, String str2, zzbv.zza.C0010zza c0010zza, int i, int i2) {
        super(zzeoVar, str, str2, c0010zza, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzfz
    protected final void zzcx() throws IllegalAccessException, InvocationTargetException {
        zzdx zzdxVar = new zzdx((String) this.zzaaw.invoke(null, this.zzvp.getContext(), Boolean.valueOf(((Boolean) zzvj.zzpv().zzd(zzzz.zzcnv)).booleanValue())));
        synchronized (this.zzaam) {
            this.zzaam.zze(zzdxVar.zzxs);
            this.zzaam.zzag(zzdxVar.zzxt);
        }
    }
}
