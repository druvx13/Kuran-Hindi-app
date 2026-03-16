package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzqx implements Comparator<zzrd> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqx(zzqy zzqyVar) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzrd zzrdVar, zzrd zzrdVar2) {
        zzrd zzrdVar3 = zzrdVar;
        zzrd zzrdVar4 = zzrdVar2;
        int i = zzrdVar3.zzbrj - zzrdVar4.zzbrj;
        return i != 0 ? i : (int) (zzrdVar3.value - zzrdVar4.value);
    }
}
