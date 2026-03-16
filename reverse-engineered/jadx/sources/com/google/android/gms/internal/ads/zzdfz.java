package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzdfz implements zzegz<zzdfw> {
    private final zzehm<zzbgy> zzenk;
    private final zzehm<zzdgz> zzfek;
    private final zzehm<Executor> zzfjj;
    private final zzehm<Context> zzgqo;
    private final zzehm<zzdeu<zzceo, zzcel>> zzgqp;
    private final zzehm<zzdez> zzgqq;
    private final zzehm<zzdhg> zzgqr;

    public zzdfz(zzehm<Context> zzehmVar, zzehm<Executor> zzehmVar2, zzehm<zzbgy> zzehmVar3, zzehm<zzdeu<zzceo, zzcel>> zzehmVar4, zzehm<zzdez> zzehmVar5, zzehm<zzdhg> zzehmVar6, zzehm<zzdgz> zzehmVar7) {
        this.zzgqo = zzehmVar;
        this.zzfjj = zzehmVar2;
        this.zzenk = zzehmVar3;
        this.zzgqp = zzehmVar4;
        this.zzgqq = zzehmVar5;
        this.zzgqr = zzehmVar6;
        this.zzfek = zzehmVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzdfw(this.zzgqo.get(), this.zzfjj.get(), this.zzenk.get(), this.zzgqp.get(), this.zzgqq.get(), this.zzgqr.get(), this.zzfek.get());
    }
}
