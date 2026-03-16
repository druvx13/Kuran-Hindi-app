package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbzg implements zzegz<zzbvs> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzdgo> zzfkc;

    public zzbzg(zzehm<Context> zzehmVar, zzehm<zzdgo> zzehmVar2) {
        this.zzenp = zzehmVar;
        this.zzfkc = zzehmVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (zzbvs) zzehf.zza(new zzbvs(this.zzenp.get(), new HashSet(), this.zzfkc.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
