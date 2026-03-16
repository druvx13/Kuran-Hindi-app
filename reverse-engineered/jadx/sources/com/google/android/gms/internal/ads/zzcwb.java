package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcwb implements zzegz<zzcvz> {
    private final zzehm<zzcfz> zzenj;
    private final zzehm<zzdrh> zzgln;
    private final zzehm<String> zzgmb;

    private zzcwb(zzehm<String> zzehmVar, zzehm<zzdrh> zzehmVar2, zzehm<zzcfz> zzehmVar3) {
        this.zzgmb = zzehmVar;
        this.zzgln = zzehmVar2;
        this.zzenj = zzehmVar3;
    }

    public static zzcwb zzq(zzehm<String> zzehmVar, zzehm<zzdrh> zzehmVar2, zzehm<zzcfz> zzehmVar3) {
        return new zzcwb(zzehmVar, zzehmVar2, zzehmVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcvz(this.zzgmb.get(), this.zzgln.get(), this.zzenj.get());
    }
}
