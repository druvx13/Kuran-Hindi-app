package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzecz extends zzecy {
    private zzecz() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzecy
    public final <L> List<L> zza(Object obj, long j) {
        zzecl zzc = zzc(obj, j);
        if (zzc.zzbci()) {
            return zzc;
        }
        int size = zzc.size();
        zzecl zzfn = zzc.zzfn(size == 0 ? 10 : size << 1);
        zzefi.zza(obj, j, zzfn);
        return zzfn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzecy
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzbcj();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.zzecl] */
    @Override // com.google.android.gms.internal.ads.zzecy
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzecl<E> zzc = zzc(obj, j);
        zzecl<E> zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzecl<E> zzeclVar = zzc;
        zzeclVar = zzc;
        if (size > 0 && size2 > 0) {
            boolean zzbci = zzc.zzbci();
            zzecl<E> zzeclVar2 = zzc;
            if (!zzbci) {
                zzeclVar2 = zzc.zzfn(size2 + size);
            }
            zzeclVar2.addAll(zzc2);
            zzeclVar = zzeclVar2;
        }
        if (size > 0) {
            zzc2 = zzeclVar;
        }
        zzefi.zza(obj, j, zzc2);
    }

    private static <E> zzecl<E> zzc(Object obj, long j) {
        return (zzecl) zzefi.zzp(obj, j);
    }
}
