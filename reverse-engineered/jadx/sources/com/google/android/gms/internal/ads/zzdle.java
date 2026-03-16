package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdle implements zzegz<zzakp> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzazz> zzfnd;
    private final zzdlb zzhap;

    public zzdle(zzdlb zzdlbVar, zzehm<Context> zzehmVar, zzehm<zzazz> zzehmVar2) {
        this.zzhap = zzdlbVar;
        this.zzenp = zzehmVar;
        this.zzfnd = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzakp) zzehf.zza(new zzakg().zzb(this.zzenp.get(), this.zzfnd.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
