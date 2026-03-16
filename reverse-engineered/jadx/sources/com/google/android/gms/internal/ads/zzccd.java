package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzccd implements zzdnx {
    static final zzdnx zzdsc = new zzccd();

    private zzccd() {
    }

    @Override // com.google.android.gms.internal.ads.zzdnx
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzace zzaceVar : (List) obj) {
            if (zzaceVar != null) {
                arrayList.add(zzaceVar);
            }
        }
        return arrayList;
    }
}
