package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcon implements zzegz<zzcoi> {
    private final zzehm<Context> zzenp;
    private final zzehm<Executor> zzfjj;
    private final zzehm<zzbxr> zzges;
    private final zzehm<zzdgm> zzgfg;

    public zzcon(zzehm<Context> zzehmVar, zzehm<Executor> zzehmVar2, zzehm<zzbxr> zzehmVar3, zzehm<zzdgm> zzehmVar4) {
        this.zzenp = zzehmVar;
        this.zzfjj = zzehmVar2;
        this.zzges = zzehmVar3;
        this.zzgfg = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcoi(this.zzenp.get(), this.zzfjj.get(), this.zzges.get(), this.zzgfg.get());
    }
}
