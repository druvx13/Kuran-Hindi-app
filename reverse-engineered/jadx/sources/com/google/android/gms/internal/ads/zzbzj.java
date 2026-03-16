package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzj implements zzegz<zzpu> {
    private final zzehm<zzazz> zzfib;
    private final zzehm<String> zzfic;

    public zzbzj(zzehm<zzazz> zzehmVar, zzehm<String> zzehmVar2) {
        this.zzfib = zzehmVar;
        this.zzfic = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        com.google.android.gms.ads.internal.zzq.zzkw();
        return (zzpu) zzehf.zza(new zzpu(zzaxa.zzxg(), this.zzfib.get(), this.zzfic.get(), new JSONObject(), false, true), "Cannot return null from a non-@Nullable @Provides method");
    }
}
