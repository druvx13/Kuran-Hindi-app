package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcbg implements zzegz<zzcbb> {
    private final zzehm<zzcaf> zzeyh;
    private final zzehm<zzcdt> zzezj;
    private final zzehm<zzcey> zzfuf;
    private final zzehm<zzbky> zzfug;

    public zzcbg(zzehm<zzcey> zzehmVar, zzehm<zzcdt> zzehmVar2, zzehm<zzbky> zzehmVar3, zzehm<zzcaf> zzehmVar4) {
        this.zzfuf = zzehmVar;
        this.zzezj = zzehmVar2;
        this.zzfug = zzehmVar3;
        this.zzeyh = zzehmVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcbb(this.zzfuf.get(), this.zzezj.get(), this.zzfug.get(), this.zzeyh.get());
    }
}
