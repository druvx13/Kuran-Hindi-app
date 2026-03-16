package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.1.0 */
/* loaded from: classes.dex */
final class zzeas implements Comparator<zzeaq> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzeaq zzeaqVar, zzeaq zzeaqVar2) {
        int zzb;
        int zzb2;
        zzeaq zzeaqVar3 = zzeaqVar;
        zzeaq zzeaqVar4 = zzeaqVar2;
        zzeaz zzeazVar = (zzeaz) zzeaqVar3.iterator();
        zzeaz zzeazVar2 = (zzeaz) zzeaqVar4.iterator();
        while (zzeazVar.hasNext() && zzeazVar2.hasNext()) {
            zzb = zzeaq.zzb(zzeazVar.nextByte());
            zzb2 = zzeaq.zzb(zzeazVar2.nextByte());
            int compare = C$r8$backportedMethods$utility$Integer$2$compare.compare(zzb, zzb2);
            if (compare != 0) {
                return compare;
            }
        }
        return C$r8$backportedMethods$utility$Integer$2$compare.compare(zzeaqVar3.size(), zzeaqVar4.size());
    }
}
