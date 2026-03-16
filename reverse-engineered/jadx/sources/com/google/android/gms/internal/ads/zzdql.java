package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdql<V> extends zzdqi<V, List<V>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdql(zzdot<? extends zzdri<? extends V>> zzdotVar, boolean z) {
        super(zzdotVar, true);
        zzawi();
    }

    @Override // com.google.android.gms.internal.ads.zzdqi
    public final /* synthetic */ Object zzi(List list) {
        ArrayList zzej = zzdpc.zzej(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdod zzdodVar = (zzdod) it.next();
            zzej.add(zzdodVar != null ? zzdodVar.zzavo() : null);
        }
        return Collections.unmodifiableList(zzej);
    }
}
