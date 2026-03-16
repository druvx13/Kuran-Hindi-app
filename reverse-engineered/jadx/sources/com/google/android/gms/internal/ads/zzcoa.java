package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@19.1.0 */
/* loaded from: classes.dex */
public final class zzcoa implements zzcnm<zzblx, zzdhq, zzcot> {
    private final zzazz zzbml;
    private final Executor zzfhi;
    private final zzbmt zzgeq;
    private final Context zzvf;

    public zzcoa(Context context, zzazz zzazzVar, zzbmt zzbmtVar, Executor executor) {
        this.zzvf = context;
        this.zzbml = zzazzVar;
        this.zzgeq = zzbmtVar;
        this.zzfhi = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final void zza(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzdhq, zzcot> zzcnlVar) throws zzdhk {
        zzum zzb;
        zzum zzumVar = zzdhaVar.zzgur.zzfll.zzbmp;
        if (zzumVar.zzcfd) {
            zzb = new zzum(this.zzvf, com.google.android.gms.ads.zzb.zza(zzumVar.width, zzumVar.height));
        } else {
            zzb = zzdhh.zzb(this.zzvf, zzdgoVar.zzgtt);
        }
        zzum zzumVar2 = zzb;
        if (this.zzbml.zzdzo < 4100000) {
            zzcnlVar.zzdgp.zza(this.zzvf, zzumVar2, zzdhaVar.zzgur.zzfll.zzguw, zzdgoVar.zzgtu.toString(), zzcnlVar.zzgel);
        } else {
            zzcnlVar.zzdgp.zza(this.zzvf, zzumVar2, zzdhaVar.zzgur.zzfll.zzguw, zzdgoVar.zzgtu.toString(), zzayu.zza(zzdgoVar.zzgtr), zzcnlVar.zzgel);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnm
    public final /* synthetic */ zzblx zzb(zzdha zzdhaVar, zzdgo zzdgoVar, zzcnl<zzdhq, zzcot> zzcnlVar) throws zzdhk, zzcqm {
        zzbmt zzbmtVar = this.zzgeq;
        zzboi zzboiVar = new zzboi(zzdhaVar, zzdgoVar, zzcnlVar.zzflf);
        View view = zzcnlVar.zzdgp.getView();
        zzdhq zzdhqVar = zzcnlVar.zzdgp;
        zzdhqVar.getClass();
        zzblw zza = zzbmtVar.zza(zzboiVar, new zzbma(view, null, zzcod.zza(zzdhqVar), zzdgoVar.zzgtt.get(0)));
        zza.zzafk().zzu(zzcnlVar.zzdgp.getView());
        zza.zzaeh().zza((zzbrr) new zzbkc(zzcnlVar.zzdgp), this.zzfhi);
        zzcnlVar.zzgel.zzb(zza.zzaem());
        return zza.zzafj();
    }
}
