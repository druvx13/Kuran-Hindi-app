package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcig implements zzegz<zzcie> {
    private final zzehm<Executor> zzenm;
    private final zzehm<Context> zzenp;
    private final zzehm<zzbaa> zzets;
    private final zzehm<zzazz> zzffv;

    public zzcig(zzehm<Executor> zzehmVar, zzehm<zzbaa> zzehmVar2, zzehm<Context> zzehmVar3, zzehm<zzazz> zzehmVar4) {
        this.zzenm = zzehmVar;
        this.zzets = zzehmVar2;
        this.zzenp = zzehmVar3;
        this.zzffv = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcie(this.zzenm.get(), this.zzets.get(), this.zzenp.get(), this.zzffv.get());
    }
}
