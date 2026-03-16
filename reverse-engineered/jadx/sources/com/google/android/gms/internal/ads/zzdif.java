package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdif implements zzegz<Context> {
    private final zzdie zzgvr;
    private final zzehm<zzdic> zzgvs;

    private zzdif(zzdie zzdieVar, zzehm<zzdic> zzehmVar) {
        this.zzgvr = zzdieVar;
        this.zzgvs = zzehmVar;
    }

    public static zzdif zzb(zzdie zzdieVar, zzehm<zzdic> zzehmVar) {
        return new zzdif(zzdieVar, zzehmVar);
    }

    public static Context zzb(zzdie zzdieVar, zzdic zzdicVar) {
        return (Context) zzehf.zza(zzdicVar.zzzo, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zzb(this.zzgvr, this.zzgvs.get());
    }
}
