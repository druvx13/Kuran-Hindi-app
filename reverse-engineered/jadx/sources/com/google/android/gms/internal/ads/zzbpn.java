package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbpn implements zzegz<com.google.android.gms.ads.internal.zzc> {
    private final zzehm<Context> zzenp;
    private final zzbpk zzfmc;
    private final zzehm<zzaun> zzfmd;

    private zzbpn(zzbpk zzbpkVar, zzehm<Context> zzehmVar, zzehm<zzaun> zzehmVar2) {
        this.zzfmc = zzbpkVar;
        this.zzenp = zzehmVar;
        this.zzfmd = zzehmVar2;
    }

    public static zzbpn zza(zzbpk zzbpkVar, zzehm<Context> zzehmVar, zzehm<zzaun> zzehmVar2) {
        return new zzbpn(zzbpkVar, zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (com.google.android.gms.ads.internal.zzc) zzehf.zza(new com.google.android.gms.ads.internal.zzc(this.zzenp.get(), this.zzfmd.get(), null), "Cannot return null from a non-@Nullable @Provides method");
    }
}
