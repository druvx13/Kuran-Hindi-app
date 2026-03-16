package com.google.android.gms.internal.ads;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcdz implements zzdqx<zzbek> {
    private final /* synthetic */ String zzfwk;
    private final /* synthetic */ Map zzfwl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdz(zzcdt zzcdtVar, String str, Map map) {
        this.zzfwk = str;
        this.zzfwl = map;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(zzbek zzbekVar) {
        zzbekVar.zza(this.zzfwk, this.zzfwl);
    }
}
