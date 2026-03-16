package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzafw implements zzaga<zzbek> {
    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ void zza(zzbek zzbekVar, Map map) {
        zzbek zzbekVar2 = zzbekVar;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzbekVar2.zzkc();
        } else if ("resume".equals(str)) {
            zzbekVar2.zzkd();
        }
    }
}
