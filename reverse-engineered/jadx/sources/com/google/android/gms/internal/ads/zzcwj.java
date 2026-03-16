package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcwj implements zzegz<zzcwi> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzawd> zzglv;

    private zzcwj(zzehm<Executor> zzehmVar, zzehm<zzawd> zzehmVar2) {
        this.zzenm = zzehmVar;
        this.zzglv = zzehmVar2;
    }

    public static zzcwj zzas(zzehm<Executor> zzehmVar, zzehm<zzawd> zzehmVar2) {
        return new zzcwj(zzehmVar, zzehmVar2);
    }

    public static zzcwi zza(Executor executor, zzawd zzawdVar) {
        return new zzcwi(executor, zzawdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return zza(this.zzenm.get(), this.zzglv.get());
    }
}
