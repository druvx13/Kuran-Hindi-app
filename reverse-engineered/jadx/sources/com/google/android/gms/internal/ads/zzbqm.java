package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzbqm implements zzegz<Context> {
    private final zzehm<Context> zzfmf;
    private final zzbqj zzfmy;

    private zzbqm(zzbqj zzbqjVar, zzehm<Context> zzehmVar) {
        this.zzfmy = zzbqjVar;
        this.zzfmf = zzehmVar;
    }

    public static zzbqm zza(zzbqj zzbqjVar, zzehm<Context> zzehmVar) {
        return new zzbqm(zzbqjVar, zzehmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return (Context) zzehf.zza(this.zzfmy.zzca(this.zzfmf.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
