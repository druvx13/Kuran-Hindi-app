package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzagf implements zzaga<zzbek> {
    private static final Map<String, Integer> zzdav = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzc zzdas;
    private final zzaor zzdat;
    private final zzapa zzdau;

    public zzagf(com.google.android.gms.ads.internal.zzc zzcVar, zzaor zzaorVar, zzapa zzapaVar) {
        this.zzdas = zzcVar;
        this.zzdat = zzaorVar;
        this.zzdau = zzapaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ void zza(zzbek zzbekVar, Map map) {
        com.google.android.gms.ads.internal.zzc zzcVar;
        zzbek zzbekVar2 = zzbekVar;
        int intValue = zzdav.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (zzcVar = this.zzdas) != null && !zzcVar.zzjx()) {
            this.zzdas.zzbm(null);
        } else if (intValue == 1) {
            this.zzdat.zzg(map);
        } else if (intValue == 3) {
            new zzaos(zzbekVar2, map).execute();
        } else if (intValue == 4) {
            new zzaom(zzbekVar2, map).execute();
        } else if (intValue == 5) {
            new zzaot(zzbekVar2, map).execute();
        } else if (intValue == 6) {
            this.zzdat.zzac(true);
        } else if (intValue == 7) {
            this.zzdau.zzue();
        } else {
            zzawr.zzfb("Unknown MRAID command called.");
        }
    }
}
