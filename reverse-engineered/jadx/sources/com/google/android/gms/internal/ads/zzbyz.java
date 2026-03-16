package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbyz implements zzaga<Object> {
    private WeakReference<zzbyx> zzfqq;

    private zzbyz(zzbyx zzbyxVar) {
        this.zzfqq = new WeakReference<>(zzbyxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(Object obj, Map<String, String> map) {
        zzbyx zzbyxVar = this.zzfqq.get();
        if (zzbyxVar != null && "_ac".equals(map.get("eventName"))) {
            zzbyx.zzb(zzbyxVar).onAdClicked();
        }
    }
}
