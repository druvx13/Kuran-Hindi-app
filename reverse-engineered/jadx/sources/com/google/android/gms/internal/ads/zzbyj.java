package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbyj implements zzbnx<zzbny> {
    private final zzcae zzfjb;
    private final Map<String, zzcnj<zzbny>> zzfku;
    private final zzehm<zzbnx<zzblx>> zzfpo;
    private final Map<String, zzcnj<zzbzm>> zzfpp;
    private final Map<String, zzcpk<zzbzm>> zzfpq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyj(Map<String, zzcnj<zzbny>> map, Map<String, zzcnj<zzbzm>> map2, Map<String, zzcpk<zzbzm>> map3, zzehm<zzbnx<zzblx>> zzehmVar, zzcae zzcaeVar) {
        this.zzfku = map;
        this.zzfpp = map2;
        this.zzfpq = map3;
        this.zzfpo = zzehmVar;
        this.zzfjb = zzcaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnx
    public final zzcnj<zzbny> zze(int i, String str) {
        zzcnj<zzblx> zze;
        zzcnj<zzbny> zzcnjVar = this.zzfku.get(str);
        if (zzcnjVar != null) {
            return zzcnjVar;
        }
        if (i == 1) {
            if (this.zzfjb.zzalo() == null || (zze = this.zzfpo.get().zze(i, str)) == null) {
                return null;
            }
            return zzbny.zza(zze);
        } else if (i != 4) {
            return null;
        } else {
            zzcpk<zzbzm> zzcpkVar = this.zzfpq.get(str);
            if (zzcpkVar != null) {
                return zzbny.zza((zzcpk<? extends zzbns>) zzcpkVar);
            }
            zzcnj<zzbzm> zzcnjVar2 = this.zzfpp.get(str);
            if (zzcnjVar2 != null) {
                return zzbny.zza(zzcnjVar2);
            }
            return null;
        }
    }
}
