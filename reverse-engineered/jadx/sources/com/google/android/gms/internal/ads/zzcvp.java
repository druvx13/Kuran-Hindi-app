package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcvp implements zzegz<zzcvo> {
    private final zzehm<Executor> zzenm;
    private final zzehm<zzdri<String>> zzglq;

    private zzcvp(zzehm<zzdri<String>> zzehmVar, zzehm<Executor> zzehmVar2) {
        this.zzglq = zzehmVar;
        this.zzenm = zzehmVar2;
    }

    public static zzcvp zzaq(zzehm<zzdri<String>> zzehmVar, zzehm<Executor> zzehmVar2) {
        return new zzcvp(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcvo(this.zzglq.get(), this.zzenm.get());
    }
}
