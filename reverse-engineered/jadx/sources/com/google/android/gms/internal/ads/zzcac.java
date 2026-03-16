package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcac implements zzegz<zzcaa> {
    private final zzehm<JSONObject> zzeyy;
    private final zzehm<zzdgo> zzfia;

    public zzcac(zzehm<zzdgo> zzehmVar, zzehm<JSONObject> zzehmVar2) {
        this.zzfia = zzehmVar;
        this.zzeyy = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcaa(this.zzfia.get(), this.zzeyy.get());
    }
}
