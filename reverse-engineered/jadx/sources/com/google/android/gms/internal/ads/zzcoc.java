package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcoc implements zzegz<zzcoa> {
    private final zzehm<Context> zzenp;
    private final zzehm<zzazz> zzfib;
    private final zzehm<Executor> zzfjj;
    private final zzehm<zzbmt> zzges;

    public zzcoc(zzehm<Context> zzehmVar, zzehm<zzazz> zzehmVar2, zzehm<zzbmt> zzehmVar3, zzehm<Executor> zzehmVar4) {
        this.zzenp = zzehmVar;
        this.zzfib = zzehmVar2;
        this.zzges = zzehmVar3;
        this.zzfjj = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcoa(this.zzenp.get(), this.zzfib.get(), this.zzges.get(), this.zzfjj.get());
    }
}
