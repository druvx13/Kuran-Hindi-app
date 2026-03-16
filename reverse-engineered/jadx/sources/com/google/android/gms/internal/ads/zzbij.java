package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbij implements zzbne {
    private zzehm<zzdgo> zzewe;
    private zzehm<Set<zzbvt<zzbrs>>> zzewh;
    private zzehm<zzbrr> zzewi;
    private zzehm<zzdha> zzewj;
    private zzehm<Set<zzbvt<zzbsm>>> zzexh;
    private zzehm<zzbsh> zzexi;
    private zzehm<String> zzeya;
    private zzehm<zzbqs> zzeyb;
    private zzehm<zzbnv> zzeyc;
    private final zzbnh zzfch;
    private zzehm<zzaem> zzfci;
    private zzehm<Runnable> zzfcj;
    private zzehm<zzbnd> zzfck;
    private final /* synthetic */ zzbih zzfcl;

    private zzbij(zzbih zzbihVar, zzboi zzboiVar, zzbnh zzbnhVar) {
        zzehm zzehmVar;
        this.zzfcl = zzbihVar;
        this.zzfch = zzbnhVar;
        this.zzewj = zzbon.zze(zzboiVar);
        this.zzewe = zzbol.zzc(zzboiVar);
        zzehi zzbit = zzehi.zzar(0, 2).zzau(zzbih.zzl(this.zzfcl)).zzau(zzbih.zzk(this.zzfcl)).zzbit();
        this.zzewh = zzbit;
        this.zzewi = zzeha.zzar(zzbry.zzj(zzbit));
        zzehi zzbit2 = zzehi.zzar(4, 3).zzat(zzbih.zzh(this.zzfcl)).zzat(zzbih.zzg(this.zzfcl)).zzat(zzbih.zzf(this.zzfcl)).zzau(zzbih.zzah(this.zzfcl)).zzau(zzbih.zzag(this.zzfcl)).zzau(zzbih.zzaf(this.zzfcl)).zzat(zzbih.zzc(this.zzfcl)).zzbit();
        this.zzexh = zzbit2;
        this.zzexi = zzeha.zzar(zzbsj.zzl(zzbit2));
        zzbok zza = zzbok.zza(zzboiVar);
        this.zzeya = zza;
        this.zzeyb = zzbqr.zzm(this.zzewe, zza);
        this.zzeyc = zzbpl.zzb(this.zzewj, this.zzewe, this.zzewi, this.zzexi, zzbih.zzai(this.zzfcl), this.zzeyb);
        this.zzfci = new zzbnj(zzbnhVar);
        zzbng zzbngVar = new zzbng(zzbnhVar);
        this.zzfcj = zzbngVar;
        zzehm<zzbnv> zzehmVar2 = this.zzeyc;
        zzehm<zzaem> zzehmVar3 = this.zzfci;
        zzehmVar = this.zzfcl.zzewb.zzent;
        this.zzfck = zzeha.zzar(new zzbni(zzehmVar2, zzehmVar3, zzbngVar, zzehmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbne
    public final zzblx zzafh() {
        return (zzblx) zzehf.zza(this.zzfck.get(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
