package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzeda extends zzecy {
    private static final Class<?> zzhzq = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzeda() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzecy
    public final <L> List<L> zza(Object obj, long j) {
        return zza(obj, j, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzecy
    public final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzefi.zzp(obj, j);
        if (list instanceof zzecv) {
            unmodifiableList = ((zzecv) list).zzbft();
        } else if (zzhzq.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzeea) && (list instanceof zzecl)) {
                zzecl zzeclVar = (zzecl) list;
                if (zzeclVar.zzbci()) {
                    zzeclVar.zzbcj();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzefi.zza(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <L> List<L> zza(Object obj, long j, int i) {
        zzecw zzecwVar;
        List<L> arrayList;
        List<L> zzd = zzd(obj, j);
        if (zzd.isEmpty()) {
            if (zzd instanceof zzecv) {
                arrayList = new zzecw(i);
            } else if ((zzd instanceof zzeea) && (zzd instanceof zzecl)) {
                arrayList = ((zzecl) zzd).zzfn(i);
            } else {
                arrayList = new ArrayList<>(i);
            }
            zzefi.zza(obj, j, arrayList);
            return arrayList;
        }
        if (zzhzq.isAssignableFrom(zzd.getClass())) {
            ArrayList arrayList2 = new ArrayList(zzd.size() + i);
            arrayList2.addAll(zzd);
            zzefi.zza(obj, j, arrayList2);
            zzecwVar = arrayList2;
        } else if (zzd instanceof zzefd) {
            zzecw zzecwVar2 = new zzecw(zzd.size() + i);
            zzecwVar2.addAll((zzefd) zzd);
            zzefi.zza(obj, j, zzecwVar2);
            zzecwVar = zzecwVar2;
        } else if ((zzd instanceof zzeea) && (zzd instanceof zzecl)) {
            zzecl zzeclVar = (zzecl) zzd;
            if (zzeclVar.zzbci()) {
                return zzd;
            }
            zzecl zzfn = zzeclVar.zzfn(zzd.size() + i);
            zzefi.zza(obj, j, zzfn);
            return zzfn;
        } else {
            return zzd;
        }
        return zzecwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzecy
    public final <E> void zza(Object obj, Object obj2, long j) {
        List zzd = zzd(obj2, j);
        List zza = zza(obj, j, zzd.size());
        int size = zza.size();
        int size2 = zzd.size();
        if (size > 0 && size2 > 0) {
            zza.addAll(zzd);
        }
        if (size > 0) {
            zzd = zza;
        }
        zzefi.zza(obj, j, zzd);
    }

    private static <E> List<E> zzd(Object obj, long j) {
        return (List) zzefi.zzp(obj, j);
    }
}
