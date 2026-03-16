package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
final class zzbif implements zzddl {
    private final /* synthetic */ zzbhw zzewb;
    private zzehm<Context> zzfbf;
    private zzehm<String> zzfbg;
    private zzehm<zzdeu<zzbll, zzblr>> zzfbh;
    private zzehm<zzddn> zzfbi;
    private zzehm<zzdcz> zzfbj;
    private zzehm<zzddf> zzfbk;

    private zzbif(zzbhw zzbhwVar, Context context, String str) {
        zzehm zzehmVar;
        zzehm zzehmVar2;
        zzehm zzehmVar3;
        zzehm zzehmVar4;
        zzehm zzehmVar5;
        zzehm zzehmVar6;
        zzehm zzehmVar7;
        this.zzewb = zzbhwVar;
        this.zzfbf = zzehc.zzbb(context);
        this.zzfbg = zzehc.zzbb(str);
        zzehm<Context> zzehmVar8 = this.zzfbf;
        zzehmVar = this.zzewb.zzepo;
        zzehmVar2 = this.zzewb.zzepp;
        this.zzfbh = new zzdey(zzehmVar8, zzehmVar, zzehmVar2);
        zzehmVar3 = this.zzewb.zzepo;
        this.zzfbi = zzeha.zzar(new zzddu(zzehmVar3));
        zzehm<Context> zzehmVar9 = this.zzfbf;
        zzehmVar4 = this.zzewb.zzent;
        zzehmVar5 = this.zzewb.zzenk;
        this.zzfbj = zzeha.zzar(new zzddg(zzehmVar9, zzehmVar4, zzehmVar5, this.zzfbh, this.zzfbi, zzdhf.zzary()));
        zzehmVar6 = this.zzewb.zzenk;
        zzehm<Context> zzehmVar10 = this.zzfbf;
        zzehm<String> zzehmVar11 = this.zzfbg;
        zzehm<zzdcz> zzehmVar12 = this.zzfbj;
        zzehm<zzddn> zzehmVar13 = this.zzfbi;
        zzehmVar7 = this.zzewb.zzeob;
        this.zzfbk = zzeha.zzar(new zzddm(zzehmVar6, zzehmVar10, zzehmVar11, zzehmVar12, zzehmVar13, zzehmVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final zzddf zzafc() {
        return this.zzfbk.get();
    }
}
