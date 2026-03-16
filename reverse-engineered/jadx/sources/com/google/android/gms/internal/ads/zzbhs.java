package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbhs implements zzegz<zzarx> {
    private final zzehm<Context> zzenp;

    public zzbhs(zzehm<Context> zzehmVar) {
        this.zzenp = zzehmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        Context context = this.zzenp.get();
        return (zzarx) zzehf.zza(new zzarv(context, new zzasc(context).zzuu()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
