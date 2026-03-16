package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbip implements zzdgg {
    private final /* synthetic */ zzbhw zzewb;
    private zzehm<Context> zzfbf;
    private zzehm<String> zzfbg;
    private zzehm<zzdeu<zzceo, zzcel>> zzfei;
    private zzehm<zzdez> zzfej;
    private zzehm<zzdgz> zzfek;
    private zzehm<zzdfw> zzfel;
    private zzehm<zzdgi> zzfem;
    private zzehm<zzdgc> zzfen;

    private zzbip(zzbhw zzbhwVar, Context context, String str) {
        zzehm zzehmVar;
        zzehm zzehmVar2;
        zzehm zzehmVar3;
        zzehm zzehmVar4;
        zzehm zzehmVar5;
        this.zzewb = zzbhwVar;
        zzegz zzbb = zzehc.zzbb(context);
        this.zzfbf = zzbb;
        zzehmVar = this.zzewb.zzepo;
        zzehmVar2 = this.zzewb.zzepp;
        this.zzfei = new zzdex(zzbb, zzehmVar, zzehmVar2);
        zzehmVar3 = this.zzewb.zzepo;
        this.zzfej = zzeha.zzar(new zzdfu(zzehmVar3));
        this.zzfek = zzeha.zzar(zzdhc.zzarw());
        zzehm<Context> zzehmVar6 = this.zzfbf;
        zzehmVar4 = this.zzewb.zzent;
        zzehmVar5 = this.zzewb.zzenk;
        zzehm<zzdfw> zzar = zzeha.zzar(new zzdfz(zzehmVar6, zzehmVar4, zzehmVar5, this.zzfei, this.zzfej, zzdhf.zzary(), this.zzfek));
        this.zzfel = zzar;
        this.zzfem = zzeha.zzar(new zzdgj(zzar, this.zzfej, this.zzfek));
        zzegz zzbc = zzehc.zzbc(str);
        this.zzfbg = zzbc;
        this.zzfen = zzeha.zzar(new zzdgd(zzbc, this.zzfel, this.zzfbf, this.zzfej, this.zzfek));
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final zzdgi zzafr() {
        return this.zzfem.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final zzdgc zzafs() {
        return this.zzfen.get();
    }
}
