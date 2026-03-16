package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbeq implements zzdqx<Map<String, String>> {
    private final /* synthetic */ zzbej zzeik;
    private final /* synthetic */ List zzein;
    private final /* synthetic */ String zzeio;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbeq(zzbej zzbejVar, List list, String str) {
        this.zzeik = zzbejVar;
        this.zzein = list;
        this.zzeio = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqx
    public final /* synthetic */ void onSuccess(Map<String, String> map) {
        this.zzeik.zza(map, this.zzein, this.zzeio);
    }
}
