package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzedk implements zzedh {
    @Override // com.google.android.gms.internal.ads.zzedh
    public final Map<?, ?> zzan(Object obj) {
        return (zzedi) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzedh
    public final zzedf<?, ?> zzas(Object obj) {
        zzedg zzedgVar = (zzedg) obj;
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.zzedh
    public final Map<?, ?> zzao(Object obj) {
        return (zzedi) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzedh
    public final boolean zzap(Object obj) {
        return !((zzedi) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.ads.zzedh
    public final Object zzaq(Object obj) {
        ((zzedi) obj).zzbcj();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzedh
    public final Object zzar(Object obj) {
        return zzedi.zzbfy().zzbfz();
    }

    @Override // com.google.android.gms.internal.ads.zzedh
    public final Object zze(Object obj, Object obj2) {
        zzedi zzediVar = (zzedi) obj;
        zzedi zzediVar2 = (zzedi) obj2;
        if (!zzediVar2.isEmpty()) {
            if (!zzediVar.isMutable()) {
                zzediVar = zzediVar.zzbfz();
            }
            zzediVar.zza(zzediVar2);
        }
        return zzediVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedh
    public final int zzb(int i, Object obj, Object obj2) {
        zzedi zzediVar = (zzedi) obj;
        zzedg zzedgVar = (zzedg) obj2;
        if (zzediVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzediVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw new NoSuchMethodError();
        }
        return 0;
    }
}
