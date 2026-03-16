package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzchj implements zzdla {
    private zzst zzfyd;
    private Map<zzdkr, zzchl> zzfyn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchj(zzst zzstVar, Map<zzdkr, zzchl> map) {
        this.zzfyn = map;
        this.zzfyd = zzstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zza(zzdkr zzdkrVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zzb(zzdkr zzdkrVar, String str) {
        if (this.zzfyn.containsKey(zzdkrVar)) {
            this.zzfyd.zza(this.zzfyn.get(zzdkrVar).zzfyp);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zza(zzdkr zzdkrVar, String str, Throwable th) {
        if (this.zzfyn.containsKey(zzdkrVar)) {
            this.zzfyd.zza(this.zzfyn.get(zzdkrVar).zzfyr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdla
    public final void zzc(zzdkr zzdkrVar, String str) {
        if (this.zzfyn.containsKey(zzdkrVar)) {
            this.zzfyd.zza(this.zzfyn.get(zzdkrVar).zzfyq);
        }
    }
}
