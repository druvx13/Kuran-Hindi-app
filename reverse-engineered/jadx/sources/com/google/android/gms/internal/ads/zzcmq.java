package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcmq implements zzegz<zzcmp> {
    private final zzehm<zzcmn> zzetk;
    private final zzehm<zzdrh> zzgde;

    private zzcmq(zzehm<zzcmn> zzehmVar, zzehm<zzdrh> zzehmVar2) {
        this.zzetk = zzehmVar;
        this.zzgde = zzehmVar2;
    }

    public static zzcmq zzap(zzehm<zzcmn> zzehmVar, zzehm<zzdrh> zzehmVar2) {
        return new zzcmq(zzehmVar, zzehmVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcmp(this.zzetk.get(), this.zzgde.get());
    }
}
