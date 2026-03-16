package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcps implements zzcnm<zzbzm, zzdhq, zzcot> {
    private final Executor zzfhi;
    private final zzbyp zzgfy;
    private final Context zzvf;

    public zzcps(Context context, zzbyp zzbypVar, Executor executor) {
        this.zzvf = context;
        this.zzgfy = zzbypVar;
        this.zzfhi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final void zza(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzdhq, zzcot> zzcnlVar) throws zzdhk {
        zzcnlVar.zzdgp.zza(this.zzvf, zzdhaVar.zzgur.zzfll.zzguw, zzdgoVar.zzgtu.toString(), zzayu.zza(zzdgoVar.zzgtr), zzcnlVar.zzgel, zzdhaVar.zzgur.zzfll.zzdhc, zzdhaVar.zzgur.zzfll.zzguy);
    }

    private static boolean zza(zzdha zzdhaVar, int i) {
        return zzdhaVar.zzgur.zzfll.zzguy.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final /* synthetic */ zzbzm zzb(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzdhq, zzcot> zzcnlVar) throws zzdhk, zzcqm {
        zzbzx zza;
        zzaly zztg = zzcnlVar.zzdgp.zztg();
        zzamd zzth = zzcnlVar.zzdgp.zzth();
        zzame zztm = zzcnlVar.zzdgp.zztm();
        if (zztm != null && zza(zzdhaVar, 6)) {
            zza = zzbzx.zzb(zztm);
        } else if (zztg != null && zza(zzdhaVar, 6)) {
            zza = zzbzx.zzb(zztg);
        } else if (zztg != null && zza(zzdhaVar, 2)) {
            zza = zzbzx.zza(zztg);
        } else if (zzth != null && zza(zzdhaVar, 6)) {
            zza = zzbzx.zzb(zzth);
        } else if (zzth != null && zza(zzdhaVar, 1)) {
            zza = zzbzx.zza(zzth);
        } else {
            throw new zzcqm("No native ad mappers", 0);
        }
        if (!zzdhaVar.zzgur.zzfll.zzguy.contains(Integer.toString(zza.zzakw()))) {
            throw new zzcqm("No corresponding native ad listener", 0);
        }
        zzbzy zza2 = this.zzgfy.zza(new zzboi(zzdhaVar, zzdgoVar, zzcnlVar.zzflf), new zzcaj(zza), new zzcbm(zzth, zztg, zztm));
        zzcnlVar.zzgel.zzb(zza2.zzaem());
        zza2.zzaeh().zza((zzbrr) new zzbkc(zzcnlVar.zzdgp), this.zzfhi);
        return zza2.zzaeo();
    }
}
