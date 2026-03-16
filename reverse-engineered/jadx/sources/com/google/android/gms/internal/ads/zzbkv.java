package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbkv implements zzegz<zzpu> {
    private final zzehm<JSONObject> zzeza;
    private final zzehm<zzdgo> zzfia;
    private final zzehm<zzazz> zzfib;
    private final zzehm<String> zzfic;

    private zzbkv(zzehm<zzdgo> zzehmVar, zzehm<zzazz> zzehmVar2, zzehm<JSONObject> zzehmVar3, zzehm<String> zzehmVar4) {
        this.zzfia = zzehmVar;
        this.zzfib = zzehmVar2;
        this.zzeza = zzehmVar3;
        this.zzfic = zzehmVar4;
    }

    public static zzbkv zza(zzehm<zzdgo> zzehmVar, zzehm<zzazz> zzehmVar2, zzehm<JSONObject> zzehmVar3, zzehm<String> zzehmVar4) {
        return new zzbkv(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        this.zzfia.get();
        zzazz zzazzVar = this.zzfib.get();
        JSONObject jSONObject = this.zzeza.get();
        String str = this.zzfic.get();
        boolean equals = "native".equals(str);
        com.google.android.gms.ads.internal.zzq.zzkw();
        return (zzpu) zzehf.zza(new zzpu(zzaxa.zzxg(), zzazzVar, str, jSONObject, false, equals), "Cannot return null from a non-@Nullable @Provides method");
    }
}
