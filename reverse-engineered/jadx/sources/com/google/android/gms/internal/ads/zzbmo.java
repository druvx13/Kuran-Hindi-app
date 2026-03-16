package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbmo implements zzegz<zzbvt<zzpz>> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzbnr> zzfip;
    private final zzbma zzfjo;

    public zzbmo(zzbma zzbmaVar, zzehm<zzbnr> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzfjo = zzbmaVar;
        this.zzfip = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvt) zzehf.zza(new zzbvt(this.zzfip.get(), this.zzenm.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
