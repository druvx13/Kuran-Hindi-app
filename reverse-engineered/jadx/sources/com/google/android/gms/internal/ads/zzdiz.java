package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdiz {
    private HashMap<zzdiu, zzdjc<? extends zzbns>> zzgxx = new HashMap<>();

    public final <AdT extends zzbns> zzdjc<AdT> zza(zzdiu zzdiuVar, Context context, zzdih zzdihVar, zzdjk<AdT> zzdjkVar) {
        zzdjc<AdT> zzdjcVar = (zzdjc<AdT>) this.zzgxx.get(zzdiuVar);
        if (zzdjcVar == null) {
            zzdin zzdinVar = new zzdin(zzdir.zza(zzdiuVar, context));
            zzdjc<AdT> zzdjcVar2 = new zzdjc<>(zzdinVar, new zzdjd(zzdinVar, zzdihVar, zzdjkVar));
            this.zzgxx.put(zzdiuVar, zzdjcVar2);
            return zzdjcVar2;
        }
        return zzdjcVar;
    }
}
