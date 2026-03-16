package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzafy implements zzaga<zzbek> {
    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ void zza(zzbek zzbekVar, Map map) {
        zzbek zzbekVar2 = zzbekVar;
        if (map.keySet().contains("start")) {
            zzbekVar2.zzbc(true);
        }
        if (map.keySet().contains("stop")) {
            zzbekVar2.zzbc(false);
        }
    }
}
