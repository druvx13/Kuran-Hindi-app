package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbld implements zzegz<JSONObject> {
    private final zzehm<zzdgo> zzfia;

    private zzbld(zzehm<zzdgo> zzehmVar) {
        this.zzfia = zzehmVar;
    }

    public static zzbld zzc(zzehm<zzdgo> zzehmVar) {
        return new zzbld(zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzbla.zza(this.zzfia.get());
    }
}
