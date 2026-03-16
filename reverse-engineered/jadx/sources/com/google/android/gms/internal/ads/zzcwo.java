package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcwo implements zzegz<zzcwm> {
    private final zzehm<zzbpc> zzeqe;
    private final zzehm<zzdhy> zzero;
    private final zzehm<zzdhe> zzfjq;
    private final zzehm<String> zzgmb;
    private final zzehm<String> zzgml;

    private zzcwo(zzehm<String> zzehmVar, zzehm<String> zzehmVar2, zzehm<zzbpc> zzehmVar3, zzehm<zzdhy> zzehmVar4, zzehm<zzdhe> zzehmVar5) {
        this.zzgmb = zzehmVar;
        this.zzgml = zzehmVar2;
        this.zzeqe = zzehmVar3;
        this.zzero = zzehmVar4;
        this.zzfjq = zzehmVar5;
    }

    public static zzcwo zzg(zzehm<String> zzehmVar, zzehm<String> zzehmVar2, zzehm<zzbpc> zzehmVar3, zzehm<zzdhy> zzehmVar4, zzehm<zzdhe> zzehmVar5) {
        return new zzcwo(zzehmVar, zzehmVar2, zzehmVar3, zzehmVar4, zzehmVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final /* synthetic */ Object get() {
        return new zzcwm(this.zzgmb.get(), this.zzgml.get(), this.zzeqe.get(), this.zzero.get(), this.zzfjq.get());
    }
}
