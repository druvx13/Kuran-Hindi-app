package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcsg implements zzegz<zzcsa> {
    private final zzehm<zzdrh> zzfjj;
    private final zzehm<zzdku> zzfju;
    private final zzehm<zzbmt> zzges;
    private final zzehm<Context> zzgid;
    private final zzehm<zzaas> zzgie;

    public zzcsg(zzehm<Context> zzehmVar, zzehm<zzbmt> zzehmVar2, zzehm<zzdku> zzehmVar3, zzehm<zzdrh> zzehmVar4, zzehm<zzaas> zzehmVar5) {
        this.zzgid = zzehmVar;
        this.zzges = zzehmVar2;
        this.zzfju = zzehmVar3;
        this.zzfjj = zzehmVar4;
        this.zzgie = zzehmVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcsa(this.zzgid.get(), this.zzges.get(), this.zzfju.get(), this.zzfjj.get(), this.zzgie.get());
    }
}
