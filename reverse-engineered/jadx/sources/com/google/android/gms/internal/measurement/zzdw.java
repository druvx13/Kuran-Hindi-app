package com.google.android.gms.internal.measurement;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
/* loaded from: classes.dex */
final class zzdw implements Comparator<zzdu> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzdu zzduVar, zzdu zzduVar2) {
        int zzb;
        int zzb2;
        zzdu zzduVar3 = zzduVar;
        zzdu zzduVar4 = zzduVar2;
        zzed zzedVar = (zzed) zzduVar3.iterator();
        zzed zzedVar2 = (zzed) zzduVar4.iterator();
        while (zzedVar.hasNext() && zzedVar2.hasNext()) {
            zzb = zzdu.zzb(zzedVar.zza());
            zzb2 = zzdu.zzb(zzedVar2.zza());
            int compare = C$r8$backportedMethods$utility$Integer$2$compare.compare(zzb, zzb2);
            if (compare != 0) {
                return compare;
            }
        }
        return C$r8$backportedMethods$utility$Integer$2$compare.compare(zzduVar3.zza(), zzduVar4.zza());
    }
}
