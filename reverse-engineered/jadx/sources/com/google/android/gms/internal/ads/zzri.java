package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzri implements Comparator<zzqw> {
    public zzri(zzrf zzrfVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzqw zzqwVar, zzqw zzqwVar2) {
        zzqw zzqwVar3 = zzqwVar;
        zzqw zzqwVar4 = zzqwVar2;
        if (zzqwVar3.zzmo() < zzqwVar4.zzmo()) {
            return -1;
        }
        if (zzqwVar3.zzmo() > zzqwVar4.zzmo()) {
            return 1;
        }
        if (zzqwVar3.zzmn() < zzqwVar4.zzmn()) {
            return -1;
        }
        if (zzqwVar3.zzmn() > zzqwVar4.zzmn()) {
            return 1;
        }
        float zzmq = (zzqwVar3.zzmq() - zzqwVar3.zzmo()) * (zzqwVar3.zzmp() - zzqwVar3.zzmn());
        float zzmq2 = (zzqwVar4.zzmq() - zzqwVar4.zzmo()) * (zzqwVar4.zzmp() - zzqwVar4.zzmn());
        if (zzmq > zzmq2) {
            return -1;
        }
        return zzmq < zzmq2 ? 1 : 0;
    }
}
