package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbju implements zzdqj<zzdha, zzdha> {
    private Map<String, zzbjx> zzfgg;

    public zzbju(Map<String, zzbjx> map) {
        this.zzfgg = map;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final /* synthetic */ zzdri<zzdha> zzf(zzdha zzdhaVar) throws Exception {
        zzdha zzdhaVar2 = zzdhaVar;
        for (zzdgx zzdgxVar : zzdhaVar2.zzgus.zzguq) {
            if (this.zzfgg.containsKey(zzdgxVar.name)) {
                this.zzfgg.get(zzdgxVar.name).zzl(zzdgxVar.zzgun);
            }
        }
        return zzdqw.zzag(zzdhaVar2);
    }
}
