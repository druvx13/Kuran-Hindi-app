package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzccn implements zzdnx {
    static final zzdnx zzdsc = new zzccn();

    private zzccn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdnx
    public final Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzccp zzccpVar : (List) obj) {
            if (zzccpVar != null) {
                arrayList.add(zzccpVar);
            }
        }
        return arrayList;
    }
}
