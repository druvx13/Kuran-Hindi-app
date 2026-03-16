package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzc implements zzegz<JSONObject> {
    private final zzbza zzfqw;

    public zzbzc(zzbza zzbzaVar) {
        this.zzfqw = zzbzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (JSONObject) zzehf.zza(this.zzfqw.zzako(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
