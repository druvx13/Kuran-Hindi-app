package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzagj implements zzagi {
    private final /* synthetic */ zzbaj zzdax;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagj(zzagg zzaggVar, zzbaj zzbajVar) {
        this.zzdax = zzbajVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void zzc(JSONObject jSONObject) {
        this.zzdax.set(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzagi
    public final void onFailure(String str) {
        this.zzdax.setException(new zzake(str));
    }
}
